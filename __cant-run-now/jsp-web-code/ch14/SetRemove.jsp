<%@ page contentType="text/html;charset=GB2312" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Core_set_remove.jsp</title>
</head>
<body>

<h2>c:set和c:remove用法示例</h2><br>

<c:set scope="page" var="number">
       <c:out value="${2}"/>
</c:set>

<c:set scope="request" var="number">
     <%= 3 %>
</c:set>

<c:set scope="session" var="number">
     4
</c:set>

c:set初始设置的值<br><hr>
pageScope.number:<c:out value="${pageScope.number}" default="No Data" /><br>
requestScope.number:<c:out value="${requestScope.number}" default="No Data" /><br>
sessionScope.number:<c:out value="${sessionScope.number}" default="No Data" /><br><br>

<c:out value='<c:remove var="number" scope="page" />之后'/><br><hr>
<c:remove var="number" scope="page" />
pageScope.number:<c:out value="${pageScope.number}" default="No Data"/> <br>
requestScope.number:<c:out value="${requestScope.number}" default="No Data" /><br>
sessionScope.number:<c:out value="${sessionScope.number}" default="No Data" /><br><br>

<c:out value='<c:remove var="number" />之后'/><br><hr>
<c:remove var="number" />
pageScope.number:<c:out value="${pageScope.number}" default="No Data" /><br>
requestScope.number:<c:out value="${requestScope.number}" default="No Data" /><br>
sessionScope.number:<c:out value="${sessionScope.number}" default="No Data" />
</body>
</html>