package com.itzcn.manager;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.itzcn.dao.Info;
import com.itzcn.dao.UserDao;

public class AddUserDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		UserDao userDao = (UserDao) factory.getBean("userDao");
		Info info = new Info("hibernate", "spring");
		userDao.insert(info);

	}

}
