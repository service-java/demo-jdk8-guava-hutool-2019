package com.itzcn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {
	
	private String sayHello;//定义sayHello属性
	
	public String getSayHello() {
		return sayHello;
	}
	public void setSayHello(String sayHello) {
		this.sayHello = sayHello;
	}
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		return new ModelAndView("index","hello",sayHello);//返回一个ModelAndView对象
	}

}
