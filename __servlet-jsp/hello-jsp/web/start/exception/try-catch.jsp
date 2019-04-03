<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/6
  Time: 1:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="../../error.jsp" %>
<html>
<head>
    <title>Try...Catch Example</title>
</head>
<body>
<%
    try {
        int i = 1;
        i = i / 0;
        out.println("The answer is " + i);
    } catch (Exception e){
        out.println("An exception occurred: " + e.getMessage());
    }

    //    输出结果
    //  An exception occurred: / by zero
%>
</body>
</html>
