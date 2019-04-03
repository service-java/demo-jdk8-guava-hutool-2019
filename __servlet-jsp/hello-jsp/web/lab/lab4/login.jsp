<!--
@Author: 骆金参
@Date:   2017-03-16T09:30:53+08:00
@Email:  1095947440@qq.com
@Filename: login.jsp
@Last modified by:   骆金参
@Last modified time: 2017-03-16T09:35:51+08:00
-->


<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%!
	String name = "";
	String pwd = "";
	Boolean isRemembered = false;
%>    
<%
Cookie cookie = null;
Cookie[] cookies = request.getCookies();

if(cookies != null){
   out.print("cookies不为空，如下<br>");
   for (int i = 0; i < cookies.length; i++){
      cookie = cookies[i];
      out.print(cookie.getName() + " : " + cookie.getValue() + "<br>");
      if(cookie.getName().equals("username") ) {
			name =  cookie.getValue();
      }
      if(cookie.getName().equals("userpwd") ) {
    	  	pwd =  cookie.getValue();
      }
      if(cookie.getName().equals("isremembered") ) {
    	  if(cookie.getValue().equals("on")) {
    		  isRemembered = true;  
    	  }
    	  else {
    		  isRemembered = false;  
    	  }
      }
   }
}

%>    

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
	<h3 class="text-center">用户登录</h3>

	<form class="form-horizontal" action="login_deal.jsp" method="post">
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
				<div class="col-sm-10">
						<input type="text" class="form-control"
									 id="username" name="username"
									 value="<%=name%>" required="required"
									 placeholder="姓名">
				</div>
			</div>

			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">密码</label>
				<div class="col-sm-10">
						<input type="password" class="form-control"
									 id="userpwd" name="userpwd"
									 value="<%=pwd%>" required
									 placeholder="密码">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							<label>
									<input type="checkbox" name="is_remembered" 
								<%
							      if(isRemembered) {
							    	  out.print(" checked ");
							      }
								%> > 10天内免登陆
							</label>
						</div>
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default btn-success">提交</button>
						<button type="reset" class="btn btn-default">重置</button>
				</div>
			</div>
	</form>
</div>


<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>

</script>
</body>
</html>
