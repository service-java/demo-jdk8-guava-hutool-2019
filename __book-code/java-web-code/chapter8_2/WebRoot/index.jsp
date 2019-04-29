<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>主页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style>
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
		<c:choose>
		<c:when test="${empty sessionScope.user}">
			<form action="deal.jsp" method="post">
			<table >
				<tr>
					<td>用户名</td>
					<td><input type="text" name="userName" size="20"></td>
				</tr>
				<tr>
					<td>密&nbsp;&nbsp;&nbsp;&nbsp;码</td>
					<td><input type="password" name="pass" size="21"></td>
				</tr>
				<tr>
					<td align="center"></td>
					<td align="center"><input type="submit" value="登录"><input type="reset" value="重置"></td>
				</tr>
			</table>
			</form>
		</c:when>
		<c:otherwise>
			欢迎${sessionScope.user }登录！<c:url var="url" value="logout.jsp"></c:url>
			<a href ="${url }">退出</a>
		</c:otherwise>
		</c:choose>
		</div>
	<div id="three">
		</div> 
	</div>
  </body>
</html>
