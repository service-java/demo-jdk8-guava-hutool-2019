<%@ page contentType="text/html; charset=gb2312" %>
<%@ page session="true" %>
<jsp:useBean id="user" scope="page" class="org.pan.web.usermn" />
<%
String mesg = "";
String submit = request.getParameter("Submit");
if (submit!=null && !submit.equals("")) {
	if(user.insert(request)){
		session.setAttribute("username",user.getUserName());
		session.setAttribute( "userid", Long.toString( user.getUserid() ) ); 
		response.sendRedirect("userinfo.jsp?action=regok");
	} else if (!user.getMessage().equals("")) {
		mesg = user.getMessage();
	} else
		mesg = "注册时出现错误，请稍后再试";
}
%>
<html>
<head>
<title>电子商务--用户注册</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<script language="javascript">

function openScript(url,name, width, height){
	var Win = window.open(url,name,'width=' + width + ',height=' + height + ',resizable=1,scrollbars=yes,menubar=no,status=yes' );
}

function checkform() {
	if (document.form1.username.value==""){
		alert("用户名不能为空");
		document.form1.username.focus();
		return false;
	}
	if (document.form1.passwd.value==""){
		alert("用户密码不能为空");
		document.form1.passwd.focus();
		return false;
	}
	if (document.form1.passwd.value!=document.form1.passconfirm.value){
		alert("确认密码不相符！");
		document.form1.passconfirm.focus();
		return false;
	}
	
	return true;
}

</script>
<link rel="stylesheet" href="books.css" type="text/css">
</head>

<body text="#000000">
<div align="center">
  <table width="750" border="0" cellspacing="1" cellpadding="1">
    <tr>      
      <td align="center"><img src="images/baners2.jpg" width="592" height="83"></td>      
        <br>
      </td>
    </tr>
  </table>

  <table width="750" border="0" cellspacing="1" cellpadding="1">
    <tr> 
      <td width="200">&nbsp;</td>
      <td width="55"><a href="index.jsp">首页</a></td>
      <td width="100"><a href="goodslist.jsp">在线购物</a></td>
      <td width="100"><a href="shoperlist.jsp">我的购物车</a></td>
      <td width="100"><a href="userinfo.jsp">用户信息</a></td>
      <td>&nbsp;</td>
    </tr>
  </table>
  <p>您好，电子商务感谢您的支持</p>
  <form name="form1" method="post" action="">
  <%if (!mesg.equals("")) out.println("<p><font color=#ff0000>"+ mesg + "</font></p>");%>
    <table width="450" border="0" cellspacing="1" cellpadding="1">
      <tr> 
        <td colspan="2" align="center"><b><font color="#0000FF">用户注册</font></b></td>
      </tr>
      <tr> 
        <td width="171" align="right">用户名：</td>
        <td width="272"> 
          <input type="text" name="username" maxlength="20" size="14" >
        </td>
      </tr>
      <tr> 
        <td width="171" align="right">密码：</td>
        <td width="272">
          <input type="password" name="passwd" maxlength="20" size="14">
        </td>
      </tr>
      <tr> 
        <td width="171" align="right">确认密码：</td>
        <td width="272">
          <input type="password" name="passconfirm" maxlength="20" size="14">
        </td>
      </tr>
      <tr> 
        <td width="171" align="right">真实姓名：</td>
        <td width="272">
          <input type="text" name="names" maxlength="20" size="14">
        </td>
      </tr>
      <tr> 
        <td width="171" align="right">性别：</td>
        <td width="272">
          <select name="sex">
            <option>男</option>
            <option>女</option>
          </select>
        </td>
      </tr>
      <tr> 
        <td width="171" align="right">联系地址：</td>
        <td width="272">
          <input type="text" name="address" maxlength="150" size="40">
        </td>
      </tr>
	  <tr> 
        <td width="171" align="right">联系邮编：</td>
        <td width="272">
          <input type="text" name="post" maxlength="8" size="8">
        </td>
      </tr>
      <tr> 
        <td width="171" align="right">联系电话：</td>
        <td width="272">
          <input type="text" name="phone" maxlength="25" size="16">
        </td>
      </tr>
      <tr> 
        <td width="171" align="right">电子邮件：</td>
        <td width="272">
          <input type="text" name="email" maxlength="50" size="25">
        </td>
      </tr>
      <tr>
        <td width="171" align="right">&nbsp; </td>
        <td width="272">
          <input type="submit" name="Submit" value="注册" onclick="javascript:return(checkform());">
          <input type="reset" name="reset" value="取消">
        </td>
      </tr>
    </table>  
  </form>
  <p>&nbsp;</p> <jsp:include flush="true" page="bottom.jsp"></jsp:include>
  
</div>
</body>
</html>
<% user.close();  //关闭数据库连接 %>