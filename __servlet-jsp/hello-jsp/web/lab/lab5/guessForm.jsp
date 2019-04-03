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
    <input class="form-control" 
			id="num" type="number" required
  			placeholder="输入1-100的整数：" 
  			name="num" min="1" max="100">
  			
  	<button class="btn btn-default" type="submit">送出</button>
  </form>
  
  <h4>猜数游戏</h4>
</div>


<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
document.getElementById("num").focus();
</script>
</body>
</html>
