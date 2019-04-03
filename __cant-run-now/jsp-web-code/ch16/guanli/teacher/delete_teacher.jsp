<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="business.*" errorPage="error.jsp"%>
<html>
	<head>
		<title>delete teacher</title>		
	</head>
	<body bgcolor="#E5E5E5">

		<%String id = (String) request.getParameter("teacher_id");
			int ID = Integer.parseInt(id);
			Teacher_Manager.Delete_Teacher(ID);
		%>

	<SCRIPT language=javascript>
	     alert("该老师已删除!");
		 location.href='./teacher_list.jsp';
     </SCRIPT>

	</body>
</html>
