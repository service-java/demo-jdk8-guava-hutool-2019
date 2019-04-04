<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>员工列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
	body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #F0F4FF;
}
.STYLE1 {
	color: #FFFFFF;
	font-size: 9pt;
}
</style>


  </head>
  
  <body>
	<table background="images/23_03.gif" width="755px" height="27px"
		border="0" align="left" cellpadding="0" cellspacing="0">
		<tr>
			<td width="20px">&nbsp;</td>
			<td>
				<span class="STYLE1">当前位置-&gt;用户管理首页</span>
			</td>
		</tr>
	</table>
	<br>
	<br>
	<table width="755px" height="48">
		<tr>
			<td align="center">
				<a href="user/addUser.jsp">创建新用户</a>
			</td>
		</tr>
	</table>
	
	<table width="730" border="0" cellspacing="1" bgcolor="#999999">
		<s:iterator value="userLt" var="user">
			<tr>
				<td width="128" height="128" rowspan="5" align="center"
					valign="middle" bgcolor="#F0F4FF">
					<s:param name="photo" value="#user.photo"/>
					<img src="upload/<%=request.getAttribute("photo") %>" width="100px" height="100px">
					
				</td>
				<td height="23" colspan="3" align="right" bgcolor="#F0F4FF">
				<s:param name="userId" value="#user.userId"/>
					<a href="showUser?userId=<%=request.getAttribute("userId") %>">修改</a>
					&nbsp;&nbsp;
					<a href="delUser?userId=<%=request.getAttribute("userId")%>">删除</a>
					&nbsp;&nbsp;&nbsp;
				</td>
			</tr>
			<tr>
				<td height="23" bgcolor="#F0F4FF">
					用户编号：
					<s:property value="#user.userId"/>
				</td>
				<td height="23" bgcolor="#F0F4FF">
					登录账号：
					<s:property value="#user.userName"/>
				</td>
				<td height="23" bgcolor="#F0F4FF">
					登录密码：
					<s:property value="#user.userPass"/>
				</td>
			</tr>
			<tr>
				<td height="23" bgcolor="#F0F4FF">
					用户姓名：
					<s:property value="#user.name"/>
				</td>
				<td height="23" bgcolor="#F0F4FF">
					用户性别：
					<s:property value="#user.sex"/>
				</td>
				<td height="23" bgcolor="#F0F4FF">
					出生日期：
					<s:date name="birthday" format="yyyy-MM-dd"/>
				</td>
			</tr>
			<tr>
				<td height="23" bgcolor="#F0F4FF">
					入职日期：
					<s:date name="entryDate" format="yyyy-MM-dd"/>
				</td>
				<td height="23" bgcolor="#F0F4FF">
					所属部门：
					<s:property value="#user.post.postName"/>
				</td>
				<td height="23" bgcolor="#F0F4FF">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td height="23" colspan="3" bgcolor="#F0F4FF">
					个人介绍：
					<s:property value="#user.remark"/>
				</td>
			</tr>
			</s:iterator>
	</table>
  </body>
</html>
