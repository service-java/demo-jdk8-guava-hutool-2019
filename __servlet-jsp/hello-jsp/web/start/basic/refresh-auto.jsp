<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/6
  Time: 1:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<html>
<head>
    <title>自动刷新实例</title>
</head>
<body>

<h2>实时刷新</h2>
<%
    // 设置每隔5秒刷新一次
    response.setIntHeader("Refresh", 5);

    // 获取当前时间
    Calendar calendar = new GregorianCalendar();
    String am_pm;

    int hour = calendar.get(Calendar.HOUR);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    if(calendar.get(Calendar.AM_PM) == 0)
        am_pm = "AM";
    else
        am_pm = "PM";

    String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
    out.println("<p>当前时间为: " + CT + "</p>");
%>

</body>
</html>
