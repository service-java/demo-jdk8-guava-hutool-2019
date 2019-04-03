<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ page language="java" contentType="text/html; charset=gb2312"%>
pageContext的测试页面－在pagecontext中设置一些属性：
<br>
<%
	ServletRequest req = pageContext.getRequest();//
	String name = req.getParameter("name");//和request.getParameter("name")效果是一样的
	out.println("request的到的参数:name=" + name);
	pageContext.setAttribute("userName", name);
	pageContext.getSession().setAttribute("sessionValue", name);
	pageContext.getServletContext().setAttribute("sharevalue", name);
	out.println("<br>pageContext.getAttribute('userName'):");
	out.println(pageContext.getAttribute("userName"));//只在当前的页面有效
	out.println("<br>pageContext.getSession().getAttribute('sessionValue')=");
	out.println(pageContext.getSession().getAttribute("sessionValue"));
	out.println("<br>pageContext.getServletContext().getAttribute('sharevalue')=");
	out.println(pageContext.getServletContext().getAttribute("sharevalue"));
%>
<a href="pagecontext2.jsp">next--></a>跳转到下一个测试页面
