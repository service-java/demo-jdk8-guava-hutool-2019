<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Map集合元素的读取</title>
    
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
    <%Map<String,String> cityMap = new HashMap<String,String>();
    cityMap.put("1", "郑州");
    cityMap.put("2", "北京");
    cityMap.put("3", "重庆");
    cityMap.put("4", "成都");
    application.setAttribute("citys", cityMap);
     %>
     
  ${applicationScope.citys["1"] }<!-- 输出集合中“1”键所对应的值 -->
  </body>
</html>
