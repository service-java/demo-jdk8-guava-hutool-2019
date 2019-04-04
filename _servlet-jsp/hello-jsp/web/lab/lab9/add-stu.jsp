<!--
@Author: 骆金参
@Date:   2017-03-16T08:26:32+08:00
@Email:  1095947440@qq.com
@Filename: investigation.html
@Last modified by:   骆金参
@Last modified time: 2017-03-16T09:12:20+08:00

@在线预览 http://qmen.space:8080/HelloJSP/lab/lab9/add-stu.jsp
-->


<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>新增学生</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" style="margin-top: 20px;">



    <%
        if(request.getAttribute("status") == "success") { %>
    <div class="col-sm-12">
        <div class="alert alert-success alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            学生新增成功  <a href="<%=request.getContextPath()%>/lab/lab9/list-stu.jsp" class="alert-link">查看所有学生</a>
        </div>
    </div>
    <%   } else if(request.getAttribute("status") == "error") { %>
    <div class="col-sm-12">
        <div class="alert alert-danger alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            学生新增失败
        </div>
    </div>
    <% }
    %>

    <h3 class="text-center">新增学生</h3>


    <div class="panel panel-default">
        <div class="panel-body">
            <form class="form-horizontal" action="<%=request.getContextPath()%>/Stu?action=add" method="post">

                <div class="form-group">
                    <label for="name" class="col-sm-2 control-label">姓名</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"
                               id="name" name="name"
                               placeholder="姓名" required>
                    </div>
                </div>

                <div class="form-group">
                    <label for="age" class="col-sm-2 control-label">年龄</label>
                    <div class="col-sm-10">
                        <input type="number" class="form-control"
                               min="1"
                               id="age" name="age"
                               placeholder="年龄" required>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">性别</label>
                    <div class="col-sm-10">
                        <div class="radio">
                            <label>
                                <input type="radio" name="gender" id="male" value="男" checked>男
                            </label>
                            <label>
                                <input type="radio" name="gender" id="female" value="女"> 女
                            </label>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">爱好</label>
                    <div class="col-sm-10">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" value="旅游" name="hobby">旅游
                            </label>
                            <label>
                                <input type="checkbox" value="登山" name="hobby">登山
                            </label>
                            <label>
                                <input type="checkbox" value="健身" name="hobby">健身
                            </label>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">学历</label>
                    <div class="col-sm-10">
                        <select class="form-control" name="qualification">
                            <option value="高中毕业" >高中毕业</option>
                            <option value="本科生" selected >本科生</option>
                            <option value="研究生">研究生</option>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">自我介绍</label>
                    <div class="col-sm-10">
                        <textarea class="form-control" rows="3" name="introduction" required></textarea>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default btn-success">提交</button>
                        <button type="reset" class="btn btn-default">重置</button>
                    </div>
                </div>
            </form>

        </div>
    </div>

    <p class="text-right">
        <a href="<%=request.getContextPath()%>/lab/lab9/list-stu.jsp">所有学生信息</a>
    </p>

</div><!-- ./container -->


<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>

</script>
</body>
</html>
