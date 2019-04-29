<%@   page contentType="text/html;   charset=gb2312" language="java"
	import="java.sql.*" errorPage=""%>
<html>
<head>
<title>config读取初始值计数器的例子</title>
</head>
<body>
<%
	int org = 0;
	int count = 0;
	try {
		org = Integer.parseInt(config.getInitParameter("counter"));
	} catch (Exception e) {
		out.print("org:" + e);
	}
	try {
		count = Integer.parseInt((application
		.getAttribute("config_counter").toString()));
	} catch (Exception e) {
		out.print("config_counter" + e);
	}
	if (count < org)
		count = org;
	out.print("此页面已经访问了" + count + "次");
	count++;
	application.setAttribute("config_counter", new Integer(count));
%>
</body>
</html>
