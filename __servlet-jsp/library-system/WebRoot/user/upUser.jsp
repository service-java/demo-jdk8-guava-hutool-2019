<%@page import="com.itzcn.util.UtilMethod"%>
<%@page import="com.itzcn.entity.Post"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改员工信息</title>
    
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
.STYLE2 {font-size: 9pt}
.STYLE4 {font-size: 9pt; color: #FFFFFF; }
</style>


  </head>
  
  <body>
  
  <%String pathParam =request.getSession().getServletContext().getRealPath("");
  List<Post> postLt = UtilMethod.getPosts(pathParam);
  request.setAttribute("postLt", postLt);
  
   %>

		<table background="images/23_03.gif" width="755px" height="27px"
			border="0" align="left" cellpadding="0" cellspacing="0">
			<tr>
				<td width="20px">&nbsp;
					
			  </td>
				<td>
					<span class="STYLE4">当前位置-&gt;创建新用户</span>				</td>
			</tr>
		</table>
		<br><br>
		<form action="upUser"
			method="post" enctype="multipart/form-data" >
			<table style="position:relative;top:20px;left:70px;" width="540px" border="0" cellspacing="1" bgcolor="#999999">
				<tr>
					<td height="32" bgcolor="#F0F4FF"><div align="center"><span class="STYLE2">
					 员工用户名：					</span></div></td>
					<td bgcolor="#F0F4FF">
						<span class="STYLE2">&nbsp;
						<input type="hidden" name="user.userId" value="<%=request.getParameter("userId")%>">
						<input type="text" name="user.userName" value="${ user.userName}">
				        </span></td>
					<td bgcolor="#F0F4FF"><span class="STYLE2">
					  6-10位英文字母或数字					</span></td>
				</tr>
				<tr>
					<td height="32" bgcolor="#F0F4FF"><div align="center"><span class="STYLE2">
					  员工密码：					</span></div></td>
					<td bgcolor="#F0F4FF">
						<span class="STYLE2">&nbsp;
						<input type="text" name="user.userPass" value="${user.userPass}">
				        </span></td>
					<td bgcolor="#F0F4FF"><span class="STYLE2">
					  6-10位英文字母或数字					</span></td>
				</tr>
				<tr>
					<td height="32" bgcolor="#F0F4FF"><div align="center"><span class="STYLE2">
					  员工姓名：					</span></div></td>
					<td bgcolor="#F0F4FF">
						<span class="STYLE2">&nbsp;
						<input type="text" name="user.name" value="${user.name}">
				        </span></td>
					<td bgcolor="#F0F4FF"><span class="STYLE2">
					  10位以内中文					</span></td>
				</tr>
				<tr>
					<td height="32" bgcolor="#F0F4FF"><div align="center"><span class="STYLE2">
					 员工性别：					</span></div></td>
					<td bgcolor="#F0F4FF">
						<span class="STYLE2">
						<input type="radio" value="男" name="user.sex" checked="checked">
						男
						<input type="radio" value="女" name="user.sex">
				  女		          </span></td>
					<td bgcolor="#F0F4FF"><span class="STYLE2">
					  选择用户性别					</span></td>
				</tr>
				<tr>
					<td height="32" bgcolor="#F0F4FF"><div align="center"><span class="STYLE2">
					  出生日期：					</span></div></td>
					<td bgcolor="#F0F4FF">
						<span class="STYLE2">&nbsp;
						<input type="text" name="user.birthday" value="${user.birthday }">
						<s:date name="user.birthday" format="yyyy-MM-dd"/>
				        </span></td>
					<td bgcolor="#F0F4FF"><span class="STYLE2">
					  格式：YYYY-MM-DD					</span></td>
				</tr>
				<tr>
					<td height="32" bgcolor="#F0F4FF"><div align="center"><span class="STYLE2">
					  入职日期：					</span></div></td>
					<td bgcolor="#F0F4FF">
						<span class="STYLE2">&nbsp;
						<input type="text" name="user.entryDate" value="${user.entryDate }" >
						<s:date name="user.entryDate" format="yyyy-MM-dd"/>
				        </span></td>
					<td bgcolor="#F0F4FF"><span class="STYLE2">
					  格式：YYYY-MM-DD					</span></td>
				</tr>
				<tr>
					<td height="32" bgcolor="#F0F4FF"><div align="center"><span class="STYLE2">
					  所属部门：					</span></div></td>
					<td bgcolor="#F0F4FF">
						<span class="STYLE2">&nbsp;
						<select name="postId">
						  <option value="0">
						    选择部门...					      </option>
						    <c:forEach items="${postLt}" var="post">
						    	 <option value="${post.postId }">${post.postName}</option>
						    </c:forEach>
					    </select>
				        </span><s:actionerror/></td>
					<td bgcolor="#F0F4FF"><span class="STYLE2">
					  选择所在部门					</span></td>
				</tr>
				<tr>
					<td height="32" bgcolor="#F0F4FF"><div align="center"><span class="STYLE2">
					  员工图片：					</span></div></td>
					<td colspan="2" bgcolor="#F0F4FF">
						<span class="STYLE2">&nbsp;
						<input type="file" name="file" onChange="testFileType(this)">
				        </span></td>
				</tr>
				<tr>
					<td bgcolor="#F0F4FF"><div align="center"><span class="STYLE2">
					  个人简介：					</span></div></td>
					<td colspan="2" bgcolor="#F0F4FF">
						<span class="STYLE2">&nbsp;
						<textarea name="user.remark" cols="40" rows="5" id="user.remark">${user.remark }</textarea>
				        </span></td>
				</tr>
				<tr>
					<td height="32" colspan="3" align="center" bgcolor="#F0F4FF">
						<span class="STYLE2">
                        <input type="submit" value="确定">
&nbsp;&nbsp;
						<input type="reset" value="重置">
		          </span></td>
				</tr>
		  </table>
		</form>
	</body>
</html>
