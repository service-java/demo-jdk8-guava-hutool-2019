<%@ page contentType="text/html; charset=gb2312"%>
<html>
<head>
<title>jsp:setProperty动作实例</title>
</head>
<body>
<h1><jsp:useBean id="clock" class="java.util.Date">
	<jsp:setProperty name="clock" property="hours" param="hh" />
	<jsp:setProperty name="clock" property="minutes" value="79" />
	<jsp:setProperty name="clock" property="seconds" param="*" />
</jsp:useBean> 
设置属性后的时刻：<%=clock%> <br>
现在是<%=clock.getHours()%>点， 
<%=clock.getMinutes()%>分， 
<%=clock.getSeconds()%>秒
</body>
</html>
