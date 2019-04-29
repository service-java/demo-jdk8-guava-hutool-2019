<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="business.*,java.util.*,Object.*" errorPage="error.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>edit student</title>
		<style type="text/css">
<!--
@import url("../../css/OSX.css");
-->
</style>
	</head>
	<SCRIPT language=javascript>
function CheckForm()
{
	if(document.edit_student_Form.name.value=="")
	{
		alert("请输入姓名！");
		return false;
	}
	document.edit_student_Form.submit();
}
</SCRIPT>
	<body  background="../../img/body_background.gif"  topmargin="100">

		<%String id = (String) request.getParameter("student_id");
			int ID = Integer.parseInt(id);
			Student stu = Student_Manager.getStudent(ID);			
			ArrayList gl = (ArrayList) Grade_Manager.getGradeList();
%>

		<div align="center">
			<form name="edit_student_Form" method="post" action="<%=basePath %>/edit_student">
				<table width="500" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td colspan="2" align="center" background="../../img/title_4.png">
							<font class="title_2">编辑学生</font>
						</td>
					</tr>
					<tr>
						<td width="97" align="center" bgcolor="F1F3F5" class="normalText">
							姓名:
						</td>
						<td width="396" bgcolor="F1F3F5">
							<input name="name" type="text" id="name" class="textBox" value="<%=stu.getName()%>">
							<input type="hidden" name="student_id" value="<%=ID%>">
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="F1F3F5" class="normalText">
							性别:
						</td>
						<td bgcolor="F1F3F5">
							<input type="radio" name="radiobutton" value="male" <%if(stu.getSex().equals("男")){%> checked <%}%> />
							<span class="normalText">男</span>
							<input type="radio" name="radiobutton" value="female" <%if(stu.getSex().equals("女")){%> checked <%}%> />
							<span class="normalText">女</span>
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="F1F3F5" class="normalText">
							年级:
						</td>
						<td bgcolor="F1F3F5">
							<select name="grade">
								<%Iterator iter = gl.iterator();
								while (iter.hasNext()) {
			                    	   Grade grade = (Grade) iter.next();
			                    %>
								<%if (stu.getGrade_id() == grade.getId()) {
								%>
								<option value="<%=grade.getId()%>" selected>
									<%=grade.getName()%>
								</option>
								<%} else {
								%>
								<option value="<%=grade.getId()%>"><%=grade.getName()%>
								</option>
								<%}
			}
			%>
							</select>
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="F1F3F5" class="normalText">
							图片:
						</td>
						<td bgcolor="F1F3F5">
							<span class="normalText">images/face/</span>
							<input name="image" type="text" id="image" class="textBox" value="<%=stu.getImage()%>">
						</td>
					</tr>
					<tr align="center">
						<td colspan="2" bgcolor="F1F3F5">
							<input type="button" name="Submit" value="保存修改" onClick="CheckForm()">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
