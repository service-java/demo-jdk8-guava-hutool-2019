<%@ page language="java" pageEncoding="utf-8" %>
<%@ page import="business.*" errorPage="error.jsp"%>
<html>
<head>
<title>delete news</title>
</head>
<body bgcolor="#FFFFFF">

<% String id = (String)request.getParameter("news_id"); 		 
		    int ID = Integer.parseInt(id);
			News_Manager.Delete_News(ID);
%>
<SCRIPT language=javascript>
	alert("该新闻已删除!");	
	location.href='./news_list.jsp';	
</SCRIPT>

</body>
</html>