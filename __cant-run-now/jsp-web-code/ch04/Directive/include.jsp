<%@ page contentType="text/html; charset=gb2312" language="java"%>
<html>
<head>
<title>Include指令示例</title>
</head>
<body>
也不可以在file所指定的文件后添加任何参数，下面的这行代码是不合法的。
<%@ include file="setInfo.jsp?name=browser"%>

<p>插入HTML文件：<%@ include file="include_html.html"%>
<p>插入文本文件：<%@ include file="include_txt.txt"%>
<p>插入JSP文件,显示现在的日期时间：<%@include file="include_jsp.jsp"%>
<p>插入JSP代码：<%@ include file="include_code.cod"%>
</body>
</html>
