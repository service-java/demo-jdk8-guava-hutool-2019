<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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

    <%
        try {
            //驱动类
            String url = "jdbc:mysql://localhost:3306/luodb87";
            String username = "root"; //用户名
            String password = "root"; //密码
            Connection conn = null;
            Statement statement = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "select * from books";
            ResultSet rs = statement.executeQuery(sql);
    %>

    <table border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC"
           width="100%">
        <tr align="center" bgcolor="#FAFAF1">
            <td>编号1</td>
            <td>书名</td>
            <td>作者</td>
            <td>价格</td>
            <td>出版社</td>
            <td>简介</td>
        </tr>

        <%
            while (rs.next()) {
        %>
        <tr>
            <td><%=rs.getString("id")%></td>
            <td><%=rs.getString("name")%></td>
            <td><%=rs.getString("author")%></td>
            <td><%=rs.getString("price")%></td>
            <td><%=rs.getString("publisher")%></td>
            <td><%=rs.getString("intro")%></td>
        </tr>
        <%
            }
            //修改数据记录
            rs.absolute(2);
            rs.updateInt("id", 8);
            rs.updateRow();
            //插入一条数据记录
            rs.moveToInsertRow();
            rs.updateInt(1, 10);
            rs.updateString(2, "猫和老鼠");
            rs.updateString(3, "汤姆");
            rs.updateInt(4, 18);
            rs.updateString(5, "教育出版社");
            rs.updateString(6, "无");
            rs.insertRow();
            //删除一行数据
            rs.absolute(3);
            rs.deleteRow();
        %>
    </table>

    <table border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC"
           width="100%">
        <tr align="center" bgcolor="#FAFAF1">
            <td>编号</td>
            <td>书名</td>
            <td>作者</td>
            <td>价格</td>
            <td>出版社</td>
            <td>简介</td>
        </tr>

        <%
            rs.beforeFirst();
            while (rs.next()) {
        %>
        <tr>
            <td><%=rs.getString("id")%></td>
            <td><%=rs.getString("name")%></td>
            <td><%=rs.getString("author")%></td>
            <td><%=rs.getString("price")%></td>
            <td><%=rs.getString("publisher")%></td>
            <td><%=rs.getString("intro")%></td>
        </tr>
        <%
                }
                rs.close();
                statement.close();
                conn.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </table>
</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
