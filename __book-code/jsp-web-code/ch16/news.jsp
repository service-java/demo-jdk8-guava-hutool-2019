<%@ page contentType="text/html; charset=utf-8" language="java"%>

<%@ taglib uri="control" prefix="control"%>
<html>
	<head>
		<title>新闻</title>
	</head>
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

@import url("./css/OSX.css");
@IMPORT url("./css/laste_zyn.css");
-->
</style>
	<body topmargin="30" background="img/body_background.gif">

		<div align="center">
			<!-- 最外层table -->
			<table width="79%" cellspacing="0" cellpadding="0">
				<tr>
				<td height="62" align="center">
					<H1 align="center">
						<FONT face="Arial Black" size="7">科研信息发布平台</FONT>
					</H1>
				</td>
				</tr>
				<tr>
				<td>
				<div style="text-align: center;">
				<ul class="nav">
						<li class="active"><a href="index.jsp" target="_self"><font size="4px">&nbsp;首&nbsp;&nbsp;&nbsp;页&nbsp;&nbsp;</font></a></li>
							<li><a href="news.jsp" target="_self"><font size="4px">&nbsp;新&nbsp;&nbsp;&nbsp;闻&nbsp;&nbsp;</font></a></li>
							<li><a href="researchProject.jsp" target="_self"><font size="4px">在研项目</font></a></li>
							<li><a href="production.jsp" target="_self"><font size="4px">研究成果</font></a></li>
							<li><a href="teachers.jsp" target="_self"><font size="4px">老师信息</font></a></li>
							<li><a href="members.jsp" target="_self"><font size="4px">学生信息</font></a></li>
							<li><a href="down.jsp" target="_self"><font size="4px">软件下载</font></a></li>
						</ul>
						<br>
						<br><br>
						</div>
				</td>
				</tr>
				<tr>
					<td height="329" align="center" valign="top">
					<!-- 从这里开始显示主要内容 -->
						<table width="100%" border="0" cellspacing="1" cellpadding="1">
							<tr background="images/front/bg_1.gif">
								
								<td colspan="2" height="32" background="img/title_2.png"><font
											class="lanmu_font"> 新闻:</font></td>
							</tr>
							<tr>
								<td colspan="2">
									<control:news4news />
									
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td height="43">
						<div align="center">Copyright AlphaThink
					</td>
				</tr>
			</table>

		</div>
	</body>
</html>
