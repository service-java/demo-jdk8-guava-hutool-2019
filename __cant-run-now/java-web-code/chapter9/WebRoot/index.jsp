<%@page import="java.sql.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  <body>
     <center><h3>测试数据库的连接</h3></center>
  <hr>
    <%
	try {
		Driver driver=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);				//加载驱动
		} catch (SQLException e) {
			e.printStackTrace();
			out.print("驱动加载失败");
			}					 
	try {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbd_book", "root", "123456");									//获取连接
		out.println("数据库连接成功!");
		connection.close();							//关闭连接，释放资源
		} catch (Exception e) {
			out.println("数据库连接失败!<br/>");
			out.print("错误信息："+e.toString());
		}
     %>

  </body>
</html>
