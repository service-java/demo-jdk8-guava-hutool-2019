<%@ page import="java.sql.ResultSet" %>
<!--
@Author: 骆金参
@Date:   2017-03-16T08:26:32+08:00
@Email:  1095947440@qq.com
@Filename: investigation.html
@Last modified by:   骆金参
@Last modified time: 2017-03-16T09:12:20+08:00

@在线预览 http://qmen.space:8080/HelloJSP/lab/lab9/list-stu.jsp
-->


<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<jsp:useBean id="conn" scope="page" class="db.ConnDB" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>新增学生</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" style="margin-top: 20px;">
    <table class="table table-bordered table-striped">
        <tr class="success">
            <th>序号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
            <th>学历</th>
            <th>爱好</th>
            <th>操作</th>
        </tr>

        <%
            String sql = null;
            ResultSet rs = null;

            // 查询
            sql = "SELECT * FROM  student;";
            rs = conn.executeQuery(sql);

            while(rs.next()) { %>
        <tr>
            <td><% out.print(rs.getInt("id")); %></td>
            <td><% out.print(rs.getString("name")); %></td>
            <td><% out.print(rs.getInt("age")); %></td>
            <td><% out.print(rs.getString("gender")); %></td>
            <td><% out.print(rs.getString("qualification")); %></td>
            <td><% out.print(rs.getString("hobby")); %></td>
            <td>
                <a href="<%=request.getContextPath()%>/Stu?action=show&id=<%=rs.getInt("id")%>">查看</a>
                <a href="<%=request.getContextPath()%>/lab/lab9/edit-stu.jsp?id=<%=rs.getInt("id")%>">编辑</a>
                <a href="<%=request.getContextPath()%>/Stu?action=del&id=<%=rs.getInt("id")%>" onclick="return del()">删除</a>
            </td>
        </tr>
        <% } %>

    </table>
<div class="col-sm-12">



    <p class="text-right">
        <a href="<%=request.getContextPath()%>/lab/lab9/add-stu.jsp">新增学生</a>
    </p>

</div>



</div>

<script>
    function del() {
        if (!confirm("确认要删除？")) {
            window.event.returnValue = false;
        }
    }
</script>
</body>
</html>