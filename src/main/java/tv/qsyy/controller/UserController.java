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
