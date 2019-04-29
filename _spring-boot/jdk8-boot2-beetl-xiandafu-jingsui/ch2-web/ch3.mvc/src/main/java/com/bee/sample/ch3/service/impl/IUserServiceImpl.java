package com.bee.sample.ch3.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bee.sample.ch3.entity.User;
import com.bee.sample.ch3.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService {

    public List<User> allUser() {
        return sampleUser(5);
    }

    public User getUserById(Long id) {
        User user = sampleUser(1).get(0);
        user.setId(id);
        return user;
    }


    private List<User> sampleUser(int num) {
        List<User> list = new ArrayList<User>(num);
        for (int i = 0; i < num; i++) {
            User user = new User();
            user.setId((long) i);
            user.setName("name" + i);
            list.add(user);
        }
        return list;
    }


    public void updateUser(Long id, Integer type) {
        // TODO Auto-generated method stub

    }
}
