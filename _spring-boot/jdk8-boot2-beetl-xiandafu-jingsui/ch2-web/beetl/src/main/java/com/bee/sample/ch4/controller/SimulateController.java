package com.bee.sample.ch4.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.beetl.ext.simulate.WebSimulate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前后端分离。
 *
 * @author xiandafu
 */
@Controller
public class SimulateController {
    @Autowired
    WebSimulate webSimulate;

    @RequestMapping("/api/**")
    public void simluateJson(HttpServletRequest request, HttpServletResponse response) {
        webSimulate.execute(request, response);
    }

    @RequestMapping("/**/*.html")
    public void simluateView(HttpServletRequest request, HttpServletResponse response) {
        webSimulate.execute(request, response);
    }

}