<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户注册_窗内网</title>
<link href="reg.css" type="text/css" rel="stylesheet" />
</head>
<body>
<%@include file="header.jsp" %>
<!--中间-->
<div id="center"> 
  <!--中左-->
  <div class="c_lt">
    <div class="tt"></div>
<div class="content">
      <h2>您的注册信息如下</h2>
      <p><%
	//设置编码格式
	request.setCharacterEncoding("gbk");

	String uname=request.getParameter("username");
	String userpass=request.getParameter("userpass");
	String email=request.getParameter("email");
%>
           	<jsp:useBean id="user" class="com.itzcn.bean.User" />
           <jsp:setProperty property="username" name="user" value="<%=uname%>"/>
            <jsp:setProperty property="userpass" name="user" value="<%=userpass%>"/>
            <jsp:setProperty property="email" name="user" value="<%=email%>"/>
            <jsp:setProperty property="regdate" name="user" value="<%=new Date().toLocaleString()%>"/>
            用户名：<jsp:getProperty property="username" name="user"/><br/>
            密码：<jsp:getProperty property="userpass" name="user"/><br/>
       邮箱：<jsp:getProperty property="email" name="user"/><br/>
       注册时间：<jsp:getProperty property="regdate" name="user"/><br/>      
      </p>
        

      </div>
    <div class="ft"></div>
  </div>
  <!--中左--> 
  <!--中右-->
  <div class="clear"></div>
</div>
<!--中间-->
<%@include file="footer.jsp" %>
</body>
</html>	
			