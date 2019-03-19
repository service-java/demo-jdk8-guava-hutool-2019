package com.bee.sample.ch3.web;

import com.bee.sample.ch3.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch3.service.IUserService;

@Controller
@RequestMapping("/attr")
public class ModelAttributeController {
    @Autowired
    IUserService IUserService;

    /**
     * Controller方法中的公共方法
     * 调用方法前先调用此方法。
     *
     * @param id
     * @param model
     */
    @ModelAttribute
    public void findUserById(@PathVariable Long id, Model model) {
        model.addAttribute("user", IUserService.getUserById(id));
    }

    /**
     * 如果仅仅添加一个对象到model
     */
//    @ModelAttribute
//    public User findUserById(@PathVariable Long id) {
//        return IUserService.getUserById(id);
//    }

    @GetMapping(path = "/user/{id}")
    @ResponseBody
    public String getUser(Model model) {
        System.out.println(model.containsAttribute("user"));
        return "got it";
    }


}
