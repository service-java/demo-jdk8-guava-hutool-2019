<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 18:46
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

    <form action="pureupload-deal.jsp"
          enctype="multipart/form-data"
          method="post" class="form" >
        <input class="form-control"
               type="file" name="fileupload"
               value="upload" placeholder="请选择一张图片"/><br>
        <input class="btn btn-success" type ="submit" value ="上传">
        <input class="btn btn-default" type ="reset" value = "取消">
    </form>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>