<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import="java.util.*" %>
<%@ page import="org.pan.web.book.goodsclass" %>
<%@ page session="true" %>
<jsp:useBean id="classlist" scope="page" class="org.pan.web.goodsclasslist" />
<html>
<head>
<title>电子商务　首页</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<link rel="stylesheet" href="books.css" type="text/css">
</head>

<body  text="#000000">
<div align="center">
  <table width="592" border="0" cellspacing="1" cellpadding="1">
    <tr> 
      
      <td align="center"><img src="images/baners2.jpg" width="592" ></td>
 
    </tr>
  </table>

<table width="592" border="0" cellspacing="1" cellpadding="1">
  <tr>
      <td width="100">&nbsp;</td>
      <td width="100"><a href="goodslist.jsp">在线购物</a></td>
      <td width="100"><a href="shoperlist.jsp">我的购物车</a></td> 
      <td align="center" width="80">
        <a href="manage/login.jsp">管理员登陆</a></td>
	  <td align="right">当前时间:<%= (new java.util.Date()).toLocaleString() %> &nbsp;</td>
  </tr>
</table>
  <table width="592" border="0" cellspacing="1" cellpadding="1">
    <tr valign="top"> 
      <td width="186">  本店商品分类：<marquee direction="up" scrollamount=3>
     
        <table width="100%" border="0" cellspacing="1" cellpadding="1">
          <tr> 
            <td width="20">&nbsp;</td>
            <td></td>
          </tr>
          <% if (classlist.excute()){
				for (int i=0;i<classlist.getClasslist().size();i++){
					goodsclass bc = (goodsclass) classlist.getClasslist().elementAt(i); %>	
          <tr> 
            <td width="20">&nbsp;</td>
            <td><a href="goodslist.jsp?classid=<%= bc.getId()%>"><%= bc.getClassName() %></a></td>
          </tr>
          <%		}	}%>
	
          <tr> 
            <td width="20">&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
        </table></marquee>
       <p>友情链接：</p>
       <p><img src="images/icon1.jpg"  ></p>
         <p><img src="images/icon2.jpg" ></p>
      </td>
      <td width="387">本店商品精品 
        <table width="95%" border="0" cellspacing="1" cellpadding="1">
          <tr> 
            <td rowspan="2" align="center" width="49%"><img src="images/ecommernce_thumb.jpg" width="126" height="97"></td>
            <td width="51%">电子商务精品推荐</td>
          </tr>
          <tr> 
            <td width="51%"> 质优价廉<br>
              款到发货 </td>
          </tr>
          <tr> 
            <td colspan="2"> 
              <p>电子商务简介：

电子商务是信息社会的产物，具体地说是Internet的产物。没有计算机网络就不会有电子商务。

电子商务源于英文ELECTRONIC COMMERCE，简写为EC。顾名思义，其内容包含两个方面，一是电子方式，二是商贸活动。
中国电信电子商务是指利用TCP/IP公众网络和技术进行的在线交易和商务作业活动。
涉及对象包括：金融机构、商家、生产企业、网络服务提供商、 个人用户、政府部门和事业单位等。
			  </p>

            </td>
          </tr>
        </table>
        <p>&nbsp;</p>
      </td>
      <td width="210" align="center"> <br>
        <form name="form1" method="post" action="login.jsp">
          用户登录 
          <table width="100%" border="0" cellspacing="1" cellpadding="1">
            <tr> 
              <td align="right" width=50>用户名：</td>
              <td> 
                <input type="text" name="username" size="10" maxlength="25">
              </td>
            </tr>
            <tr> 
              <td align="right"width=50>密 码：</td>
              <td> 
                <input type="password" name="passwd" size="10" maxlength="25">
              </td>
            </tr>
          
            <tr> 
              <td colspan="2" align="center"> 
                <input type="submit" name="Submit" value="登录">
                <input type="reset" name="Submit2" value="取消">
              </td>
            </tr>
            <tr> 
              <td colspan="2">如果不是本站会员,请在此<a href="reg.jsp">注册</a>。</td>
            </tr>
          </table>
        </form>
        <p>&nbsp;</p>
       <p><img src="images/icon.png" width="120" height="60"></p>
        </td>
    </tr>
  </table>
 <jsp:include flush="true" page="bottom.jsp"></jsp:include>
  
</div>
</body>
</html>
