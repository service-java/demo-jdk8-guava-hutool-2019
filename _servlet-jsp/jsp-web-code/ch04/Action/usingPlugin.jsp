<%@page contentType="text/html"%>
<%@page pageEncoding="GB2312"%>
<html>
<title>бнЪО plugin</title>
<body>
<jsp:plugin type="applet" code="ch04.showmsg.class"
	height="200" width="200">
	<jsp:params>
		<jsp:param name="msg1" value="C++" />
		<jsp:param name="msg2" value="Java" />
		<jsp:param name="msg3" value="C#" />
	</jsp:params>
</jsp:plugin>
</body>
</html>
