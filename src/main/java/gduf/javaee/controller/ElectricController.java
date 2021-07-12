package gduf.javaee.controller;

import gduf.javaee.controller.model.request.ElectricCreateModel;
import gduf.javaee.controller.model.request.ElectricUpdateModel;
import gduf.javaee.controller.model.response.Response;
import gduf.javaee.po.Electric;
import gduf.javaee.service.ElectricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/electric")
public class ElectricController {
    @Autowired
    private ElectricService electricService;

    @RequestMapping("/electriclist")
    public String index() {
        return "electric/electriclist";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
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
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Response createElectric(@RequestBody ElectricCreateModel electric) {
        try {
            Electric el = new Electric(electric.getEno(), electric.getEremain());
            electricService.createElectric(el);
            return Response.success(el);
        } catch (DuplicateKeyException e) {
            return Response.error("该宿舍号已存在");
        }
    }

    //电费充值
    @RequestMapping(value = "/{eno}/updateElectric", method = RequestMethod.POST)
    @ResponseBody
    public Response updateElectric(
            @RequestBody ElectricUpdateModel electric,
            @PathVariable String eno
    ) {
        Electric el=electricService.selectElectricByEno(eno);
        if (el == null) {
            return Response.error("没有找到这个宿舍号");
        }
        int eremain=el.getEremain()+electric.getEremain();
        electricService.updateElectric(eno,eremain);
        el.setEremain(eremain);
        return Response.success(el);
    }
}
