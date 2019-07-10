package com.bee.sample.ch3.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.IUserService;

/**
 * mvc url映射测试
 *
 * @author lijiazhi
 */
@Controller
@RequestMapping("/url")
public class URLMapperController {

    @Autowired
    IUserService IUserService;


    @RequestMapping(path = "/user/list", method = RequestMethod.GET)
    @ResponseBody
    public List<User> allUser() {
        return IUserService.allUser();
    }


    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getById(@PathVariable Long id) {
return IUserService.getUserById(id);
    }

    @GetMapping(path = "/user/{userId}", produces = "application/json")
    @ResponseBody
    public User getUserById(@PathVariable Long userId) {
        return IUserService.getUserById(userId);
    }

    @GetMapping(value = "user/test/consume", consumes = "application/json")
    @ResponseBody
    public User forJson() {
        return IUserService.getUserById(1l);
    }

}
