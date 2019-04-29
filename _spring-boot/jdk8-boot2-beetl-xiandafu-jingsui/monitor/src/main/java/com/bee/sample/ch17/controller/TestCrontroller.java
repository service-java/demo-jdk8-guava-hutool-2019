package com.bee.sample.ch17.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestCrontroller {

    Log log = LogFactory.getLog(TestCrontroller.class);


    @RequestMapping("/test.html")
    public @ResponseBody
    String create() throws Exception {
        return "hello ";
    }

    @RequestMapping("/testsleep.html")
    public @ResponseBody
    String sleepTest() throws Exception {
        Thread.currentThread().sleep(1000 * 1000);
        return "";
    }

    @RequestMapping("/testloglevel.html")
    public @ResponseBody
    String logLevelTest(String para) throws Exception {
        log.debug("enter testlog level " + para);
        return "";
    }


}
