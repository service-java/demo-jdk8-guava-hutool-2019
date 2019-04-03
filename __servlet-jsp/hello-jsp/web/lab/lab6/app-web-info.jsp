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
request.setCharacterEncoding("utf-8");
%>
<div class="container" style="margin-top: 20px;"> 

<table class="table table-bordered table-hover">
<% 
	String driver = application.getInitParameter("driver");
	String url = application.getInitParameter("url");
	String user = application.getInitParameter("user");
	String pass = application.getInitParameter("pass");
	
	out.print("<tr><th>driver</th><th>" + driver + "</th></tr>");
	out.print("<tr><th>url</th><th>" + url + "</th></tr>");
	out.print("<tr><th>user</th><th>" + user + "</th></tr>");
	out.print("<tr><th>pass</th><th>" + pass + "</th></tr>");
%>
</table>

</div>


<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>

</script>
</body>
</html>
