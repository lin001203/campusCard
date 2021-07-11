package gduf.javaee.controller;

import gduf.javaee.controller.model.request.CardCreateModel;
import gduf.javaee.controller.model.request.CardUpdateBalanceModel;
import gduf.javaee.controller.model.request.CardUpdateStatusModel;
import gduf.javaee.controller.model.response.Response;
import gduf.javaee.po.Card;
import gduf.javaee.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.dao.DuplicateKeyException;

@Controller
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @RequestMapping("/cardlist")
    public String index() {
        return "card/cardlist";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public Response getCardTest(String id) {
        return Response.success(cardService.selectCardByCid(id));
    }

    //通过卡id查询卡信息
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Response getCard(@PathVariable String id) {
        return Response.success(cardService.selectCardByCid(id));
    }

    // 创建一张卡
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Response addCard(@RequestBody CardCreateModel card) {
        try {
            Card c = new Card(card.getCid(), card.getUid(), 0, true);
            cardService.createCard(c);
            return Response.success(c);
        } catch (DuplicateKeyException e) {
            return Response.error("卡id已存在");
        }
    }

    // 充值
    @RequestMapping(value = "/{id}/recharge", method = RequestMethod.POST)
    @ResponseBody
    public Response updateCardBalance(
            @RequestBody CardUpdateBalanceModel card,
            @PathVariable String id
    ) {
        Card c = cardService.selectCardByCid(id);
        if (c == null){
            return Response.error("没有找到这张卡");
        }
        float balance = c.getBalance() + card.getBalance();
        cardService.updateCardBalance(id, balance);
        c.setBalance(balance);
        return Response.success(c);
    }

    //冻结与解冻
    @RequestMapping(value = "/{id}/updateCardStatus", method = RequestMethod.POST)
    @ResponseBody
    public Response updateCardStatus(

            @RequestBody CardUpdateStatusModel card,
            @PathVariable String id
    ) {
        Card c1 = cardService.selectCardByCid(id);
        if (c1 == null){
            return Response.error("没有找到这张卡");
        }
        cardService.updateCardStatus(id,c1.isStatus());
        c1.setStatus(card.isStatus());
        return Response.success(c1);
    }

}