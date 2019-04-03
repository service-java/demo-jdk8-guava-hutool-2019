<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 12:53
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

    <form name="SendMessage" Method="post" action="/SendMessage">

        <div class="form-group">
            <div class="col-md-4">
                <input type="email" name="From"
                       class="form-control"
                       placeholder="发件人">
            </div>

            <div class="col-md-4">
                <input type="email" name="To"
                       class="form-control"
                       placeholder="收件人">
            </div>

            <div class="col-md-4">
                <input type="text" name="Subject"
                       class="form-control"
                       placeholder="主题" >
            </div>
        </div>

        <br>
        <br>

        <div class="form-group">
            <textarea name="Message"
                      cols="40" rows="4"
                      class="form-control" >
            </textarea>
        </div>

        <br>

        <div class="form-group">
            <input type="submit" class="btn btn-success" value="提交">
            <input type="reset" class="btn btn-default" value="重填">
        </div>

    </form>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
