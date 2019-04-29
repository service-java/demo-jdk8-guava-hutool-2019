package com.bee.sample.ch9.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bee.sample.ch9.dao.UserDao;
import com.bee.sample.ch9.entity.User;
import com.bee.sample.ch9.service.CreditSystemService;
import com.bee.sample.ch9.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    Log log = LogFactory.getLog(this.getClass());
    @Autowired
    CreditSystemService creditSystemService;

    @Autowired
    UserDao userDao;

    @Override
    public int getCredit(int userId) {

        return creditSystemService.getUserCredit(userId);

    }

    @Override
    public boolean updateUser(User user) {
        int ret = userDao.updateById(user);
        return ret == 1;
    }

}
