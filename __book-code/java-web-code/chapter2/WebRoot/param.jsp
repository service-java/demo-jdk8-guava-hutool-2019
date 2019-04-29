<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	request.setCharacterEncoding("gbk");
%>
<jsp:forward page="proc.jsp">
	<jsp:param name="title" value="今日作业" ></jsp:param>
	<jsp:param name="yuwen" value="默写第19页的生词，各5行。" ></jsp:param>
	<jsp:param name="shuxue" value="练习册第10单元。" ></jsp:param>
	<jsp:param name="date" value="2013年10月10日" ></jsp:param>
</jsp:forward>
