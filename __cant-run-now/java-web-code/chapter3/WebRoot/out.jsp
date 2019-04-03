<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>out对象</title>
</head>
<body>
	<%
		out.println("<h2>梦天</h2>");
		out.clearBuffer();
		out.println("<h2>Hello out对象!</h2>");
		out.flush();
		out.print("剩余缓冲区大小为：" + out.getRemaining() + "bytes<BR>");
		out.print("默认缓冲区大小为：" + out.getBufferSize() + "bytes<BR>");
		out.print("剩余缓冲区大小为：" + out.getRemaining() + "bytes<BR>");
		out.print("是否使用默认AutoFlush：" + out.isAutoFlush());
	%>
</body>
</html>
