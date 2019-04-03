<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/5
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%-- 直接调用工具类显示日期 --%>
<jsp:useBean id="date" class="java.util.Date" />
<p>日期为：<%= date %></p>
<%--日期为：Wed Apr 05 22:04:03 CST 2017--%>


<jsp:useBean id="simple" scope="page" class="valuebean.SimpleBean"/>

<%
    simple.setName("Joywy");
    simple.setAge(23);
%>

<h3>姓名：<%=simple.getName()%></h3>
<h3>年龄：<%=simple.getAge()%></h3>


</body>
</html>
