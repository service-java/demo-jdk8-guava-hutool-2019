package com.bee.sample.ch12.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.hash.ObjectHashMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/redis")
public class RedisTemplateCrontroller {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisClient;

    @RequestMapping("/user/set")
    public @ResponseBody
    String simpleSet() {
        redisClient.opsForValue().set("key-0", "hello");
        redisClient.opsForValue().set("key-1", User.getSampleUser());
        return "success";
    }

    @RequestMapping("/user")
    public @ResponseBody
    String simpleGet() {
        String value = (String) redisClient.opsForValue().get("key-0");
        User user = (User) redisClient.opsForValue().get("key-1");
        return "success";

    }

    public static class User implements java.io.Serializable {
        int id;
        String name;
        Date date = new Date();

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public static User getSampleUser() {
            User user = new User();
            user.setId(123);
            user.setName("abc");
            return user;
        }

    }


}
