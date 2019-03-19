package com.bee.sample.ch4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TreeModelController {

    @RequestMapping("/hello")
    public @ResponseBody
    String say() {
        return "hello world I AM YOUR XYZ";
    }
}
