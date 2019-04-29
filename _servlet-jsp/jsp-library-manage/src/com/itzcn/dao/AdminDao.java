package com.itzcn.dao;

import java.util.List;

import com.itzcn.entity.Admin;

public interface AdminDao {
	
	public List<Admin> findAllAdmin();//列出所有管理员信息
	public List<Admin> findByAdminUserNameAndPwd(String adminUserName,String adminUserPwd);//根据adminUserName和adminUserPwd查询
	public Admin findByAdminId(Integer adminId);//根据adminId查询
	

}
