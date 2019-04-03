<%@ page contentType="text/html;charset=GB2312"%>
<%!int Num = 0;%>
<%
	if (session.isNew()) {
		Num += 1;
		session.setAttribute("Num", Num);//将Num变量值存入session
	} 
%>
<HTML>
<HEAD>
<TITLE>session计数器</TITLE>
</HEAD>
<BODY>
<CENTER><FONT SIZE=5>session计数器</FONT></CENTER>
<BR>
<CENTER><Font color=blue>您是第</Font> 
<Font color=red><%=session.getAttribute("Num")%></Font>
<Font color=blue>个访问本站的用户</Font></CENTER>
</BODY>
</HTML>
