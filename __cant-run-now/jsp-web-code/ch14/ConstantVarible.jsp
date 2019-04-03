<%@page contentType="text/html"%>
<%@page pageEncoding="GB2312"%>
<html>
<head>
<title>EL 常量变量</title>
</head>
<body>
<%
	application.setAttribute("firstNum", "20");
	application.setAttribute("secondNum", "40");
%>

输出数值10：${10}
<br>
输出变量firstNum：${firstNum}
<br>
输出变量firstNum：${secondNum}
<br>
输出变量firstNum+firstNum：${secondNum+firstNum}
<br>
输出字符串firstNum：${'firstNum'}
<br>
输出字符串firstNum：${'secondNum'}
<br>
</body>
</html>
