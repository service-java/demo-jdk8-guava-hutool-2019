<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>HTML5 Page Title</title>
  
  <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<%
	long endTime = System.currentTimeMillis();
	long startTime = (Long)session.getAttribute("start");
	long totalSeconds = (endTime - startTime) / 1000;
%>



<div class="container" style="margin-top: 20px;"> 
	<h5>没错，这个数是<%=session.getAttribute("num")%></h5>
	<h5>共用时 <%=totalSeconds%>s</h5>
	<a href="guessForm.jsp">再来一次</a>
</div>

<%
session.setAttribute("num", ((int)(Math.random() * 100) + 1));
session.setAttribute("times", 0); // 统计次数初始化
session.setAttribute("min", 0);
session.setAttribute("max", 101);
session.setAttribute("isTiming", "false"); // 是否在计时
%>

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>

</script>
</body>
</html>
