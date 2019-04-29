<%@ page contentType="text/html; charset=gb2312" language="java"%>
<html>
<body>
<%@ include file="static.html"%>
<%
//静态包含只是把文件包含进来
%>
<a href="action.jsp">goto two--></a>
<br>
<!-- 超级连接转到action.jsp文件和动态包含该文件显示是不同的 -->
this examples show include works
<br>
<!-- 动态包含文件并传递参数 -->
<jsp:include page="action.jsp" flush="true">
	<jsp:param name="a1" value="<%=request.getParameter("name")%>" />
	<jsp:param name="a2" value="<%=request.getParameter("password")%>" />
</jsp:include>
</body>
</html>
