<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/8
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<jsp:useBean id="conn" scope="page" class="db.DBCurd" />

<html>
<head>
    <title>Title</title>
</head>
<body>

<%

    String sql = null;
    ResultSet rs = null;

    // 增删改
    try {
        sql = "delete from websites where name like '%q%';";
        conn.delete(sql);

        sql = "insert websites values (null,'qmen', 'http://qmen.space', 12, 'CN')";
//        conn.insert(sql);

        sql = "update websites set name='q'  where name = 'qmen'";
//        conn.update(sql);


    } catch(Exception e) {
        out.print("<script>alert('操作失败！');</script>");
    }

    // 查询
    sql = "SELECT * FROM  websites";
    rs = conn.select(sql);

    while(rs.next()) {
        out.print(rs.getString("name") + " : " + rs.getInt("alexa") + "<br>");
    }




    // 关闭数据库连接
    if (rs != null) {
        rs.close();
    }
%>
</body>
</html>
