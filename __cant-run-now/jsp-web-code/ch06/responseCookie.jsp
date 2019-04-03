<%@page contentType="text/html; charset=gb2312"%>
<%@page pageEncoding="GB2312"%>
<html>
<head>
<title>获取Cookie资料</title>
</head>
<body>
<%
	Cookie cookies[] = request.getCookies();
	int count = cookies.length;
	String name = "", sex = "", color = "";

	for (int i = 0; i < count; i++)
		if (cookies[i].getName().equals("name"))
			name = cookies[i].getValue();
		else if (cookies[i].getName().equals("sex"))
			sex = cookies[i].getValue();
		else if (cookies[i].getName().equals("color"))
			color = cookies[i].getValue();
%>
<font color="<%=color%>" size="5"><%=java.net.URLDecoder.decode(name)%></font>
您好，以下是您的个人资料…
<p>
<%
	out.println("性别：<br>");
	if (sex.equals("M"))
		out.println("<img src = 'boy.jpg'>我是男生..<p>");
	else
		out.println("<img src = 'girl.jpg'>我是女生..<p>");
%>

</body>
</html>
