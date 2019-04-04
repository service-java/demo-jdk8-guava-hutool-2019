<%@ page language="java" pageEncoding="utf-8" %>
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
	if(document.add_manager_Form.name.value=="")
	{
		alert("请输入登录名!");
		return false;
	}
	if(document.add_manager_Form.password.value=="")
	{
		alert("请输入密码!");
		
		return false;
	}
	document.add_manager_Form.submit();
}
</SCRIPT>
<body background="../../img/body_background.gif" topmargin="100">

<div align="center"">
<form name="add_manager_Form" method="post" action="<%=basePath%>add_manager">
  <table width="500"  border="0" cellspacing="0" cellpadding="0">
    <tr>
     <td colspan="3" align="center" background="../../img/title_4.png" >
				<font class="title_2">添加管理员</font>
	</td>
    </tr>
    <tr>
      <td width="97" align="center" bgcolor="F1F3F5" class="normalText">登录名:</td>
      <td width="396" bgcolor="F1F3F5"><input name="username" type="text" id="name" class="textBox"></td>
    </tr>
    <tr align="center">
      <td bgcolor="F1F3F5" class="normalText">密码:</td>
      <td align="left" bgcolor="F1F3F5"><input name="password" type="text" class="textBox"></td>
    </tr>
    <tr align="center">
      <td colspan="2" bgcolor="F1F3F5"><input type="button" name="Submit" value="提交" onClick="CheckForm()">        </td>
    </tr>
  </table>
</form>
</div>
</body>
</html>