<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ taglib uri="control" prefix="control"%>
<html>
<head>
<%-- 这里引用bootstrap.min.css样式文件 --%>
<title>研究成果</title>
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
		<table width="79%" align="center">
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
				<td  valign="top">
					<table width="100%"  border="0" >
						<tr>
							<td height="32" colspan="2" background="img/title_2.png"><font
								class="lanmu_font">研究成果:</font></td>
						</tr>

						<tr bgcolor="E4EDF9">
							<td width="21%" align="center" class="titile_td">名称</td>
							<td width="79%" align="center" class="titile_td"><strong>简介</strong></td>
						</tr>

						<tr bgcolor="F1F3F5">
							<td align="center" class="item_td">信息与通信技术</td>
							<td  class="item_td">
								信息系统与安全、通信技术、感知信息、人工智能、数据挖掘、物联网及其应 用</td>
						</tr>
						<tr><td><div style="height: 10">&nbsp;</div><td></tr>
						<tr bgcolor="F1F3F5">
							<td align="center" class="item_td">图像与图形</td>
							<td class="item_td">在采用二维视频图像的刚体三维空间运动估值方面做出过原创性的研究</td>
						</tr>
						<tr><td><div style="height: 10">&nbsp;</div><td></tr>
						<tr bgcolor="F1F3F5">
							<td align="center" class="item_td">智能机器人</td>
							<td  class="item_td">智能机器人主题</td>
						</tr>
						<tr><td><div style="height: 10">&nbsp;</div><td></tr>
						<tr><td><div style="height: 10">&nbsp;</div><td></tr>

					</table>
					<p>&nbsp;</p>
				</td>
			</tr>
			<!-- 底部声明 -->
		<tr>
			<td height="43">
				<div align="center">Copyright AlphaThink</div>
			</td>
		</tr>
		</table>

	</div>
</body>
</html>
