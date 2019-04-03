<%@ page language="java" contentType="text/html; charset=GB2312"
	pageEncoding="GB2312"%>
<html>
<head>
<title>index.jsp</title>
</head>
<BODY>
<center>
<TR>
	<TD align="center" bgcolor="#CCCC99"><font size=5>访客留言板</font></TD>
</TR>
<TR>
	<FORM method="post" action="AddMessageServlet">
	<table border=1 width=500 align="center" cellpadding="3"
		cellspacing="2" bgcolor=#E6CAFF>
		<tr>
			<TD>姓名：</TD>
			<TD><INPUT type="text" name="name" size="25"></TD>
		<tr>
			<TD>E-mail：</TD>
			<TD><INPUT type="text" name="email" size="25"></TD>
		</tr>
		<tr>
			<TD>主题：</TD>
			<TD><INPUT type="text" name="title" size="25"></TD>
		</tr>
		<br>
		<tr>
			<TD valign="top">留言：</TD>
			<TD><TEXTAREA name="content" rows="7" cols="25"></TEXTAREA></TD>
		</tr>
		<TD colspan="3">
		<table align="center" width="100%" cellspacing="0" cellpadding="0"
			bordercolordark="#ffccff">
			<tr>
				<TD align="center"><INPUT type="submit" value="提交留言"></TD>
				<TD align="center"><A href="ViewMessageServlet"><FONT
					size="2">查看留言</FONT></A></TD>
				<TD align="center"><INPUT type="reset" value="重新填写"></TD>
			</tr>
		</table>
		<hr>
	</table>
	</form>
</TR>
</center>
</BODY>
</html>
