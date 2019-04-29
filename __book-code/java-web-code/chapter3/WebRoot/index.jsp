<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>古诗</title>
<style type="text/css">
body {
	background-image: url(images/2005617192843333.jpg);
	background-repeat: no-repeat;
}

.main {
	margin-top: 130px;
	margin-left: 20px;
	font-size: 12px;
}

h2 {
	font-size: 22px;
}
</style>
</head>
<body>
	<div class="main">
		<%
			String[] strs = { "老兔寒蟾泣天色，云楼半开壁斜白。", "玉轮轧露湿团光，鸾佩相逢桂香陌。",
					"黄尘清水三山下，更变千年如走马。", "遥望齐州九点烟，一泓海水杯中泻。" };
			out.println("<h2>梦天</h2>");
			for (int i = 0; i < strs.length; i++) {
				out.print(strs[i]);
				out.print("<br/><br/>");
			}
		%>

	</div>
</body>
</html>
