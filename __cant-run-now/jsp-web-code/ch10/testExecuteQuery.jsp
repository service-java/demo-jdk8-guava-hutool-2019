<%@ page contentType="text/html; charset=gb2312"  language="java" errorPage=""%>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>test executeQuery</title>
</head>
<body>
<%
String url = "jdbc:mysql://localhost/ch10";
		String userName = "root";
		String password = "root";
		String sql = null;
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			out.println("加载驱动器类时出现异常");
		}
		
		try {
			conn = DriverManager.getConnection(url, userName, password);
			
			//创建Statement语句
			stmt = conn.createStatement();			
			sql = "SELECT * FROM student";
			
			//使用executeQuery执行SQL查询语句
			ResultSet rs = stmt.executeQuery(sql);
			%>
	<table width="740" border="1" cellspacing="0" cellpadding="6">
    <tr> 
      <td width="120" align="center" valign="middle">编号</td>
      <td width="145" align="center">姓名</td>
      <td width="253" align="center">地址</td>
      <td width="148" align="center">出生日期</td>
    </tr>
			<%
			//显示返回的结果集
			while (rs.next()) {
				int id      = rs.getInt(1);
				String name    = rs.getString(2);
				String address = rs.getString(3);
				String birthday     = rs.getString(4);						
			%>
			<tr> 
      <td height="40" align="center" valign="middle"><%=id%></td>
      <td align="center" valign="middle"><%=name%></td>
      <td valign="middle"><%=address%></td>    
       <td align="center" valign="middle"><%=birthday%></td>  
    </tr>
			<%}
			rs.close();
			stmt.close();
			
		} catch(SQLException e) {
			out.println("出现SQLException异常");
		} finally {
			//关闭语句和数据库连接
			try {
				if (conn != null) conn.close();
			} catch(SQLException e) {
				out.println("关闭数据库连接时出现异常");
			}		
		}
%>
</body>
</html>