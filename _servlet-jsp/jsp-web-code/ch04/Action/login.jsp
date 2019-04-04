<%@ page contentType="text/html; charset=gb2312"%>
<html>
<body>
<form method=get action=checklogin.jsp>
<table>
	<tr>
		<td>输入用户名：</td>
		<td><input type=text name=name
			value=<%=request.getParameter("user")%>></td>
	</tr>
	<tr>
		<td>输入密码：</td>
		<td><input type=password name=password></td>
	</tr>
	<tr colspan=2>
		<td><input type=submit value=login></td>
	</tr>
</table>
</body>
</html>
