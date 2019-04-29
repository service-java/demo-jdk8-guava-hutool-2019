package com.bee.sample.ch9.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch9.entity.User;
import com.bee.sample.ch9.service.UserService;

@Controller
public class UserController {
    private Log log = LogFactory.getLog(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/user/{id}")
    public @ResponseBody
    String getUser(@PathVariable Integer id) {
        return String.valueOf(userService.getCredit(id));
    }

    @RequestMapping("/user/{id}/{name}")
    public @ResponseBody
    String updateUser(@PathVariable Integer id, @PathVariable String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        userService.updateUser(user);
        return "{\"success\":true}";
    }


}
