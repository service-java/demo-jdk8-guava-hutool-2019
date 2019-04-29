<%@ page language="java" pageEncoding="utf-8" %>
<%@ page import="business.*" errorPage="error.jsp"%>
<html>
<head>
<title>delete project</title>
</head>
<body bgcolor="#FFFFFF">

	<% String id = (String)request.getParameter("project_id"); 		 
		    int ID = Integer.parseInt(id);
			Project_Manager.Delete_Project(ID);
	%>
<SCRIPT language=javascript>	
	alert("该项目已删除!");	
	location.href='./project_list.jsp';	
</SCRIPT>

</body>
</html>