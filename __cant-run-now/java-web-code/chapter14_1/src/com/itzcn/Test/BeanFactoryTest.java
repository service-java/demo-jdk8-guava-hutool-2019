package com.itzcn.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.itzcn.bean.Student;

public class BeanFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("student");
		student.setName("ÁõÃ÷öÎ");
		student.setAge(22);
		student.setSex("ÄÐ");
		System.out.println(student);
	}

}
