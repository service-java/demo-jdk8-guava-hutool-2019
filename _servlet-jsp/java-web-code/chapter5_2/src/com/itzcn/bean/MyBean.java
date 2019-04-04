package com.itzcn.bean;

public class MyBean {
	
	private String name = null;//用户名
	private String pass = null;//密码
	private int count = 0;//登录次数
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getCount() {
		count ++;
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
