<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/8
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<jsp:useBean id="conn" scope="page" class="db.ConnDB" />

<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String sql = null;
    ResultSet rs = null;

    try {
        sql = "delete from websites where name like '%q%';";
        conn.executeUpdate(sql);

        sql = "insert websites values (null,'qmen', 'http://qmen.space', 12, 'CN')";
//        conn.executeUpdate(sql);

        sql = "update websites set name='q3' where name = 'qmen'";
//        conn.executeUpdate(sql);


    } catch(Exception e) {
        out.print("<script>alert('操作失败！');</script>");
    }



    // 查询
    sql = "SELECT * FROM  websites";
    rs = conn.executeQuery(sql);

    while(rs.next()) {
        out.print(rs.getString("name") + " : " + rs.getInt("alexa") + "<br>");
    }
%>
</body>
</html>
