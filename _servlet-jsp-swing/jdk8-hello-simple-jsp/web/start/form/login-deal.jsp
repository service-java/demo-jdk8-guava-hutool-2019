<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html; charset=utf-8" language="java" %>

<%
    request.setCharacterEncoding("utf-8"); // 防止中文乱码

    String username = request.getParameter("username");
    String pwd = request.getParameter("pwd");

    // 判空
    if(username.equals("") || pwd.equals("")){
        response.sendError(500, "请输入登录验证信息");
    }

    out.println("<p>用户名为：" + username + "</p>");
    out.println("<p>密码为：" + pwd + "</p><hr>");



    // 获取全部参数
    out.print("<p>遍历表单信息如下:</p>");
    Enumeration paramNames = request.getParameterNames();

    out.print("<ul>");
    while(paramNames.hasMoreElements()) {
        String paramName = (String)paramNames.nextElement();
        String paramValue = request.getParameter(paramName);
        out.print("<li>" + paramName + " : ");
        out.println( paramValue + "</li>");
    }

    out.print("</ul>");

%>

