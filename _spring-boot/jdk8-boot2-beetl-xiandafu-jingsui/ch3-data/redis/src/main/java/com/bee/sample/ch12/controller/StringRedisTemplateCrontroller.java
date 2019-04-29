package com.bee.sample.ch12.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/redis")
public class StringRedisTemplateCrontroller {

    @Autowired
    private StringRedisTemplate redisClient;

    @RequestMapping("/str/setget")
    public @ResponseBody
    String env(@RequestParam(defaultValue = "123") String para) throws Exception {
        redisClient.opsForValue().set("testenv", para);
        String str = redisClient.opsForValue().get("testenv");

        return str;
    }

    @RequestMapping("/message/add")
    public @ResponseBody
    String addMessage() throws Exception {
        redisClient.opsForList().leftPush("platform:message", "hello,xiandafu");
        redisClient.opsForList().leftPush("platform:message", "hello,spring boot");
        return "success";
    }

    @RequestMapping("/message")
    public @ResponseBody
    String readMessage() throws Exception {
        String str = redisClient.opsForList().leftPop("platform:message");
        return str;
    }


    @RequestMapping("/cache/add")
    public @ResponseBody
    String addMessage(String key, String value) throws Exception {
        redisClient.opsForHash().put("cache", key, value);
        return "success";
    }

    @RequestMapping("/cache")
    public @ResponseBody
    String addMessage(String key) throws Exception {
        String str = (String) redisClient.opsForHash().get("cache", key);
        return str;
    }

    @RequestMapping("/boundvalue")
    public @ResponseBody
    String boundValue(String key) throws Exception {
        BoundListOperations operations = redisClient.boundListOps(key);
        operations.leftPush("a");
        operations.leftPush("b");
        return String.valueOf(operations.size());
    }

    @RequestMapping("/connection/set")
    public @ResponseBody
    String connectionSet(final String key, final String value) throws Exception {
        redisClient.execute(new RedisCallback() {

            public Object doInRedis(RedisConnection connection) throws DataAccessException {
                try {
                    connection.set(key.getBytes("UTF-8"), value.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
                return null;
            }

        });

        return "success";

    }


}
