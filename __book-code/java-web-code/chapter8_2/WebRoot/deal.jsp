<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>deal</title>
    
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
  	<c:choose>
  		<c:when test="${param.userName=='itzcn'&&param.pass=='123456' }">
  			<c:set var="user" scope="session" value="${param.userName }"></c:set>
  			<c:redirect url="index.jsp"></c:redirect>
  		</c:when>
  		<c:otherwise>
  			<script language="javascript">
  				alert("您输入的用户名或密码错误！");
  				window.location.href="index.jsp";
  			</script>
  		</c:otherwise>
  	</c:choose>
    
  </body>
</html>
