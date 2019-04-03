package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: HelloWorld
 */
 public class HelloServlet extends GenericServlet {

		public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {	
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<body>");
			out.println("<head>");
			out.println("<title>¼Ì³ÐGenericServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Hello World!</h1>");
			out.println("</body>");
			out.println("</html>");
		}
}