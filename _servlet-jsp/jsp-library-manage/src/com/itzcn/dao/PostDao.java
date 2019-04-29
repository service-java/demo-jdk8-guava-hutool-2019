package com.itzcn.dao;

import java.util.List;

import com.itzcn.entity.Post;

public interface PostDao {
	
	public void insertPost(Post post);//插入Post
	public void upPost(Post post);//更新Post
	public void delPost(Post post);//删除Post
	
	public List<Post> findAllPost();//列出Post
	
	public Post findByPostId(Integer postId);//根据PostId查询
	
	public List<Post> findByPostName(String postName);//根据PostName查询
	
	
}
