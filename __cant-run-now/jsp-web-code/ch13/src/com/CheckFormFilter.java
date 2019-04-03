package com;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CheckFormFilter implements Filter {

	protected FilterConfig config;

	public void destroy() {}

	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
			throws IOException, ServletException {
			String name = request.getParameter("name");
			String strAge = request.getParameter("age");
			int age;

			RequestDispatcher dispatcher =
				request.getRequestDispatcher("CheckFormFail.jsp");

			if (name == null || strAge == null) {
				// 重定向到formCheckFail.jsp页面
				dispatcher.forward(request, response);
				return;
			}
			try{
				age = Integer.parseInt(strAge);
				if(age>100 || age<0){
					dispatcher.forward(request, response);
					return;
					}			
			}catch (NumberFormatException e) {
				// 重定向到formCheckFail.jsp页面
				dispatcher.forward(request, response);
				return;
			}
			chain.doFilter(request, response);		
			
		}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
	}


}
