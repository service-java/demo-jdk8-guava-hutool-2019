<%@ page contentType="text/html; charset=gb2312" %>
<%@ page session="true" %>
<%@ page import="org.pan.web.book.goods" %>
<jsp:useBean id="book" scope="page" class="org.pan.web.goodsmn" />
<jsp:useBean id="shop" scope="page" class="org.pan.web.purchase" />

<%
String mesg = "";
String submits = request.getParameter("Submit");
int Id=0;
if (submits!=null && !submits.equals("")){
	if (shop.addnew(request)){
		mesg = "你要的商品已经放入你的购物车中！谢谢";
	} else if (shop.getIsEmpty()){
		mesg = "库存商品数量不足！只剩"+shop.getLeaveGoods()+"本";
	} else {
		mesg = "暂时不能购买！";
	}
}else {
	if (request.getParameter("bookid")==null || request.getParameter("bookid").equals("")) {
			mesg = "你要购买的商品不存在！";
	} else {
		try {
			Id = Integer.parseInt(request.getParameter("bookid"));
			if (!book.getOnebook(Id)){
				mesg = "你要购买的商品不存在！";
			}
		} catch (Exception e){
			mesg = "你要购买的商品不存在！";
		}
	}
}
%>
<html>
<head>
<title>电子商务　购买商品</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<script language="javascript">

function openScript(url,name, width, height){
	var Win = window.open(url,name,'width=' + width + ',height=' + height + ',resizable=1,scrollbars=yes,menubar=no,status=yes' );
}

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

<body  text="#000000" onload="javascript:window.focus();">
<div align="center">
  <p>电子商务欢迎你<font color="#CC0066">选购商品</font>！</p>
   <% if(!mesg.equals("")){
		out.println(mesg);
	  } else {
		goods bk = (goods) book.getGoodslist().elementAt(0);			  
	%>
 <form name="form1" method="post" action="purchase.jsp">
  <table width="90%" border="0" cellspacing="2" cellpadding="1">
      <tr> 
        <td align="center">商品名：<%= bk.getGoodsName() %></td>
      </tr>
      <tr align="center"> 
        <td>你想要的数量： 
          <input type="text" name="amount" maxlength="4" size="3" value="1"> </td>
      </tr>
      <tr align="center"> 
        <td>
		  <input type="hidden" name="bookid" value="<%=Id %>">
          <input type="submit" name="Submit" value="购 买" onclick="return(check());">
          <input type="reset" name="Reset" value="取 消">
        </td>
      </tr>
	   <tr align="center"> 
        <td><a href="#" onclick="openScript('showgoods.jsp?bookid=<%= Id %>','show',400,450)" >查看详细资料</a> </td>
      </tr>   
  </table>
   </form>
<% } %>
  <br>
  <p><a href="javascript:window.close()">关闭窗口</a></p>
 <jsp:include flush="true" page="bottom.jsp"></jsp:include>
  
</div>
</body>
</html>
