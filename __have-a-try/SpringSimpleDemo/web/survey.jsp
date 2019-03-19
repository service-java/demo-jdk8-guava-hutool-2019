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

    <form:form>
        <div class="checkbox">

        <form:checkbox cssClass="" path="favor" value="看书"/>看书<br>
        <form:checkbox path="favor" value="看电视"/>看电视<br>
        <form:checkbox path="favor" value="上网"/>上网<br>
        <form:checkbox path="favor" value="聊天"/>聊天<br>
        <form:checkbox path="favor" value="看电影"/>看电影<br>
        <form:checkbox path="favor" value="画画"/>画画<br>
        <form:checkbox path="favor" value="逛街"/>逛街<br>

        </div>
        <input class="btn btn-default" type="submit" name="_target1" value="上一步">
        <input class="btn btn-success" type="submit" name="_finish" value="确定"/>
        <input class="btn btn-default" type="submit" name="_cancel" value="取消"/>
    </form:form>
</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
