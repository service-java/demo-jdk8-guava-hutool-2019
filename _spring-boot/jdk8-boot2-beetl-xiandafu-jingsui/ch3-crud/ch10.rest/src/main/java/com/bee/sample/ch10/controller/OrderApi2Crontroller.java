package com.bee.sample.ch10.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.beetl.ext.simulate.WebSimulate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/")
public class OrderApi2Crontroller {

    @Autowired
    WebSimulate webSimulate;

    @RequestMapping("/**")
    public void simluateJson(HttpServletRequest request, HttpServletResponse response) {
        webSimulate.execute(request, response);
    }

}
