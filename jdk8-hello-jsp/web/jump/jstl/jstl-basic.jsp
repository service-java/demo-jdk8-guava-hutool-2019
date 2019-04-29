
<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/5
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>JSTL使用</title>
</head>
<body>

<%--<c:out value="<hr>"/>--%>
<c:out value="<hr>" escapeXml="false"/>

<p><c:out value="${name}" default="name的值为空"/></p>
<p><c:out value="${name}">name的值为空</c:out></p>

<c:set var="name" value="hello jsp" scope="page"/>
<c:out value="${name}"></c:out>
<c:remove var="name"/><br>
<c:out value="${name}" default="变量name为空"></c:out>


<c:set var="hours">
    <%=new java.util.Date().getHours()%>
</c:set>

<c:choose>
    <c:when test="${hours>6 && hours<11}" ><p>上午好！</p></c:when>
    <c:when test="${hours>11 && hours<17}"><p>下午好！</p></c:when>
    <c:otherwise><p>晚上好！<p></c:otherwise>
</c:choose>


<p>现在时间是：${hours}时</p>


<%
    // 定义链表
    ArrayList list = new ArrayList();
    list.add("天");
    list.add("地");
    list.add("玄");
    list.add("黄");

    request.setAttribute("list",list);
%>

<ol>
    <c:forEach items="${list}" var="tag" varStatus="id">
        <li>[${id.count}] ${tag }</li>
    </c:forEach>
</ol>


<%-- 按照index --%>
<ul>
<c:forEach begin="1" end="8" step="2" var="str">
    <li>吓<c:out value="${str}"/>跳</li>
</c:forEach>
</ul>


<c:set var="sourceStr" value="我|曾经|穿过|人山人海"/>

<p>原字符串：<c:out value="${sourceStr}"/></p>
<p>分割后的字符串：</p>


<%-- 使用forTokens来切割 --%>
<c:forTokens var="str" items="${sourceStr}" delims="|" varStatus="status">
    <c:out value="${str}"></c:out> ☆
    <c:if test="${status.last}">
        <p>总共输出<c:out value="${status.count}"></c:out>个元素</p>
    </c:if>
</c:forTokens>


<%--<c:set var="name" value="编程词典" scope="page"/>--%>
<%--<c:set var="hostpage" value="www.bcty365.com" scope="session"/>--%>
<%--<c:out value="${name}"></c:out>--%>
<%--<c:out value="${hostpage}"></c:out>--%>




</body>
</html>
