<%@ page contentType="text/html;charset=gb2312"%>
<html>
<head>
<title>操纵Cookie示例－写入Cookie</title>
</head>
<body>
<h2>操纵Cookie示例-写入Cookie</h2>
<%
		try {
		Cookie _Cookie = new Cookie("mycookie", "COOKIE_TEST");
		_Cookie.setMaxAge(10 * 60); // 设置Cookie的存活时间为10分钟
		response.addCookie(_Cookie); // 写入客户端硬盘
		out.print("已经把Cookie写入客户端");
	} catch (Exception e) {
		System.out.println(e);
	}
%>
</body>
</html>
