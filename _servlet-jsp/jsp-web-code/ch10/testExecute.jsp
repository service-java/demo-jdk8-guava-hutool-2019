<%@ page contentType="text/html; charset=gb2312"  language="java" errorPage=""%>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>test execute</title>
</head>
<body>
<%String sql=request.getParameter("sqltest"); 
if(sql==null){%>
<form name="Example" method="post" action="">
<p> sql语句：<input type="text" name="sqltest" size="100" maxlength="100"></p>
<p><input type="submit" value="传送"></p>
<%}else{ 
String url = "jdbc:mysql://localhost/ch10";
String userName = "root";
String password = "root";
Connection conn = null;
Statement stmt = null;

try {
	Class.forName("com.mysql.jdbc.Driver");
} catch(ClassNotFoundException e) {
	out.println("加载驱动器类时出现异常"+"<br>");
}

try {
	conn = DriverManager.getConnection(url, userName, password);
	
	//创建Statement语句
	stmt = conn.createStatement();	

	out.println("执行的SQL语句为：" + sql+"<br>");
	
	//使用execute执行未知SQL语句
	boolean isResultSet = stmt.execute(sql);
	int count = 0;

	while (true) {
		count ++;
		if (isResultSet) {
			ResultSet rs = stmt.getResultSet();
			out.println("返回的执行结果 " + count + " 为结果集"+"<br>");
			//显示返回的结果集
			while (rs.next()) {
				int f1 = rs.getInt(1);
				String f2 = rs.getString(2);
				String f3 = rs.getString(3);
				out.println(f1 + "   " + f2 + "   " + f3);
				out.println("<br>");
			}
			rs.close();
		}
		else {
			int affectedRowCount = stmt.getUpdateCount();
			if (affectedRowCount == -1) break;
			out.println("返回的执行结果 " + count + " 为更新计数"+"<br>");
			out.println("更新计数为：" + affectedRowCount+"<br>");
		}
		
		isResultSet = stmt.getMoreResults();
	}
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
} }%>
</form>
</body>
</html>