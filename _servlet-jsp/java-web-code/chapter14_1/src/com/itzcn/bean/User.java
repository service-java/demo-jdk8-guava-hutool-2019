package com.itzcn.bean;

public class User {
	
	private String name = null;
	private int age = 0;
	private String sex = null;
	/**
	 * 
	 */
	public User(String name,int age,String sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	
	public void showUser(){
		System.out.println("User [name=" + name + ", age=" + age + ", sex=" + sex + "]");
	}


}
