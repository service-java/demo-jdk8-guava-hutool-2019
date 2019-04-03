<%@ page contentType="text/html; charset=gb2312" %>
<%@ page session="true" %>
<%
if (session.getAttribute("admin")==null || session.getAttribute("admin")==""){
	response.sendRedirect("error.htm");
} %>
<%@ page import="org.pan.web.book.goods"%>
<jsp:useBean id="goods_list" scope="page" class="org.pan.web.goodsmn" />
<%
int pages=1;
String mesg = "";

if (request.getParameter("action")!=null && request.getParameter("action").equals("del")){
	try {
		int delid = Integer.parseInt(request.getParameter("id"));
		if (goods_list.delete(delid)){
			mesg = "删除成功！";
		} else {
			mesg = "删除出错！";
		}
	} catch (Exception e){
		mesg = "你要删除的对象错误!";
	}
}

if (request.getParameter("page")!=null && !request.getParameter("page").equals("")) {
	String requestpage = request.getParameter("page");	
	try {
		pages = Integer.parseInt(requestpage);
	} catch(Exception e) {
		mesg = "你要找的页码错误!";
	}
}


%>
<html>
<head>
<title>电子商务管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<script language="javascript">
function openScript(url,name, width, height){
	var Win = window.open(url,name,'width=' + width + ',height=' + height + ',resizable=1,scrollbars=yes,menubar=no,status=yes' );
}
</script>
<link rel="stylesheet" href="books.css" type="text/css">
</head>

<body text="#000000">
<div align="center">
  <table width="100%" border="0" cellspacing="2" cellpadding="2">
    <tr> 
      
      <td colspan=2 align="center" ><img src="../images/backlogo.jpg" ></td>
    </tr>
    <tr>
      <td align="center" width="23%" valign="top"> 
        <jsp:include flush="true" page="list.jsp"></jsp:include>
      </td>
      <td align="center" width="77%">
        <p>&nbsp;<% if (!mesg.equals("")) out.println(mesg);%></p>
        <p>电子商务当前商品情况:</p>
        <table width="90%" border="1" cellspacing="2" cellpadding="2" bordercolor=#CC0000>
          <tr align="center"> 
            <td>编号</td>
            <td>商品名</td>
            <td>销售员</td>
            <td>类别</td>
            <td>单价</td>
            <td>总数量</td>
            <td>剩余数</td>
            <td>动作</td>
          </tr>
<% if (goods_list.execute(request)) {
	for (int i=0;i<goods_list.getGoodslist().size();i++){
		goods bk = (goods) goods_list.getGoodslist().elementAt(i);
%>
          <tr> 
            <td align="center"><%=bk.getId() %></td>
            <td><a href="#" onclick="openScript('showgoods.jsp?bookid=<%= bk.getId() %>','sbook',450,500);"><%= bk.getGoodsName() %></a></td>
            <td align="center"><%= bk.getAuthor() %></td>
            <td align="center"><%= bk.getClassname() %></td>
            <td align="center"><%= bk.getPrince() %></td>
            <td align="center"><%= bk.getAmount() %></td>
            <td align="center"><%= bk.getLeav_number() %></td>
            <td align="center"><a href="modigoods.jsp?id=<%= bk.getId() %>">修改</a>&nbsp;&nbsp;<a href="goodslist.jsp?action=del&page=<%= pages %>&id=<%= bk.getId() %>" onclick="confirm('真的要删除吗');">删除</a></td>
          </tr>
<% }
} else {%>
          <tr> 
            <td align="center" colspan=8>&nbsp;网站正在维护中，请稍后......</td>
            
          </tr>
<% } %>
        </table>
        <br>
        <table width="85%" border="0" cellspacing="1" cellpadding="1">
          <tr>
            <td align="right">当前页第<%= goods_list.getPage() %>页　<a href="goodslist.jsp">首页</a>&nbsp;
	<% if (goods_list.getPage()>1) {%><a href="goodslist.jsp?page=<%= goods_list.getPage()-1 %>">上一页</a>&nbsp;<% } %>
	<% if (goods_list.getPage()<goods_list.getPageCount()-1) {%><a href="goodslist.jsp?page=<%= goods_list.getPage()+1 %>">下一页</a>&nbsp;<% } %>
				<a href="goodslist.jsp?page=<%= goods_list.getPageCount() %>">未页</a>&nbsp;</td>
          </tr>
        </table>
        <p>&nbsp;</p>
      </td>
    </tr>
  </table>
  <br>
  <jsp:include flush="true" page="..\bottom.jsp"></jsp:include>
  
</div>
</body>
</html>
<% goods_list.close();%>