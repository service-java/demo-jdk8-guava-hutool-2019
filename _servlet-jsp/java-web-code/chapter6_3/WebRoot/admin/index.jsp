<%@page import="com.itzcn.bean.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

	<style media="all" type="text/css">@import "css/all.css";</style>


  </head>
 
  <body>
<div id="main">
	<div id="header">
		<a href="index.html" class="logo"><img src="images/logo.gif"  alt="" /></a>
		<ul id="top-navigation">
			<li class="active"><span><span>首页</span></span></li>
			<li><span><span><a href="#">用户</a></span></span></li>
			<li><span><span><a href="#">订单</a></span></span></li>
			<li><span><span><a href="#">全局</a></span></span></li>
			<li><span><span><a href="#">统计</a></span></span></li>
			<li><span><span><a href="#">工具</a></span></span></li>
			<li><span><span><a href="#">扩展</a></span></span></li>
		</ul>
	</div>
	<div id="middle">
		<div id="left-column">
			<h3>系统设置</h3>
			<ul class="nav">
				<li><a href="#">站点基本设置</a></li>
				<li><a href="#">本地路径设置</a></li>
				<li><a href="#">积分设置</a></li>
				<li><a href="#">缩略图设置</a></li>
				<li><a href="#">水印设置</a></li>
				<li class="last"><a href="#">RSS设置</a></li>
			</ul>
			<a href="#" class="link">用户组权限</a>
			<a href="#" class="link">公告管理</a>
		</div>
		<div id="center-column">
			<div class="top-bar">
				<a href="#" class="button">添加新配置 </a>
				<h1>  <%User user = (User)request.getSession().getAttribute("user"); %>
    欢迎用户[<%=user.getName() %>]登录！ </h1>
				<div class="breadcrumbs"><a href="#">首页</a> / <a href="#">内容搜索</a></div>
			</div><br />
		  <div class="select-bar">
		    <label>
		    <input type="text" name="textfield" />
		    </label>
		    <label>
		      <input type="submit" name="Submit" value="开始搜索" />
		    </label>
		  </div>
			<div class="table">
				<img src="images/bg-th-left.gif" width="8" height="7" alt="" class="left" />
				<img src="images/bg-th-right.gif" width="7" height="7" alt="" class="right" />
				<table class="listing" cellpadding="0" cellspacing="0">
					<tr>
						<th class="first" width="177">Header Here</th>
						<th>Header</th>
						<th>Head</th>
						<th>Header</th>
						<th>Header</th>
						<th>Head</th>
						<th>Header</th>
						<th class="last">Head</th>
					</tr>
					<tr>
						<td class="first style1">- Lorem Ipsum </td>
						<td><img src="images/add-icon.gif" width="16" height="16" alt="" /></td>
						<td><img src="images/hr.gif" width="16" height="16" alt="" /></td>
						<td><img src="images/save-icon.gif" width="16" height="16" alt="" /></td>
						<td><img src="images/edit-icon.gif" width="16" height="16" alt="" /></td>
						<td><img src="images/login-icon.gif" width="16" height="16" alt="" /></td>
						<td><img src="images/save-icon.gif" width="16" height="16" alt="save" /></td>
						<td class="last"><img src="images/add-icon.gif" width="16" height="16" alt="add" /></td>
					</tr><tr class="bg">
						<td class="first style1">- Lorem Ipsum </td>
						<td><img src="images/add-icon.gif" width="16" height="16" alt="add" /></td>
						<td><img src="images/hr.gif" width="16" height="16" alt="" /></td>
						<td><img src="images/save-icon.gif" width="16" height="16" alt="save" /></td>
						<td><img src="images/edit-icon.gif" width="16" height="16" alt="edit" /></td>
						<td><img src="images/login-icon.gif" width="16" height="16" alt="login" /></td>
						<td><img src="images/save-icon.gif" width="16" height="16" alt="save" /></td>
						<td class="last"><img src="images/add-icon.gif" width="16" height="16" alt="add" /></td>
					</tr>
				</table>
				<div class="select">
					<strong>页跳转: </strong>
				  <select>
						<option>1</option>
					</select>
			  </div>
			</div>
		</div>
		<div id="right-column">
			<strong class="h">提示</strong>
			<div class="box">
            程序版本：itZcn BCM V1.0  <a>查看最新版</a><br/>
            服务器软件：Microsoft-IIS/6.0 <br/>
            数据库大小：10.4M
            </div>
	  </div>
	</div>
	<div id="footer"></div>
    <div style="text-align:center">Powered by itZcn BCM V1.0 &copy; 2010 itZcn.com </div>

</div>

</body>
</html>
