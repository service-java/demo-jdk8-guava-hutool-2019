<%@ page contentType="text/html; charset=GBK"%>
<html>
<head>
<title>我的第一个JSP程序！！！</title>
</head>
<body>
<%!int number = 1;%>
<%--这是声明一个变量 --%>
<%!public int count() {
		return number++;
	}

	/*这是声明一个方法*/%>
<%
	//JSP程序代码
	out.println("Hello JSP! ");
	out.println("欢迎使用 JSP交互式动态网页!!  ");
%>
<br>
<%="您是第" + count() + "个客人!"%>
<br>
</body>
</html>
