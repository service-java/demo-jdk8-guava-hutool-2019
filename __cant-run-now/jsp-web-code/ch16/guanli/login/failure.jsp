<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
<title>Lomboz JSP</title>
</head>
<body bgcolor="#E5E5E5">

<script language="javascript">
<%
String error = (String)session.getAttribute("error");

if(error!=null)
{
%>

	alert("您输入的用户名和密码有误!");
<%
}
%>
	location.href='guanli/login.jsp';

<%
session.removeAttribute("error");
%>
</script>
</body>
</html>