<%@page import="com.itzcn.bean.Email"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>邮箱认证结果页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/mycss.css" type="text/css" />

  </head>
  <body>
<div id="container" >
		<div id="headerWrap">
			<div id="header">
				<h1><a href="index.html">边缘地带</a></h1>
				<ul id="navigation">
					<li><a href="#">其他</a></li>
					<li><a href="#">好友</a></li>
					<li><a href="#">照片</a></li>
					<li><a href="#">文章</a></li>
					<li><a href="#">首页</a></li>
				</ul>
			</div>
		</div>
		<div id="content">
			<div id="contentHeader">
				<div id="siteDescription"><p>我的博客：边缘地带</p></div>
			</div>
		
			<div id="main">
				<div class="post">
					<h2>边城</h2>
					<p>《边城》是我国文学史上一部优秀的抒发乡土情怀的中篇小说，（沈从文小说的代表作）。它以20世纪30年代川湘交界的边城小镇茶峒为背景，以兼具抒情诗和小品文的优美笔触，描绘了湘西边地特有的风土人情；借船家少女翠翠的爱情悲剧，凸显出了人性的善良美好与心灵的澄澈纯净。</p>
				</div>
				<div class="post">
					<h2>边城</h2>
					<p>《边城》是我国文学史上一部优秀的抒发乡土情怀的中篇小说，（沈从文小说的代表作）。它以20世纪30年代川湘交界的边城小镇茶峒为背景，以兼具抒情诗和小品文的优美笔触，描绘了湘西边地特有的风土人情；借船家少女翠翠的爱情悲剧，凸显出了人性的善良美好与心灵的澄澈纯净。</p>
					<blockquote><p>Some blockquote text which is showed as an example how it looks like.</p></blockquote>
					更多文章:
					<ul>
						<li>鲁迅《故乡》</li>
						<li>背影</li>
						<li>家.春.秋</li>
					</ul>
					As you can see, the link color is <a href="#">light green</a>.
				</div>
			</div>
		
			<div id="secondary">
				<h2>邮箱认证系统</h2>
			      <%
    String mail = request.getParameter("mail");
    Email email = new Email(mail);
    if(email.isMail()){
    	out.print(mail + "<br>是一个标准的邮箱地址<br>");   
    }else{
    	out.print(mail + "<br>不是一个标准的邮箱地址<br>");
    }
 
     %>
     <a href="index.jsp">[返回]</a>
			</div>
		</div>
		<div id="footer">
	<p>&copy; 2006 Your or your company name | Design by <a href="#">Mike Yarmish</a></p>
</div>
</div>


</body>
</html>
