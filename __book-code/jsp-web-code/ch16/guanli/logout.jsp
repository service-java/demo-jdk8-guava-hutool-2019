<%@ page language="java" pageEncoding="GB2312" %>
<html>
<head>
<title>ÍË³ö</title>
</head>
<body bgcolor="#E5E5E5">

<%
session.removeAttribute("username");

session.invalidate();
%>
<script language="JavaScript">
location.href = "../index.jsp";
</script>

</body>
</html>