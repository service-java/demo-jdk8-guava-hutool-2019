<%@ page language="java" pageEncoding="utf-8"%>
<%@ page
	import="business.Teacher_Manager,java.util.*,Object.*"
	errorPage="error.jsp"%>
<html>

<head>
<title>teacher list</title>
<style type="text/css">
<!--
@import url("../../css/OSX.css");

@IMPORT url("../../css/laste_zyn.css");
-->
</style>
</head>
<body background="../../img/body_background.gif" topmargin="30">
	<%
		ArrayList teacherList = (ArrayList) Teacher_Manager
				.getTeacherList();
	%>
	<div align="center">
		<table width="80%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td align="center" background="../../img/title_4.png"><font
					class="title_2">老师列表</font></td>
			</tr>
			<%

				Iterator iter = teacherList.iterator();
			System.out.println("iter="+iter);
				while (iter.hasNext()) {
					Teacher teacher = (Teacher) iter.next();
					System.out.println("teacher="+teacher);
			%>
			<tr>
				<td width="100%">
					<div class="lanmu_item_parent">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="center" class="name"><%=teacher.getName()%></td>
								<td align="right"><a
									href=<%="./edit_teacher.jsp?teacher_id=" + teacher.getId()%>>[编辑]</a><a
									href=<%="./delete_teacher.jsp?teacher_id=" + teacher.getId()%>
									onclick="{if(confirm('确定删除吗?')){return true;}return false;}">[删除]</a>
								</td>
							</tr>
							<tr>
								<td width="10%" align="center" class="left">性别:</td>
								<td width="90%" class="sex"><%=teacher.getSex()%></td>
							</tr>
							<tr>
								<td align="center" class="left">职称:</td>
								<td class="lavel"><%=teacher.getZhicheng()%></td>
							</tr>
							<tr>
								<td align="center" class="left">图片:</td>
								<td><img src=<%="../../images/face/" + teacher.getImage()%>
									height="38"></td>
							</tr>
							<tr>
								<td align="center" class="neirong_title">简介:</td>
								<td class="neirong_content"><%=teacher.getInfo()%></td>
							</tr>
						</table>
					</div>
				</td>
			</tr>
			<tr>
				<td><div style="height: 10">&nbsp;</div>
				<td>
			</tr>

			<%
				}
			%>
			<tr>
				<td>&nbsp;</td>
			</tr>
		</table>
	</div>

</body>
</html>
