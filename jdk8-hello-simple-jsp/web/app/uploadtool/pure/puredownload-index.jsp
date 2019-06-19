<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<%--%>
    <%--String path = request.getContextPath();--%>
    <%--String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";--%>
<%--%>--%>

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

    <% List<String> list=(List) request.getAttribute("list");%>
    <table class="table">
        <tr>
            <td>文件名称</td>
            <td>上传时间</td>
            <td>文件大小</td>
            <td>操    作</td>
        </tr>
        <%for (String str :list){%>
        <tr>
            <%
                String param[] = str.split("#");
            %>
            <td><%=param[1]%></td>
            <td><%=param[2]%></td>
            <td><%=param[3]%></td>
            <td><a href ="app/uploadtool/pure/puredownload-deal.jsp?path=<%=param[0]%>">下载</a></td>

            <%-- 不知道为什么文件路径... 唧唧了--%>
        </tr><%
        }%></table>
</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>