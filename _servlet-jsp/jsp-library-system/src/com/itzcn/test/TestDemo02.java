package com.itzcn.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.itzcn.dao.PostDao;
import com.itzcn.dao.UserDao;
import com.itzcn.entity.Post;
import com.itzcn.entity.User;

public class TestDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path="WebRoot/WEB-INF/applicationContext.xml"; 
		ApplicationContext context = new FileSystemXmlApplicationContext(path);
		UserDao userDao = (UserDao) context.getBean("userDao");
		List<User> lt = userDao.findAllUserByPage(1, 2);
		for (User user : lt) {
			System.out.println(user.getName());
		}
		System.out.println(userDao.getUserCount());
		System.out.println(userDao.getPostUserCount(1));
		
		PostDao postDao = (PostDao) context.getBean("postDao");
		
		Set<User> set = postDao.findByPostId(1).getUsers();
		System.out.println(set.size());
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			User user = (User) iterator.next();
			System.out.println(user.getName());
			
		}

	}

}
