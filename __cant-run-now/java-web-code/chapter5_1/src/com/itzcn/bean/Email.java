package com.itzcn.bean;

import java.io.Serializable;

public class Email implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String mail = null;//Email地址
	private boolean isMail = false;//是否为一个标准的Email地址
	public Email() {//默认无参数的构造函数
		super();
		// TODO Auto-generated constructor stub
	}
	public Email(String mail) {//参数为mail的构造方法
		this.mail = mail;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public boolean isMail() {
		String regex =  "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		if (mail.matches(regex)) {
			isMail = true;
		}
		return isMail;
	}
	public void setMail(boolean isMail) {
		this.isMail = isMail;
	}
}
