package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestFilter implements Filter {

	public void destroy() { }

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		res.setContentType("text/html;charset=GB2312");
        PrintWriter out=res.getWriter();
        out.println("before doFilter()");
        chain.doFilter(req, res);
        out.println("after doFilter()");
        out.close();
	}

	public void init(FilterConfig arg0) throws ServletException {	}

}
