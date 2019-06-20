<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    // 如果有过提交
    if(request.getParameter("submit") != null){
        response.setContentType("application/msword;charset=utf-8");
    }
%>
    
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>HTML5 Page Title</title>
</head>
<body>

平平淡淡才是真！
快快乐乐才是福！

<form action="" method="post" name="form1">
	<input name="submit" type="submit" id="submit" value="保存为word" />
</form>
	
</body>
</html>