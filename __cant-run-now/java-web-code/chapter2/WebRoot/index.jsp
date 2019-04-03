<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="images/style.css" type="text/css" />
<title>胖子的IT技术专栏</title>
</head>
<body>
	<div class="content">
		<div class="preheader">
			<div class="padding">
				<a href="#">加关注</a>&nbsp; <a href="#">登录</a>
			</div>
		</div>
		<div class="header">
			<div class="title">胖子的IT技术专栏</div>
			<div class="slogan">为IT菜鸟起飞铺跑道，和学生一起享受快乐和激情的大学</div>
		</div>
		<div id="nav">
			<ul>
				<li id="current"><a href="#">首页</a>
				</li>
				<li><a href="#">日志</a>
				</li>
				<li><a href="#">相册</a>
				</li>
				<li><a href="#">关于我</a>
				</li>
				<li><a href="#">帮助 </a>
				</li>
				<li><a href="#">管理</a>
				</li>
			</ul>
		</div>
		<div class="main_content">
			<div class="sd_right">
				<div class="text_padding">
					<h2>关于胖子</h2>
					<img src="images/logo.gif" /> <br />
					<h2>搜索</h2>
					<form method="post" action="#">
						<p>
							<input type="text" name="search" class="search" /> <input
								type="submit" value="Go" class="submit" />
						</p>
					</form>
					<br />
					<h2>最近更新</h2>
					<a href="#">博客新开张。</a><br /> <br />
					<h2>外链</h2>
					<a href="#">计算机教程网</a><br /> <a href="#">科技网站</a><br />
				</div>
			</div>
			<div class="sd_left">
				<div class="text_padding">
					<%
						String title = "关于我们";
						String body = "这里是学习编程技术的最好社区。<br/>访问http://www.itzcn.com了解更多内容";
						Date now = new Date();
						String day = String.format("%tY年%tm月%td日", now, now, now);

						out.print("<h2>" + title + "</h2>");
						out.print(body);
						out.print("<p class=date>" + day + "</p>");
					%>
				</div>
			</div>
			<div class="footer">
				<div class="padding">
					Powered by <a href="#">sNews</a> | &copy; Copyright BinaryNews
					Template :: Design: <a href="#">David Herreman</a> | <a
						href="rss/">RSS Feed</a> | <a href="#">CSS</a> and <a href="#">XHTML</a>
					| <a href="#">Login</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
