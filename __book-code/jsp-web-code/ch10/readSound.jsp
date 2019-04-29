<%@ page contentType="text/html;charset=gb2312"%>　
<%@ page import="java.sql.*" %> 
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 
<%@ page import="java.io.*"%>
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>从数据库中读取声音文件</title>
<style type="text/css">
<!--
body {
	background-color: #FFFFCC;
}
.style1 {
	color: #FF0000;
	font-size: 18px;
}
-->
</style></head>
<body  topmargin="0" leftmargin="0"> 
<%Class.forName("com.mysql.jdbc.Driver").newInstance();
//加载JDBC驱动程序   
String  url="jdbc:mysql://localhost/bin_db"; 
//bin_db为你的数据库的名称   
String  user="root";    
String  password="root";    
Connection  conn=  DriverManager.getConnection(url,user,password);
//创建数据库连接
String sql="select * from bindata where filename='03'"; 
Statement stmt=null; 
ResultSet rs=null; 
try{ 
    stmt=conn.createStatement(); 
    rs=stmt.executeQuery(sql); 
    }catch(SQLException e){} 
try { 
    String rootPath = application.getRealPath("/");//获取当前应用程序的根目录
   if (rs.next()) { 
        File f=new File(rootPath+"03");//在应用程序根目录下输出读取的声音文件
        FileOutputStream outs=new FileOutputStream(f);
        InputStream in = rs.getBinaryStream(2); //获取二进制输入流
        byte b[] = new byte[0x7a120];// 创建byte数组用作缓冲
        while (in.read(b) != -1) 
            { 
                outs.write(b); //输出二进制文件
              
            } 
           outs.flush(); 
            outs.close(); 
            } 
            } 
      catch(Exception e){System.out.println(e);} 
%> 
<p>&nbsp;  </p>
<p align="center" class="style1"> 单击播放按钮播放声音文件</p>
<p>&nbsp;</p>
<p align="center">

<!--在页面中插入Windows Media Player播放器用来播放声音文件-->
  <object  classid=clsid:22D6F312-B0F6-11D0-94AB-0080C74C7E95 codebase=
http://activex.microsoft.......ols/mplayer/en/nsmp2inf.cab#
Version=9.0 height=53 id=NSPlay0 name=NSPlay type=application/x-oleobject
 width=300 VIEWASTEXT standby="Loading Microsoft Windows Media Player
 components..." border="0">
    <param name="AudioStream" value="-1">
    <param name="AutoSize" value="0">
   
    <!--设置播放器为“不自动播放”-->
    <param name="AutoStart" value="0">
……………<!--设置播放器的播放参数-->
……………

       <!-- 设置播放文件的名称-->
       <param name="Filename" value="03">
……….<!--设置播放器的播放参数-->
………..
  </object>

</p>
</body> 
</html>

