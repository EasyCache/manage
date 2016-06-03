package tv.qsyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import tv.qsyy.entity.User;
import tv.qsyy.service.IUserService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Easy on 2016/6/2.
 */

@Controller
public class UserController {

    @Resource
    private IUserService userService;


    @RequestMapping(value = "/index")
    private ModelAndView home(HttpServletRequest request) {
        Map map = new HashMap();
        User user = new User("赵", "");
        map.put("user", user);
        if ("top".equals(request.getParameter("m")))
            return new ModelAndView("home/top", map);
        else if ("left".equals(request.getParameter("m")))
            return new ModelAndView("home/left", map);
        else if ("middle".equals(request.getParameter("m")))
            return new ModelAndView("home/frame", map);
        return new ModelAndView("home/home");
    }

    @RequestMapping(value = "/frame")
    private ModelAndView frame() {
        Map map = new HashMap();
        User user = new User("赵", "");
        map.put("user", user);
        return new ModelAndView("home/frame", map);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private ModelAndView login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username, password);
        int i = userService.login(user);
        if (i > 0) {
            Map map = new HashMap();
            map.put("user", user);
            request.getSession().setAttribute("user", user);
            return new ModelAndView("frame", map);
        }
        return new ModelAndView();
    }

}
