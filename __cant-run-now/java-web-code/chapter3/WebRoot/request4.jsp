<%@page import="com.Book"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>使用request对象操作属性</title>
<link href="style/css/reset.css" rel="stylesheet" type="text/css"
	media="screen" />
<link href="style/css/layout.css" rel="stylesheet" type="text/css"
	media="screen" />
</head>
<body>
	<div id="wrapper">
		<h1>
			&nbsp; <a href="#"><span>后台管理系统</span> </a>
		</h1>
		<ul id="mainNav">
			<li><a href="#" class="active">后台首页</a></li>
			<!-- Use the "active" class for the active menu item  -->
			<li><a href="#">用户</a></li>
			<li><a href="#">订单</a></li>
			<li><a href="#">全局</a></li>
			<li><a href="#">统计</a></li>
			<li><a href="#">工具</a></li>
			<li><a href="#">扩展</a></li>
			<li class="logout"><a href="#">退出</a></li>
		</ul>
		<div id="containerHolder">
			<div id="container">
				<div id="sidebar">
					<ul class="sideNav">
						<li><a href="#">站点基本设置</a></li>
						<li><a href="#">文件上传设置</a></li>
						<li><a href="#">积分设置</a></li>
						<li><a href="#">缩略图设置</a></li>
						<li><a href="#">邮件设置</a></li>
						<li><a href="#">公告管理</a></li>
					</ul>
				</div>
				<div id="main">
					﻿
					<h2>
						<a href="#">首页</a> &raquo; <a href="#" class="active">查看信息</a>
					</h2>
					<style>
table {
	font-size: 14px;
}
</style>
					<% 
					Book book = new Book();
						 book.setAuthor("祝红涛");
						 book.setId(123456);
						 book.setTitle("JSP学习最佳教程");
						 request.setAttribute("bk", book);
						 request.setAttribute("today",new Date()); 
					%>
					<%
Book bk;
bk=(Book)request.getAttribute("bk"); %>
					<table cellpadding="3" cellspacing="3">
						<tr>
							<td>图书编号：</td>
							<td>
								<%=bk.getId()%>
							</td>
						</tr>
						<tr>
							<td>图书标题：</td>
							<td><%=bk.getTitle()%></td>

						</tr>
						<tr>
							<td>图书作者：</td>
							<td><%=bk.getAuthor()%></td>
						</tr>
						<tr>
							<td>查看时间：</td>
							<td><%=request.getAttribute("today")%></td>
						</tr>
					</table>
					<hr />
					<%
						request.removeAttribute("today");
						out.print("现在时间是：" + request.getAttribute("today"));
					%>
<br/><br/>

				</div>
				<!-- // #main -->

				<div class="clear"></div>
			</div>
			<!-- // #container -->
		</div>
		<!-- // #containerHolder -->
	</div>
	<!-- // #wrapper -->
</body>
</html>