package com.itzcn.service;

import java.util.List;

import com.itzcn.entity.Post;

public interface PostService {
	
	public void addPost(Post post);//添加部门
	public void delPost(Post post);//删除部门
	public void upPost(Post post);//更新部门信息
	public Post showByPostId(Integer postId);//根据部门编号查询部门信息
	public List<Post> showPosts();//显示所有部门信息
	public List<Post> showByPostName(String postName);//根据部门名称查询部门信息
	public boolean isExist(String postName);//部门名称是否存在
	public boolean isUpdate(Post post);//部门信息是否可以更新
	public boolean isDel(Integer postId);//部门信息是否可以删除
	public int getPostUserCount(Integer postId);//根据部门编号查询该部门员工数量

}
