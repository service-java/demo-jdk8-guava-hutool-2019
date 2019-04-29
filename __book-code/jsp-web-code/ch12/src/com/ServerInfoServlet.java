package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: ServerInfoServlet
 *
 */
 public class ServerInfoServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

		private Map initParams = new LinkedHashMap();
		private String servletName = null;
		
			public void service(ServletRequest request, ServletResponse response)	throws ServletException,IOException {
			response.setContentType("text/html;charset=GB2312");
			PrintWriter out = response.getWriter();
			ServletContext sc = getServletContext();

			out.println("<html>");
			out.println("<body>");
			out.println("<head>");
			out.println("<title>获取服务器端信息</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h2>服务器端信息：</h2>");
			out.println("<table width=\"500\" border=\"1\">");

			out.println("<tr>");
			out.println("<td width=\"175\">站点名</td>");
			out.println("<td width=\"325\">" + request.getServerName() + "</td>");
			out.println("</tr>");

			out.println("<tr>");
			out.println("<td>端口号</td>");
			out.println("<td>" + request.getServerPort() + "</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>服务器类型</td>");
			out.println("<td>" + sc.getServerInfo() + "</td>");
			out.println("</tr>");

			out.println("<tr>");
			out.println("<td>支持Servlet版本</td>");
			out.println("<td>"+sc.getMajorVersion()+"."+sc.getMinorVersion()+"</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>服务器属性</td>");
			out.println("<td>");
			// 获得服务器属性集合
			Enumeration attributes = sc.getAttributeNames();
			while (attributes.hasMoreElements()) {
				String name = (String)attributes.nextElement();
				out.println(name);
			}
			out.println("</td>");
			out.println("</tr>");		
			
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}

		
 }