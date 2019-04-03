<%@ page language="java"  pageEncoding="GBK"%>
<%@ taglib uri="showDateUri" prefix="wghDate" %>
<html>
  <head><title>调用自定义标签显示当前系统日期</title></head>
 <body>

今天是<wghDate:showDate />


<%-- 在web.xml定义 如下 --%>

<%--
<jsp-config>
    <taglib>
        <taglib-uri>showDateUri</taglib-uri>
        <taglib-location>/WEB-INF/showDate.tld</taglib-location>
    </taglib>
</jsp-config>
--%>

</body>
</html>
