<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    errorPage="error.jsp" %>
    
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
<%  if(request.getParameter("num") != null) { 
		int num = Integer.parseInt(request.getParameter("num")); 
		
		if(1 <= num && num <= 50) { %>
			<jsp:forward page="two.jsp">
				<jsp:param value="<%=num%>" name="num"/>
			</jsp:forward>	
<% 		} else if (50 < num && num <= 100) { %>
			<jsp:forward page="three.jsp">
				<jsp:param value="<%=num%>" name="num"/>
			</jsp:forward>	
<% 	    } else { %>
			<jsp:forward page="error.jsp">
				<jsp:param value="The given number is not in the predefined range: 1~100." name="exception"/>
			</jsp:forward>	
<% 		}
		
    } %>

<div class="container" style="margin-top: 20px;"> 
	<jsp:include page="head.jsp" />
	
	<form class="form-inline" method="post">
	
		<input class="form-control" 
			id="num" type="text" 
  			placeholder="输入0-100的整数：" 
  			name="num">		
  	<%-- 	
  		<input class="form-control" 
			id="num" type="number" 
  			placeholder="输入0-100的整数：" 
  			name="num" min="1" max="100">	
  	 --%>	
  	 			
  		<button class="btn btn-default" type="submit" onclick="deal()">提交</button>
	</form>

</div>


<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>

	
</script>
</body>
</html>