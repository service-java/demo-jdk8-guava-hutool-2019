<%@ page language="java" contentType="text/html; charset=gb2312"%>
<HTML>
<HEAD>
<TITLE>读取session值</TITLE>
</HEAD>
<BODY>
<%
	Object id = session.getAttribute("name");
	Object sex = session.getAttribute("sex");

	if (id != null) {
		out.println("姓名：" + id.toString());
		out.println("<br>");
		out.println("性别：" + sex.toString());

	} else {
		out.println("无设置seeion数据 !!");
	}
%>
</BODY>
</HTML>
