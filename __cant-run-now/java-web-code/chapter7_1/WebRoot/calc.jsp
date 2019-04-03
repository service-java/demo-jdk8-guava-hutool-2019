<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>EL计算器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <style>
#one {
	margin:auto;
	background:url(images/logo.jpg);
	background-repeat:no-repeat;
	height:392px;
	width:722px;	
}
#two {
	position:relative;
	font-size: 12px;
	margin-top:150px;
	margin-left:190px;	
	width:500px;	
	float:left;
	font-size: 16px;
}
#three {
 position:relative;
 width:200px; 
 margin-top:150px;
 margin-right:60px;
 float:right;
}
</style>
  </head>
<body>
	<div id="one">
		<div id="two">
<form action="calc.jsp" method="post">
    	第一个运算数：<input type="text" name="calc01"  ><br>
    	请选择运算符：
    	<select name="op">
    		<option selected="selected" value="+">+</option>
    		<option value="-">-</option>
    		<option value="*">*</option>
    		<option value="/">/</option>
    	</select><br>
    	第二个运算数：<input type="text" name="calc02" ><br>
    	<input type="submit" value="计算">
    </form>
    <%if(request.getParameter("op")!=null){
    String op = request.getParameter("op"); 
    %>${param.calc01}${param.op}${param.calc02}=
    <%if(op.equals("+")) {%>
    ${param.calc01+param.calc02  }
    <%}else if(op.equals("-")){%>
    ${param.calc01-param.calc02  }
    <%} else if(op.equals("*")){%>
    ${param.calc01*param.calc02  }
    <%}else {%>
    ${param.calc01/param.calc02  }
    <%}} %>
		</div>

	</div>
</body>
  
</html>
