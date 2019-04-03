package com.itzcn.action;

import com.itzcn.entity.Post;
import com.itzcn.service.PostService;
import com.opensymphony.xwork2.ActionSupport;

public class DelPostAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer postId;
	private PostService postService;
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public PostService getPostService() {
		return postService;
	}
	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	
	public String execute(){
		if (postService.isDel(postId)) {
			Post post = postService.showByPostId(postId);
			postService.delPost(post);
			return SUCCESS;
		} else {
			addActionError("该部门中有员工，故删除失败");
			return INPUT;
		}
	}

}
