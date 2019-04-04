<%@page contentType="text/html"%>
<%@page pageEncoding="GB2312"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>演示query标签</title>
</head>
<body>
<sql:setDataSource url="jdbc:mysql://localhost/liuyan"
	driver="com.mysql.jdbc.Driver" user="root" password="root" var="ds" />
	使用&lt;sql:query&gt;查找所有记录<br>
<sql:query dataSource="${ds}" sql="SELECT * FROM message"
	var="selectResult" />
<c:forEach var="row" items="${selectResult.rows}">
	<c:out value="${'姓名：'}" />
	<c:out value="${row.Name}" />
	<c:out value="${'|标题：'}" />
	<c:out value="${row.title}" />
	<c:out value="${'|留言内容：'}" />
	<c:out value="${row.content}" />
	<br>
</c:forEach>
<br>下面显示的是按条件查找
<br>
<sql:query dataSource="${ds}"
	sql="SELECT * FROM message WHERE name=? AND title=?" var="selectResult">
	<sql:param value="${'cherry'}" />
	<sql:param value="${'welcome'}" />
</sql:query>

<c:forEach var="row" items="${selectResult.rows}">
	<c:out value="${'姓名：'}" />
	<c:out value="${row.name}" />
	<c:out value="${'|标题：'}" />
	<c:out value="${row.title}" />
	<c:out value="${'|留言内容：'}" />
	<c:out value="${row.content}" />
	<br>
</c:forEach>
</body>
</html>
