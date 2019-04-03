<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/6
  Time: 8:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>


<div class="container" style="margin-top: 20px;">
    <form method="post"
          action="getScore.jsp">

        <div class="form-group">
            <input class="form-control"
                   id="no" type="number" required
                   placeholder="输入 学生学号"
                   name="stuNo">
        </div>

        <div class="form-group">
            <input class="form-control"
                   id="name" type="text" required
                   placeholder="输入 学生姓名"
                   name="stuName">
        </div>

        <div class="form-group">
            <input class="form-control"
                   id="course" type="text" required
                   placeholder="输入 课程名"
                   name="courseName">
        </div>

        <div class="form-group">
            <input class="form-control"
                   id="score" type="number" required
                   placeholder="输入 分数"
                   name="score" min="0" max="100">
        </div>


        <button class="btn btn-success" type="submit">提交</button>
        <button class="btn btn-default" type="reset">重置</button>

    </form>

</div>


<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
