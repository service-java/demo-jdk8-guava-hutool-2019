<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/6
  Time: 1:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="../../error.jsp" %>

<html>
<head>
    <title>Error Handling Example</title>
</head>
<body>
<%
    // Throw an exception to invoke the error page
    int x = 1;
    if (x == 1) {
        throw new RuntimeException("Error condition!!!");
    }
%>
</body>
</html>
