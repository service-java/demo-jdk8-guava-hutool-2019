package com.itzcn.test;

import java.io.File;
import java.util.List;

import com.itzcn.entity.Post;
import com.itzcn.util.UtilMethod;

public class TestDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "D:\\Program Files\\MyEclipse\\Workspaces\\.metadata\\.me_tcat\\webapps\\chapter15\\";
		;
		List<Post> posts = UtilMethod.getPosts(path);
		for (Post post : posts) {
			System.out.println(post.getPostName());
		}
		

	}


}
