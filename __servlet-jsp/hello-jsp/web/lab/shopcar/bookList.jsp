<!--
@Author: 骆金参
@Date:   2017-03-23T11:38:34+08:00
@Email:  1095947440@qq.com
@Filename: bookList.jsp
@Last modified by:   骆金参
@Last modified time: 2017-03-23T14:30:27+08:00
-->


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

<table class="table table-bordered table-hover">
  <tr class="info">
     <td>图书ID</td>
     <td>书名</td>
     <td>价格</td>
     <td>购买</td>
  </tr>

  <tr>
     <td>1</td>
     <td>JSP开发应用详解</td>
     <td>36.0</td>
     <%--<td>--%>
		 <%--<a class="js-confirm"--%>
			<%--role="button" data-toggle="popover"--%>
			<%--data-trigger="focus"--%>
			<%--data-content="成功加入购物车"--%>
			<%--href="buy.jsp?type=buy&price=36&bookname=<%=java.net.URLEncoder.encode(">Buy It!</a> </td>--%>

  </tr>

  <tr>
     <td>2</td>
     <td>JSP 2.0应用教程</td>
     <td>24</td>
     <td>
			 <%--<a class="js-confirm"--%>
			 	<%--role="button" data-toggle="popover"--%>
			 	<%--data-trigger="focus"--%>
			 	<%--data-content="成功加入购物车" --%>
			 <%--href="buy.jsp?type=buy&price=24&bookname=<%=java.net.URLEncoder.encode(">Buy It!</a>--%>
		 <%--</td>--%>
  </tr>

  <tr>
     <td>3</td>
     <td>Visual Basic课程设计</td>
     <td>29</td>
     <%--<td>--%>
			 <%--<a class="js-confirm"--%>
			 	<%--role="button" data-toggle="popover"--%>
			 	<%--data-trigger="focus"--%>
			 	<%--data-content="成功加入购物车" --%>
			 <%--href="buy.jsp?type=buy&price=29&bookname=<%=java.net.URLEncoder.encode(">Buy It!</a>--%>
		 <%--</td>--%>
  </tr>
</table>

<a href="checkout.jsp">查看购物车</a>
</div> <!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
	$('.js-confirm').popover();
});

</script>
</body>
</html>
