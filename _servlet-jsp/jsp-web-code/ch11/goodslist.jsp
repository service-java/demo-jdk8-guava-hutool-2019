<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import="java.util.*" %>
<%@ page import="org.pan.web.book.goodsclass" %>
<%@ page session="true" %>
<%@ page import="org.pan.web.book.goods"%>
<jsp:useBean id="book" scope="page" class="org.pan.web.book.goods" />
<jsp:useBean id="book_list" scope="page" class="org.pan.web.goodsmn" />
<jsp:useBean id="classlist" scope="page" class="org.pan.web.goodsclasslist" />
<%
int pages=1;
String mesg = "";

if (request.getParameter("page")!=null && !request.getParameter("page").equals("")) {
	String requestpage = request.getParameter("page");	
	try {
		pages = Integer.parseInt(requestpage);
	} catch(Exception e) {
		mesg = "你要找的页码错误!";
	}
	book_list.setPage(pages);
}
String classid = request.getParameter("classid");
String classname ="";
String keyword = request.getParameter("keyword");
if (classid==null) classid="";
if (keyword==null) keyword="";
keyword = book_list.getGbk(keyword);
%>

<html>
<head>
<title>电子商务　选购商品</title>
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
  <table width="750" border="0" cellspacing="1" cellpadding="1">
    <tr> 
      <td align="center"><img src="images/baners2.jpg" width="592" ><br></td>    
   
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
      <td width="186"> 
        <table width="100%" border="0" cellspacing="1" cellpadding="1">
          <tr> 
           
            <td>本店商品分类：</td>
          </tr>
          <% if (classlist.excute()){
				for (int i=0;i<classlist.getClasslist().size();i++){
					goodsclass bc = (goodsclass) classlist.getClasslist().elementAt(i); 
					if ( classid.equals(Integer.toString(bc.getId())) ) classname=bc.getClassName();
					%>
          <tr> 
          
            <td><a href="goodslist.jsp?classid=<%= bc.getId()%>"><%= bc.getClassName() %></a></td>
          </tr>
          <%		}			
		} %>
          <tr> 
           
            <td>&nbsp;</td>
          </tr>
        </table>
		 <p>友情链接：</p>
       <p><img src="images/icon1.jpg"  ></p>
         <p><img src="images/icon2.jpg" ></p>
      </td>
      <td align="center"> 
      <form name=form1 METHOD=POST ACTION="goodslist.jsp">
      <table width="100%" border="0" cellspacing="1" cellpadding="1">
		  
          <tr> 
            <td align=center><b>商品查询：</b></td>
          </tr>
		  <tr> 
            <td>关键字：<INPUT TYPE="text" NAME="keyword" size=8 maxlength=40 value="<%= keyword %>">
        
		 类别:
		    <SELECT NAME="classid">
				<option value="">所有类别</option>			
		 
		  <%
				for (int i=0;i<classlist.getClasslist().size();i++){
					goodsclass bc = (goodsclass) classlist.getClasslist().elementAt(i); %>		    
            <option value="<%= bc.getId()%>"><%= bc.getClassName() %></option>
          <%		}			
%></SELECT>
		   <INPUT TYPE="submit" name="submit" value="查询" ></td>
          </tr>		  		 
        </table>
         </form>
        <p><br>
        
          <b><font color="#0000FF">电子商务商品<%= classname %>列表</font></b></p>
		  <%if (!keyword.equals("")) out.println("<p ><font color=#ff0000>你要查找关于&nbsp;" + keyword + "&nbsp;的商品如下</font></p>"); %>
        <table width="100%" border="1" cellspacing="1" cellpadding="1" bordercolor="#CC9966">
          <tr align="center"> 
            <td>商品名称</td>
            <td>销售员</td>
            <td>商品类别</td>
            <td>生产商</td>
            <td>单价</td>
            <td width=110>选择</td>
          </tr>
<% if (book_list.execute(request)) {
	if (book_list.getGoodslist().size()>0 ){
		for (int i=0;i<book_list.getGoodslist().size();i++){
			goods bk = (goods) book_list.getGoodslist().elementAt(i);%>
          <tr>
            <td><%= bk.getGoodsName() %></td>
            <td align="center"><%= bk.getAuthor() %></td>
            <td align="center"><%= bk.getClassname() %></td>
            <td align="center"><%= bk.getPublish() %></td>
            <td align="center"><%= bk.getPrince() %>元</td>
            <td align="center"><a href="#" onclick="openScript('purchase.jsp?bookid=<%= bk.getId() %>','pur',300,250)" >购买</a>&nbsp;
			<a href="#" onclick="openScript('showgoods.jsp?bookid=<%= bk.getId() %>','show',400,450)" >详细资料</a></td>
          </tr>
<%		} 
	}else { 
		if (keyword.equals("")){
			out.println("<tr><td align='center' colspan=6>&nbsp;暂时没有此类商品资料</td></tr>");
		} else {
			out.println("<tr><td align='center' colspan=6>&nbsp;没有你要查找的&nbsp;" + keyword + "&nbsp;相关商品</td></tr>")	;
		}
	}
} else {%>
          <tr>            
            <td align="center" colspan=6>&nbsp;数据库出错，请稍后</td>
            
          </tr>
<% } %>

        </table>
        <table width="90%" border="0" cellspacing="1" cellpadding="1">
          <tr>
            <td align="right">总计结果为<%= book_list.getRecordCount() %>条，当前页第<%= book_list.getPage() %>页　<a href="goodslist.jsp?classid=<%= classid%>&keyword=<%= keyword %>">首页</a>&nbsp; 
              <% if (book_list.getPage()>1) {%>
              <a href="goodslist.jsp?page=<%= book_list.getPage()-1 %>&classid=<%= classid%>&keyword=<%= keyword %>">上一页</a>&nbsp; 
              <% } %>
              <% if (book_list.getPage()<book_list.getPageCount()-1) {%>
              <a href="goodslist.jsp?page=<%= book_list.getPage()+1 %>&classid=<%= classid%>&keyword=<%= keyword %>">下一页</a>&nbsp; 
              <% } %>
              <a href="goodslist.jsp?page=<%= book_list.getPageCount() %>&classid=<%= classid%>&keyword=<%= keyword %>">未页</a>&nbsp;</td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
 <jsp:include flush="true" page="bottom.jsp"></jsp:include>
  
</div>
</body>
</html>
<% book_list.close();%>