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

<div class="container" style="margin-top: 20px;"> 

  <form class="form-inline" 
        method="post"
        action="result.jsp">
	<div class="form-group">
		<label class="sr-only" for="exampleInputAmount">Amount</label>
    	<div class="input-group">
      		<div class="input-group-addon"><%=session.getAttribute("min")%> </div>
      		<input class="form-control" 
				id="num" type="number" required
  				placeholder='上次: <%=session.getAttribute("pre")%>' 
  				name="num" min="1" max="100">
      		<div class="input-group-addon"><%=session.getAttribute("max")%></div>
    	</div>
  	</div>
  	<button class="btn btn-default" type="submit">送出</button>
  </form>
  
  <h5>数字过<mark>大</mark>, 您已经猜了<%=session.getAttribute("times")%>次</h5>
  
</div>


<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
document.getElementById("num").focus();
</script>
</body>
</html>
