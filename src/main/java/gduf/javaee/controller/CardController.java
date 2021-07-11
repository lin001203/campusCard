package gduf.javaee.controller;

import gduf.javaee.controller.model.request.CardRegisterModel;
import gduf.javaee.controller.model.response.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/card")
public class CardController {

    @RequestMapping("/cardlist")
    public String index() {
        return "card/cardlist";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Response addCard(@RequestBody CardRegisterModel user) {
        System.out.println(user);
        return Response.success(null);
    }
}