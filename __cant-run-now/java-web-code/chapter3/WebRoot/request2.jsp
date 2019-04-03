<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>使用request对象获取HTTP Headers信息</title>
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
<style>table{font-size:14px;}</style>
					<table cellpadding="3" cellspacing="3">
						<tr>
							<td>获取HTTP请求头信息：</td>
							<td>
								<%
									Enumeration HeadList = request.getHeaderNames();
									while (HeadList.hasMoreElements()) {
										String header = (String) HeadList.nextElement();
										String content = request.getHeader(header);
										out.print("["+header+"]: ");
										out.print(content + "<br>");

									}
								%>
							</td>
						</tr>
						<tr>
							<td>国家：</td>
							<td><%=request.getLocale().getDisplayCountry()%></td>

						</tr>
						<tr>
							<td>语言：</td>
							<td><%=request.getLocale().getDisplayLanguage()%></td>

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