<%@ page contentType="text/html;charset=gb2312" language="java"%>
<%request.setCharacterEncoding("gb2312");%>
<html>
<head>
<title>显示用户信息</title>
</head>
<body>
兴趣：
<%
	String[] hobby = request.getParameterValues("Habit");
	if (hobby != null) {
		for (int i = 0; i < hobby.length; i++) {
			if (hobby[i].equals("Read")) {
		out.println("看书 ");
			}
			if (hobby[i].equals("Football")) {
		out.println("足球 ");
			}
			if (hobby[i].equals("Travel")) {
		out.println("旅游 ");
			}
			if (hobby[i].equals("Music")) {
		out.println("听音乐 ");
			}
			if (hobby[i].equals("Tv")) {
		out.println("看电视 ");
			}
		}
	}
%>
</body>
</html>

