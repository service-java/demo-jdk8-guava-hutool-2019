<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312" import="java.util.Calendar" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>c:if c:choose c:when c:otherwise的使用</title>
</head>
<body>
<h4>依据当前时间来输出不同的问候语
	<%
	Calendar rightNow = Calendar.getInstance();
	Integer Hour=new Integer(rightNow.get(Calendar.HOUR_OF_DAY));
	request.setAttribute("hour", Hour);
	%>
	<br>&ltc:if&gt使用：  
	<c:if test="${hour >= 0 && hour <=11}">
        <c:set var="sayHello" value="上午好！"/>
    </c:if>
    <c:if test="${hour >= 12 && hour <=17}">
        <c:set var="sayHello" value="下午好！"/>
    </c:if>
    <c:if test="${hour >= 18 && hour <=23}">
        <c:set var="sayHello" value="晚上好！"/>
    </c:if>
     <c:out value="${sayHello}"/>    
     <br>&ltc:choose&gt使用：  
	<c:choose>
		<c:when test="${hour >= 0 && hour <=11}">
		    <c:set var="sayHello" value="上午好！"/>
		</c:when>
		<c:when test="${hour >= 12 && hour <=17}">
		    <c:set var="sayHello" value="下午好！"/>
		</c:when>
		<c:otherwise>
		    <c:set var="sayHello" value="晚上好！"/>
		</c:otherwise>
	</c:choose>    
    <br><c:out value="现在时间：${hour}时，"/>
    <c:out value="${sayHello}"/>    <p />
    </h4>
</body>
</html>