<%@ page contentType="text/html;charset=gb2312"%>
<html>
<head>
<title>操纵Cookie示例-读取Cookie</title>
</head>
<body>
<h2>操纵Cookie示例-读取Cookie</h2>
<%
	// 将当前站点的所有Cookie读入并存入Cookies数组中
	Cookie[] Cookies = request.getCookies();
	Cookie sCookie = null;
	String cookieName = null;
	String cookieValue = null;
	if (Cookies == null) // 如果没有任何Cookie
		out.print("没有Cookie");
	else {
		try {
			if (Cookies.length == 0) {
		System.out.println("客户端禁止写入cookie");
			} else {
		for (int i = 0; i < Cookies.length; i++) { // 循环列出所有可用的Cookie

			sCookie = Cookies[i];
			cookieName = sCookie.getName();
			cookieValue = sCookie.getValue();
			if (cookieName.equals("mycookie")) {
				out.println(cookieName + "->" + cookieValue
				+ "<br>");
				break;
			}
		}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
%>
</body>
</html>


