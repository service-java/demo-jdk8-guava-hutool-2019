<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>paramValues对象的应用</title>
    
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
    
    <form action="paramValues.jsp" method="post">
    	<input name="subject" type="checkbox"  value="Java基础">Java基础
		<input name="subject" type="checkbox"  value="ASP.NET开发指南">ASP.NET开发指南
		<input name="subject" type="checkbox"  value="Linux基础学习">Linux基础学习
		<input name="subject" type="checkbox"  value="Oracle学习手册">Oracle学习手册
		<input name="subject" type="checkbox"  value="JSP Web学习">JSP Web学习
		<input type="submit" value="提交">
    </form>
    <%
	request.setCharacterEncoding("UTF-8");
 %>
所选科目为：	${paramValues.subject[0]}
			${paramValues.subject[1]}
			${paramValues.subject[2]}
			${paramValues.subject[3]}
			${paramValues.subject[4]}
    
  </body>
</html>
