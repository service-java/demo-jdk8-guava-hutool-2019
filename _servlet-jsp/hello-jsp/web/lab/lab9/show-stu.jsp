<%@ page import="java.sql.ResultSet" %>
<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/20
  Time: 2:36
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="conn" scope="page" class="db.ConnDB" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>HTML5 Page Title</title>

    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" style="margin-top: 20px;">

    <table class="table table-striped table-bordered">
        <tr class="info">
            <th>序号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
            <th>学历</th>
            <th>爱好</th>
            <th>个人介绍</th>
        </tr>

            <%
                String sql = null;
                ResultSet rs = null;

                // 查询
                sql = "SELECT * FROM  student where id = " + request.getParameter("id");
                rs = conn.executeQuery(sql);
                if(rs.next()) { %>
        <tr>
            <td><%= rs.getInt("id")%></td>
            <td><%= rs.getString("name")%></td>
            <td><%= rs.getInt("age")%></td>
            <td><%= rs.getString("gender")%></td>
            <td><%= rs.getString("qualification")%></td>
            <td><%= rs.getString("hobby")%></td>
            <td><%= rs.getString("introduction")%></td>
        </tr>
        <% } %>
    </table>

    <p class="text-right">
        <a href="<%=request.getContextPath()%>/lab/lab9/list-stu.jsp">所有学生信息</a>
    </p>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
