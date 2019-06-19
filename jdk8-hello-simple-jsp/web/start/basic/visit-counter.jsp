<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 21:56
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

    <%
        Integer hitsCount =
                (Integer)application.getAttribute("hitCounter");

        // 第一次访问
        if( hitsCount == null || hitsCount == 0 ){

            out.println("欢迎访问!");
            hitsCount = 1;
        }

        // 不是第一次访问
        else {
            out.println("欢迎再次访问!");
            hitsCount += 1;
        }
        application.setAttribute("hitCounter", hitsCount);
    %>

    <p>(method1)页面访问量为: <mark><%= hitsCount%></mark></p>


    <%!
        int i = 0;
        synchronized void add() {
            i++;
        }
    %>

    <%
        add(); // 不要忘记调用
    %>


    <p> (method2)页面访问量为: <mark><%=i%><mark> </p>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
