package com;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: RequestServlet
 */
 public class HttpReqResServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("gb2312");
		response.setContentType("text/html;charset=gb2312");
		
		PrintWriter out = response.getWriter();
		out.println("<h3><br>客户使用的协议是:");
			   out.println("request.getProtocol()");

			out.println("<br>获取接受客户提交信息的页面：");
			   out.println(request.getServletPath());

			out.println("<br>接受客户提交信息的长度：");
			   out.println(request.getContentLength());

			out.println("<br>客户提交信息的方式：");
			   out.println(request.getMethod());

			out.println("<br>获取HTTP头文件中User-Agent的值：");
			   out.println(request.getHeader("User-Agent"));

			out.println("<br>获取HTTP头文件中Host的值：");
			   out.println(request.getHeader("Host"));

			out.println("<br>获取HTTP头文件中accept的值：");
			   out.println(request.getHeader("accept"));

			out.println("<br>获取HTTP头文件中accept-encoding的值：");
			   out.println(request.getHeader("accept-encoding"));

			out.println("<br>获取客户机的名称：");
			   out.println(request.getRemoteHost()); 

			out.println("<br>获取客户的IP地址：");
			   out.println(request.getRemoteAddr());

			out.println("<br>获取服务器的名称：");
			   out.println(request.getServerName());

			out.println("<br>获取服务器的端口号：");
			   out.println(request.getServerPort()); 

			out.println("<br>当前时间：");
			
			out.println(new Date());
           //	5秒种后自动刷新本页面
			response.setHeader("Refresh","5");
			out.println("</h3>");
			  
			  
	}  	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}   	  	    
}