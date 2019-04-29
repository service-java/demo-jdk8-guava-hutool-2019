<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>窗内网</title>
<LINK href="news.css" type=text/css rel=stylesheet>

<style type="text/css">
* {
	margin: 0;
	padding: 0;
}
body {
	font-family:Arial, Helvetica, sans-serif;
	margin:0;
	padding:0;
	font-size:14px
}
a {
	text-decoration:none;
	color:#666
}
a:hover {
	text-decoration: underline;
	color:#000000;
}

.content {
	margin-left:10px;
	line-height:24px;
	text-align: left;
}
h1 {
	color:#006;
	font-size:24px;
	font-weight:bold;
	text-align:center;
	margin-bottom:0px;
}
 h2 {
	font-size:12px;
	text-align:center;
	font-weight:normal;
	border-top:#ccc 1px dashed;
	color:#666;
	height:24px;
	margin:3px 5px 8px 0;
	background:#f5f5f5
}
p{
	text-indent: 20px;
	text-align: left;
	}
#sHeader {
	height:52px;
	background:url(images/titbg2.gif) no-repeat;
	color:#333;
	padding-left:110px;
	padding-top:2px;
	margin-left: 10px;
	text-align: left;
}
	#wrap {
	margin: 20px auto 10px auto;
	width: 730px;
	background: #fff;
	padding: 10px;
	border: 5px solid #E6F4FE;
}
#demo {
	height: 150px;
	width: 510px;
	overflow: hidden;
	border: 1px solid #FFC937;
}
#mydemo {
	height: 110px;
	width: 510px;
	overflow: hidden;
	background-color:#EBF8FF;
	border: 1px solid #ACDAFF;
}
</style>

</head>
<body>
<DIV id=wrapper>
  <P id=header>  <A class=logo title="窗内网" href="http://www.itzcn.com/"><SPAN>窗内网</SPAN></A> <SPAN class=login>您好，
    请 <A href="http://school.itzcn.com/register.php">注册</A> 或 <A href="http://school.itzcn.com/login.php">登录</A> | <A 
href="http://school.itzcn.com/help.html" target=_blank>帮助中心</A> | <A  href="#">设为首页</A> | <A href="#">加入收藏</A>
<br/><br/>
<%
    	Integer number=(Integer)application.getAttribute("number");
    	if(number==null){
    		number=new Integer(1);
    		application.setAttribute("number",number);
    	}else{
    		number=new Integer(number.intValue()+1);
    		application.setAttribute("number",number);
    	}
    	out.print("欢迎您！您是本站的第"+number+"位访客");
     %> 
</SPAN>
 
</P>
  <DIV id="nav_index">
    <ul>
      <LI><A href="http://school.itzcn.com">窗内学院</A> </LI>
      <LI><A href="http://bbs.itzcn.com">窗内论坛</A> </LI>
      <LI><A href="http://blog.itzcn.com">窗内博客</A> </LI>
      <LI><SPAN></SPAN></LI>
    </ul>
  </DIV>
</DIV>
<div id="wrap">
<div id="sHeader">新手常见问题</div>
      <div class="content">
        <h1>窗内网原创教程标准</h1>
        <h2>来源：窗内网 | 浏览次数：1356次 | 发布时间：2009-1-8</h2>
        <p> 很多朋友问我，我做的教程，是否可以认定为原创教程，什么样的教程会被收录教程库中并加威望。这里我做一个约定，即我们对原创教程的认定并加威望的规则。 <br />
          <br />1．原创教程，当然要有相当的原创成分，完全抄袭，或者大部分抄袭的教程是不能按原创对待的。教程可以借鉴别人的经验，可以组合综合技巧制作新的效果，别人的教程成份不可过高，否则会被认定为转贴或者抄袭。<br />
          <br />2．教程的图片宽度应该控制在550像素以内，我见过有的人做教程，整屏整屏的抓图，动不动就单图一到二兆，宽度1024以上。这样小显示器用户还怎么看呀。一般的网页无法显示完全，在论坛中被自动缩小看不清楚字。教程没有传播的价值。<br />
          <br />
        </p>
      </div>
  
</div>
<DIV id=foot>
  <P class=foot><A href="http://school.itzcn.com/aboutus.html">关于我们</A> | <A 
href="http://school.itzcn.com/etrs.html">免责声明</A> | <A 
href="http://school.itzcn.com/adver.html">广告合作</A> | <A 
href="http://school.itzcn.com/knowledge.html">知识产权</A> | <A 
href="http://school.itzcn.com/payment.html">支付方式</A> | <A 
href="http://school.itzcn.com/contactus.html">联系方式</A> | <A 
href="http://school.itzcn.com/zhaopin.html">加入我们</A> </P>
  <P class=foot><EM>Copyrights Reserved 2005-2010</EM> 窗内网(<EM>www.itzcn.com</EM>) <br>
    豫 <EM>ICP08104500</EM>号</P>
</DIV>   

</body>
</html>
