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
	if(document.add_project_Form.name.value=="")
	{
		alert("请输入项目名称!");
		return false;
	}
	document.add_project_Form.submit();
}
</SCRIPT>
<body background="../../img/body_background.gif" topmargin="100">

<div align="center">
<form name="add_project_Form" method="post" action="<%=basePath %>/add_project">
  <table width="500"  border="0" cellspacing="1" cellpadding="1" >
    <tr>
      <td colspan="2" align="center" background="../../img/title_4.png" >
				<font class="title_2">添加项目</font>
	</td>
    </tr>
    <tr>
      <td width="97" align="center" bgcolor="F1F3F5" class="normalText">名称:</td>
      <td width="396" bgcolor="F1F3F5"><input name="name" type="text" id="name" class="textBox"></td>
    </tr>
    <tr align="center">
      <td bgcolor="F1F3F5" class="normalText">开发起始时间:</td>
      <td align="left" bgcolor="F1F3F5"><input name="time" type="text" class="textBox"></td>
    </tr>
    <tr align="center">
      <td bgcolor="F1F3F5" class="normalText">项目简介:</td>
      <td align="left" bgcolor="F1F3F5"><textarea name="info" cols="40" rows="6"></textarea></td>
    </tr>
    <tr align="center">
      <td colspan="2" bgcolor="F1F3F5"><input type="button" name="Submit" value="提交" onClick="CheckForm()">        </td>
    </tr>
  </table>
</form>
</div>
</body>
</html>