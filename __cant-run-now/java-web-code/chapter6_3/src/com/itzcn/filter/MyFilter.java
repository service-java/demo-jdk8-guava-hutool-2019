package com.itzcn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	public void destroy() {//销毁
		System.out.println("MyFilter被销毁");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {//处理
		// TODO Auto-generated method stub
		arg2.doFilter(arg0, arg1);//将请求向下传递

	}

	public void init(FilterConfig arg0) throws ServletException {//初始化
		System.out.println("MyFilter被初始化");
	}

}
