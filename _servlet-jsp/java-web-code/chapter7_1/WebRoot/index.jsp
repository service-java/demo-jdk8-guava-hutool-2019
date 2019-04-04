<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    ${"汇智科技"}<br>
     ${'汇智科技'}<br>
     ${1/0}<br>
     ${3 ge 4 }<br>
     ${username=="itzcn"&&pwd=='123456' }<br>
     
     ${pageContext.request }<br>
     ${pageContext.request.requestURL }<br>
     ${pageContext.response.contentType}<br>
     ${pageContext.out.bufferSize}<br>
     ${pageContext.session.maxInactiveInterval}<br>
     ${pageContext.exception.message}<br>
     ${pageContext.page.class}<br>
     ${pageContext.servletContext.contextPath}
  </body>
</html>
