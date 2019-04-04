<%@ page contentType="text/html;charset=gb2312"%>　
<%@ page import="java.sql.*" %> 
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 
<%@ page import="java.io.*"%>
<html>
<body>
<%request.setCharacterEncoding("gb2312");%>
<%
Class.forName("com.mysql.jdbc.Driver");
//加载JDBC驱动程序   
      String  url="jdbc:mysql://localhost/bin_db"; 
//bin_db为你的数据库的名称   
      String  user="root";    
      String  password="root";    
      Connection  conn=  DriverManager.getConnection(url,user,password);
//创建数据库连接
         String filename=request.getParameter("sound");
        File file = new File(filename); //获取表单传过来的声音的url           
        try {
			//打开文件
			FileInputStream fin = new FileInputStream(file);
//获取声音文件并转化为单字符的字符输入流
       String sql1="delete from bindata where filename='03'";
       PreparedStatement pstmt1=conn.prepareStatement(sql1); //创建PreparedStatement对象
       pstmt1.execute();
        String sql="insert into bindata(filename,binfile) values('03',?)"; //插入记录的sql语句
        PreparedStatement pstmt=conn.prepareStatement(sql); //创建PreparedStatement对象
        pstmt.setBinaryStream(1,fin,fin.available()); //将字符输入流in存储到pstmt对象中
        pstmt.execute(); //pstmt将记录插入到数据库中
        out.println("恭喜，声音文件已经成功地存储到数据库中！"); }
        catch(SQLException e) {
        	out.println("出现SQLException异常");
        }
   %> 
     </body>
</html>
