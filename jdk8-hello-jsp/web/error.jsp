<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/6
  Time: 1:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isErrorPage="true" %>
<html>
<head>
    <title>Show Error Page</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" style="margin: 20px;">
    <table class="table">
        <tr class="info">
            <th>错误信息</th>
            <td><%=request.getAttribute("error") %></td>
        </tr>
        <tr>
            <th>Error</th>
            <td>${pageContext.exception}</td>
        </tr>
        <tr>
            <th>URI</th>
            <td>${pageContext.errorData.requestURI}</td>
        </tr>
        <tr>
            <th>Status code</th>
            <td>${pageContext.errorData.statusCode}</td>
        </tr>
        <tr>
            <th>Stack trace</th>
            <td>
                <c:forEach var="trace"
                           items="${pageContext.exception.stackTrace}">
                    <p>${trace}</p>
                </c:forEach>
            </td>
        </tr>
    </table>


</div>


</body>
</html>
