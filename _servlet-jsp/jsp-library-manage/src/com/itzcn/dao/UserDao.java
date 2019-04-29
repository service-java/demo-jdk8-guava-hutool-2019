package com.itzcn.dao;

import java.util.List;

import com.itzcn.entity.User;

public interface UserDao {
	
	public void insertUser(User user);//插入User
	public void delUser(User user);//删除
	public void upUser(User user);//更新
	public User findByUserId(Integer userId);//根据userId查找
	public List<User> findByUserName(String userName);//根据userName查找
	public List<User> findByPostId(Integer postId);//根据部门postId查询
	public List<User> findAllUser();//列出所有User信息
	public List<User> findAllUserByPage(int pageNo,int pageSize);//分页列出User信息
	public int getUserCount();//获取User的总数
	public int getPostUserCount(Integer postId);//获取某Post下的User数量
	
}
