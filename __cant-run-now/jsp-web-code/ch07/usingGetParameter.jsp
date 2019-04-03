<%@page contentType="text/html"%>
<%@page pageEncoding="GB2312"%>
<html>
    <head><title>JSP Page</title></head>
    <body>
    <%
        //request.setCharacterEncoding("GB2312") ; 
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");
    %>
    Hi , <%=name%> 您好 : <br>   <br>
    您输入的个人数据如下<p>
    姓名：<%=name%><br>
    E-mail：<%=email%><br>
    电话：<%=tel%>
    </body>
</html>
