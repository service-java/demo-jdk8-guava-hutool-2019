<%@ page contentType="text/html; charset=gb2312"  language="java" errorPage=""%>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>test ScrollResultset</title>
</head>
<body>
<%String url = "jdbc:mysql://localhost/ch10";
String userName = "root";
String password = "root";
Connection conn = null;
try {
	Class.forName("com.mysql.jdbc.Driver");
} catch(ClassNotFoundException e) {
	out.println("加载驱动器类时出现异常"+"<br>");
}

try {
	conn = DriverManager.getConnection(url, userName, password);
	
	//创建返回可更新结果集的语句对象
	Statement stmt = conn.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE, 
			ResultSet.CONCUR_UPDATABLE);
		
	//执行SQL查询语句得到可更新结果集
	ResultSet rs = stmt.executeQuery(
			"SELECT * FROM student ORDER BY stu_id");
				
    out.println("修改之前的结果集：");
	while (rs.next()) {	
		int id      = rs.getInt(1);
		String name    = rs.getString(2);
		String address = rs.getString("address");
		Date birthday = rs.getDate(4);		
	   out.println(id + "   " + name + "   " + 
				address + "   " + birthday+"<br>");
	}
	
	//将游标移动到最后一行
	rs.last();			
	int stuID = rs.getInt("stu_id");
	
	//使用updateXXX方法更新列值			
	rs.updateString(2, "newName"+Integer.toString(stuID));
	rs.updateString("address", "newAddr");
	rs.updateDate("birthday", new Date(79, 7, stuID%29));
	
	//使用updateRow()方法提交更新结果
	rs.updateRow();
	
	//将游标移动到插入行
	rs.moveToInsertRow();
	stuID++;
	
    //使用updateXXX方法更新列值
	rs.updateInt("stu_id", stuID);
	rs.updateString(2, "Name"+Integer.toString(stuID));
	rs.updateString("address", "Addr"+Integer.toString(stuID));
	rs.updateDate("birthday", new Date(79, 7, stuID%29));
	
	//使用insertRow()方法提交插入行
	rs.insertRow();
	
    //将游标移动到当前行
	rs.moveToCurrentRow();
	rs.previous();
	
	//使用deleteRow()方法删除一行
	rs.deleteRow();
	rs.close();
	
	//重新查询并显示结果集
	rs = stmt.executeQuery(
			"SELECT * FROM student ORDER BY stu_id");
	
	out.println("修改之后的结果集："+"<br>");
	while (rs.next()) {	
		int id      = rs.getInt(1);
		String name    = rs.getString(2);
		String address = rs.getString(3);
		Date birthday = rs.getDate(4);
		
		out.println(id + "   " + name + "   " + 
				address + "   " + birthday+"<br>");
	}
	
	rs.close();
	stmt.close();
	
} catch(SQLException e) {
	out.println("出现SQLException异常"+"<br>");
} finally {
	//关闭语句和数据库连接
	try {
		if (conn != null) conn.close();
	} catch(SQLException e) {
		out.println("关闭数据库连接时出现异常"+"<br>");
	}		
}%>

</body>
</html>