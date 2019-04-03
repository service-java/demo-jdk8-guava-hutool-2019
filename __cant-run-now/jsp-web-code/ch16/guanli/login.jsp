<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<title>admin login</title>
<style type="text/css">
<!--
@import url("../css/OSX.css");

@IMPORT url("../../css/laste_zyn.css");
-->
</style>
</head>
<SCRIPT language=javascript>
	function CheckForm() {
		if (document.loginForm.username.value == "") {
			alert("请输入用户名！");
			document.loginForm.username.focus();
			return false;
		}
		if (document.loginForm.password.value == "") {
			alert("请输入密码！");
			document.loginForm.password.focus();
			return false;
		}
		document.loginForm.submit();
	}
</SCRIPT>
<body background="../img/body_background.gif" topmargin="100">
	<div align="center">
		<form name="loginForm" method="post" action="<%=basePath%>/login">
			<table width="480" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td colspan="3" align="center" background="../img/title_4.png"><font class="title_2">信息发布平台管理登陆</font>
					</td>
				</tr>
				<tr>
					<td height="120" colspan="2" background=../img/dvbbs.png;>&nbsp;
					</td>
				</tr>
				<tr bgcolor="c2d8f6">
					<td width="30%" align="right" class="normalText">用户名:</td>
					<td width="70%"><input type="text" name="username"
						class="textBox"></td>
				</tr>
				<tr bgcolor="c2d8f6">
					<td align="right" class="normalText">密&nbsp;&nbsp;码:</td>
					<td><input type="password" name="password" class="textBox">
					</td>
				</tr>
				<tr align="center">
					<td colspan="2" bgcolor="c2d8f6"><input type="button"
						name="Submit" value="提交" onClick="CheckForm()"></td>
				</tr>
			</table>

		</form>

	</div>

</body>
</html>
