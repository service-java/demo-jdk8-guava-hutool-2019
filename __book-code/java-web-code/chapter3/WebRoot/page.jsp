<%@ page language="java" import="java.util.*" pageEncoding="GBK" info="使用page对象"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>page对象</title>
<style type="text/css">
body {
	background-image: url(images/ypz.jpg);
	background-position: center top;
	background-repeat: no-repeat;
	text-align:center;
}
body {
	text-apgn: center;
	padding-top: 70px;
	color: #805231;
	font-family: "Monotype Corsiva 宋体";
}

p {
	font-size: 14px;
}

h1 {
	font-size: 30px;
	padding-bottom: 20px;
}
</style>
</head>
<body>
	<%
		String info;
		info = ((javax.servlet.jsp.HttpJspPage) page).getServletInfo();
		out.print("<h1>" + info + "<h1>");
	%>
	<%! Object obj;//声明一个Object变量%>
	<p>getClass()方法的返回值：<%=page.getClass()%></p>	
	<p>toString()方法的返回值<%=page.toString()%></p>
	<p>hashCode()方法的返回值：<%=page.hashCode()%></p>
	<p>与Object对象比较的返回值：<%=page.equals(obj)%></p>
	<p>与this对象比较的返回值：<%=page.equals(this)%></p>
</body>
</html>
