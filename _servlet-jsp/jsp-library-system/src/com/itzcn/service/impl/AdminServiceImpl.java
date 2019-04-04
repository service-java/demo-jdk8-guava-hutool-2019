package com.itzcn.service.impl;

import java.util.Iterator;
import java.util.List;

import com.itzcn.dao.AdminDao;
import com.itzcn.entity.Admin;
import com.itzcn.service.AdminService;

public class AdminServiceImpl implements AdminService {

	private AdminDao adminDao;
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public boolean islogin(String adminUserName, String adminUserPwd) {
		boolean flag = false;
		if (adminDao.findByAdminUserNameAndPwd(adminUserName, adminUserPwd).size()>0) {
			flag = true;
		} 
		return  flag;
	}

	public List<Admin> showAdmins() {
		return adminDao.findAllAdmin();

	}

	public Admin showByAdminId(Integer adminId) {
		return adminDao.findByAdminId(adminId);
	}

	public Admin login(String adminUserName, String adminUserPwd) {
		Admin admin = null;
		if (islogin(adminUserName, adminUserPwd)) {
			List<Admin> adminLt = adminDao.findByAdminUserNameAndPwd(adminUserName, adminUserPwd);
			Iterator<Admin> iterator = adminLt.iterator();
			if(iterator.hasNext()){
				admin = iterator.next();
			}
		}
		return admin;
	}

}
