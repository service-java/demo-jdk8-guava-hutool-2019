<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>重复登录</title>
    
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
	<script type="text/javascript">
    function warn(){
       alert("您已经登录在线，不能重复登录！");
    }
    </script>

  </head>
 
  <body onload="warn();">   
          


	<div id="one">
		<div id="two">
			<h3>欢迎登录窗内网</h3>

 	 			您已经登陆在线,不能重复登陆! <br>   
      <a href="login.jsp">返回主页</a>
		
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
			<p>
				当前在线的用户数：<%=users.size()%></p> 
		</div> 
	</div>
</body>
</html>
