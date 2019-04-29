package com.bee.sample.ch3.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.IUserService;

/**
 * 测试使用模板引擎Beetl
 *
 * @author xiandafu
 */
@Controller
@RequestMapping("/beetl")
public class BeetlController {

    @Autowired
    IUserService IUserService;

    @RequestMapping("user")
    public String say(Model model) {
        model.addAttribute("name", "luo0412")
            .addAttribute("phone", "1789505");

        // 直接返回
        return "/index.btl";
//        return "hello guys";
    }

    @GetMapping("/user/detail")
    public ModelAndView showUserInfo(Long id) {
        ModelAndView view = new ModelAndView();
        User user = IUserService.getUserById(id);
        view.addObject("user", user).setViewName("/userInfo.btl");
        return view;
    }

}
