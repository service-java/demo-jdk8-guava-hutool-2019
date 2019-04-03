package com.itzcn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		People people = (People) ac.getBean("ProxyFactoryBean");
		people.speaking();
		people.runing();
		people.loving();
		people.died();
	}

}
