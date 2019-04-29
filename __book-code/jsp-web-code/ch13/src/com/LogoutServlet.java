package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


 public class LogoutServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   
	public LogoutServlet() {
		super();
	}   	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException,IOException
    {
		resp.setContentType("text/html;charset=gb2312");

		HttpSession session=req.getSession();
		User user=(User)session.getAttribute("user");
		session.invalidate();

		PrintWriter out=resp.getWriter();
		out.println("<html><head><title>ÍË³öµÇÂ¼</title></head><body>");
		out.println(user.getName()+"£¬ÄãÒÑÍË³öµÇÂ¼<br>");
		out.println("<a href=login.html>ÖØÐÂµÇÂ¼</a>");
		out.println("</body></html>");
		out.close();
    }
}