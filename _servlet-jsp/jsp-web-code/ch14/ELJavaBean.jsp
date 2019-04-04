<%@ page language="java" contentType="text/html; charset=GBK" import="com.*"%>
<html>
<head>
<title>用EL访问JavaBean中的属性</title>
</head>
<body>
<%
	ELJavaBean id= new ELJavaBean("20130409");
	session.setAttribute("PID",id);	
%>
用EL访问JavaBean中personID属性的值: 
${sessionScope.PID.personID }
</body>
</html>