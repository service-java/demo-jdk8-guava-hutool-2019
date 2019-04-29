package com.bee.sample.ch5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch5.entity.User;
import com.bee.sample.ch5.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/{id}")
    public @ResponseBody
    User say(@PathVariable Long id) {
        User user = userService.geUserById(id);
        return user;
    }
}
