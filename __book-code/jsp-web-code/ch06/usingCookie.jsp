<%@page contentType="text/html"%>
<%@page pageEncoding="GB2312"%>
<%request.setCharacterEncoding("gb2312"); %>
<html>
<head>
<title>‘À”√Cooike</title>
</head>
<body>
<%
        String strname = request.getParameter("name");
        String strsex = request.getParameter("sex");
        String strcolor = request.getParameter("color");
        
        Cookie nameCookie = new Cookie("name", java.net.URLEncoder.encode(strname));
        Cookie sexCookie = new Cookie("sex",strsex);
        Cookie colorCookie = new Cookie("color",strcolor);

        response.addCookie(nameCookie);
        response.addCookie(sexCookie);
        response.addCookie(colorCookie);

        response.sendRedirect("responseCookie.jsp");
    %>
</body>
</html>
