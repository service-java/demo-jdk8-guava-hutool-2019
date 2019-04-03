<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/6
  Time: 8:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page import="toolbean.MyTools" %>--%>


<%
    request.setCharacterEncoding( "utf-8"); // 防止中文乱码
%>

<jsp:useBean id="student" class="valuebean.StudentInfo" scope="page">
    <jsp:setProperty name="student" property="*"/>
</jsp:useBean>

<p>学号 : <jsp:getProperty name="student" property="stuNo"/></p>
<p>姓名 : <jsp:getProperty name="student" property="stuName"/></p>
<p>课程 : <jsp:getProperty name="student" property="courseName"/></p>
<p>成绩 : <jsp:getProperty name="student" property="score"/></p>

<p><a href="scoreForm.jsp">重新输入</a></p>
