<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="gb2312"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Redirect</title>
</head>
<body>
 <c:redirect url="/Cout.jsp" context="/ch14" >
             <c:param name="name" value="PG20174" />   
      </c:redirect>

</body>
</html>