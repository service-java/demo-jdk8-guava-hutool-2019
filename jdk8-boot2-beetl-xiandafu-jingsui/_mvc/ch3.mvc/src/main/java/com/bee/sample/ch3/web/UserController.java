package com.bee.sample.ch3.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.IUserService;

/**
 * url映射到方法
 *
 * @author xiandafu
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService IUserService;

    @GetMapping("/")
    public @ResponseBody
    String index() {
        return "hello";
    }


    /**
     * 客户端请求必须包含application/json 才会处理
     */
    @GetMapping(value = "/1", consumes = "application/json")
//    @GetMapping(value = "/1")
    @ResponseBody
    public User forJson() {
        return IUserService.getUserById(1l);
    }

    @GetMapping(path = "/{userId}.json", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public User getUser(@PathVariable Long userId, Model model) {
        return IUserService.getUserById(userId);
    }


    @GetMapping(path = "/update.json", params ="action=save")
    @ResponseBody
    public void saveUser() {
    System.out.println("call save");
    }

    @GetMapping(path = "/update.json", params = "action=update")
    @ResponseBody
    public void updateUser() {
        System.out.println("call update");
    }


}
