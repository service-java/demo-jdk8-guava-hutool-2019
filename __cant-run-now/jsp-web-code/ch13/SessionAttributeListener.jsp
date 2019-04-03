<%
   out.print("SessionAttribute");
   session.setAttribute("userName","Tom");
   session.setAttribute("userName","Jerry");
   session.setAttribute("password","123");
   session.removeAttribute("password");
   session.invalidate();
%>
