<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%
request.setCharacterEncoding("gb2312");
%>
<html>
<head>
<title>设置 session 数据</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String sex = request.getParameter("sex");

	session.setAttribute("name", name);
	session.setAttribute("sex", sex);
%>
<a href="usingSession.jsp"> 显示已设置的session 数据内容 </a>
</body>
</html>
