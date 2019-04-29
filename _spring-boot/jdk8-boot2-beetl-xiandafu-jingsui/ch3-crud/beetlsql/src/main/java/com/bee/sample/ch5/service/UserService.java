package com.bee.sample.ch5.service;

import java.util.List;

import com.bee.sample.ch5.entity.User;

public interface UserService {
    public User getUserById(Integer id);

    public List<User> select(String name);

}
