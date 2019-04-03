<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>Test c:import</title>
</head>
<body>
<h2><c:out value="<c:import> 的用法" /></h2>

<c:import url="TestURL.jsp" charEncoding="GB2312">
	<c:param name="userName" value="wangruijuan"/>
</c:import>
</body>
</html>