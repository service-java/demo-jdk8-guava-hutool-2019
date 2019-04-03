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
-->
</style>
</head>
<SCRIPT language=javascript>
function CheckForm()
{
	if(document.add_student_Form.name.value=="")
	{
		alert("请输入姓名！");
		return false;
	}
	document.add_student_Form.submit();
}
</SCRIPT>
<body background="../../img/body_background.gif" topmargin="100">

<%
ArrayList gl = (ArrayList)Grade_Manager.getGradeList();
%>
<div align="center">
<form name="add_student_Form" method="post" action="<%=basePath %>/add_student">
  <table width="500"  border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td colspan="2" align="center" background="../../img/title_4.png" >
		<font class="title_2">添加学生</font>
	</td>
    </tr>
    <tr>
      <td width="97" align="center" bgcolor="F1F3F5" class="normalText">姓名:</td>
      <td width="396" bgcolor="F1F3F5"><input name="name" type="text" id="name" class="textBox"></td>
    </tr>
    <tr>
      <td align="center" bgcolor="F1F3F5" class="normalText">性别:</td>
      <td bgcolor="F1F3F5"><input type="radio" name="radiobutton" value="male" checked/>
        <span class="normalText">男</span>		<input type="radio" name="radiobutton" value="female" />
        <span class="normalText">女</span></td>
    </tr>
    <tr>
      <td align="center" bgcolor="F1F3F5" class="normalText">年级:</td>
      <td bgcolor="F1F3F5">
      	<select name="grade">
      		<%
      		Iterator iter = gl.iterator();
      		
      		while(iter.hasNext())
      		{
      		  Grade grade = (Grade)iter.next();
      		%>
			<option value="<%=grade.getId()%>" ><%=grade.getName()%></option>
			<%
			}
			%>
      	</select>
      </td>
    </tr>
    <tr>
      <td align="center" bgcolor="F1F3F5" class="normalText">图片:</td>
      <td bgcolor="F1F3F5"><span class="normalText">images/face/</span>        <input name="image" type="text" id="image" class="textBox"></td>
    </tr>
    <tr align="center">
      <td colspan="2" bgcolor="F1F3F5"><input type="button" name="Submit" value="提交" onClick="CheckForm()">        </td>
    </tr>
  </table>
</form>
</div>
</body>
</html>