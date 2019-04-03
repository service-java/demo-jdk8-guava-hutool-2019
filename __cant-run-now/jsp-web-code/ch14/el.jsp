<%@ page language="java" contentType="text/html; charset=GB2312"%>
<html>
  <head>
    <title>EL 隐含对象</title>
  </head>
  <body>
  
   <form method="GET" action="InternalObject.jsp">
    <input type="text" name="name" size="20"><br>
    <input type="submit" value="确认" >
    <input type="reset" value="取消" >
   </form>  
 <%
            Cookie nameCookie = new Cookie("cname", "JSP");           
            response.addCookie(nameCookie);           
  %>
  </body>
</html>