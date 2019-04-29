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
try {
	Class.forName("com.mysql.jdbc.Driver");
} catch(ClassNotFoundException e) {
	out.println("加载驱动器类时出现异常");
}

try {
	conn = DriverManager.getConnection(url, userName, password);
	
	//创建PreparedStatement语句
	PreparedStatement pstmtDelete = conn.prepareStatement(
			"DELETE FROM student WHERE stu_id=?");		
	PreparedStatement pstmtInsert = conn.prepareStatement(
			"INSERT INTO student(name,address,birthday) VALUES(?, ?, ?)");	
	PreparedStatement pstmtSelect = conn.prepareStatement(
			"SELECT * FROM student WHERE stu_id>=? " +
			"ORDER BY stu_id");
	
	pstmtSelect.setInt(1, 1);
		
//	多次执行同一语句
	for (int i=1; i<4; i++) {
		
        //使用setXXX方法设置IN参数
		pstmtDelete.setInt(1, i);
        
		pstmtInsert.setString(1, "name"+i);
		pstmtInsert.setString(2, "city"+i);
		pstmtInsert.setDate(3, new Date(85, 12, i));
		
        //执行PreparedStatement语句
		pstmtDelete.executeUpdate();
		pstmtInsert.executeUpdate();
        ResultSet rs = pstmtSelect.executeQuery();
		
	    out.println("第 " + (i) + " 次循环后的结果集为："+"<br>");
        
//	  显示返回的结果集
		while (rs.next()) {
			int stuID      = rs.getInt(1);
			String name    = rs.getString(2);
			String address = rs.getString(3);
			String birthday= rs.getString(4);
			out.println(stuID + "   " + 
					name + "   " + address + "   " + birthday+"<br>");
		}
	}
	
	pstmtDelete.close();
	pstmtInsert.close();
	pstmtSelect.close();
	
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