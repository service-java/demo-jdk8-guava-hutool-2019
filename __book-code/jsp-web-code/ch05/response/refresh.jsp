<%@page language="java" contentType="text/html;charset=gb2312"
	import="java.util.*"%>
<HTML>
<HEAD>
<TITLE>response应用实例</TITLE>
</HEAD>
<BODY>
<%
	out.println(new Date().toLocaleString()); //获得当前时间
	response.setHeader("refresh", "1"); //设置每1秒刷新一次刷新
%>
</BODY>
</HTML>
