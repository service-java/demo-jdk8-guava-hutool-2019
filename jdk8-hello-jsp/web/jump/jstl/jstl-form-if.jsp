<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/5
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test="${param.user==null}" var="rtn" scope="page"/>
<p>用户名为null: <c:out value="${rtn}"/></p>

<c:if test="${param.user==null}">
    <form action="" method="post">
        请输入用户名：<input type="text" name="user">
        <input type="submit" value="提交">
    </form>
</c:if>


</body>
</html>
