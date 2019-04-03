<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/25
  Time: 16:03
  To change this template use File | Settings | File Templates.

  在线预览 http://qmen.space:8080/HelloJSP/lab/lab10/upload-file.jsp
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

    <form class="form-horizontal"
          action="<%=request.getContextPath()%>/DBUploadServlet" method="post"
          enctype="multipart/form-data"
          name="form1" id="form1">

        <div class="form-group">
            <label for="exampleInputFile" class="col-sm-2 control-label">上传文件</label>
            <div class="col-sm-6">
                <input type="file" name="file" class="form-control" id="exampleInputFile" required>
                <%--<p class="help-block">在这里上传文件</p>--%>
            </div>
            <div class="col-sm-4">
                <button type="submit" class="btn btn-success">上传</button>
                <button type="reset" class="btn btn-default">重置</button>
                <a class="btn btn-default" href="<%=request.getContextPath()%>/lab/lab10/download-file.jsp">下载图像</a>
            </div>
        </div>

    </form>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
