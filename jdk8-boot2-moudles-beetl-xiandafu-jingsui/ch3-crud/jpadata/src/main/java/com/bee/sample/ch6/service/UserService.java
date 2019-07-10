package com.bee.sample.ch6.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bee.sample.ch6.entity.User;

public interface UserService {
    public User findUser(int id);

    public Integer addUser(User user);

    public List<User> getAllUser(int start, int end);

    public User getUser(String name);

    public User getUser(String name, Integer departmentId);

    public Page<User> queryUser(Integer departmentId, Pageable page);

    public Page<User> queryUser2(Integer departmentId, Pageable page);

    public List<User> getByExample(String name);

    public void updateUser();
}
