package com.itzcn.action;

import java.util.List;

import com.itzcn.entity.Post;
import com.itzcn.service.PostService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowPostsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PostService postService;
	private List<Post> posts;
	private Post post;
	
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public PostService getPostService() {
		return postService;
	}

	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	
	
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public String execute(){
		
		posts = postService.showPosts();
		return SUCCESS;
		
	}

}
