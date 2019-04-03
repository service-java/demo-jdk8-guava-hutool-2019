package com.itzcn.action;

import com.itzcn.entity.Post;
import com.itzcn.service.PostService;
import com.opensymphony.xwork2.ActionSupport;

public class UpPostAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PostService postService;
	private Post post;
	public PostService getPostService() {
		return postService;
	}
	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
	public String execute(){
		if (postService.isUpdate(post)) {
			Post p = postService.showByPostId(post.getPostId());
			post.setPostNum(p.getPostNum());
			postService.upPost(post);
			return SUCCESS;
		} else {
			addActionError("ÐÞ¸ÄÊ§°Ü");
			return INPUT;
		}
	}
	
	

}
