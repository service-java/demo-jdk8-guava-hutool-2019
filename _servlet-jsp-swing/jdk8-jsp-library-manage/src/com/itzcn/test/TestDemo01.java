package com.itzcn.test;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.itzcn.dao.AdminDao;
import com.itzcn.dao.PostDao;
import com.itzcn.dao.UserDao;
import com.itzcn.entity.Admin;
import com.itzcn.entity.Post;
import com.itzcn.entity.User;

public class TestDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path="WebRoot/WEB-INF/applicationContext.xml"; 
		ApplicationContext context = new FileSystemXmlApplicationContext(path);
		PostDao postDao = (PostDao) context.getBean("postDao");
		Post post =  postDao.findByPostId(1);
		//System.out.println(post.getPostName());
		UserDao userDao = (UserDao) context.getBean("userDao");
		List<User> lt = userDao.findByPostId(1);
		for (User user : lt) {
			System.out.println(user.getBirthday());
		}
		
//		AdminDao adminDao = (AdminDao) context.getBean("adminDao");
//		List<Admin> adminLt = adminDao.findByAdminUserNameAndPwd("admin", "admin");
//		for (Admin admin : adminLt) {
//			System.out.println(admin.getAdminName());
//		}
		
		

	}

}
