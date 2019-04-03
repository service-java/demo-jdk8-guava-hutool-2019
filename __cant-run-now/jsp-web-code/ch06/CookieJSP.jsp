<%@ page contentType="text/html;charset=gb2312"%>
<html>
<head>
<title>操纵Cookie示例</title>
</head>
<body>
<h2>Cookie示例</h2>
<%
//取得传入的名字参数
String name=(request.getParameter("name")!=null)?request.getParameter("name"):"jack";	
//创建Cookie
Cookie cookie=new Cookie("name",name);
//设置Cookie的保存时间
cookie.setMaxAge(6000);
//在客户端保存cookie
response.addCookie(cookie);
%>
<a href="ShowCookie.jsp">显示Cookie值</a>
</body>
</html>
