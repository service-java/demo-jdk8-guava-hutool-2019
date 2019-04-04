<%
session.removeAttribute("username");
session.removeAttribute("userid");
session.removeAttribute("shopcar");
response.sendRedirect("index.jsp?msg=logout");

%>