<%@ page contentType="text/html; charset=GBK"%>
<%@ page language="java" import="java.util.*"%>
<html>
<head>
<title>混合静态HTML代码和Scriptlet</title>
</head>
<body>
<%
if (Calendar.getInstance().get(Calendar.AM_PM) == Calendar.AM) {
%>
早上好！
<%
} else {
%>
下午好！
<%
}
%>
</body>
</html>
