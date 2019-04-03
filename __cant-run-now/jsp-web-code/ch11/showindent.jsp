<%@ page contentType="text/html; charset=gb2312" %>
<%@ page session="true" %>
<%
String username = (String)session.getAttribute("username");
if ( username == null || username.equals("") ){
	response.sendRedirect("login.jsp?msg=nologin");
}
%>
<%@ page import="org.pan.web.book.goods" %>
<%@ page import="org.pan.util.strFormat" %>
<%@ page import="org.pan.web.book.indentlist" %>
<%@ page import="org.pan.web.book.goods" %>
<jsp:useBean id="myIndentlist" scope="page" class="org.pan.web.purchase" />
<jsp:useBean id="mybook" scope="page" class="org.pan.web.goodsmn" />
<%
String mesg = "";
long Id=0;
String indentNo = request.getParameter("orderno");
if (indentNo==null) indentNo="";
if (request.getParameter("id")==null || request.getParameter("id").equals("")) {
		mesg = "你要查看的订单清单不存在！";
} else {
	try {
		Id = Long.parseLong(request.getParameter("id"));
		if (!myIndentlist.getIndentList(Id)){
			mesg = "你要查看的订单清单不存在！";
		}
	} catch (Exception e){
		mesg = "你要查看的订单清单不存在！";
	}
}

%>

<html>
<head>
<title>极限空间电子商务　查看订购清单资料</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<link rel="stylesheet" href="books.css" type="text/css">
</head>

<body  text="#000000" onload="javascript:window.focus();" >
<div align="center">
  
  <% if(!mesg.equals("")){
		out.println(mesg);
	  } else {
	%>
		<p>电子商务商品订单<%= indentNo %>&nbsp;清单:</p>
          <table width="95%" border="1" cellspacing="1" cellpadding="1" bordercolor="#CC9966">
          <tr align="center"> 
            <td>商品名称</td>
            <td>销售员</td>
            <td>商品类别</td>
            <td>单价(元)</td>
            <td>数量</td>
          </tr>
	<%
	for (int i=0; i<myIndentlist.getIndent_list().size();i++){
		indentlist idList = (indentlist) myIndentlist.getIndent_list().elementAt(i);
		if (mybook.getOnebook((int)idList.getGoodsNo()) ){
			goods bk = (goods) mybook.getGoodslist().elementAt(0);		
	%>	  
	      <tr align="center"> 
            <td><%= bk.getGoodsName() %></td>
            <td><%= bk.getAuthor() %></td>
            <td><%= bk.getClassname() %></td>
            <td><%= bk.getPrince() %></td>
            <td><%= idList.getAmount() %></td>
          </tr>
	<%
		}
	}%>
		</table>
<% } %>
  <br><p><a href="javascript:window.close()">关闭窗口</a></p>
 <jsp:include flush="true" page="bottom.jsp"></jsp:include>
  
</div>
</body>
</html>
<%mybook.close();%>