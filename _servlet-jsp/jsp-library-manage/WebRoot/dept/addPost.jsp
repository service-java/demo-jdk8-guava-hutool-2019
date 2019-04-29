<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加部门</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table  background="images/23_03.gif" width="755px" height="27px" border="0" align="left" cellpadding="0" cellspacing="0">
    	<tr>
    		<td width="20px">&nbsp;</td>
    		<td><span class="STYLE3">当前位置-&gt;部门信息</span></td>
    	</tr>
  	</table>
  	<br><br>
	<form action="addPost" method="post">
    	<table style="position: relative;top:20px;left:40px">
    		<tr>
    			<td height="24"><s:textfield name="post.postName" label="部门名称"/></td>
    		</tr>
    		<tr>
    			<s:textfield name="post.postRemark" label="部门介绍"/>
      		</tr>
    		<tr>
   			  <td height="24" colspan="2" align="right"><span class="STYLE6">
   			  <s:actionerror cssStyle="color:red" />  
   			  <input type="submit" value="确定">
   			  &nbsp;&nbsp;</span></td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
