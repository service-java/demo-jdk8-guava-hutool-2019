<%@ page language="java" contentType="text/html; charset=gb2312"%>
<html>
<head>
<title>重定向的页面</title>
</head>
<body>
<%
String sendname = request.getParameter("sendname");
%>
用户名：
<%=sendname%>
</body>
</html>
