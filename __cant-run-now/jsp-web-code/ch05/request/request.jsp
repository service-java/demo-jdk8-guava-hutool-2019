<%@ page contentType="text/html;charset=GB2312"%>
<%@ page import="java.util.*"%>
<HTML>
<head>
<title>reuqest对象示例</title>
</head>
<BODY>
<BR>
客户使用的协议是:
<%=request.getProtocol()%>
<BR>
获取接受客户提交信息的页面：
<%=request.getServletPath()%>
<BR>
接受客户提交信息的长度：
<%=request.getContentLength()%>
<BR>
客户提交信息的方式：
<%=request.getMethod()%>
<BR>
获取HTTP头文件中User-Agent的值：
<%=request.getHeader("User-Agent")%>
<BR>
获取HTTP头文件中Host的值：
<%=request.getHeader("Host")%>
<BR>
获取HTTP头文件中accept的值：
<%=request.getHeader("accept")%>
<BR>
获取HTTP头文件中accept-encoding的值：
<%=request.getHeader("accept-encoding")%>
<BR>
获取客户机的名称：
<%=request.getRemoteHost()%>
<BR>
获取客户的IP地址：
<%=request.getRemoteAddr()%>
<BR>
获取服务器的名称：
<%=request.getServerName()%>
<BR>
获取服务器的端口号：
<%=request.getServerPort()%>
<BR>
枚举所有的头部名称：
<%
	Enumeration enum_headed = request.getHeaderNames();
	while (enum_headed.hasMoreElements()) {
		String s = (String) enum_headed.nextElement();
		out.println(s);
	}
%>

<BR>
枚举头部信息中指定头名字的全部值：
<%
	Enumeration enum_headedValues = request.getHeaders("cookie");
	while (enum_headedValues.hasMoreElements()) {
		String s = (String) enum_headedValues.nextElement();
		out.println(s);
	}
%>
</BODY>
</HTML>
