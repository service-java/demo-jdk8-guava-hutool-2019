package com.itzcn.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itzcn.bean.User;

public class LoginFilter implements Filter {
	
	private FilterConfig config = null;
	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("gbk");
		HttpSession session = ((HttpServletRequest) request).getSession();
		if (session.getAttribute("user") == null) {
			PrintWriter out = response.getWriter();
			out.print("<script language = javascript>alert('Äã»¹Ã»ÓÐµÇÂ¼£¡£¡£¡');window.location.href='../login.jsp;'</script>");
		} else {
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
	}

	/**
	 * Constructor of the object.
	 */
	public LoginFilter() {
		super();
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}



	

}
