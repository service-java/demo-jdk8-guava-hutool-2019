<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="business.*,java.util.*,Object.*" errorPage="error.jsp"%>
<html>

	<head>
		<title>Lomboz JSP</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

		<style type="text/css">
<!--
@import url("../../css/OSX.css");
@IMPORT url("../../css/laste_zyn.css");
-->
</style>
	</head>
	<body background="../../img/body_background.gif" topmargin="30">
		<%ArrayList pl = (ArrayList) Project_Manager.getProjectList();

			%>
		<div align="center">
			<table width="80%" border="0" cellspacing="1" cellpadding="1">
				<tr>
					<td colspan="3" align="center" background="../../img/title_4.png" >
							<font class="title_2">项目列表</font>
						</td>
				</tr>
				<%Iterator iter = pl.iterator();

			while (iter.hasNext()) {
				Project pro = (Project) iter.next();
%>
				<tr>
				<td>
				<div class="lanmu_item_parent">
				<table  width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr bgcolor="E4EDF9">
					<td align="center" colspan="2" class="tag_news_item_partent_title">
						<%=pro.getName()%>
					</td>
					<td width="15%" align="right" bgcolor="#E5E5E5">
						<a href=<%="./edit_project.jsp?project_id="+pro.getId()%>>[编辑]</a><a href=<%="./delete_project.jsp?project_id="+pro.getId()%> onclick="{if(confirm('确定删除吗?')){return true;}return false;}">[删除]</a>
					</td>
				</tr>
				<tr bgcolor="F1F3F5">
					<td width="10%" align="center" class="normalText">
						起始时间:
					</td>
					<td width="90%" colspan="2" class="normalText">
						<%=pro.getTime()%>
					</td>
				</tr>
				<tr bgcolor="F1F3F5">
					<td align="center" class="neirong_title">
						简介:
					</td>
					<td colspan="2" class="neirong_content_1">
						<%=pro.getInfo()%>
					</td>
				</tr>
				</table>
				</div>
				</td>
				</tr>
				<tr><td><div style="height: 10">&nbsp;</div><td></tr>
				<%}

		%>
				<tr>
					<td colspan="2">
						&nbsp;
					</td>
				</tr>
			</table>
		</div>

	</body>
</html>
