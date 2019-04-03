<%@ page language="java" pageEncoding="GB2312"%>
<html>
	<head>
		<title>menu</title>
		<style type="text/css">
<!--
@import url("../css/OSX.css");
@IMPORT url("../css/laste_zyn.css");
-->
</style>
	</head>
	<body background="../img/body_background.gif" topmargin="0" leftmargin="0" rightmargin="0" >

		<div style="width: 100%;text-align: center;">
		<table width="100%" border="0" cellpadding="0" cellspacing="0" >
			<tr>
				<td height="24" align="center" background="../img/title_3.png">
					<font class="title_1">功能菜单</font>
				</td>
			</tr>
			<tr>
				<td height="26" valign="top" >
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="51%" height="26" align="center">
								<a href="index.jsp" target="_parent" class="title_normal">管理首页</a>
							</td>
							<td width="6%" align="center">
								|
							</td>
							<td width="43%" align="center" class="title_normal">
								<a href="logout.jsp" target="_parent">退出</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td height="19">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td height="24" align="center" background="../img/title_3.png" >
					<font class="title_1">新闻管理</font>
				</td>
			</tr>
			<tr>
				<td>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="6%" height="21" background="../images/guanli/bullet.gif">
								&nbsp;
							</td>
							<td width="94%" align="center" class="normalText">
								<a href="news/news_list.jsp" target="main">查看所有新闻</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr align="center">
							<td width="8%" height="23" background="../images/guanli/bullet.gif">
								&nbsp;
							</td>
							<td class="normalText">
								<a href="news/add_news.jsp" target="main">添加新闻</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td height="24" align="center" background="../img/title_3.png" >
					<font class="title_1">在研项目管理</font>
				</td>
			</tr>
			<tr>
				<td>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr >
							<td  width="8%" height="25" background="../images/guanli/bullet.gif">
								&nbsp;
							</td>
							<td width="92%" align="center" class="normalText">
								<a href="./project/project_list.jsp" target="main">查看项目(编辑)</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="9%" height="23" background="../images/guanli/bullet.gif">
								&nbsp;
							</td>
							<td width="92%" align="center" valign="middle" class="normalText">
								<a href="./project/add_project.jsp" target="main">添加项目</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td height="24" align="center" background="../img/title_3.png" >
					<font class="title_1">团队管理</font>
				</td>
			</tr>
			<tr>
				<td >
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr align="center">
							<td width="9%" height="25" background="../images/guanli/bullet.gif">
								&nbsp;
							</td>
							<td width="43%" class="normalText">
								<a href="./teacher/teacher_list.jsp" target="main">查看老师</a>
							</td>
							<td width="7%">
								|
							</td>
							<td width="43%" class="normalText">
								<a href="./teacher/add_teacher.jsp" target="main">添加老师</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td >
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr align="center">
							<td width="9%" height="22" background="../images/guanli/bullet.gif">
								&nbsp;
							</td>
							<td width="43%" class="normalText">
								<a href="./student/student_list.jsp" target="main">查看学生</a>
							</td>
							<td width="5%">
								|
							</td>
							<td width="43%" class="normalText">
								<a href="./student/add_student.jsp" target="main">添加学生</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td height="24" align="center" background="../img/title_3.png" >
					<font class="title_1">下载管理</font>
				</td>
			</tr>
			<tr>
				<td >
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr align="center">
							<td width="9%" height="24" background="../images/guanli/bullet.gif">
								&nbsp;
							</td>
							<td width="40%" class="normalText">
								课件管理
							</td>
							<td width="7%">
								|
							</td>
							<td width="43%" class="normalText">
								添加
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td >
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr align="center">
							<td width="9%" height="24" background="../images/guanli/bullet.gif">
								&nbsp;
							</td>
							<td width="41%" class="normalText">
								软件管理
							</td>
							<td width="6%">
								|
							</td>
							<td width="43%" class="normalText">
								添加
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td height="24" align="center" background="../img/title_3.png" >
					<font class="title_1">其他管理</font>
				</td>
			</tr>
			<tr>
				<td>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr align="center">
							<td width="9%" height="21" background="../images/guanli/bullet.gif">
								&nbsp;
							</td>
							<td width="46%" class="normalText">
								<a href="manage/manager_list.jsp" target="main">管理员列表</a>
							</td>
							<td width="8%">
								|
							</td>
							<td width="38%" class="normalText">
								<a href="manage/add_manager.jsp" target="main">添加</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
			</tr>
		</table>
		</div>
	</body>
</html>
