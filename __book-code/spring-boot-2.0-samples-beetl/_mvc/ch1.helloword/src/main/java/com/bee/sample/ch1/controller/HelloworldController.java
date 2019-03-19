package com.bee.sample.ch1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch1.annotation.Function;

/**
 * 访问:http://127.0.0.1:8080/sayhello.html?name=springboot
 *
 * @author xiandafu
 */
@Controller
public class HelloworldController {


    @RequestMapping("/sayhello.html")
    @Function()
    public @ResponseBody
    String say(String name) {
        return "hello " + name;
    }
}
