<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>HTML5 Page Title</title>
</head>
<body>

<%
  int num = 0;
  if(application.getAttribute("num") == null) {
    num = 1;
  }
  else {
    num = Integer.parseInt((String)application.getAttribute("num"));
    num++;
  }
 %>

<p>到目前为止共有 <%=num%> 位用户访问过本站.</p>

<%
  application.setAttribute("num", String.valueOf(num));
  // out.print(application.getAttribute("num").getClass()); // class java.lang.String
  
%>


</body>
</html>
