package com.itzcn.bean;

public class MyBean {
	
	private String userName = null;//用户名
	private String userPass = null;//密码
	private int count = 0;//数量

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	

	public int getCount() {
		count ++;
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
