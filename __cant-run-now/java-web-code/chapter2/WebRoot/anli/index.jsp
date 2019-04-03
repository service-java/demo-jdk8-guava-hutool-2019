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
    <div class="tt">只填四项就可立即注册窗内<font color="#FF0000">（必填）</font></div>
    <form action="check.jsp" method="post" id="apForm">
      <div class="content">
        <p>
          <label for="email"> 您的登录名：</label>
          <INPUT class="input" type="text" id=username maxLength=32  name="username">
          </p>
        <p>
          <label for="email"> 登录密码：</label>
          <INPUT  class="input"  style="width:148px;"  type=password maxLength=16  id="password" name="userpass">
           </p>
        <p>
          <label for="email"> 密码确认：</label>
          <INPUT class="input" style="width:148px;"   type=password maxLength=16 id="password2" name="userpass2">
           </p>
        <p>
          <label for="email"> 电子邮箱：</label>
          <INPUT id=email maxLength=32   class="input" name=email>
          </p>
        <p>
          <INPUT type="submit" name="mysubmit" value="" class="tj">
        </p>
      </div>
    </form>
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
			