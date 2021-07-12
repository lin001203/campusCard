package gduf.javaee.controller;

import gduf.javaee.controller.model.response.Response;
import gduf.javaee.po.Card;
import gduf.javaee.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CardController {
    @Autowired
    private CardService cardService;

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    @ResponseBody
    public Response getCardTest(String id) {
        return Response.success(cardService.selectCardByCid(id));
    }

    //通过卡id查询卡信息
    @RequestMapping(value = "/cardselect", method = RequestMethod.GET)
    @ResponseBody
    public String selectCard(Model model, String id) {
        model.addAttribute("card",cardService.selectCardByCid(id));
        return "card/cardlist";
    }

    //开卡
    @RequestMapping(value="/cardpreinsert",method= RequestMethod.GET)
    public String cardPreinsert() {
        return "user/cardadd";
    }

    @RequestMapping(value="/cardinsert", method=RequestMethod.POST)
    public String cardInsert(Card card){
        cardService.createCard(card);
        return "card/cardlist";
    }
    /*挂失解挂*/
    @RequestMapping(value="/cardpreupdate1", method= RequestMethod.GET)
    public String cardPreupdate1(Card card, Model model) {
        model.addAttribute("card", card);
        return "card/cardlist";
    }

    @RequestMapping(value="/cardupdate1", method=RequestMethod.POST)
    public String cardUpdate1(Card card) {
        cardService.updateCardStatus(card);
        return "card/cardlist";
    }
    //充值
    @RequestMapping(value="/cardpreupdate2", method= RequestMethod.GET)
    public String cardPreupdate2(Card card, Model model) {
        model.addAttribute("card", card);
        return "card/cardlist";
    }

    @RequestMapping(value="/cardupdate2", method=RequestMethod.POST)
    public String cardUpdate2(Card card) {
        cardService.updateCardBalance(card);
        return "card/cardlist";
    }


}
