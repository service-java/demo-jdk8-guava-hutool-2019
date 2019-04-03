package com.itzcn.action;

import java.util.List;

import com.itzcn.entity.User;
import com.itzcn.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowUsersAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private User user;
	private List<User> userLt ;
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
	
	public List<User> getUserLt() {
		return userLt;
	}
	public void setUserLt(List<User> userLt) {
		this.userLt = userLt;
	}
	public String execute(){
		userLt = userService.showUsers();
		return SUCCESS;
	}
	

}
