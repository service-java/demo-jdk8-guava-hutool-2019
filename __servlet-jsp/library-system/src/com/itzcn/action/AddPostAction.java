
package com.itzcn.action;

import com.itzcn.entity.Post;
import com.itzcn.service.PostService;
import com.opensymphony.xwork2.ActionSupport;

public class AddPostAction extends ActionSupport {

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
		if (postService.isExist(post.getPostName())) {
			this.addActionError("该部门已存在");
			return INPUT;
		} else {
			post.setPostNum(0);
			if (post.getPostRemark().trim().equals("")) {
				post.setPostRemark("暂无");
			}
			postService.addPost(post);
			return SUCCESS;
		}
		
	}
	
	

}
