<%@ page contentType="text/html;charset=utf-8" language="java" %>

<html>
<head>
	<title>聊天室</title>
	<link href="css/style.css" rel="stylesheet">
</head>	
<body>

<br>
<form name="form1" method="post" action="login.jsp" onSubmit="return check()">
    <table id="login_table">
      <tr>
        <td height="121" colspan="3" class="word_dark">&nbsp;</td>
      </tr>
      <tr>
        <td width="53" align="center" valign="top" class="word_dark">&nbsp;</td>
        <td width="216" align="center" valign="top" class="word_dark">用户名：
			<input type="text" name="username"></td>
        <td width="94" valign="top" class="word_dark">
        	<input type="image" name="imageField" src="images/go.jpg"></td>
      </tr>
	</table>		
</form>

<script>
function check(){
	if(form1.username.value==""){
		alert("请输入用户名！");
		form1.username.focus();
		return false;	
	}
}
</script>
</body>
</html>
