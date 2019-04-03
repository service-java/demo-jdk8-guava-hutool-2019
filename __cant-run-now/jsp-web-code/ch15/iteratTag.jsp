<%@ page language="java" contentType="text/html; charset=GB2312"
	pageEncoding="GB2312"%>
<%@ page import="java.util.HashMap"%>
<%@ taglib uri="/mytag" prefix="my"%>
<%
HashMap h = new HashMap();
	h.put("2011", "1");
	h.put("2010", "2");
	h.put("2009", "3");
	h.put("2008", "4");
	h.put("2007", "5");
%>
<html>
<head>
<title>iterate tag</title>
</head>
<body>
<my:iterate map="<%= h%>" element="number">
	<h3><%=pageContext.getAttribute("number")%></h3>
	
</my:iterate>
</body>
</html>
