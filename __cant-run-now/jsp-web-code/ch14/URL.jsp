<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>Insert title here</title>
</head>
<body>
 <h3>&lt;c:url&gt;</h3>
    <font size=-1>在将鼠标移到对应的超链接上，浏览器状态栏中可以看到结果。</font><p/>
    <b>c:url 嵌入html标记中：</b>
    <a href="<c:url value="/Cout.jsp" />">&lt;c:url&gt;的用法</a>
    <br/>结果：http://localhost:8080/ch14/Cout.jsp<p/>
    <b>使用var属性保存URL：</b>
    <c:url var="url1" value="/Cout.jsp"/>
    <a href="${url1}">&lt;c:url&gt;的用法</a>
    <br/>结果：http://localhost:8080/ch14/Cout.jsp<p/>
    <b>使用其他Web应用URL：</b>
    <c:url var="examples" value="/index.html" context="/root"/>
    <a href="${examples}">Tomcat实例</a>
    <br/>结果：http://localhost:8080/root/index.html<p/>
    <b>使用参数：</b>
    <c:url value="/Cout.jsp" var="url1">
	   <c:param name="Id" value="12345678"/>
	   <c:param name="Type" value="String"/>
	</c:url>
	<a href="${url1}">带参数的URL</a>
    <br/>结果：http://localhost:8080/ch14/Count?Id=123456789&Type=String<p/>
    <b>使用绝对URL：</b>
    <c:url var="ftp1" value="ftp://ftp.zzu.edu.cn"/>
    <a href="${ftp1}">绝对URL</a>
    <br/>结果：ftp://ftp.zzu.edu.cn
   

</body>
</html>