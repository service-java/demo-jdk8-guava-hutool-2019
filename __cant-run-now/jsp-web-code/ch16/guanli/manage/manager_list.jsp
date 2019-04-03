<%@ page language="java" pageEncoding="utf-8" %>
<%@ page import="business.*,java.util.*,Object.*" errorPage="error.jsp"%>
<html>
<head>
<title>Lomboz JSP</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<style type="text/css">
<!--
@import url("../../css/OSX.css");
@IMPORT url("../../css/laste_zyn.css");
-->
</style>
</head>
<body background="../../img/body_background.gif" topmargin="30">
<%
ArrayList ml = (ArrayList)Admin_Manager.getManagerList();
%>
<div align="center">
<table width="80%"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td colspan="3" align="center" background="../../img/title_4.png" >
			<font class="title_2">管理员列表</font>
	</td>
  </tr>
<%
Iterator iter = ml.iterator();

while(iter.hasNext())
{
	Manager ma = (Manager)iter.next();
%>
	<tr>
	<td colspan="2">
	<div class="lanmu_item_parent">
	<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	<tr bgcolor="E4EDF9">
    <td colspan="2" align="center" class="tag_news_item_partent_title">Administrator</td>
    <td align="right" bgcolor="#E5E5E5">
    	<a href=<%="edit_manager.jsp?manager_username="+ma.getUsername()%>>[编辑]</a>
    	<a href=<%="delete_manager.jsp?manager_username="+ma.getUsername()%>>[删除]</a></td>
  </tr>
  <tr bgcolor="F1F3F5">
    <td width="10%" align="center" class="manager_passAndName">用户名:</td>
    <td colspan="2" width="90%" class="tag_news_item_partent_content" width="75%"><%=ma.getUsername()%></td>
  </tr>
  <tr bgcolor="F1F3F5">
    <td align="center" class="manager_passAndName">密码:</td>
    <td colspan="2" class="tag_news_item_partent_content" width="75%"><%=ma.getPassword()%></td>
  </tr>
	</table>
	</div>
	</td>
	</tr>
  <tr><td><div style="height: 10">&nbsp;</div><td></tr>
<%
 }
%>
  <tr>
    <td colspan="2">&nbsp;</td>
  </tr>
</table>
</div>

</body>
</html>