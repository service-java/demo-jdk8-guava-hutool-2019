<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>数组集合元素的读取</title>
    
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
    <%String[] citys = {"郑州","北京","重庆","成都"};
    request.setAttribute("citys", citys);
     %>
     
     <%String[] getCitys = (String[])request.getAttribute("citys");
     for(int i=0;i<getCitys.length;i++){
     request.setAttribute("i", i);
     %>
     [${i}]:${citys[i]}<br>
     <%} %>
  </body>
</html>
