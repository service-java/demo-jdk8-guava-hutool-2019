<%@ page contentType="text/html;charset=gb2312" language="java"%>
<%
request.setCharacterEncoding("gb2312");
%>
<html>
<head>
<title>显示用户信息</title>
</head>
<body>
喜欢的城市：
<%
	String[] city = request.getParameterValues("city");
	if (city != null) {
		for (int i = 0; i < city.length; i++) {
			out.println(city[i] + " ");
		}
	}
%>
</body>
</html>

