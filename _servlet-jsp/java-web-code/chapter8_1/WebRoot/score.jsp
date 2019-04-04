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
    
    <title>使用 &lt;流程控制&gt;标签</title>
    
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
	margin-top:150px;
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
		<c:if test="${empty param.score }" var="result">
	<form action="" method="post" name="form1">
	成绩：
	<input name="score" type="text" id="score">
	<input  type="submit" value="查询">
	</form>
</c:if>
<c:if test="${!result }">
<c:choose>
    <c:when test="${param.score>=90&&param.score<=100}">
    你的成绩为优秀！
    </c:when>
    <c:when test="${param.score>=70&&param.score<90}">
    您的成绩为良好!
    </c:when>
    <c:when test="${param.score>60&&param.score<70}">
    您的成绩为及格!
    </c:when>
        <c:when test="${param.score>=0&&param.score<=60}">
     对不起，您没有通过考试！
    </c:when>
    <c:otherwise>
    对不起，您输入的成绩无效！
    </c:otherwise>
    </c:choose>
</c:if>

		</div>
	<div id="three">

		</div> 
	</div>
  	
  	
  </body>
</html>
