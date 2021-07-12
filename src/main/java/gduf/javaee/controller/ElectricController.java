package gduf.javaee.controller;

import gduf.javaee.controller.model.request.ElectricCreateModel;
import gduf.javaee.controller.model.response.Response;
import gduf.javaee.po.Electric;
import gduf.javaee.po.Record;
import gduf.javaee.service.ElectricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ElectricController {
    @Autowired
    private ElectricService electricService;

    @RequestMapping("/electriclist")
    public String index() {
        return "electric/electriclist";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public Response getElectricTest(String eno) {
        return Response.success(electricService.selectElectricByEno(eno));
    }

    //通过eno查询电费
    @RequestMapping(value = "/{eno}", method = RequestMethod.GET)
    @ResponseBody
    public Response getElectric(@PathVariable String eno) {
        return Response.success(electricService.selectElectricByEno(eno));
    }

    //添加电费信息
    @RequestMapping(value="/electricinsert",method= RequestMethod.GET)
    public String recordPreinsert() {
        return "electric/electricadd";
    }

    @RequestMapping(value="/recordinsert", method=RequestMethod.POST)
    public String recordInsert(Record record){
        electricService.createElectric();
        return "redirect:recordlist";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Object createElectric(@RequestBody ElectricCreateModel electric) {
        try {
            Electric el = new Electric(electric.getEno(), electric.getEremain());
            electricService.createElectric(el);
            return "electric/electriclist";
        } catch (DuplicateKeyException e) {
            return Response.error("该宿舍号已存在");
        }
    }


    //充值
    @RequestMapping(value="/electricupdate", method= RequestMethod.GET)
    public String updateElectric(Electric electric, Model model) {
        model.addAttribute("electric", electric);
        return "electric/electriclist";
    }

    @RequestMapping(value="/electricupdate", method=RequestMethod.POST)
    public String cardUpdate2(Electric electric) {
        electricService.updateElectric(electric);
        return "card/cardlist";
    }
}
