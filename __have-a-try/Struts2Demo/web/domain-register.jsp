<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/9
  Time: 15:24
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

    <s:form namespace="User" action="ModelUserAction" method="post">
        <s:textfield name = "user.name" label="用户名"></s:textfield>
        <s:password name = "user.password" label="密码"></s:password>
        <s:radio name = "user.sex" list="#{1:'男', 0:'女'}" label="性别"></s:radio>
        <%--<button type="submit">提交</button>--%>
        <s:submit value="提交"></s:submit>
    </s:form>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
