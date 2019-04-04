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
	out.println("加载驱动器类时出现异常");
}

try {
	conn = DriverManager.getConnection(url, userName, password);
	
	//创建返回可滚动结果集的语句对象
	Statement stmt = conn.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE, 
			ResultSet.CONCUR_READ_ONLY);
		
	//执行SQL查询语句得到可滚动结果集
	ResultSet rs = stmt.executeQuery("SELECT * FROM student");
	
	out.println("当前游标是否在第一行之前：" + rs.isBeforeFirst()+"<br>");
	
	out.println("由前至后顺序显示结果集："+"<br>");
	
	//使用next()方法顺序显示结果集
	while (rs.next()) {	
		int id      = rs.getInt(1);
		String name    = rs.getString(2);
		String address = rs.getString("address");
		Date birthday = rs.getDate(4);
		
		out.println(id + "   " + name + "   " + 
				address + "   " + birthday+"<br>");
	}
	
	out.println("当前游标是否在最后一行之后：" + rs.isAfterLast()+"<br>");

	out.println("由后至前逆序显示结果集："+"<br>");
	
	//使用previous()方法逆序显示结果集
	while (rs.previous()) {	
		int id      = rs.getInt(1);
		String name    = rs.getString(2);
		String address = rs.getString("address");
		Date birthday = rs.getDate(4);
		
		out.println(id + "   " + name + "   " + 
				address + "   " + birthday+"<br>");
	}
	
	out.println("将游标移动到第一行"+"<br>");
	rs.first();
	out.println("当前游标是否在第一行：" + rs.isFirst()+"<br>");
	out.println("结果集第一行的数据为："+"<br>");
	out.println(rs.getInt(1) +  "   " + rs.getString(2) + 
			"   " + rs.getString(3) +  "   " + rs.getDate(4)+"<br>");
	
	out.println("将游标移动到最后一行"+"<br>");
	rs.last();
    out.println("当前游标是否在最后一行：" + rs.isLast()+"<br>");
	out.println("结果集最后一行的数据为："+"<br>");
	out.println(rs.getInt(1) +  "   " + rs.getString(2) + 
		"   " + rs.getString(3) +  "   " + rs.getDate(4)+"<br>");

	//游标的相对定位
	out.println("将游标移动到最后一行的前两行"+"<br>");
	rs.relative(-2);
	out.println("结果集最后一行的前两行的数据为："+"<br>");
	out.println(rs.getInt(1) +  "   " + rs.getString(2) + 
			"   " + rs.getString(3) +  "   " + rs.getDate(4)+"<br>");
	
    //游标的绝对定位
	out.println("将游标移动到第二行"+"<br>");
	rs.absolute(2);
	out.println("结果集第二行的数据为："+"<br>");
	out.println(rs.getInt(1) +  "   " + rs.getString(2) + 
			"   " + rs.getString(3) +  "   " + rs.getDate(4)+"<br>");
	
    //beforeFirst()方法和next()方法的配合使用
    out.println("先将游标移动到第一行之前"+"<br>");
	rs.beforeFirst();
	out.println("再次由前至后顺序显示结果集："+"<br>");		
	while (rs.next()) {	
		int id      = rs.getInt(1);
		String name    = rs.getString(2);
		String address = rs.getString("address");
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