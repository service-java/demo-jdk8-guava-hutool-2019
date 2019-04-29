package com.bee.sample.ch12.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.hash.ObjectHashMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch12.controller.RedisTemplateCrontroller.User;

@Controller
@RequestMapping("/redis")
public class StrKeyRedisTemplateCrontroller {

    @Autowired
    @Qualifier("strKeyRedisTemplate")
    private RedisTemplate redisClient;

    @RequestMapping("/key/set")
    public @ResponseBody
    String simpleSet() {
        redisClient.opsForValue().set("key-0", "hello");
        return "success";
    }

    @RequestMapping("/key")
    public @ResponseBody
    String simpleGet() {
        String value = (String) redisClient.opsForValue().get("key-0");
        return value;

    }

}
