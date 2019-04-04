<%@page contentType="text/html" pageEncoding="GB2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head><title>JSP Page</title></head>
    <body>
        <c:catch var="execption">
        <%
            int[]  a = {1,2,3} ; 
            int  b= 0  ; 
            for(int i=0 ; i<4 ; i++){
                b+=a[i]  ;  
         %>              
         <%out.print(b); }%>         
        </c:catch>  
        <br>      
        <c:out value ="${execption}" />
    </body>
</html>
