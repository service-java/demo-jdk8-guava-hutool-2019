package com.itzcn.action;

import com.itzcn.entity.Post;
import com.itzcn.entity.User;
import com.itzcn.service.PostService;
import com.itzcn.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class DelUserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PostService postService;
	private UserService userService;
	private Integer userId;
	
	
	public PostService getPostService() {
		return postService;
	}
	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String execute(){
		User user = userService.showByUserId(userId);
		if (user!=null) {
			Post post = postService.showByPostId(user.getPost().getPostId());
			userService.delUser(user);
			Integer postNum = post.getPostNum() - 1;
			post.setPostNum(postNum);
			postService.upPost(post);
			return SUCCESS;
		} else {
			return INPUT;
		}
	}

}
