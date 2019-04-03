<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" %>
<% request.setCharacterEncoding("utf-8"); %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>聊天室</title>
	<link href="css/style.css" rel="stylesheet">
</head>
<body onload ="showContent();showOnline();">

<table width="778" height="148" background="images/top.jpg">
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>

<table width="778" height="276">
  <tr>
    <td width="165" valign="top" bgcolor="#FDF7E9" id="online" style="padding:5px">在线人员列表</td>
    <td width="613" valign="top" bgcolor="#FFFFFF" id="content" style="padding:5px">聊天内容</td>
  </tr>
</table>

<table width="778" border="0" bordercolor="#D6D3CE" bgcolor="#D39800">
<form action="send.jsp" name="form1" method="post" onSubmit="return check()">
  <tr>
    <td height="30" align="left">&nbsp;</td>
    <td height="37" align="left">[<%=session.getAttribute("username")%> ]对
      <input name="tempuser" type="text" value="" size="35" readonly="readonly">
表情
<select name="select" class="wenbenkuang">
  <option  value="无表情的">无表情的</option>
  <option value="微笑着" selected>微笑着</option>
  <option value="笑呵呵地">笑呵呵地</option>
</select>
说： </td>
    <td width="163" align="left"> &nbsp;&nbsp;字体颜色：
      <select name="color" size="1" class="wenbenkuang" id="select">
        <option selected>默认颜色</option>
        <option style="color:#FF0000" value="FF0000">红色热情</option>
        <option style="color:#0000FF" value="0000ff">蓝色开朗</option>
        <option style="color:#009900" value="009900">绿色青春</option>
      </select></td>
    <td width="19" align="left">&nbsp;</td>
  </tr>
  <tr>
    <td width="21" height="30" align="left">&nbsp;</td>
    <td width="575" align="left"><input name="message" type="text" size="70">
      <input name="Submit2" type="submit" class="btn_blank" value="发送"></td>
    <td align="right"><input name="button_exit" type="button" class="btn_orange" value="退出聊天室" onClick="Exit()"></td>
    <td align="center">&nbsp;</td>
  </tr>
  <tr>
    <td height="30" align="left">&nbsp;</td>
    <td colspan="2" align="center" class="word_dark">&nbsp;All CopyRights reserved 2008</td>
    <td align="center">&nbsp;</td>
  </tr>
</form>
</table>


<script src="js/AjaxRequest.js"></script>
<script>
// 周期定时器
window.setInterval("showContent();",1000); 
window.setInterval("showOnline();",10000); 

//此处需要加&nocache="+new Date().getTime()，否则将出现在线人员列表不更新的情况
function showOnline(){
	var loader = new net.AjaxRequest("online.jsp?nocache="
			 + new Date().getTime(),deal_online,onerror,"GET");
}

function showContent(){
	var loader1 = new net.AjaxRequest("content.jsp?nocache="
			+ new Date().getTime(),deal_content,onerror,"GET");
}

function onerror(){
	alert("很抱歉，服务器出现错误，当前窗口将关闭！");
	window.opener = null;
	window.close();
}

function deal_online(){
	online.innerHTML = this.req.responseText;
}

function deal_content(){
	content.innerHTML=this.req.responseText;
}


/*
	function check(){	//验证聊天信息
		if(form1.tempuser.value==""){
			alert("请选择聊天对象！");return false;
		}
		if(form1.message.value==""){
			alert("发送信息不可以为空！");form1.message.focus();return false;
		}
	}
	function Exit(){
		window.location.href="leave.jsp";
		alert("欢迎您下次光临！");
	}
*/


function set(selectPerson){	//自动添加聊天对象
	if(selectPerson!="<%=session.getAttribute("username")%>"){
		form1.tempuser.value=selectPerson;
	}else{
		alert("请重新选择聊天对象！");
	}
}


window.onbeforeunload=function(){   //当用户单击浏览器中的“关闭”按钮时，执行退出操作
	if(event.clientY<0 && event.clientX>document.body.scrollWidth){  
	 	Exit();		//执行退出操作
	}   
}   
</script> 

</body>
</html>
