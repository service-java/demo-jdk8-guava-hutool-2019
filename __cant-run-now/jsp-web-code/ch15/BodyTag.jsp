<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<%@ taglib uri="/mytag" prefix="bodytag" %>
<html>
<head>
<title>body tag</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body>
 <HR>
 <bodytag:loop counts="3"> 
   <h3>当前的时间： <%=new java.util.Date()%></h3><BR>
</bodytag:loop> 
 </BODY>  
</HTML>