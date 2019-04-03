<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/6
  Time: 1:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Locale" %>
<%@ page import="java.text.NumberFormat,java.util.Date" %>
<%@ page import="java.text.DateFormat,java.util.Date" %>

<%
//    response.setContentType("text/html");
    // Set spanish language code.
//    response.setHeader("Content-Language", "es");

    String title = "Locale Specific Currency";
    Locale locale = request.getLocale( ); // 获取客户端Locale

    // 货币Locale
    NumberFormat nft = NumberFormat.getCurrencyInstance(locale);
    String formattedCurr = nft.format(1000000); // 更具语言货币格式

    // 日期Locale
    String date = DateFormat.getDateTimeInstance(
            DateFormat.FULL,
            DateFormat.SHORT,
            locale).format(new Date( ));
%>

<html>
<head>
    <title><% out.print(title); %></title>
</head>
<body>

<%
    if(locale.equals(Locale.US)) {
        out.print("Welcome to China!");
    }

    else if(locale.equals(locale.CHINA)) {
        out.print("中国欢迎你！"); // eclipse的内置浏览器貌似无法显示
    }
%>

    <%-- 输出货币 --%>
    <p>Formatted Currency: <%  out.print(formattedCurr); %></p>

    <%--输出日期--%>
    <p>Local Date: <%  out.print(date); %></p>

</body>
</html>
