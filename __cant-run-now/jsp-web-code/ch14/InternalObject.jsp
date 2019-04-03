<%@ page language="java" contentType="text/html; charset=GB2312"%>
<html>
<head>
<title>EL隐含对象运行</title>
</head>
<body>
    请求URL:${pageContext.request.requestURL}<br>
    通信协议：${pageContext.request.protocol}<br>
    表单参数：${pageContext.request.queryString}<br>
    
    ${'Hello '}  
    ${param.name} 
    ${'欢迎使用 JSP  动态网页 !'}  <br>
    
    accept-language：${header["accept-language"]}<br>      
    host：${header["host"]}<br>
    cookie：${header["cookie"]}<br>
    
    cookie cname：${cookie.cname} <br>
    cookie cname(value)：${cookie.cname.value} <br>
    
</body>
</html>