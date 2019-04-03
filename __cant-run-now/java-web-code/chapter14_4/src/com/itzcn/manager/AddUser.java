package com.itzcn.manager;

import java.sql.SQLException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.itzcn.dao.AddUserDao;
import com.itzcn.dao.User;


public class AddUser {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		Resource resource = new ClassPathResource("applicationContext.xml");//º”‘ÿ≈‰÷√Œƒº˛
		BeanFactory factory = new XmlBeanFactory(resource);
		User user = new User(1000, "user0020", "user0020");
		AddUserDao addUserDao = (AddUserDao) factory.getBean("transactionProxy");
		addUserDao.addUser(user);
		
	}

}
