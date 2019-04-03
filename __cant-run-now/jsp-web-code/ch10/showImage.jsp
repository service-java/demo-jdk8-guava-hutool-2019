<%@ page contentType="text/html;charset=gb2312"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 
<%@ page import="java.io.*"%>
<html> 
<body> 
<%Class.forName("com.mysql.jdbc.Driver");
//加载JDBC驱动程序   
String  url="jdbc:mysql://localhost/bin_db"; 
//bin_db为你的数据库的名称   
String  user="root";    
String  password="root";    
Connection  conn=  DriverManager.getConnection(url,user,password);
//创建数据库连接
String sql="select binfile from bindata where filename='01'"; //查询filename为01的记录的pic字段
Statement stmt=null; 
ResultSet rs=null; 
try{ 
    stmt=conn.createStatement(); 
    rs=stmt.executeQuery(sql); 
    }catch(SQLException e){} 
try { 
    while(rs.next()) { 
      response.setContentType("image/jpeg");  //设置返回图像的类型
        ServletOutputStream sout = response.getOutputStream();
//声明ServletOutputStream的实例sout
        InputStream in = rs.getBinaryStream(1); //获取二进制输入流
        byte b[] = new byte[0x7a120];// 创建byte数组用作缓冲
        for(int i = in.read(b); i != -1;) 
            { 
                sout.write(b); //向输出流中写入返回页面的内容 
                in.read(b); //读取输入流中的数据 
            } 
            sout.flush(); 
            sout.close(); //关闭输入流
            } 
            } 
      catch(Exception e){System.out.println(e);} 
%> 
</body> 
</html>
