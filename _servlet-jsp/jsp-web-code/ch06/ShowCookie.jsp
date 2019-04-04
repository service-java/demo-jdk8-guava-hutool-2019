<%@ page contentType="text/html;charset=gb2312"%>
<html>
<head>
<title>显示Cookie</title>
</head>
<body>
<h2> Cookie如下所示：</h2>
<%
	//取得客户端的所有Cookie
	Cookie[] Cookies = request.getCookies();
    
	Cookie sCookie = null;
	String cookieName = null;
	String cookieValue = null;
	int cookieVersion=0;
	if (Cookies == null) // 如果没有任何Cookie
		out.print("没有Cookie");
	else {
		try {
			if (Cookies.length == 0) {
		System.out.println("客户端禁止写入cookie");
			} else {
				for (int i = 0; i <= Cookies.length; i++) { // 循环列出所有可用的Cookie
			sCookie = Cookies[i];
			cookieName = sCookie.getName();
			cookieValue = sCookie.getValue();
			cookieVersion=sCookie.getVersion();
			out.print("<P><b>Cookie的名字是："+cookieName+"<br><p>");
			out.print("<P><b>Cookie的版本是："+cookieVersion+"<br><p>");
			out.print("<P><b>Cookie的值是："+cookieValue+"<br><p>");
			}
		}
			}
		catch (Exception e) {
			System.out.println(e);
		}
	}
%>
</body>
</html>
