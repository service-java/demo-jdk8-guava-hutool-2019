package com.bee.sample.ch6.controller;

import java.lang.reflect.Array;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch6.entity.User;
import com.bee.sample.ch6.service.UserService;

import javax.persistence.Convert;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("")
    public @ResponseBody
    String findUser(int userId) {
        User user = userService.findUser(userId);

        return user.getName();
    }

    @RequestMapping("/add")
    public @ResponseBody
    String addUser(User user) {
        int id = userService.addUser(user);
        return String.valueOf(id);
    }

    @RequestMapping("/list")
    public @ResponseBody
    String alluser(int begin, int end) {
        List<User> list = userService.getAllUser(begin, end);

        String result = "";
        for (User user : list) {
            result += user.getName() + " ";
        }

        return result;
    }

    @RequestMapping("/getuser.html")
    public @ResponseBody
    String getUser(String name) {
        User user = userService.getUser(name);
        return String.valueOf(user.getName());
    }

    @RequestMapping("/getdepartuser.html")
    public @ResponseBody
    String getDepartmentUser(String name, Integer deptId) {
        User user = userService.getUser(name, deptId);
        return user == null ? "" : String.valueOf(user.getName());
    }

    @RequestMapping("/pagequery.html")
    public @ResponseBody
    String pageQuery(Integer deptId, int page, int size) {
        PageRequest pr = new PageRequest(page, size);
//		Page<User> users =  userService.queryUser(deptId, pr);
        Page<User> users = userService.queryUser2(deptId, pr);
        return String.valueOf(users.getTotalElements());
    }

    @RequestMapping("/example.html")
    public @ResponseBody
    String example(String name) {
        List<User> users = userService.getByExample(name);
        return String.valueOf(users.size());
    }


    @RequestMapping("/test.html")
    public @ResponseBody
    String test() {
        userService.updateUser();
        return "success";
    }
}
