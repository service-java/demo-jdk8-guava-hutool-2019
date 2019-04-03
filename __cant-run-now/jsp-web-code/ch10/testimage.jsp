<%@ page contentType="text/html;charset=gb2312"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 
<%@ page import="java.io.*"%>
<%@ page import="java.nio.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
    <body>
<%request.setCharacterEncoding("gb2312");%>
     <%
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        //加载JDBC驱动程序   
        String  url="jdbc:mysql://localhost/bin_db"; 
       //bin_db为你的数据库的名称   
        String  user="root";    
        String  password="root";          
      
        String filename=request.getParameter("image");
         File file = new File(filename); //获取表单传过来的图片的url           
        try {
			//打开文件
			FileInputStream fin = new FileInputStream(file);
			//建一个缓冲保存数据
			ByteBuffer nbf = ByteBuffer.allocate((int) file.length());
			byte[] array = new byte[1024];
			int offset = 0, length = 0;
			//读存数据
			while ((length = fin.read(array)) > 0) {
				if (length != 1024)
					nbf.put(array, 0, length);
				else
					nbf.put(array);
				offset += length;
			}
		  //新建一个数组保存要写的内容
			byte[] content = nbf.array();
			//创建数据库连接
			Connection  conn=  DriverManager.getConnection(url,user,password);
			//保存数据
			Statement stmt =conn.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			String sqlstr = "select * from bindata where filename='01'";
			ResultSet rs = stmt.executeQuery(sqlstr);
			if (rs.next()) 
			{
				rs.updateBytes(2, content);
				rs.updateRow();
			} else {
				rs.moveToInsertRow();
				rs.updateString(1, "01");
				rs.updateBytes(2, content);
				rs.insertRow();
			}
			rs.close();
//			关闭文件
			fin.close();
			out.println("恭喜，已经将新的记录成功地添加到数据库中！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
   %> 
    </body>
</html>
