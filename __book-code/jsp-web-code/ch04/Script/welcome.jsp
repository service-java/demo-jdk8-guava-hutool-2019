<%@ page contentType="text/html; charset=gb2312"%>
<%!int Num = 0;%>
<%
int count = 0;
%>
<html>
<head>
<title>欢迎你！！！</title>
</head>
<body>
<h1><%="欢迎！"%></h1>
<br>
<%
	Num++;
	count++;
%>
<%="您是第" + Num + "个客人!"%>
<br>
<%="您是第" + count + "个客人!"%>
</body>
</html>
