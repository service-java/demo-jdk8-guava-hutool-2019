package com.itzcn.service.impl;

import java.util.List;
import java.util.Set;

import com.itzcn.dao.PostDao;
import com.itzcn.entity.Post;
import com.itzcn.entity.User;
import com.itzcn.service.PostService;

public class PostServiceImpl implements PostService {

	private PostDao postDao;
	
	
	public PostDao getPostDao() {
		return postDao;
	}

	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}

	public void addPost(Post post) {
		postDao.insertPost(post);
	}

	public void delPost(Post post) {
		postDao.delPost(post);
	}

	public void upPost(Post post) {
		postDao.upPost(post);
	}

	public Post showByPostId(Integer postId) {
		return postDao.findByPostId(postId);
	}

	public List<Post> showPosts() {
		return postDao.findAllPost();
	}

	public List<Post> showByPostName(String postName) {
		return postDao.findByPostName(postName);
	}

	public boolean isExist(String postName) {
		boolean flag = false;
		if (showByPostName(postName).size()>0) {
			flag = true;
		} 
		return flag;
	}

	public boolean isUpdate(Post post) {
		boolean flag = false;
		if (showByPostName(post.getPostName()).size()>0) {
			for (Post p : showByPostName(post.getPostName())) {
				if(p.getPostId().equals(post.getPostId())){
					flag = true;
				}
			}
		}else{
			flag = true;
		}
		return flag;
	}

	public boolean isDel(Integer postId) {
		boolean flag = true;
		if (showByPostId(postId).getPostNum()>0) {
			flag = false;
		} 
		return flag;
	}

	public int getPostUserCount(Integer postId) {
		int count = 0;
		@SuppressWarnings("unchecked")
		Set<User> set = postDao.findByPostId(postId).getUsers();
		count = set.size();
		return count;
	}

}
