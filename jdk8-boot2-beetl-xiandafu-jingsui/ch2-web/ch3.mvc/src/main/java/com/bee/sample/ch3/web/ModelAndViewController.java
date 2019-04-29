package com.bee.sample.ch3.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.IUserService;

@Controller
@RequestMapping("/model")
public class ModelAndViewController {

    @Autowired
    IUserService IUserService;

    /**
     * 一个beetl模板测试
     * 因为视图扩展名字是btl
     *
     * @param userId
     * @param model
     * @return
     */
    @GetMapping(path = "/user/{userId}")
    public String getUser(@PathVariable Long userId, Model model) {
        User userInfo = IUserService.getUserById(userId);
        // 与下面一行作用一样，但这会有潜在问题
        // model.addAttribute(userInfo);
        model.addAttribute("user", userInfo);
        return "/userInfo.btl";
    }

    /**
     * 使用freemaker模板测试
     * freemaker会寻找/userInfo.ftl 模板
     *
     * @param userId
     * @param view
     * @return
     */
    @GetMapping(path = "/user/get/{userId}")
    public ModelAndView getUser2(@PathVariable Long userId, ModelAndView view) {
        User userInfo = IUserService.getUserById(userId);

        //model.addAttribute(userInfo);
        view.addObject("user", userInfo);
        view.setViewName("/userInfo");
        return view;
    }


}
