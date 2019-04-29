<%@page contentType="text/html;charset=GB2312"%>
<%@ page import="javax.servlet.http.Cookie,java.util.*"%>
<TITLE>response应用实例</TITLE>
<%
	//通过request对象将Cookie中的内容读出
	Cookie[] cookies = request.getCookies();
	Cookie cookie_response = null;
	if (cookies == null) // 如果没有任何Cookie
		out.print("没有Cookie" + "<br>");
	else {
		try {
			if (cookies.length == 0) {
		System.out.println("客户端禁止写入cookie");
			} else {

		for (int i = 0; i < cookies.length; i++) { // 循环列出所有可用的Cookie

			Cookie temp = cookies[i];
			if (temp.getName().equals("cookietest")) {
				cookie_response = temp;
				break;
			}
		}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	out.println("当前的时间：" + new java.util.Date() + "<br>");
	//如果不是第一次访问，显示Cookie保存的时间
	if (cookie_response != null) {
		out.println(cookie_response.getName() + "上一次访问的时间："
		+ cookie_response.getValue());
		cookie_response.setValue(new Date().toString());
	}
	//如果该客户第一次访问此页面所进行的操作
	else {
		out.print("第一次访问!");
		cookie_response = new Cookie("cookietest", new java.util.Date()
		.toString());
		out.print("创建Cookie!");
	}
	//更新Cookie的内容
	response.addCookie(cookie_response);
	response.setContentType("text/html");
	response.flushBuffer();
%>
