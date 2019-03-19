package com.bee.sample.ch4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 学习beetl语法，可以参考在线体验:http://ibeetl.com/beetlonline/,学习大部分语法
 *
 * @author xiandafu
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "/index"})
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("/index.btl");
        view.addObject("name", "lijz");

        return view;
    }

    @RequestMapping("/test")
    public ModelAndView test() {

        ModelAndView view = new ModelAndView("/test.html");
        return view;
    }
}
