<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import="java.util.*" %>
<%@ page import="org.pan.web.book.goodsclass" %>
<%@ page session="true" %>
<%@ page import="org.pan.web.book.goods"%>
<%@ page import="org.pan.web.goodsmn" %>
<%@ page import="org.pan.web.book.indentlist" %>
<jsp:useBean id="book_list" scope="page" class="org.pan.web.goodsmn" />
<jsp:useBean id="classlist" scope="page" class="org.pan.web.goodsclasslist" />
<jsp:useBean id="shop" scope="page" class="org.pan.web.purchase" />

<% 
String userid = (String) session.getAttribute("userid");
if ( userid == null )
	userid = "";
String modi = request.getParameter("modi");
String del = request.getParameter("del");
String payoutCar = request.getParameter("payout");
String clearCar = request.getParameter("clear");
String mesg = "";

if (modi!=null && !modi.equals("")) {
	if ( !shop.modiShoper(request) ){
		if (shop.getIsEmpty())
			mesg = "你要的修改购买的商品数量不足你的购买数量!";
		else
			mesg = "修改购买数量出错！";
	} else {
		mesg = "修改成功";
	}

}else if ( del != null && !del.equals("") ) {
	if ( !shop.delShoper(request) ) {
		mesg = "删除清单中的商品时出错！" ;
	}
}else if (payoutCar != null && !payoutCar.equals("") ) {
	if (shop.payout(request) ) {
		mesg = "你的购物车中的物品已提交给本店，你的订单号为 "+ shop.getIndentNo() + "<br>请及时付款，以便我们发货!";
		session.removeAttribute("shopcar");
	} else {
		if(!shop.getIsLogin())
			mesg = "你还没有登录，请先<a href=login.jsp>登录</a>后再提交";
		else
			mesg = "对不起，提交出错，请稍后重试"; 
	}	
} else if (clearCar != null && ! clearCar.equals("") ) {
	session.removeAttribute("shopcar");
	mesg = "购物车中的物品清单已清空";
}


%>

<html>
<head>
<title>电子商务--我的购物车</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<script language="javascript">

function openScript(url,name, width, height){
	var Win = window.open(url,name,'width=' + width + ',height=' + height + ',resizable=1,scrollbars=yes,menubar=no,status=yes' );
}
function checklogin() {
	if (document.payout.userid.value=="")
	{
		alert("你还没有登录，请登录后再提交购物清单地。");
		return false;
	}
	return true;
}

function check()
{
	if (document.change.amount.value<1){
		alert("你的购买数量有问题");
		document.change.amount.focus();
		return false;
	}
	return true;
}

</script>
<link rel="stylesheet" href="books.css" type="text/css">
</head>

<body  text="#000000">
<div align="center">
  <table width="750" border="0" cellspacing="1" cellpadding="1">
    <tr> 
      <td align="center"><img src="images/baners2.jpg" width="592" ></td>
    </tr>
  </table>

  <table width="592" border="0" cellspacing="1" cellpadding="1">
    <tr> 
      <td width="100">&nbsp;</td>
      <td width="55"><a href="index.jsp">首页</a></td>
      <td width="100"><a href="goodslist.jsp">在线购物</a></td>
      <td width="100"><a href="shoperlist.jsp">我的购物车</a></td>
      <td width="100"><a href="userinfo.jsp">用户信息</a></td>
      <%  String username = (String)session.getAttribute("username");
