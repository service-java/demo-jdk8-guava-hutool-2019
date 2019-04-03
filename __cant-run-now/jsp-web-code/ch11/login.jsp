<%@ page contentType="text/html; charset=gb2312" %>
<%@ page session="true" %>
<jsp:useBean id="alogin" scope="page" class="org.pan.web.login" />
<%
String mesg = "";

if( request.getParameter("username")!=null && !request.getParameter("username").equals("")){
	String username =request.getParameter("username");
	String passwd = request.getParameter("passwd");
	username = new String(username.getBytes("ISO8859-1"));
	passwd = new String(passwd.getBytes("ISO8859-1"));
	alogin.setUsername(username);
	alogin.setPasswd(passwd);

	if (alogin.excute()){
		session.setAttribute("username",username);
		String userid = Long.toString(alogin.getUserid());
		session.setAttribute("userid",userid);
		response.sendRedirect("userinfo.jsp");
		%>
<%	
	}else {
	mesg = "登录出错！"	;
	}
}
%>

<html>
<head>
<title>电子商务--用户登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<script language="javascript">

 function checkform() {
	if (document.form1.username.value=="" || document.form1.passwd.value==""){
		alert("用户名或密码为空！");
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
     <td align="center"><img src="images/baners2.jpg" width="592" ></td>
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
  <p>电子商务用户登录</p><% if (!mesg.equals("")){
						out.println("<p>" + mesg + "</p>");}%>
  <form name="form1" method="post" action="login.jsp">
    <table width="400" border="0" cellspacing="1" cellpadding="1">
    <tr> 
      <td width="147" align="right">用户名：<br>
      </td>
      <td width="246" valign="top">
          <input type="text" name="username" size="16" maxlength="25">
        </td>
    </tr>
    <tr> 
      <td width="147" align="right">密码：</td>
      <td width="246" valign="top">
          <input type="password" name="passwd" maxlength="20" size="16">
        </td>
    </tr>
  <tr>
      <td width="147" align="right">&nbsp;</td>
      <td width="246" valign="top">
          <input type="submit" name="Submit" value="登录" onclick="javascript:return(checkform());">
          <input type="reset" name="Submit2" value="取消">
        </td>
    </tr>
    <tr> 
      <td colspan="2" align="center">
        <p>&nbsp;</p>
        <p>如果你还不是本站用户，请在此<a href="reg.jsp">注册</a></p>
      </td>
    </tr>
  </table>
    </form>
  <p>&nbsp;</p> <jsp:include flush="true" page="bottom.jsp"></jsp:include>
  
</div>
</body>
</html>
