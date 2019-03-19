package com.bee.sample.ch15.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringSessionCrontroller {
    @Autowired
    RedisTemplate redisTemplate;
    Log log = LogFactory.getLog(SpringSessionCrontroller.class);

    @RequestMapping("/putsession.html")
    public @ResponseBody
    String putSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        log.info(session.getClass());
        log.info(session.getId());
        String name = "xiandafu";
        session.setAttribute("user", name);
        redisTemplate.opsForValue().set("why", "ccccc");
        return "hey," + name;
    }

    @RequestMapping("/getsession.html")
    public @ResponseBody
    String getSession(HttpServletRequest request) {
        log.info(request.getRemoteAddr());
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
        return "user=" + user;
    }


}
