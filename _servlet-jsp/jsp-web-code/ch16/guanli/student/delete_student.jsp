<%@ page language="java" pageEncoding="utf-8" %>
<%@ page import="business.*" errorPage="error.jsp"%>
<html>
<head>
<title>del students</title>
</head>
<body bgcolor="#FFFFFF">

	<% String id = (String)request.getParameter("student_id");		 
		    int ID = Integer.parseInt(id);
			Student_Manager.Delete_Student(ID);
	%>
<SCRIPT language=javascript>	
	alert("该学生已删除!");	
	location.href='./student_list.jsp';	
</SCRIPT>

</body>
</html>