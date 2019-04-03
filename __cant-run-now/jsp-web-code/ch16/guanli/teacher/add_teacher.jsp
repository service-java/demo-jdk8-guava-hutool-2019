<%@ page language="java" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>add teacher</title>
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
	if(document.add_teacher_Form.name.value=="")
	{
		alert("请输入姓名！");
		return false;
	}
	document.add_teacher_Form.submit();
}
</SCRIPT>
	<body background="../../img/body_background.gif" topmargin="100">
		<div align="center">
			<form name="add_teacher_Form" method="post" action="<%=basePath%>/add_teacher">
				<table width="500" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td colspan="2" align="center" background="../../img/title_4.png" >
		<font class="title_2">添加教师</font>
	</td>
					</tr>
					<tr>
						<td width="97" align="center" bgcolor="F1F3F5" class="normalText">
							姓名:
						</td>
						<td width="396" bgcolor="F1F3F5">
							<input name="name" type="text" id="name" class="textBox">
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="F1F3F5" class="normalText">
							性别:
						</td>
						<td bgcolor="F1F3F5">
							<input type="radio" name="radiobutton" value="male" checked />
							<span class="normalText">男</span>
							<input type="radio" name="radiobutton" value="female" />
							<span class="normalText">女</span>
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="F1F3F5" class="normalText">
							职称:
						</td>
						<td bgcolor="F1F3F5">
							<input name="zhicheng" type="text" id="zhicheng" class="textBox">
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="F1F3F5" class="normalText">
							图片:
						</td>
						<td bgcolor="F1F3F5">
							<span class="normalText">images/face/</span>
							<input name="image" type="text" id="image" class="textBox">
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="F1F3F5" class="normalText">
							简介:
						</td>
						<td bgcolor="F1F3F5">
							<textarea name="info" cols="40" rows="6"></textarea>
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
