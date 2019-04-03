<%@ page contentType="text/html; charset=gb2312"  language="java" errorPage=""%>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>test executeBatch</title>
</head>
<body>
<%String url = "jdbc:mysql://localhost/ch10";
String userName = "root";
String password = "root";
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
	
	//使用addBatch方法添加一个删除语句
	stmt.addBatch("DELETE FROM student WHERE stu_id=13");
    //使用addBatch方法添加一个插入语句
	stmt.addBatch("INSERT INTO student " +
	              "VALUES(13, 'wang', 'beijing', '1980-05-01')");
    stmt.addBatch("USE ch10");
//  使用addBatch方法添加一个DROP TABLE DDL语句
	stmt.addBatch("DROP TABLE if exists test_table");
    //使用addBatch方法添加一个CREATE TABLE DDL语句
	stmt.addBatch("CREATE TABLE test_table " +
			      "(clumn1 CHAR(10),clumn2 CHAR(20))");
	
	//使用executeBatch执行批量更新语句
	int[] affectedRowCounts = stmt.executeBatch();
	
	//显示更新计数数组
	for (int i=0; i<affectedRowCounts.length; i++) {
		out.println("第" + (i+1) + "个更新语句影响的数据行数为：" + affectedRowCounts[i]+"<br>");
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
}%>

</body>
</html>