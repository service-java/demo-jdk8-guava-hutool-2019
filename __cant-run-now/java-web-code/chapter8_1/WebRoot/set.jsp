<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="user" class="com.itzcn.bean.User" ></jsp:useBean>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>使用 &lt;c:set&gt;标签</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	--><style>
#one {
	margin:auto;
	background:url(images/logo.jpg);
	background-repeat:no-repeat;
	height:392px;
	width:722px;	
}
#two {
	position:relative;
	font-size: 12px;
	margin-top:150px;
	margin-left:190px;	
	width:500px;	
	float:left;
	font-size: 16px;
}
#three {
 position:relative;
 width:200px; 
 margin-top:150px;
 margin-right:60px;
 float:right;
}
</style>

  </head>
  
  <body>
  <div id="one">
		<div id="two">
		<c:set value="王华" var="name1" scope="session"></c:set>
  <c:set var="name2" scope="session">李欣欣</c:set>
  <c:set value="孙子明" target="${user}" property="name"></c:set>
  <c:set target="${user}" property="age">19</c:set>
  <li>从session中得到的值：${sessionScope.name1}</li>
  <li>从session中得到的值：${sessionScope.name2}</li>
  <li>从Bean中获取对象user的name值：<c:out value="${user.name}"></c:out></li>
  <li>从Bean中获取对象user的age值：<c:out value="${user.age}"></c:out></li>
		</div>
	<div id="three">

		</div> 
	</div>
       
       
  </body>
</html>
