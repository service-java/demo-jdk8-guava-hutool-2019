<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 19:47
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
        String url = "jdbc:mysql://localhost:3306/luodb87";
        String username = "root"; // 用户名
        String password = "root"; // 密码
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            //执行SQL查询语句得到可滚动结果集
            ResultSet rs = stmt.executeQuery("select * from websites");
            out.println("<b>当前游标是否在第一行之前：" + rs.isBeforeFirst() + "</b><br>");
            out.println("由前至后顺序显示结果集 ：<br>");
            //使用next()方法顺序显示结果集
            while (rs.next()) {
                String id = rs.getString(1);
                out.println(id + "、 ");
            }
            out.println("<hr/><b>当前游标是否在最后一行之后:" + rs.isAfterLast() + "</b><br>");
            out.println("由后至前逆序显示结果:<br>");
            //使用previous()方法逆序显示结果
            while (rs.previous()) {
                String id = rs.getString(1);
                out.println(id + "、 ");
            }
            out.println("<hr/><br>将游标移动到第一行<br>");
            rs.first();
            out.println("<b>当前游标是否在第一行：" + rs.isFirst() + "</b><br>");
            out.println("结果集第一行的数据为:<br>");
            out.println(rs.getString(1) + " " + rs.getString(2) + " "+ rs.getString(3) + " " + rs.getString(4));
            out.println("<hr/>将游标移动到最后一行<br>");
            rs.last();
            out.println("<b>当前游标是否在最后一行：" + rs.isLast() + "</b><br>");
            out.println("结果集最后一行的数据为：<br>");
            out.println(rs.getString(1) + " " + rs.getString(2) + " "+ rs.getString(3) + " " + rs.getString(4));
            //游标的相对定位
            out.println("<hr/>将游标移动到最后一行的前三行<br>");
            rs.relative(-3);
            out.println("<b>结果集最后一行的前三行数据为：</b><br>");
            out.println(rs.getString(1) + " " + rs.getString(2) + " "+ rs.getString(3) + " " + rs.getString(4));
            //游标的绝对定位
            out.println("<hr/>将游标移动到第三行<br>");
            rs.absolute(3);
            out.println("<b>结果集第三行的数据为：</b><br>");
            out.println(rs.getString(1) + " " + rs.getString(2) + " "+ rs.getString(3) + " " + rs.getString(4));
            //beforeFirst()方法和next()方法配合使用
            out.println("<hr/><b>先将游标移动到第一行之前</b>");
            rs.beforeFirst();
            out.println("<br>再次由前至后显示结果：<br>");
            while (rs.next()) {
                String id = rs.getString(1);
                out.println(id + "、 ");
            }
            rs.close();
            stmt.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    %>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
