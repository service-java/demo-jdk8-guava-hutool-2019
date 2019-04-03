<%@ page contentType="text/html;charset=GB2312" import="java.util.Vector" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>&lt;c:forEach&gt;</title>
  </head>
  <body>
    <h3>&lt;c:forEach&gt;</h3>
    <h4>循环10次</h4>
    <c:forEach var="item" begin="1" end="10">
        ${item}
    </c:forEach>
    <br/>step=3:
    <c:forEach var="item" begin="1" end="10" step="3">
        ${item}
    </c:forEach>
    <h4>枚举Vector元素</h4>
    <% 	Vector v = new Vector();
		v.add("北京"); 
		v.add("上海"); 
		v.add("广州"); 
		v.add("郑州");
		pageContext.setAttribute("vector", v);
    %>
    <c:forEach items="${vector}" var="item" >
		${item}
    </c:forEach>
    <h4> 逗号分隔的字符串</h4>
	<c:forEach var="color" items="红,橙,黄,绿，青，蓝，紫" begin="2" step="3">
  		<c:out value="${color}"/>
	</c:forEach>
	<h4>状态变量的使用</h4>
	<c:forEach var="i" begin="5" end="50" step="5" varStatus="status">
	  <c:if test="${status.first}">
	    begin:<c:out value="${status.begin}"/>&nbsp; &nbsp; 
	      end:<c:out value="${status.end}"/>&nbsp; &nbsp; 
	     step:<c:out value="${status.step}"/><br>
	     <c:out value="输出的元素:"/> 
	  </c:if>
	  <c:out value="${i}"/> 
	  <c:if test="${status.last}">
	    <br/>总共输出<c:out value="${status.count}"/> 个元素。
	  </c:if>  
	</c:forEach>
   </body>
</html> 
