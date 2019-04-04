<!--
@Author: 骆金参
@Date:   2017-03-23T11:41:15+08:00
@Email:  1095947440@qq.com
@Filename: checkout.jsp
@Last modified by:   骆金参
@Last modified time: 2017-03-23T13:10:40+08:00
-->


<%@ page language="java"
		contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>

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

<%
	

	ArrayList books = (ArrayList) session.getAttribute("books");
	if (books == null || books.size() == 0) {
		out.println("未购买任何图书");
	} else {
%>
<table class="table table-bordered table-hover">
	<tr class="success">
		<td>序号</td>
		<td>商品名称</td>
		<td>价格</td>
		<td>数量</td>
		<td>操作</td>
	</tr>
	<%
		double total = 0;
		int i = 0;
		for (Object o : books) {
			Map book = (Map) o;
			String bookname = (String) book.get("bookname");
			String price = (String) book.get("price");
			int quantity=(Integer)book.get("quantity");
			
			bookname = java.net.URLDecoder.decode(bookname, "utf-8");
			total += Double.parseDouble(price)*quantity;
	%>
	<tr>
		<td><%=++i%></td>
		<td><%=bookname%></td>
		<td><%=price%></td>
		<td><%=quantity %></td>
		<td>
			<a href="buy.jsp?type=add&bookname=<%=java.net.URLEncoder.encode(bookname,">
				<span class="glyphicon glyphicon-plus">
			</a>
			<a href="buy.jsp?type=del&bookname=<%=java.net.URLEncoder.encode(bookname,">
				<span class="glyphicon glyphicon-minus">
			</a>
		</td>
	</tr>
	<% } %>
</table>
<%
		out.println("共" + books.size() + "件，共计:" + total + "元  | ");
	}
%>
<a href="bookList.jsp">返回商城</a>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>

</script>
</body>
</html>
