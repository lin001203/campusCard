package gduf.javaee.interceptor;

import gduf.javaee.po.Manager;
import gduf.javaee.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        String url=request.getRequestURI();
        if(url.indexOf("/stulogin")>=0) {
            return true;
        }
        if(url.indexOf("/login")>=0) {
            return true;
        }
        if(url.indexOf("/ulogin")>=0) {
            return true;
        }
        if(url.indexOf("/managerlogin")>=0) {
            return true;
        }
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("USER_SESSION");
        if(user != null) {
            return true;
        }
        Manager manager = (Manager) session.getAttribute("MANAGER_SESSION");
        if(manager != null) {
            return true;
        }
        request.setAttribute("msg", "您还没有登录，请登录！");
        request.getRequestDispatcher("/index.jsp").forward(request, response);//"/WEB-INF/jsp/login.jsp"
        return false;
    }
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modeAndView) throws Exception{
    }
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
