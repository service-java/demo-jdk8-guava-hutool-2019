<%@ page contentType="text/html;charset=GBk" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>JSTL -- c:out </title>
</head>
<body bgcolor="#FFFFFF"><h1>
&lt;c:out&gt;
<%
pageContext.setAttribute("myVar", "属性：页内有效");
request.setAttribute("myVar", "属性：请求有效");
session.setAttribute("myVar", "属性：会话有效");
java.io.Reader reader1 = new java.io.StringReader("<h2>含有特殊字符的文本</h2>");
pageContext.setAttribute("myReader1", reader1);
java.io.Reader reader2 = new java.io.StringReader("<font color=red>含有特殊字符的文本</font>");
pageContext.setAttribute("myReader2", reader2);
%>
<c:out value="常量字符串输出:"/><c:out value="郑州 2013"/><br/>
<c:out value="表达式输出："/><c:out value="${2013+100}"/><br/>
<c:out value="默认值输出："/>
<c:out value="${param.name}" default="没有输入name参数"/><br/>
<c:out value="重名属性输出:"/><c:out value="${myVar}"/><br/>

<c:out value="特殊字符输出："/><br/>
<!-- 将会输出特殊标记 -->
(escapeXml=true) : <c:out value="${myReader1}"/><br/>
<!-- 将会输出红色字符串 -->
(escapeXml=false): <c:out value="${myReader2}" escapeXml="false"/><br/>
<h1>
</body>
</html>