<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%--<%@ page import="com.mysql.jdbc.Driver" %>--%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>数据库</title>
</head>
<body>

<%
    //驱动程序名
    String driverName = "com.mysql.jdbc.Driver";
    String userName = "root";
    String userPasswd = "root";
    String dbName = "luodb87";
    String tableName = "websites";

    // 连接数据库
    String url = "jdbc:mysql://localhost/" + dbName
            + "?user=" + userName
            + "&password=" + userPasswd;
    Class.forName(driverName).newInstance();
    Connection connection = DriverManager.getConnection(url);

    // sql查询语句
    Statement statement = connection.createStatement();
    String sql = " SELECT * FROM " + tableName;
    ResultSet rs = statement.executeQuery(sql);
    ResultSetMetaData rmeta = rs.getMetaData();

    int numColumns = rmeta.getColumnCount();
    out.print("<p>总共" + numColumns + "行.</p>");

    // 遍历输出
    out.print("<ul>");
    while (rs.next()) {
        out.print("<li>");
        out.print(rs.getString(1) + "   ");
        out.print(rs.getString(2) + "   ");
        out.print(rs.getString(3));
        out.print("</li>");
    }
    out.print("</ul>");

    // 清场
    rs.close(); // 释放结果集
    statement.close();
    connection.close();
%>

</body>
</html>
