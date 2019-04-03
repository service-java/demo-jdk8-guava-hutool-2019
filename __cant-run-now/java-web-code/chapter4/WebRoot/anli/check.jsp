<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String name = request.getParameter("username");
	String pass = request.getParameter("userpass");

	if ((name != null) && (pass != null)) {
			session.setAttribute("userid", name);
			response.sendRedirect("main.jsp");
	} else {
		response.setHeader("refresh", "5; url=index.jsp");
		out.print("号码或者密码错误，请重输。");
	}
%>