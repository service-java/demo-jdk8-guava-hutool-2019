package com.bee.sample.ch7.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch7.config.EnvConfig;
import com.bee.sample.ch7.config.ServerConfig;

@Controller
public class PropertyController {
    private Log log = LogFactory.getLog(PropertyController.class);
    @Autowired
    EnvConfig envConfig;
    @Autowired
    ServerConfig serverConfig;

    @RequestMapping("/sayhello.html")
    public @ResponseBody
    String say() {
        log.info("acess");
        return "hello world";
    }

    @RequestMapping("/showenv.html")
    public @ResponseBody
    String env() {
        return "port:" + envConfig.getServerPort();
    }

    @RequestMapping("/showvalue.html")
    public @ResponseBody
    String value(@Value("${server.port}") int port) {
        return "port:" + port;
    }

    @RequestMapping("/showserver.html")
    public @ResponseBody
    String value() {

        return "port:" + serverConfig.getPort() + " contxtPath:" + serverConfig.getServlet().getPath();
    }
}
