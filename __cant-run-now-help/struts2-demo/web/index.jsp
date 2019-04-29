<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/9
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>HTML5 Page Title</title>

    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" style="margin-top: 20px;">

    <form action="first.action" method="post">
        <input type="text" name="userName">
        <input type="password" name="pass" size="21">
        <input type="submit" value="登录">
        <input type="reset" value="重置">
    </form>

    <a href="userAction!add">添加用户</a>
    <a href="userAction!update">更新用户</a>
    <a href="userAction!del">删除用户</a>
    <a href="userAction!show">显示用户</a>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
