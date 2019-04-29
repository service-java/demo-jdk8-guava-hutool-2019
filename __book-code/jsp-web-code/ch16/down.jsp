<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="business.*,java.util.*,Object.*"%>
<%@ taglib uri="control" prefix="control"%>
<html>

<head>
<%-- 这里引用bootstrap.min.css样式文件 --%>
<title>下载软件</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<style type="text/css">
.nav{
    padding:0;
    margin:0;
    list-style:none;
}

.nav li a{
    width:92px;
    height:24px;
    padding-top:15px;
    display:block;
    float:left;
}
.nav li{
    float:left;
}
.nav a:link,.nav a:visited { 
 padding: 3px 5px 2px 10px; 
 color: #000000;
 background-color: #ADADAD;
 text-decoration: none;
 border: 1px solid #000000;
}
.nav a:navbar-inner{
 color: #000000;
 background-color: #000000;
}
<!--
@IMPORT url("./css/laste_zyn.css");
@import url("./css/OSX.css");
-->
</style>
<script type="text/javascript">
	function alertMsg() {
		alert("对不起，目前 没有软件可供你下载");
	}
</script>
</head>
<body topmargin="30" background="img/body_background.gif">

	<table width="79%" align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td height="62" align="center">
				<H1 align="center">
					<FONT face="Arial Black" size="7">科研信息发布平台</FONT>
				</H1>
			</td>
		</tr>
		<tr>
			<td>
			<!-- 
				&nbsp;&nbsp; &gt;&gt; <a href="index.jsp" target="_self">首页</a>
				| <a href="news.jsp" target="_self">新闻</a> | <a
				href="researchProject.jsp" target="_self">在研项目</a> | <a
				href="production.jsp" target="_self">研究成果</a> | <a
				href="teachers.jsp" target="_self">老师信息</a> | <a href="members.jsp"
				target="_self">学生信息</a> | <a href="down2.jsp" target="_self">软件下载</a>
				| <a href="reg.jsp" target="_self">用户注册</a>
			 -->
				
				<div class="navbar">
					<div class="navbar-inner">
						<ul class="nav">
							<li><a href="index.jsp" target="_self"><font size="4px">首页</font></a></li>
							<li><a href="news.jsp" target="_self"><font size="4px">新闻</font></a></li>
							<li><a href="researchProject.jsp" target="_self"><font size="4px">在研项目</font></a></li>
							<li><a href="production.jsp" target="_self"><font size="4px">研究成果</font></a></li>
							<li><a href="teachers.jsp" target="_self"><font size="4px">老师信息</font></a></li>
							<li><a href="members.jsp" target="_self"><font size="4px">学生信息</font></a></li>
							<li class="active"><a href="down.jsp" target="_self"><font size="4px">软件下载</font></a></li>
						</ul>
					</div>
				</div>
			</td>
		</tr>
		<tr>
			<td height="329" valign="top">

				<div align="center">
					<p>&nbsp;</p>
					<table width="100%" border="0" cellspacing="1" cellpadding="1" >
						<tr>
							<td height="32" colspan="2" background="img/title_2.png"><font
								class="lanmu_font">软件列表:</font></td>
						</tr>

						<tr bgcolor="E4EDF9">
							<td class="titile_td">软件名称</td>
							<td class="titile_td" align="left">点击下载</td>
						</tr>
						<tr bgcolor="F1F3F5">
							<td width="34%" align="center" class="item_td">Fra-go
								1.02</td>
							<td width="66%" class="item_td"><a href=" ">下载</a></td>
						</tr>
						<tr><td><div style="height: 10">&nbsp;</div><td></tr>
						<tr bgcolor="F1F3F5">
							<td align="center" class="item_td">机器人模拟小软件</td>
							<td class="item_td"><a href="">下载</a></td>
						</tr>
						<tr><td><div style="height: 10">&nbsp;</div><td></tr>
						<tr bgcolor="F1F3F5">
							<td align="center" class="item_td">rp计算器</td>
							<td  class="item_td"><a href="">下载</a></td>
						</tr>
						<tr><td><div style="height: 10">&nbsp;</div><td></tr>
						<tr>
							<td colspan="2">&nbsp;</td>
						</tr>
					</table>
				</div>
			</td>
		</tr>
		<tr>
			<td height="43">
				<div align="center">Copyright AlphaThink</div>
			</td>
		</tr>
	</table>
</body>
</html>
