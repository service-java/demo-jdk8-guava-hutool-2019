<%
out.println("add attribute");
getServletContext().setAttribute("userName","hellking");
out.println("replace attribute");
getServletContext().setAttribute("userName","asiapower");
out.println("remove attribute");
getServletContext().removeAttribute("userName");
%>