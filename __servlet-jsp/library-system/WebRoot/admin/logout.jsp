<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>退出</title>
    
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
//设置无缓存  
response.setHeader("progma","no-cache");  
response.setHeader("Cache-Control","no-cache");  
response.setDateHeader("Expires",0);  
%> 
    <%request.getSession().removeAttribute("adminName");
    
   request.getSession().invalidate() ;
    %>
  <%  response.setHeader("refresh","0.3;URL=/chapter15/login.jsp") ;%> <br>
  </body>
</html>