if ( username == null || username.equals("") ){%>
      <td><a href="login.jsp">用户登录</a></td>
      <%}else { %>
      <td><a href="logout.jsp">用户退出</a></td>
      <%} %>
    </tr>
  </table>
  <table width="592" border="0" cellspacing="1" cellpadding="1">
    <tr valign="top"> 
      <td width="150"> 
        <table width="100%" border="0" cellspacing="1" cellpadding="1">
          <tr> 
         
            <td>本店商品分类：</td>
          </tr>
  <% if (classlist.excute()){
		for (int i=0;i<classlist.getClasslist().size();i++){
			goodsclass bc = (goodsclass) classlist.getClasslist().elementAt(i); %>
          <tr> 
           
            <td><a href="goodslist.jsp?classid=<%= bc.getId()%>"><%= bc.getClassName() %></a></td>
          </tr>
  <%	}			
  }%>
          <tr> 
       
            <td>&nbsp;</td>
          </tr>
        </table>
        <p>友情链接：</p>
       <p><img src="images/icon1.jpg"  ></p>
         <p><img src="images/icon2.jpg" ></p>
      </td>
      <td align="center"> 
        <p><br>
         <b><font color="#0000FF">我的购物车物品清单</font></b></p>
<%
if (!mesg.equals("") )
	out.println("<p ><font color=#ff0000>" + mesg + "</font></p>");

Vector shoplist = (Vector) session.getAttribute("shopcar");
if (shoplist==null || shoplist.size()<0 ){
	if (mesg.equals(""))
		out.println("<p><font color=#ff0000>你还没有选择购买商品！请先购买</font></p>");
} else {
%>
       <table width="100%" border="1" cellspacing="1" cellpadding="1" bordercolor="#CC9966">
          <tr align="center"> 
            <td>商品名称</td>
            <td>销售员</td>
            <td>商品类别</td>
            <td>单价(元)</td>
            <td>数量</td>
            <td colspan =2>选择</td>
          </tr>
	<% 
	float totalprice =0;
	int totalamount = 0;
	for (int i=0; i<shoplist.size();i++){
		indentlist iList = (indentlist) shoplist.elementAt(i);	
		if (book_list.getOnebook((int)iList.getGoodsNo())) {
			goods bk = (goods) book_list.getGoodslist().elementAt(0);
			totalprice = totalprice + bk.getPrince() * iList.getAmount();
			totalamount = totalamount + iList.getAmount();
	%>
          <tr>
            <td><%= bk.getGoodsName() %></td>
            <td align="center"><%= bk.getAuthor() %></td>
            <td align="center"><%= bk.getClassname() %></td>
            <td align="center"><%= bk.getPrince() %></td>
		    <form name="change" method="post" action="shoperlist.jsp">
            <td align="center">
              <input type="text" name="amount" maxlength="4" size="3" value="<%= iList.getAmount() %>" >			  
            </td>
            <td align="center" width=55 >
			<input type="hidden" name="bookid" value="<%= iList.getGoodsNo() %>" >
              <input type="submit" name="modi" value="修改" onclick="return(check());"></td>
              </form>
			<form name="del" method="post" action="shoperlist.jsp">
			 <input type="hidden" name="bookid" value="<%= iList.getGoodsNo() %>" >
			 <td align=center width=55> <input type="submit" name="del" value="删除">
            </td></form>
          </tr>
		<% } 
	} %>  <tr><td colspan=7 align="right"><br>你选择的商品的总金额:<%= totalprice%>元&nbsp;&nbsp;总数量：<%= totalamount%>&nbsp;</td></tr>
        </table>
       <p></p>
       <form name="payout" method="post" action="shoperlist.jsp">
          <table width="90%" border="0" cellspacing="1" cellpadding="1">
            <tr> 
              <td align="right" valign="bottom"> <a href="goodslist.jsp">继续购物</a>&nbsp;
                
				<input type="hidden" name="userid" value="<%= userid %>">
				<input type="hidden" name="totalprice" value="<%= totalprice %>">
				<TEXTAREA NAME="content" ROWS="3" COLS="20">附言：</TEXTAREA><br>
				<input type="submit" name="payout" value="提交我的购物车" onclick="javascript:return(checklogin());">&nbsp;</td></form>
				<form name="form1" method="post" action="shoperlist.jsp">
			  <td valign="bottom">&nbsp;
                <input type="submit" name="clear" value="清空我的购物车">
              </td></form>
            </tr>
          </table>
        </form>
<% } %>
      </td>
    </tr>
  </table>
 <jsp:include flush="true" page="bottom.jsp"></jsp:include>
  
</div>
</body>
</html>
