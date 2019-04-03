package com.itzcn.action;

import com.itzcn.entity.User;
import com.itzcn.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowUserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	private User user;
	private Integer userId;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String execute(){
		user = userService.showByUserId(userId);
		return SUCCESS;
	}

}
