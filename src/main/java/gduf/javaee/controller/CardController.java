package gduf.javaee.controller;

import gduf.javaee.controller.model.request.CardRegisterModel;
import gduf.javaee.controller.model.response.Response;
import gduf.javaee.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    @RequestMapping("/cardlist")
    public String index() {
        return "card/cardlist";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Response getCard(@PathVariable String id) {
        return Response.success(cardService.selectCardByCid(id));
    }



    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Response addCard(@RequestBody CardRegisterModel user) {
        System.out.println(user);

        return Response.success(null);
    }
}