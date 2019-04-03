<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="com.jspsmart.upload.*"%> 
<jsp:useBean id="theSmartUpload" scope="page" class="com.jspsmart.upload.SmartUpload" /> 
<html> 
<head>
<title>上载附件 </title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body>
  <center>正在上传文件...

<%

//上载附件

try
{

	theSmartUpload.initialize(pageContext); 
theSmartUpload.setTotalMaxFileSize(5*1024*1024) ;  
theSmartUpload.upload(); 
String fn=theSmartUpload.getFiles().getFile(0).getFileName();
theSmartUpload.save("C:\\saveDir\\");//文件保存的目录为upload
out.println(fn);
out.println("已经成功上传了文件，请查看文件是否上传成功");
}
catch(Exception e)
{
e.printStackTrace();
}

%>
<a href=FileUpload.html>重新上传</a>
</body>
</html>
