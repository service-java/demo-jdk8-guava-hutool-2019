<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="/WEB-INF/function.tld"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>定义和使用EL函数</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
	width:700px;	
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
			<form action="index.jsp" method="post">
		要转换的字符串：<input type="text" name="text" /> 
				<input type="submit" name="commit" value="提交" /> 
				<input type="reset"	value="重置" />
	</form>
	<%request.setCharacterEncoding("UTF-8"); %>
	转换之前的字符串为：${param.text}<br>
	转换为大写字母的字符串为： ${fn:toUpper(param.text)}<br>
	转换为小写字母的字符串为：${fn:toLower(param.text) }

		</div>
	<div id="three">

		</div> 
	</div>
    	

  </body>
</html>
