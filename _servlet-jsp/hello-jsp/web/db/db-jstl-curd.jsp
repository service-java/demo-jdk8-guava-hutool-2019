<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--<%@ page import="java.io.*,java.util.*,java.sql.*"%>--%>
<%--<%@ page import="javax.servlet.http.*,javax.servlet.*" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%-- 记得加 上面2行 --%>

<html>
<head>
    <title>SELECT操作</title>
    <style>
        table, th, td {
            border-collapse: collapse;
            border: 1px solid;
        }
    </style>
</head>
<body>

<%-- 数据库源 --%>
<sql:setDataSource
        var="snapshot"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/luodb87?useUnicode=true&characterEncoding=utf-8"
        user="root"
        password="root"/>

<%-- 插入 --%>
<sql:update dataSource="${snapshot}" var="result">
    INSERT INTO websites (name,url,alexa,country) VALUES ('永远站', 'http://m.runoob.com', 5093, 'CN');
</sql:update>

<%-- 删除 --%>
<sql:update dataSource="${snapshot}" var="count">
    DELETE FROM websites WHERE name like  '%永%'
    <%--<sql:param value="${'永'}" />--%>
</sql:update>


<%--  更改 --%>
<c:set var="SiteId" value="4"/>

<sql:update dataSource="${snapshot}" var="count">
    UPDATE websites SET name = 'X-weibo' WHERE Id = ?
    <sql:param value="${SiteId}" />
</sql:update>


<%-- 查询 --%>
<sql:query dataSource="${snapshot}" var="result">
    select *
    from websites
    where country = 'CN';
</sql:query>

<table>
    <tr>
        <th>ID</th>
        <th>站点名</th>
        <th>站点地址</th>
    </tr>

    <%-- result是sql:query的var--%>
    <c:forEach var="row" items="${result.rows}">
        <tr>
            <td><c:out value="${row.id}"/></td>
            <td><c:out value="${row.name}"/></td>
            <td><c:out value="${row.url}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
