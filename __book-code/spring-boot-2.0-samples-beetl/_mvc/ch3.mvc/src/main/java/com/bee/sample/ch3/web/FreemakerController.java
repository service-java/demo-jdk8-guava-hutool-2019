package com.bee.sample.ch3.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.IUserService;

@Controller
@RequestMapping("/freemarker")
public class FreemakerController {

    @Autowired
    IUserService IUserService;

    @GetMapping("/user")
    public ModelAndView showUserInfo(Long id) {
        ModelAndView view = new ModelAndView();
        User user = IUserService.getUserById(id);
        view.addObject("user", user).setViewName("/userInfo");
        return view;
    }

}
