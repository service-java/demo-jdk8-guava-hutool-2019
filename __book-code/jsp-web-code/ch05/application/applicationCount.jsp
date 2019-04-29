<%@ page contentType="text/html;charset=GB2312"%>
<%
	int Num = 0;
	String strNum = (String) application.getAttribute("Num");

	//检查是否Num变量是否可取得,如果能取得将该值加1
	if (strNum != null)
		Num = Integer.parseInt(strNum) + 1;

	application.setAttribute("Num", String.valueOf(Num)); //将Num变量值存入application
%>
<HTML>
<HEAD>
<TITLE>application对象示例</TITLE>
</HEAD>
<BODY>
<CENTER><FONT SIZE=5>application对象示例</FONT></CENTER>
<HR>
本页面对应的实际路径是:
<BR>
<%=application.getRealPath("application.jsp")%>
<BR>
<BR>
<Font color=blue>您已经访问页面</Font>
<Font color=red><%=Num%></Font>
<Font color=blue>次</Font>
</BODY>
</HTML>
