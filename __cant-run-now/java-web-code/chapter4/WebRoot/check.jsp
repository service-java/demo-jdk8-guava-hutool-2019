<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);

	String action = request.getParameter("action");
	if ((action != null) && action.equals("login")) {
		String name = request.getParameter("username");
		String pass = request.getParameter("userpass");
		if (name.equals("admin") && pass.equals("123456")) {
			session.setAttribute("userid", name);
			response.sendRedirect("home.jsp");
		}
	} else {
		response.setHeader("refresh", "5; url=login.jsp");
		out.print("用户名或者密码错误，请重输。");
	}
%>