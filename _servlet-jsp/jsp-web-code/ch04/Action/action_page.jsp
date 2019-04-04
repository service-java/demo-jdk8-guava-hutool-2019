<%@ page contentType="text/html; charset=gb2312" language="java"%>
举例说明动态包含的工作原理：
<br>
this is a1=
<%=request.getParameter("a1")%>
<br>
this is a2=
<%=request.getParameter("a2")%>
<br>
<%
out.println("hello from action.jsp");
%>

