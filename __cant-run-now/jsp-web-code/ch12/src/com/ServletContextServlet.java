package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: ServletContextServlet
 *
 */
 public class ServletContextServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		Integer count = null;
		synchronized(context)
		{
			count = (Integer) context.getAttribute("counter");
			if (null == count)
			{
				count = new Integer(1);
			}
			else
			{
				count = new Integer(count.intValue() + 1);
			}
			context.setAttribute("counter", count);
		}
		
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();

		out.println("<html><head>");
		out.println("<title>ServletContextServlet例子</title>");
		out.println("</head><body>");
		out.println("页面" + "<b>" + count + "</b>" + "次被访问！");
		out.println("</body></html>");
		out.close();
	}  	  	    
}