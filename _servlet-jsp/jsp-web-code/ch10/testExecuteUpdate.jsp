<%@ page contentType="text/html; charset=gb2312"  language="java" errorPage=""%>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>test executeUpdate</title>
</head>
<body>
<%String url = "jdbc:mysql://localhost/ch10";
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
	sql = "DELETE FROM student WHERE stu_id=10";
	
	//使用executeUpdate执行更新语句
	int affectedRowCount = stmt.executeUpdate(sql);
	out.println("删除操作影响的数据行数为：" + affectedRowCount+"<br>");
	
	//使用executeUpdate执行更新语句
	sql = "INSERT INTO student(name,address,birthday)" +
	      "VALUES('小王', '北京', '1980-05-10')";
	affectedRowCount = stmt.executeUpdate(sql);
	out.println("插入操作影响的数据行数为：" + affectedRowCount+"<br>");
	
	sql = "update student set address='shanghai' where stu_id=11 " ;
    affectedRowCount = stmt.executeUpdate(sql);
    out.println("修改操作影响的数据行数为：" + affectedRowCount+"<br>");
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