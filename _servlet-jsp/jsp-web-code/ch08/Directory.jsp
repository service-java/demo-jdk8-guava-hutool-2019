<%@ page contentType="text/html;charset=gb2312"%>
<%@ page import="java.io.*"%>
<html>
<head>
<title>目录的创建、检查与删除</title>
</head>
<body>
<%
String path=request.getRealPath("");
path=path + "\\text";
//将要建立的目录路径
File d=new File(path);
//建立代表uploadFile目录的File对象，并得到它的一个引用

if(d.exists())
{
//检查uploadFile目录是否存在

d.delete();
out.println("uploadFile目录存在，现被删除");
}else
{
d.mkdir();
//建立uploadFile目录

out.println("uploadFile目录不存在，现被建立");
}
%>
</body>
</html>
