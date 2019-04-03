<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="business.*,java.util.*,Object.*"
	errorPage="error.jsp"%>
<%@ taglib uri="control" prefix="control"%>
<html>
<head>
<%-- 这里引用bootstrap.min.css样式文件 --%>
<title>在研项目</title>
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
@import url("./css/OSX.css");

@IMPORT url("./css/laste_zyn.css");
-->
</style>
</head>
<body topmargin="30" background="img/body_background.gif">

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
			<td height="329" valign="top">
				<%
					ArrayList pl = (ArrayList) Project_Manager.getProjectList();
				%>
				<div>
					<table width="100%" cellspacing="1" cellpadding="1">
						<tr>
							<td height="32" background="img/title_2.png"><font
								class="lanmu_font">项目列表:</font></td>
						</tr>
						<tr><td>
						
						<div align="center" style="border: 1; padding-bottom: 10;">
							<!-- 在研项目下边内容最外层的table -->
							<table width="100%" border="0" cellspacing="1" cellpadding="1">
								<%
									Iterator iter = pl.iterator();
									while (iter.hasNext()) {
										Project pro = (Project) iter.next();
								%>
								<tr>
									<td class="lanmu_item_parent">
										<div class="lanmu_item_children_title">
											标题：<%=pro.getName()%><br>
										</div>
										<div class="lanmu_item_children_time">
											起始时间：<%=pro.getTime()%><br>
										</div>
										<div class="lanmu_item_children_jianjie">
											简介：<%=pro.getInfo()%><br>
										</div>
									</td>
								</tr>
								<tr>
									<td></td>
								</tr>
								<tr>
									<td></td>
								</tr>
								<tr>
									<td></td>
								</tr>
								<tr>
									<td></td>
								</tr>
								<tr>
									<td></td>
								</tr>
								<%
									}
								%>
							</table>
						</div>
						
						<td></tr>
					</table>
				</div>
			</td>
		</tr>
		<!-- 底部声明 -->
		<tr>
			<td height="43">
				<div align="center">Copyright AlphaThink</div>
			</td>
		</tr>
	</table>


</body>
</html>
