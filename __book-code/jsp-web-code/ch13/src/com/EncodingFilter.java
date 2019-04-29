package com;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {
	
	protected String encoding = null;
	protected FilterConfig config;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;

		// 得到在web.xml中配置的编码
		this.encoding = filterConfig.getInitParameter("Encoding");
	}

	public void doFilter(
		ServletRequest request,
		ServletResponse response,
		FilterChain chain)
		throws IOException, ServletException {
		if (request.getCharacterEncoding() == null) {			
			// 得到指定的编码
			String encode = getEncoding();
			if (encode != null) {				
				//设置request的编码
				request.setCharacterEncoding(encode);
				response.setCharacterEncoding(encode);		
			}
		}
		chain.doFilter(request, response);
	}

	protected String getEncoding() {
		return encoding;
	}

	public void destroy() {
		// TODO 自动生成方法存根

	}
	
}
