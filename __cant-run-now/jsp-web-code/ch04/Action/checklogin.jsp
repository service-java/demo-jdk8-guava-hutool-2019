<%@ page contentType="text/html; charset=gb2312"%>
<html>
<body>
<%--进行登陆检查--%>
<%
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	// if验证通过，forward-->sucess.jsp
	//else forward-->login.jsp
	if (name.equals("hellking") && password.equals("12345")) {
%>
<jsp:forward page="sucess.jsp">
	<jsp:param name="user" value="<%=name%>" />
</jsp:forward>
<%
	}//if
	else {
%>
<jsp:forward page="login.jsp">
	<jsp:param name="user" value="<%=name%>" />
</jsp:forward>
<%
}
%>
</body>
</html>
