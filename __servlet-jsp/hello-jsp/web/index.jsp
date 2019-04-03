<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Random" %>

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
    <p>Just A JSP Page! </p>

    <%-- 下拉按钮 --%>
    <div class="dropdown">
        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
            不要点我
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
            <li><a href="#">照妖镜</a></li>
            <li><a href="#">丑拒</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">回炉再造</a></li>
        </ul>
    </div>

    <%-- 演示脚本怎么混杂 --%>
    <%
        Random r = new Random();
        int type = r.nextInt(2); // 0-1

        out.print("<p>这是您的验证码 : ");
        for(int i=0; i<6; i++) {
            out.print( (r.nextInt() >>> 1) % 10); // 0-9
        }
        out.print("</p>");

        if(type == 0) { %>
            <h1>你是用户</h1>
    <%  }
        else { %>
            <h1>你是管理员</h1>
    <%    }


        // 和Java与HTML差不多
        Date nowday = new Date();
        // int hour=nowday.getHours();	// 获取日期中的小时
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 定义日期格式化对象
        String time= ft.format(nowday);

        // 这句话报407错误
        // response.sendError(407, "Need authentication!!!" );
    %>

    <%-- 赋值 --%>
    <p>当前时间<%=time%></p>

</div>

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>