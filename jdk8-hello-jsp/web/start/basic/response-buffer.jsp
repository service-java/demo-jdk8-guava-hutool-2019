<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>HTML5 Page Title</title>
</head>
<body>

<%
out.print("缓冲区大小：" + response.getBufferSize()+"<br>");

out.print("输出内容是否提交：" + response.isCommitted()+"<br>"); // false

response.flushBuffer();
out.print("输出内容是否提交：" + response.isCommitted()+"<br>"); // true
%>
	
</body>
</html>