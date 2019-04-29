<%@ page language="java" pageEncoding="utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println("basePath:"+basePath);
%>
<html>
<head>
<title>新闻修改成功</title>
<style type="text/css">
<!--
@import url("../../css/OSX.css");
-->
</style>
</head>
<body bgcolor="#E5E5E5">

<div align="center">
<table width="550"  border="0" cellspacing="1" cellpadding="1" class="tableBorder">
  <tr>
    <td align="center" background="../../images/guanli/admin_bg_1.gif" class="whitenormal">成功信息</td>
  </tr>
  <tr>
    <td bgcolor="E4EDF9" class="normalText">新闻修改成功</td>
  </tr>
  <tr>
    <td align="center" bgcolor="E4EDF9"><a href="./guali/news/news_list.jsp" class="normalText">&lt;&lt;返回查看其他新闻</a></td>
  </tr>
</table>
</div>
</body>
</html>