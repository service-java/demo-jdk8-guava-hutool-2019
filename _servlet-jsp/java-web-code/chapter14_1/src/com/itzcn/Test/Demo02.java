package com.itzcn.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.itzcn.bean.User;

public class Demo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Userbean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		User user = (User) factory.getBean("user");
		user.showUser();

	}

}
