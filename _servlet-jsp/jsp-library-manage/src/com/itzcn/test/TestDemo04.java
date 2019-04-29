package com.itzcn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.itzcn.service.PostService;
import com.itzcn.service.UserService;

public class TestDemo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path="WebRoot/WEB-INF/applicationContext.xml"; 
		ApplicationContext context = new FileSystemXmlApplicationContext(path);
		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService.showByUserId(1).getPost().getPostName());

	}

}
