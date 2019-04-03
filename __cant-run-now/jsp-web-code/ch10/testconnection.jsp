<%@ page contentType="text/html; charset=gb2312"  language="java" errorPage=""%>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>test connection</title>
</head>
<body>
<% 
	String url = "jdbc:mysql://localhost/ch10";
		String userName = "root";
		String password = "root";
		Connection conn = null;		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			} catch(ClassNotFoundException e) {
			
			out.println("加载驱动器类时出现异常");
		}try {
			conn = null;
			conn = DriverManager.getConnection(url, userName, password);
			} catch(SQLException e) {
			out.println("连接数据库的过程中出现SQL异常");
		} if (conn==null)
			out.println("连接数据库失败");
		else
			out.println("连接数据库成功");	
		try {
			conn.close();
		} catch (SQLException e) {
			out.println("关闭数据库连接时出现SQL异常");
		} 
		%>
</body>
</html>
