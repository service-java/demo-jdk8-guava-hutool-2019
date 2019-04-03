<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=GBK"%>
<%
request.setCharacterEncoding("gb2312");
%>
<html>
<head>
<title>使用Request对象</title>
</head>
<body bgcolor="#ccffcc">
<h1>您刚才输入的内容是：<BR>
</h1>
<%
	Enumeration enu = request.getParameterNames();
	while (enu.hasMoreElements()) {
		String parameterName = (String) enu.nextElement();
		String parameterValue = (String) request
		.getParameter(parameterName);
		out.print("参数名称：" + parameterName + "<BR>");
		out.print("参数内容：" + parameterValue + "<BR>");
	}
%>
</body>
</html>
