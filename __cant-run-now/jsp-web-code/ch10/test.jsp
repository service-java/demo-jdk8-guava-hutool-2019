<%@ page contentType="text/html; charset=gb2312" language="java" 
import="java.sql.*,javax.naming.*,javax.sql.*" errorPage="" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
…
<body>
<%
	out.print("使用连接池连接MySQL数据库成功！<br>");//输出提示信息
	out.println("<br>");
	Context ctx=null;
	DataSource ds=null;
	Statement stmt=null;
	ResultSet rs=null;
	Connection con=null;
	ResultSetMetaData md=null;
	try{
		ctx = new InitialContext();
		
		ds = (DataSource)ctx.lookup("java:comp/env/jdbc/my_db");//找到配置的数据源
		con=ds.getConnection();//创建数据库连接
		stmt=con.createStatement();	
		rs=stmt.executeQuery("select * from student");//执行sql查询从数据表中取出数据
		md=rs.getMetaData();//获取数据集的列数，即字段数
		out.print(md.getColumnLabel(1)+" ");//输出第一列的名称，即第一个字段名称
		out.print(md.getColumnLabel(2)+" ");
		out.print(md.getColumnLabel(3)+" ");
		out.print(md.getColumnLabel(4)+"<br>");
		while(rs.next()){
			out.print(rs.getInt(1)+" ");//输出第一个字段对应的值
			out.print(rs.getString(2)+" ");
			out.print(rs.getString(3)+" ");
			out.print(rs.getString(4)+"<br>");
		}
	}catch(Exception e){
		out.print(e);
	}finally{
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(con!=null) con.close();//断开数据库连接
                if(ctx!=null) ctx.close();//没有连接时，释放资源

	}
%>
</body>
</html>
