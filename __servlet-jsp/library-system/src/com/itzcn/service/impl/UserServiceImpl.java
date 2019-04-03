package com.itzcn.service.impl;

import java.util.List;

import com.itzcn.dao.UserDao;
import com.itzcn.entity.User;
import com.itzcn.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		userDao.insertUser(user);
	}

	public void delUser(User user) {
		userDao.delUser(user);
	}

	public void upUser(User user) {
		userDao.upUser(user);
	}

	public User showByUserId(Integer userId) {
		return userDao.findByUserId(userId);
	}

	public List<User> showUsers() {
		return userDao.findAllUser();
	}

	public boolean isExist(String userName) {
		boolean flag = false;
		if (showByUserName(userName).size()>0) {
			flag = true;
		} 
		return flag;
	}

	public List<User> showByUserName(String userName) {
		return userDao.findByUserName(userName);
	}

	public boolean isUpdate(User user) {
		boolean flag = false;
		if (showByUserName(user.getUserName()).size()>0) {
			for (User u : showByUserName(user.getUserName())) {
				if(u.getUserId().equals(user.getUserId())){
					flag = true;
				}
			}
		}else{
			flag = true;
		}
		return flag;
	}

}
