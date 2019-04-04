<%@ page import="dao.FileDAO" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/25
  Time: 16:04
  To change this template use File | Settings | File Templates.

  在线预览   http://qmen.space:8080/HelloJSP/lab/lab10/download-file.jsp
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

<%
    // 判断保存在request范围内的对象是否为空
    if (request.getAttribute("result") != null) { %>
        <%--out.println("<script >alert('" + request.getAttribute("result")--%>
                <%--+ "');</script>"); // 页面显示提示信息--%>

<div class="col-sm-12">
    <div class="alert alert-info alert-dismissible" role="alert">
        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <%=request.getAttribute("result")%>
    </div>
</div>

<%  }
%>

<div class="container" style="margin-top: 20px;">

    <table class="table table-bordered table-striped">
        <tr>
            <th>序号</th>
            <th>文件名</th>
            <th>上传日期</th>
            <th>上传时间</th>
            <th>路径</th>
            <th>下载</th>
        </tr>
        <%
            FileDAO dao = new FileDAO();
            ArrayList<Map<String, String>> files = dao.queryAll();
            int i=0;
            for (Map<String, String> file : files) {
        %>
        <tr>
            <td><%=++i %></td>
            <td><%=file.get("filename") %></td>
            <td><%=file.get("date") %></td>
            <td><%=file.get("time") %></td>
            <td><%=file.get("path") %></td>
            <td>
                <a href='<%=request.getContextPath()%>/DBDownloadServlet?filename=<%=URLEncoder.encode(file.get("filename"), "UTF-8") %>'>下载文件</a>
            </td>
        </tr>
        <% } %>
    </table>

    <p class="text-right">
        <a class="btn btn-info" href="<%=request.getContextPath()%>/lab/lab10/upload-file.jsp">上传图像</a>
    </p>



</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
