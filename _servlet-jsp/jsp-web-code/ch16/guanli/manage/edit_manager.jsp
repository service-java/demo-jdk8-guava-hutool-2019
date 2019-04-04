<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="business.*,java.util.*,Object.*" errorPage="error.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>Lomboz JSP</title>
		<style type="text/css">
<!--
@import url("../../css/OSX.css");
@IMPORT url("../../css/laste_zyn.css");
-->
</style>
	</head>
	<SCRIPT language=javascript>
function CheckForm()
{
	if(document.edit_manager_Form.password.value=="")
	{
		alert("请输入密码!");
		
		return false;
	}
	document.edit_manager_Form.submit();
}
</SCRIPT>
	<body background="../../img/body_background.gif" topmargin="100">

		<%String username = (String) request.getParameter("manager_username");

			Manager ma = (Manager) Admin_Manager.getManager(username);

			%>
		<div align="center" >
			<form name="edit_manager_Form" method="post" action="<%=basePath%>edit_manager">
				<table width="500" border="0" cellspacing="1" cellpadding="1" >
					<tr>
						  <td colspan="2" align="center" background="../../img/title_4.png" >
			<font class="title_2">编辑管理员</font>
	</td>
					</tr>
					<tr>
						<td width="97" align="center" bgcolor="F1F3F5" class="normalText">
							登录名:
						</td>
						<td width="396" bgcolor="F1F3F5">
							<%=ma.getUsername()%>

							<input type="hidden" name="manager_username" value="<%=ma.getUsername()%>">
						</td>
					</tr>
					<tr align="center">
						<td bgcolor="F1F3F5" class="normalText">
							密码:
						</td>
						<td align="left" bgcolor="F1F3F5">
							<input name="password" type="text" class="textBox" value="<%=ma.getPassword()%>">
						</td>
					</tr>
					<tr align="center">
						<td colspan="2" bgcolor="F1F3F5">
							<input type="button" name="Submit" value="提交" onClick="CheckForm()">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
