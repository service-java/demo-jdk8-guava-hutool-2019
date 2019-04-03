<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>使用 &lt;forEach&gt;标签</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	--><style>
#one {
	margin:auto;
	background:url(images/logo.jpg);
	background-repeat:no-repeat;
	height:392px;
	width:722px;	
}
#two {
	position:relative;
	font-size: 12px;
	margin-top:120px;
	margin-left:190px;	
	width:500px;	
	float:left;
	font-size: 16px;
}
#three {
 position:relative;
 width:200px; 
 margin-top:150px;
 margin-right:60px;
 float:right;
}
</style>

  </head>
  
  <body>
  <div id="one">
		<div id="two">
		<%List<String> list = new ArrayList<String>();
		list.add("Java入门经典");
		list.add("Oracle学习手册");
		list.add("C#编程基础");
		list.add("轻松学Linux");
		list.add("ASP.NET实践");
		request.setAttribute("bookList", list);
		 %>
		 <b><c:out value="不指定begin和end的迭代：" /></b><br>
		 <c:forEach items="${bookList}" var="book" >
		 	<c:out value="${book}"/><br>
		 </c:forEach>
		  <B><c:out value="指定begin和end的迭代：" /></B><br>
    <c:forEach var="book" items="${bookList}" begin="1" end="3" step="2">
    	<c:out value="${book}" /><br>
    </c:forEach>
		</div>
	<div id="three">

		</div> 
	</div>
  	
  	
  </body>
</html>
