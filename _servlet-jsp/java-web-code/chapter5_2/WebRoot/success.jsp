<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:useBean id="myBean" class="com.itzcn.bean.MyBean" scope="request"></jsp:useBean>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录成功</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<%
	if (request.getParameter("name") != null) {
%>
<jsp:setProperty property="*" name="myBean" />
<font color="red">【<jsp:getProperty property="name"
		name="myBean" />】用户已登录<jsp:getProperty property="count"
		name="myBean" />次</font>
		 <%
	}
%>

  </body>
</html>
