<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册页面</title>

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
	margin-top:80px;
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
		<p style="font-size:20px" align="center">会员信息注册</p>
			<form action="register.jsp" method="post">
    	用&nbsp;&nbsp;户&nbsp;&nbsp;名：<input type="text" name = "userName" size="20"><br>
    	密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name = "userPass" size="21" ><br>
    	性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：<input type="radio" name = "sex" value="男" checked="checked">男
    	<input type="radio" name = "sex" value="女">女<br>
    	年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：<input type="text" name = "age" ><br>
    	兴趣爱好：<input type="checkbox" name="likes" value="乒乓球">乒乓球
    	<input type="checkbox" name="likes" value="足球">足球
    	<input type="checkbox" name="likes" value="上网">上网
    	<input type="checkbox" name="likes" value="聊天">聊天
    	<input type="checkbox" name="likes" value="看书">看书
    	<input type="checkbox" name="likes" value="玩游戏">玩游戏
    	<br>
    	职&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业：<select name="job">
    		<option value="其它" >其它
    		<option value="学生" >学生
    		<option value="工程师" >工程师
    		<option value="白领" >白领
    	</select><br>
    	<input type="submit" value="提交">
    </form>
		</div>
	<div id="three">

		</div> 
	</div>
  </body>
</html>
