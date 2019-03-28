<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/10
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>HTML5 Page Title</title>

    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" style="margin-top: 20px;">
    <form:form cssClass="form">

        <div class="form-group">
            <form:input path="userName" placeholder="用户名" cssClass="form-control" />
            <form:errors path="userName" cssStyle="color:red"/>
        </div>

        <div class="form-group">
            <form:password path="password" placeholder="密码" cssClass="form-control" />
            <form:errors path="password" cssStyle="color:red"/>
        </div>

        <div class="form-group">
            <form:password path="pass" placeholder="确认密码" cssClass="form-control" />
            <form:errors path="pass" cssStyle="color:red"/>
        </div>

        <div class="form-group">
            <form:input path="mail" placeholder="邮箱" cssClass="form-control" />
            <form:errors path="mail" cssStyle="color:red"/>
        </div>

        <div class="form-group">
            <input class="btn btn-success" type="submit" name="_target1" value="下一步"/>
            <input class="btn btn-default" type="submit" name="_cancel" value="取消"/>
        </div>

    </form:form>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
