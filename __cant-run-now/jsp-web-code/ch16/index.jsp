<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page import="business.*,java.util.*,Object.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="control" prefix="control"%>
<html>
<head>
<%-- 这里引用bootstrap.min.css样式文件 --%>
<title>科研信息发布平台</title>
<style type="text/css">
.nav {
	padding: 0;
	margin: 0;
	list-style: none;
}

.nav li a {
	width: 92px;
	height: 24px;
	padding-top: 15px;
	display: block;
	float: left;
}

.nav li {
	float: left;
}

.nav a:link,.nav a:visited {
	padding: 3px 5px 2px 10px;
	color: #000000;
	background-color: #ADADAD;
	text-decoration: none;
	border: 1px solid #000000;
}

.nav a:navbar-inner {
	color: #000000;
	background-color: #000000;
}

<!--
@import url("./css/OSX.css");

@IMPORT url("./css/laste_zyn.css");

.style4 {
	FONT-SIZE: 11px
}
-->
</style>
</head>

<body background="img/body_background.gif">
	<%-- 引用 两个不知道是什么东西的JS文件…… --%>



	<table width="79%" align="center" cellpadding="0" cellspacing="0">

		<!--这一行是标题 -->

		<tr>
			<td height="62" align="center">
				<H1 align="center">
					<FONT face="Arial Black" size="7">科研信息发布平台</FONT>
				</H1>
			</td>
		</tr>
		<!-- 这一行是导航栏  -->
		<tr>
			<td width="100%">
				<div style="text-align: center;">
					<ul class="nav">
						<li class="active"><a href="index.jsp" target="_self"><font
								size="4px">&nbsp;首&nbsp;&nbsp;&nbsp;页&nbsp;&nbsp;</font></a></li>
						<li><a href="news.jsp" target="_self"><font size="4px">&nbsp;新&nbsp;&nbsp;&nbsp;闻&nbsp;&nbsp;</font></a></li>
						<li><a href="researchProject.jsp" target="_self"><font
								size="4px">在研项目</font></a></li>
						<li><a href="production.jsp" target="_self"><font
								size="4px">研究成果</font></a></li>
						<li><a href="teachers.jsp" target="_self"><font
								size="4px">老师信息</font></a></li>
						<li><a href="members.jsp" target="_self"><font size="4px">学生信息</font></a></li>
						<li><a href="down.jsp" target="_self"><font size="4px">软件下载</font></a></li>
					</ul>
					<br> <br> <br>
				</div> 当前位置：<a href="#">首页</a>
			</td>

		</tr>

		<!-- 导航下边的主要内容  -->
		<tr>
			<td height="329">
				<!-- 这个table是装载主要显示内容的   -->
				<table width="100%" height="100%" cellpadding="0" cellspacing="0">
					<tr>
						<!-- 显示主要内容  -->
						<td width="70%" valign="top" style="padding-right: 10">
							<!-- 从这个显示 在研项目-->
							<div style="width: 100%;">
								<table width="100%" height="100%" cellpadding="0"
									cellspacing="0">
									<tr>
										<td height="32" background="img/title_2.png"><font
											class="lanmu_font">在研项目:</font></td>
									</tr>
									<tr>
										<td valign="top">
											<%
												ArrayList pl = (ArrayList) Project_Manager.getProjectList();
											%>
											<div align="center" style="border: 1; padding-bottom: 10;">
												<!-- 在研项目下边内容最外层的table -->
												<table width="100%" border="0" cellspacing="1"
													cellpadding="1">
													<%
														Iterator iter = pl.iterator();

														while (iter.hasNext()) {
															Project pro = (Project) iter.next();
													%>

													<tr>
														<td width="100%">
															<div class="lanmu_item_parent">
																<div class="lanmu_item_children_title">
																	标题：<%=pro.getName()%>
																</div>
																<div class="lanmu_item_children_time">
																	起始时间：<%=pro.getTime()%>
																</div>
																<div class="lanmu_item_children_jianjie">
																	<font size="3">简介:</font><br>
																	<%=pro.getInfo()%>
																</div>
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
										</td>
									</tr>
								</table>
							</div>
						</td>
						<!-- 右侧部分  -->
						<td width="30%" valign="top" align="center"
							style="padding-left: 10">
							<div class="div_fullWhide_white">
								<!-- 登录表格部分 -->
								<table width="100%" border="1" cellspacing="0" cellpadding="0"
									align=center>
									<tr>
										<td valign="top" align="center"><br>
											<FORM name=memlogin action=login method=get>
												<TABLE >
													<TBODY>
														<TR>
															<td align=center colspan=2>用户登录</td>
														</TR>
														<TR valign="top">
															<TD align="center" width="30%"><label>用户：</label></TD>
															<TD ><INPUT type="text" name=username></TD>
														</TR>
														<TR valign="top">
															<TD align="center"><label>密码：</label></TD>
															<TD><INPUT type=password  name=password></TD>
														</TR>
														<TR >
															<TD align=center colspan=2>
																<div style="text-align: center;">
																	<INPUT id=Login2 type=image height=16 alt=#
																		src="images/front/button_login.gif" value=" Login "
																		name=Login>
																</div>
															</TD>
														</TR>
													</TBODY>
												</TABLE>
											</FORM></td>
									</tr>
								</table>
							</div> <!-- 新闻列表部分  --> <br>
							<table width="100%" border="1">
								<tr>
									<td>
										<div class="div_fullWhide_white">
											<table width="100%">
												<tr>
													<!-- 
											<td background="images/front/bg_1.gif">新闻:</td>
											 -->
													<td height="32" background="img/title_2.png"><font
														class="lanmu_font">新闻:</font></td>
												</tr>
												<tr>
													<td valign="top"><control:news /></td>
												</tr>
												<tr>
													<td>&nbsp;</td>
												</tr>

											</table>
										</div>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<!-- 底部声明  -->
		<tr>
			<td height="43">
				<div align="center">Copyright AlphaThink</div>
			</td>
		</tr>
	</table>
</body>
</html>
