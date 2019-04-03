<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");%>
	<% if (username.equals("admin")&&password.equals("888888")) {%>
	<%
		response.sendRedirect("main.jsp");
		 %>
	<%}	
		  else {
			response.sendError(400,"ÓÃ»§Ãû»òÃÜÂë´íÎó£¬µÇÂ¼Ê§°Ü£¡");
		} %>
