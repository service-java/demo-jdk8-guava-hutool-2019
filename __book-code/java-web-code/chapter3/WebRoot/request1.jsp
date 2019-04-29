<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>使用request对象获取客户端信息</title>
<link href="style/css/reset.css" rel="stylesheet" type="text/css"
	media="screen" />
<link href="style/css/layout.css" rel="stylesheet" type="text/css"
	media="screen" />
</head>
<body>
	<div id="wrapper">
		<h1>
			<a href="#"><span>后台管理系统</span> </a>
		</h1>
		<ul id="mainNav">
			<li><a href="#" class="active">后台首页</a>
			</li>
			<!-- Use the "active" class for the active menu item  -->
			<li><a href="#">用户</a>
			</li>
			<li><a href="#">订单</a>
			</li>
			<li><a href="#">全局</a>
			</li>
			<li><a href="#">统计</a>
			</li>
			<li><a href="#">工具</a>
			</li>
			<li><a href="#">扩展</a>
			</li>
			<li class="logout"><a href="#">退出</a>
			</li>
		</ul>
		<div id="containerHolder">
			<div id="container">
				<div id="sidebar">
					<ul class="sideNav">
						<li><a href="#">站点基本设置</a>
						</li>
						<li><a href="#">文件上传设置</a>
						</li>
						<li><a href="#">积分设置</a>
						</li>
						<li><a href="#">缩略图设置</a>
						</li>
						<li><a href="#">邮件设置</a>
						</li>
						<li><a href="#">公告管理</a>
						</li>
					</ul>
				</div>
				<div id="main">
					﻿
					<h2>
						<a href="#">首页</a> &raquo; <a href="#" class="active">查看信息</a>
					</h2>

					<table cellpadding="3" cellspacing="3">
						<tr>
							<td>客户使用的协议是:</td>
							<td><%=request.getProtocol()%></td>
						</tr>
						<tr>
							<td>获取接受客户提交信息的页面：</td>
							<td><%=request.getServletPath()%></td>
						</tr>
						<tr>
							<td>接受客户提交信息的长度：</td>
							<td>
								<%= request.getContentLength()%>
							</td>
						</tr>
						<tr>
							<td>客户提交信息的方式：</td>
							<td><%=request.getMethod()%></td>
						</tr>
						<tr>
							<td>获取HTTP头文件中User-Agent的值：</td>
							<td><%=request.getHeader("User-Agent")%></td>
						</tr>
						<tr>
							<td>获取HTTP头文件中accept的值：</td>
							<td><%=request.getHeader("accept")%></td>
						</tr>
						<tr>
							<td>获取HTTP头文件中Host的值：</td>
							<td><%=request.getHeader("Host")%></td>
						</tr>
						<tr>
							<td>获取HTTP头文件中accept-encoding的值：</td>
							<td><%=request.getHeader("accept-encoding")%></td>
						</tr>
						<tr>
							<td>获取客户的IP地址：</td>
							<td><%=request.getRemoteAddr()%></td>
						</tr>
						<tr>
							<td>获取客户机的名称：</td>
							<td><%=request.getRemoteHost()%></td>
						</tr>
						<tr>
							<td>获取服务器的名称：</td>
							<td><%=request.getServerName()%></td>
						</tr>
						<tr>
							<td>获取服务器的端口号：</td>
							<td><%=request.getServerPort()%></td>
						</tr>
						<tr>
							<td>获取头名字的一个枚举：</td>
							<td>
								<%
									Enumeration enum_headed = request.getHeaderNames();
								 	while (enum_headed.hasMoreElements()) {
								 		String s = (String) enum_headed.nextElement();
								 		out.println(s);
								 	}
								%>
							</td>
						</tr>
						<tr>
							<td>获取头文件中指定头名字的全部值的一个枚举：</td>
							<td>
								<%
									Enumeration enum_headedValues = request.getHeaders("cookie");
								 	while (enum_headedValues.hasMoreElements()) {
								 		String s = (String) enum_headedValues.nextElement();
								 		out.println(s);
								 	}
								%>
							</td>
						</tr>
					</table>


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