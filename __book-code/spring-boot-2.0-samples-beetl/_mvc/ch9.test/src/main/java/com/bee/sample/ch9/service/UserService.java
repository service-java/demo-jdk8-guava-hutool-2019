package com.bee.sample.ch9.service;

import com.bee.sample.ch9.entity.User;

public interface UserService {
    public int getCredit(int userId);

    public boolean updateUser(User user);
}
