package com.itzcn.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.itzcn.bean.Student;

public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("student");
		System.out.println(student);

	}

}
