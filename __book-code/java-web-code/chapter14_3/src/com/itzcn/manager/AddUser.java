package com.itzcn.manager;

import java.sql.SQLException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.itzcn.dao.User;
import com.itzcn.dao.UserDao;

public class AddUser {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		User user = new User(12, "user0020", "user0020");
		UserDao uDao = (UserDao) factory.getBean("userDao");
		int param = uDao.addUser(user);
		if (param > 0) {
			System.out.println("成功添加用户！");
		} else {
			System.out.println("添加用户失败！");
		}
		
	}

}
