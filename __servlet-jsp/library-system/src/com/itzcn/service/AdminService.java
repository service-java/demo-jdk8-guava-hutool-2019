package com.itzcn.service;

import java.util.List;

import com.itzcn.entity.Admin;

public interface AdminService {
	
	public boolean islogin(String adminUserName,String adminUserPwd);//管理员登录
	public List<Admin> showAdmins();//列出所有管理员信息
	public Admin showByAdminId(Integer adminId);//根据管理员编号列出管理员信息
	public Admin login(String adminUserName,String adminUserPwd);//根据用户名和密码获取Admin
}
