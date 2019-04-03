<%@ page contentType="text/html;charset=GB2312" import="java.util.Vector" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html> <head><title>&lt;c:forTokens&gt;</title> </head>
  <body>
  <c:set var="strs" value="红|橙,黄|绿,青|蓝,紫" scope="request" />
	<h4><c:out value="原始数据为：${strs}"/></h4>
	<c:out value="使用 '|' 作为分隔字符:"/>
	<c:forTokens var="str" items="${strs}"  delims="|" varStatus="status">
  		<c:out value="${str}"/>  
  		<c:if test="${status.last}">
	    	<br/>总共输出<c:out value="${status.count}"/> 个元素。
	    </c:if>   
	</c:forTokens>
	<p />
	<c:out value="同时使用 '|' 和 ',' 作为分隔字符:"/>
	<c:forTokens var="str" items="${strs}"  delims="|," varStatus="status">
  		<c:out value="${str}"/>  
  		<c:if test="${status.last}">
	    	<br/>共输出<c:out value="${status.count}"/> 个元素。
	    </c:if>   
	</c:forTokens>
   </body>
</html> 
