<%@ page contentType="text/html; charset=gb2312" %>
<%@ page session="true" %>
<%@ page import="org.pan.web.book.goods" %>
<%@ page import="org.pan.util.strFormat" %>
<jsp:useBean id="book" scope="page" class="org.pan.web.goodsmn" />
<%
String mesg = "";
int Id=0;
if (request.getParameter("bookid")==null || request.getParameter("bookid").equals("")) {
		mesg = "你要查看的商品不存在！";
} else {
	try {
		Id = Integer.parseInt(request.getParameter("bookid"));
		if (!book.getOnebook(Id)){
			mesg = "你要查看的商品不存在！";
		}
	} catch (Exception e){
		mesg = "你要查看的商品不存在！";
	}
}

%>

<html>
<head>
<title>电子商务　查看商品资料</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<script language="javascript">
function check()
{
	if (document.form1.amount.value<1){
		alert("你的购买数量有问题");
		document.form1.amount.focus();
		return false;
	}
	return true;
}


</script>
<link rel="stylesheet" href="books.css" type="text/css">
</head>

<body  text="#000000" >
<div align="center">
  <p>电子商务欢迎你<font color="#CC0066">选购商品</font>！</p>
  <% if(!mesg.equals("")){
		out.println(mesg);
	  } else {
		goods bk = (goods) book.getGoodslist().elementAt(0);			  
	%>
  <table width="90%" border="0" cellspacing="2" cellpadding="1">
      <tr> 
        <td align="right" width="120">商品名：</td>
        <td><%= bk.getGoodsName() %></td>
      </tr>
      <tr> 
        <td align="right" width="120">销售员：</td>
        <td><%= bk.getAuthor() %></td>
      </tr>
      <tr> 
        <td align="right" width="120">所属类别：</td>
        <td><%= bk.getClassname() %></td>
      </tr>
      <tr> 
        <td align="right" width="120">生产商：</td>
        <td><%= bk.getPublish() %></td>
      </tr>
      <tr> 
        <td align="right" width="120">商品编号：</td>
        <td><%= bk.getGoodsNo() %></td>
      </tr>
      <tr> 
        <td align="right" width="120">书价：</td>
        <td><%= bk.getPrince() %></td>
      </tr>
      <tr> 
        <td align="right" width="120" valign="top">内容介绍：</td>
        <td><%= strFormat.toHtml(bk.getContent()) %></td>
      </tr>
      <tr> 
        <td align="right" width="120" valign="top">总数量</td>
        <td><%= bk.getAmount() %></td>
      </tr> 
	  <tr> 
        <td align="right" width="120" valign="top">剩余数量</td>
        <td><%= bk.getLeav_number() %></td>
      </tr> 
	  <tr> 
        <td align="right" width="120" valign="top">登录时间</td>
        <td><%= bk.getRegTime() %></td>
      </tr>
      
  </table>
<% } %>
  <br><p><a href="javascript:window.close()">关闭窗口</a></p>
  <jsp:include flush="true" page="..\bottom.jsp"></jsp:include>
  
</div>
</body>
</html>
