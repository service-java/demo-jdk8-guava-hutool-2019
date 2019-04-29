<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	//设置编码格式
	request.setCharacterEncoding("gbk");

	String email=request.getParameter("email");
	if(email.equals("")){
%>
<jsp:forward page="result.jsp">
	<jsp:param name="result" value="0" />
</jsp:forward>
<%} else {%>
<jsp:forward page="result.jsp">
	<jsp:param name="result" value="1" />
	<jsp:param name="email" value="<%=email%>" />
</jsp:forward>
<%}%>