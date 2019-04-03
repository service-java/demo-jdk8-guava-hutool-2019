<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/5
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- --%>
<jsp:useBean id="user" class="valuebean.User" scope="page">
    <jsp:setProperty name="user" property="*"/>
</jsp:useBean>

<p>用户名：<jsp:getProperty name="user" property="userName"/></p>
<p>密码：<jsp:getProperty name="user" property="userPass"/></p>
<p><a href="login.jsp">重新输入</a></p>

