package com.itzcn.manager;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class AddUserDemo02 {
	
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = null;
		Resource resource = new ClassPathResource("jdbcTemplate.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		jdbcTemplate = (JdbcTemplate) factory.getBean("jdbcTemplate");
		String sql = "insert into info(id,name,pass) values(50,'user50','user50')";
		int param =	jdbcTemplate.update(sql);
		if (param > 0) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}

}
