package com.itzcn.service;

import java.util.List;

import com.itzcn.entity.User;

public interface UserService {
	
	
	
	public void addUser(User user);//添加员工信息
	public void delUser(User user);//删除员工信息
	public void upUser(User user);//更新员工信息
	public User showByUserId(Integer userId);//根据员工编号列出员工信息
	public List<User> showUsers();//显示所有的员工信息
	public boolean isExist(String userName);//员工的用户名是否存在
	public List<User> showByUserName(String userName);//根据员工的用户名显示员工信息
    public boolean isUpdate(User user);//是否能够更新员工信息
    

}
