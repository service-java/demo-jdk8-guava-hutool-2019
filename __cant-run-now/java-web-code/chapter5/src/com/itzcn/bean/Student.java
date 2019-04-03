package com.itzcn.bean;

import java.io.Serializable;

public class Student implements Serializable {
	
	public Student() {//无参数的构造函数
		super();
	}
	private String name;//学生姓名
	private String sex;//学生性别
	private int age;//学生年龄
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	

}
