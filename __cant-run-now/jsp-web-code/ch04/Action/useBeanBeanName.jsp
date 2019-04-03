<%@ page contentType="text/html; charset=gb2312"%>
<html>
<head>
<title>jsp:useBeanBeanName演示</title>
</head>
<body>
   <h1><jsp:useBean id="clock" type="java.io.Serializable" beanName="java.util.Date"/>
   现在时间：<%=clock %>
</body>
</html>