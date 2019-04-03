<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>处理结果</title>
</head>

<body>

<%
request.setAttribute("error","很抱歉！您输入的用户名或密码不正确！");
%>

<!-- 请求转发 -->
<jsp:forward page="../../error.jsp" />

</body>
</html>
