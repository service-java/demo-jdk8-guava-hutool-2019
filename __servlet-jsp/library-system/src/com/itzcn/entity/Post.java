package com.itzcn.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Post entity. @author MyEclipse Persistence Tools
 */

public class Post implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer postId;
	private String postName;
	private Integer postNum;
	private String postRemark;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Post() {
	}

	/** minimal constructor */
	public Post(String postName, Integer postNum, String postRemark) {
		this.postName = postName;
		this.postNum = postNum;
		this.postRemark = postRemark;
	}

	/** full constructor */
	public Post(String postName, Integer postNum, String postRemark, Set users) {
		this.postName = postName;
		this.postNum = postNum;
		this.postRemark = postRemark;
		this.users = users;
	}

	// Property accessors

	public Integer getPostId() {
		return this.postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return this.postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public Integer getPostNum() {
		return this.postNum;
	}

	public void setPostNum(Integer postNum) {
		this.postNum = postNum;
	}

	public String getPostRemark() {
		return this.postRemark;
	}

	public void setPostRemark(String postRemark) {
		this.postRemark = postRemark;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}