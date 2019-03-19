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
            <form:input path="address"  placeholder="地址" cssClass="form-control" />
            <form:errors path="address" cssStyle="color:red"/>
        </div>

        <div class="form-group">
            <form:input path="tel" placeholder="电话" cssClass="form-control"/>
            <form:errors path="tel" cssStyle="color:red"/>
        </div>


        <div class="form-group">
            <button type="submit" class="btn btn-default" name="_target0" >上一步</button>
            <button type="submit" class="btn btn-success" name="_target2" >下一步</button>
            <button type="submit" class="btn btn-default" name="_cancel" />取消</button>
        </div>

    </form:form>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
