<%@ page import="valuebean.Info" %>
<!--
@Author: 骆金参
@Date:   2017-03-16T09:02:40+08:00
@Email:  1095947440@qq.com
@Filename: getinfo.jsp
@Last modified by:   骆金参
@Last modified time: 2017-03-16T09:29:46+08:00

@在线预览 http://qmen.space:8080/HelloJSP/lab/lab8/investigation.html
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
    <title>HTML5 Page Title</title>

    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" style="margin-top: 20px;">

<%

//    request.setCharacterEncoding("utf-8");
//    response.setCharacterEncoding("utf-8");

//    response.setContentType("utf-8"); // 页面的utf-8
//    两者的区别 http://blog.csdn.net/joywy/article/details/8006645


//    Info info = (Info)session.getAttribute("info");
//    request.setAttribute("info", info);
%>

    <table class="table table-striped table-bordered">

        <tr><th>姓名</th><td> ${ name } </td></tr>
        <%--<tr><th>姓名</th><td> <%=request.getAttribute("name")%> </td></tr>--%>
        <tr><th>年龄</th><td> ${ age } </td></tr>
        <tr><th>性别</th><td> ${ gender } </td></tr>
        <tr><th>学历</th><td> ${ qualification } </td></tr>


        <tr><th>爱好</th><td>
            <%  for(int i=0; i<request.getParameterValues("hobby").length; i++) {
                request.setAttribute("i", i); %>
            ${ hobby[i] }
            <%  } %>
        </td></tr>

        <tr><th>简介</th><td>${ introduction }</td></tr>

    </table>
</div>

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>