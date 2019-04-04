package com.itzcn.action;

import com.itzcn.entity.Admin;
import com.itzcn.service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminLoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Admin admin;
	private AdminService adminService;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	public String adminLogin(){
		if (adminService.islogin(admin.getAdminUserName(), admin.getAdminUserPwd())) {
			Admin a = adminService.login(admin.getAdminUserName(), admin.getAdminUserPwd());
			ActionContext.getContext().getSession().put("adminName",a.getAdminName());
			ActionContext.getContext().getSession().put("adminUserName",a.getAdminUserName());
			return SUCCESS;
		} else {
			this.addActionError("登录失败，用户名或密码错误");
			return INPUT;
		}
		
	}
	
	public void validateAdminLogin(){
		if(admin.getAdminUserName()==null || admin.getAdminUserName().trim().equals("")){
			
			addFieldError("admin.adminUserName", "用户名不能为空");
		}
		if(admin.getAdminUserPwd() == null || admin.getAdminUserPwd().trim().equals("")){
			addFieldError("admin.adminUserPwd", "密码不能为空");
		}
	}
}
