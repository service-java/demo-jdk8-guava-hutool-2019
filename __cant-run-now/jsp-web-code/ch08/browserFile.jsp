 <%@ page contentType="text/html;charset=gb2312"%>
 <%@ page import="java.io.*"%>

<html>
<head>
<title>文件的浏览</title>
</head>
<body>
<h1>文件的浏览</h1>
 
 <%int fcount=0,dcount=0;%>
 <%
  String path=request.getRealPath("/");
 
 //建立当前目录中文件的File对象
 File d=new File(path);
 //取得代表目录中所有文件的File对象数组
  File list[]=d.listFiles();
 out.println("<font color=#ff0000>" + path + "目录下的文件：</font><br>");
 //循环输出当前目录下的所有文件
 for(int i=0;i<list.length;i++)
  {
 if(list[i].isFile())
 {
  out.println(list[i].getName() + "<br>");
 fcount++;
  }
  }
  out.println("<br><font color=#ff0000>" + path + "目录下的目录：</font><br>");
  //循环输出当前目录下的所有子目录
  for(int i=0;i<list.length;i++)
  {
  if(list[i].isDirectory())
  {
  out.println(list[i].getName() + "<br>");
  dcount++;
  }
  }
  %>
  
  <hr>
  <h3>统计结果：</h3>
  <center>
  文件总数：<%=fcount%><br>
  目录总数：<%=dcount%><br>
  </center>
  </body>
  </html>
