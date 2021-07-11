package gduf.javaee.controller;

import gduf.javaee.po.User;
import gduf.javaee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userlist")
    public String userList(Model model) {
        List<User> list = userService.findAllUser();
        model.addAttribute("userList", list);//
        return "user/userlist";
    }

    @RequestMapping(value="/userpreinsert",method= RequestMethod.GET)
    public String userPreinsert() {
        return "user/useradd";
    }

    @RequestMapping(value="/userinsert", method=RequestMethod.POST)
    public String userInsert(User user){
        userService.addUser(user);
        return "redirect:userlist";
    }

    @RequestMapping(value="/userdelete", method=RequestMethod.POST)
    public String userDelete(String[] uidArray) {
        userService.deleteUsers(uidArray);
        return "redirect:userlist";
    }

    /*修改密码*/
    @RequestMapping(value="/userpreupdate", method=RequestMethod.GET)
    public String userPreupdate(User user, Model model) {
        model.addAttribute("user", user);
        return "user/userupdate";
    }

    @RequestMapping(value="/userupdate", method=RequestMethod.POST)
    public String userUpdate(User user) {
        userService.updateUser(user);
        return "redirect:userlist";
    }

    @RequestMapping(value="/userselectbyuid")
    public String userSelectbyUid(String uid,Model model) {
        User user=userService.findUserByUid(uid);
        List<User> list = new ArrayList<User>();
        list.add(user);
        model.addAttribute("userList", list);
        return "user/userlist";
    }

    @RequestMapping(value="/userselectbyusername", method=RequestMethod.POST)
    public String userSelectbyUsername(String username,Model model) {
        List<User> list=userService.findUserByUsername(username);
        model.addAttribute("userList", list);
        return "user/userlist";
    }


    /*用户登录*/

    @RequestMapping(value="/ulogin", method=RequestMethod.POST)
    public String userLogin(String uid,String password,Model model,HttpSession session) {
        User user = userService.findUserByUid(uid);
        if(user!=null) {
            if(user.getPassword().equals(password)) {
                session.setAttribute("USER_SESSION", user);
                return "user/usermain";//
            }
        }
        model.addAttribute("msg", "账号或密码错误！");
        return "user/userlogin";
    }

    @RequestMapping(value="/userlogout")
    public String userLogout(HttpSession session) {
        session.invalidate();
        return "redirect:index.jsp";
    }

    @RequestMapping(value="/login", method=RequestMethod.GET)//
    public String toUserLogin() {
        return "user/userlogin";//
    }

    @RequestMapping(value="/usermain", method=RequestMethod.GET)
    public String toUserMain() {
        return "usermain";
    }



}
