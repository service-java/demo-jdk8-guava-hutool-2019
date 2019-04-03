<%@page contentType="text/html"%>
<%@page pageEncoding="GB2312"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>JSP Page</title>
</head>
<body>
<sql:setDataSource url="jdbc:mysql://localhost/liuyan"
	driver="com.mysql.jdbc.Driver" user="root" password="root" var="ds" />
<sql:update dataSource="${ds}"
	sql="UPDATE message SET name = 'relly'  WHERE name='rich'"
	var="updateCount" />

<c:out value="${'数据变动数目：'}" />
<c:out value="${updateCount}" />
<br>
<sql:update dataSource="${ds}"
	sql="UPDATE message SET name=?  WHERE title=? " var="updateCounts">
	<sql:param value="${'cherry'}" />
	<sql:param value="${'hello'}" />
</sql:update>
<c:out value="${'数据变动数目：'}" />
<c:out value="${updateCounts}" />
</body>
</html>
