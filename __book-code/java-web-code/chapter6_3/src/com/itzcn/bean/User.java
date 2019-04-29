package com.itzcn.bean;

public class User {
	
	private String name = null;//ÓÃ»§Ãû
	private String pass = null;//ÃÜÂë
	
	
	public User(String name,String pass) {
		this.name = name;
		this.pass = pass;
	}
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
	
}
