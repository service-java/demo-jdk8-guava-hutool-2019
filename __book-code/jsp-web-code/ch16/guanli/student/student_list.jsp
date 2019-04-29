<%@ page language="java" pageEncoding="utf-8" %>
<%@ page import="business.*,java.util.*,Object.*" errorPage="error.jsp"%>
<html>
<head>
<title>student list</title>
<style type="text/css">
<!--
@import url("../../css/OSX.css");
@IMPORT url("../../css/laste_zyn.css");
-->
</style>
</head>
<body background="../../img/body_background.gif" topmargin="30">
<%
ArrayList sl = (ArrayList)Student_Manager.getStudentList();
%>
<div align="center">
<table width="80%"  border="0" cellspacing="0" cellpadding="0" >
  <tr>
    <td align="center" background="../../img/title_4.png" >
		<font class="title_2">学生列表</font>
	</td>
  </tr>
<%
Iterator iter = sl.iterator();

while(iter.hasNext())
{
	Student stu = (Student)iter.next();	
	System.out.println("stu="+stu);
	Grade grade = Grade_Manager.getGrade(stu.getGrade_id());
	
%>
  <tr>
						<td>
						<div class="lanmu_item_parent">
							<table width=100% border="0" cellspacing="0" cellpadding="0">
							<tr>
							<td align="center" class="name"><%=stu.getName()%></td>
							<td align="right" ><a href=<%="./edit_student.jsp?student_id="+stu.getId()%>>[编辑]</a><a href=<%="./delete_student.jsp?student_id="+stu.getId()%> onclick="{if(confirm('确定删除吗?')){return true;}return false;}">[删除]</a></td>
						</tr>
						<tr>
							<td width="10%" align="center" class="left">性别:</td>
							<td width="90%" class="sex"><%=stu.getSex()%></td>
						</tr>
						<tr>
							<td align="center" class="left">年级:</td>
							<td class="lavel"><%=grade.getName()%></td>
						</tr>
						<tr>
							<td align="center" class="left">图片:</td>
							<td><img src=<%="../../images/face/" + stu.getImage()%>></td>
						</tr>
						</table>
						</div>
						</td></tr>
						<tr><td><div style="height: 10">&nbsp;</div><td></tr>
<%
 }
%>
</table>
</div>
</body>
</html>