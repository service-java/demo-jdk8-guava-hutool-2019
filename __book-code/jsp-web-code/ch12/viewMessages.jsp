<%@ page import="java.sql.*,message.*,java.util.*,java.sql.*"
	language="java" pageEncoding="UTF-8"%>
<HTML>
<HEAD>
<TITLE>show the message in the table</TITLE>
</HEAD>
<BODY>
<p align="center"><font size=5>所有访客留言</font></p>
<hr>
<%
	int message_count = 0;
	Collection messages = (Collection) request.getAttribute("messages");//和第一种方式的不同之处
	Iterator it = messages.iterator();
	while (it.hasNext()) {
		MessageVO message = (MessageVO) it.next();
%>
<table border=1 width=500 align="center" cellpadding="3" cellspacing="2"
	bgcolor=#ffccff>
	<tr>
		<td td colspan="2" align="center">
		<%
				message_count++;
				out.println("第" + message_count + "个留言者");
		%>
		</td>
	</tr>
	<tr>
		<td width="150" bgcolor="#CCCC99"><font size=3>主题：</font></td>
		<td><%=message.getTitle()%></td>
	</tr>
	<tr>
		<td bgcolor="#CCCC99"><font size=3>留言人：</font></td>
		<td><%=message.getName()%></td>
	</tr>
	<tr>
		<td bgcolor="#CCCC99"><font size=3>E-mail：</font></td>
		<td>
		<%
				out.println("<a href=mailto:" + message.getEmail() + ">"
				+ message.getEmail() + "</a>");
		%>
		</td>
	</tr>
	<tr>
		<td bgcolor="#CCCC99"><font size=3>留言时间：</font></td>
		<td>
		<%
				out.println("<font size=3>"
				+ message.getDate().toLocaleString() + "</font>");
		%>
		</td>
	</tr>
	<tr>
		<td bgcolor="#CCCC99"><font size=3>留言内容：</font></td>
		<td><%=message.getContent()%></td>
	</tr>
</table>
<%
	out.println("<hr>");
	}
%>
<p align="center"><a href="index.jsp">我要留言</a></p>
</body>
</html>
