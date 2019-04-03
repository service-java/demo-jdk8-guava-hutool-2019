<%@ page contentType="text/html; charset=gb2312"%>
<title>sendRedirect</title>
<html>
<body>
<form method=post action=sendRedirect.jsp>
    输入用户名：
   <input type=text	name=name> 
   <input type=submit value=login>
</form>
<%
	String name = request.getParameter("name");
	if (name != null) {
		response.sendRedirect("redirect.jsp?sendname=" + name);
		System.out.print("重定向后的语句执行！");
	}//if
%>
</body>
</html>
