<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/6
  Time: 2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>life.jsp</title>
</head>
<body>

<%!
    private int initVar = 0;
    private int serviceVar = 0;
    private int destroyVar = 0;

    public void jspInit() {
        initVar ++;
        System.out.println("jspInit() " + initVar + "次");
    }
    public void jspDestroy() {
        destroyVar ++;
        System.out.println("jspDestroy() " + destroyVar + "次");
    }

%>

<%
    serviceVar++; // 会不断累加
%>

<p>初始化次数 <%=initVar %></p>
<p>响应客户请求次数 <%=serviceVar %></p>
<p>销毁次数 <%=destroyVar %></p>

</body>
</html>
