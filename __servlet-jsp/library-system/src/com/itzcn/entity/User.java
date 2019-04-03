package com.itzcn.entity;

import java.util.Date;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private Post post;
	private String name;
	private String userName;
	private String userPass;
	private String sex;
	private Date birthday;
	private Date entryDate;
	private String photo;
	private String remark;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Post post, String name, String userName, String userPass,
			String sex, Date birthday, Date entryDate, String photo) {
		this.post = post;
		this.name = name;
		this.userName = userName;
		this.userPass = userPass;
		this.sex = sex;
		this.birthday = birthday;
		this.entryDate = entryDate;
		this.photo = photo;
	}

	/** full constructor */
	public User(Post post, String name, String userName, String userPass,
			String sex, Date birthday, Date entryDate, String photo,
			String remark) {
		this.post = post;
		this.name = name;
		this.userName = userName;
		this.userPass = userPass;
		this.sex = sex;
		this.birthday = birthday;
		this.entryDate = entryDate;
		this.photo = photo;
		this.remark = remark;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}