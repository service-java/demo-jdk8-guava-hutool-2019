<%@page contentType="text/html"%>
<%@page pageEncoding="GB2312"%>
<html>
    <head><title>request 类型的生命周期</title></head>
    <body> 
    <jsp:useBean id="count"scope="request" class="bean.Counter"/>   
    	<font color="red">request.jsp</font><br><br>
	您是request.jsp网页的第<font color=blue>
	<jsp:getProperty name="count" property="counter"/>
	</font>位参观者<br>	
	<%   
            out.println(" 这是request.jsp网页的计数器 !!");
	%>
    </body>
</html>
