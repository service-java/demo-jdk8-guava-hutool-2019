<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理平台</title>
    
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
	width:250px;	
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
			<h3>欢迎登录窗内网</h3>

				
 	 			<form action="servlet/LoginServlet" method="post">
				用户名: <input type="text" name="username" style="width:110px" /> <br>
				密&nbsp&nbsp&nbsp&nbsp码: <input type="password" name="password"
					style="width:110px" /> <br> <br>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit"
					name="commit" value="登录" style="color:#666" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
			</form>

		</div>
	<div id="three">
		 <!-- 向session接收输入的用户名 -->
			<h2>在线人员</h2>
			<%
				ArrayList<String> users= (ArrayList<String>) application.getAttribute("users");
				Iterator iter = users.iterator();
				while (iter.hasNext()) {
			%>
			<li><%=iter.next()%></li>
			<%
				}
			%>
			<p>当前在线的用户数：<%=users.size()%></p> 
		</div> 
	</div>
</body>

  

</html>
