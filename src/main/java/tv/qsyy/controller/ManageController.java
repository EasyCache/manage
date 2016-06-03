package tv.qsyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tv.qsyy.entity.Live;
import tv.qsyy.service.IUserService;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Easy on 2016/6/2.
 */

@Controller
public class ManageController {

    @Resource
    private IUserService userService;


    @RequestMapping(value = "/monitor")
    private ModelAndView frame() {
        Map map = new HashMap();
        Live live = new Live();
        live.setLiveNickname("测试-1");
        live.setLiveUserId("0012313");
        live.setLiveScreenShot("https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2202167066,646141048&fm=58");
        List list = new ArrayList();
        list.add(live);
        list.add(live);
        list.add(live);
        list.add(live);
        list.add(live);
        map.put("list", list);
        return new ModelAndView("monitor/wall", map);
    }
}
