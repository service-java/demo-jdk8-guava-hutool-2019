<%@ page contentType="text/html;charset=GB2312"%>
<html>
<head>
<title>session方法</title>
</head>
<body>
<h2>session方法第二个页面</h2>
<table border=1>
	<tr>
		<th align="left">session的建立时间</th>
		<td><%=session.getCreationTime()%></td>
	</tr>
	<tr>
		<th align="left">session的标识符串</th>
		<td><%=session.getId()%><br>
		</td>
	</tr>
	<tr>
		<th align="left">session最后被请求的时间</th>
		<td><%=session.getLastAccessedTime()%></td>
	</tr>
	<tr>
		<th align="left">session预设结束的时间</th>
		<td><%=session.getMaxInactiveInterval()%></td>
	</tr>
	<tr>
		<th align="left">是否为新建的session</th>
		<td><%=session.isNew()%></td>
	</tr>
	<tr>
		<th align="left">session1对象取值</th>
		<td><%=session.getAttribute("user1")%></td>
	</tr>
	<tr>
		<th align="left">session2对象取值</th>
		<td><%=session.getAttribute("user2")%></td>
	</tr>
</table>
</body>
</html>
