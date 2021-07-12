package gduf.javaee.controller;


import gduf.javaee.po.Manager;
import gduf.javaee.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping("/managerlist")
    public String managerList(Model model) {
        List<Manager> list = managerService.findAllManager();
        model.addAttribute("managerList", list);//
        return "manager/managerlist";
    }


    @RequestMapping(value="/managerdelete", method=RequestMethod.POST)
    public String managerDelete(String[] midArray) {
        managerService.deleteManagers(midArray);
        return "redirect:managerlist";
    }

    /*修改密码*/
    @RequestMapping(value="/managerpreupdate", method=RequestMethod.GET)
    public String managerPreupdate(Manager manager, Model model) {
        model.addAttribute("manager", manager);
        return "manager/managerupdate";
    }

    @RequestMapping(value="/managerupdate", method=RequestMethod.POST)
    public String managerUpdate(Manager manager) {
        managerService.updateManager(manager);
        return "redirect:managermain";
    }



    @RequestMapping(value="/managerselectbymid")
    public String managerSelectbyMid(String mid,Model model) {
        Manager manager=managerService.findManagerByMid(mid);
        List<Manager> list = new ArrayList<Manager>();
        list.add(manager);
        model.addAttribute("managerList", list);
        return "manager/managerlist";
    }


    /*管理员登录*/

    @RequestMapping(value="/mlogin", method=RequestMethod.POST)
    public String managerLogin(String mid, String mpassword, Model model, HttpSession session) {
        Manager manager = managerService.findManagerByMid(mid);
        if(manager!=null) {
            if(manager.getMpassword().equals(mpassword)) {
                session.setAttribute("MANAGER_SESSION", manager);
                return "manager/managermain";//
            }
        }
        model.addAttribute("msg", "账号或密码错误！");
        return "manager/managerlogin";
    }

    @RequestMapping(value="/managerlogout")
    public String managerLogout(HttpSession session) {
        session.invalidate();
        return "redirect:index.jsp";
    }

    @RequestMapping(value="/mmlogin", method=RequestMethod.GET)//
    public String toManagerLogin() {
        return "manager/managerlogin";//
    }

    @RequestMapping(value="/managermain", method=RequestMethod.GET)
    public String toManagerMain() {
        return "manager/managermain";
    }
}
