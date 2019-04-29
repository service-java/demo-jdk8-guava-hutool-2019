<%@ page contentType="text/html;charset=GB2312"%>
<%@ taglib uri="/mytag" prefix="my"%>
<%
String hello = request.getParameter("Name");
%>
<h3>hello 
<my:welcome name="<%=hello%>"></my:welcome> 
»¶Ó­Äú£¡
</h3>
