<%@ page import="java.io.File" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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

<div class="container">

    <p><%=path%></p>
    <p><%=basePath%></p>
    <p>ServletPath: <%=request.getServletPath()%></p>
    <p>RequestURI:<%=request.getRequestURI()%></p>
    <p>getRealPath(old): <%=request.getRealPath("/") %></p>
    <p>getRealPath(new): <%=request.getSession().getServletContext().getRealPath("./")%></p>
    <p>getRealPath(application) <%=application.getRealPath("/") %></p>
    <p>application <%=application.getRealPath(request.getServletPath()) %></p>

    <%--<p>绝对父目录 <%=new File( application.getRealPath(request.getRequestURI()) ).getParent() %></p>--%>
    <%--<p>相对父目录 <%=new File(request.getServletPath()).getParent()%></p>--%>
    <hr>

    <p>客户提交信息的方式：<%=request.getMethod()%></p>
    <p>使用协议：<%=request.getProtocol()%></p>
    <p>用户安全信息:<%=request.isSecure()%></p>
    <hr>

    <p>客户端IP地址：<%=request.getRemoteAddr()%></p>
    <p>客户端的机器名称：<%=request.getRemoteHost()%></p>
    <hr>

    <p>服务器端口号：<%=request.getServerPort()%></p>
    <p>服务器名称：<%=request.getServerName()%></p>
    <p>获得Http协议文件头Host:<%=request.getHeader("host")%></p>
    <hr>

</div>

</body>
</html>