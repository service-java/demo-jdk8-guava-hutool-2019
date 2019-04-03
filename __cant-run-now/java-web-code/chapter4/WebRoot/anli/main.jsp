<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户信息管理系统</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/JavaScript"> 
var $=function(id) {
   return document.getElementById(id);
}

function show_menu(num){
for(i=0;i<100;i++){
	if($('li0'+i)){
	$('li0'+i).style.display='none';
	$('f0'+i).className='';
	 }
}
	  $('li0'+num).style.display='block';//触发以后信息块
	  $('f0'+num).className='left02down01_xia_li';//触发以后TAG样式
}

function show_menuB(numB){
	for(j=0;j<100;j++){
		 if(j!=numB){
			if($('Bli0'+j)){
		  $('Bli0'+j).style.display='none';
		  $('Bf0'+j).style.background='url(images/01.gif)';
		}
		 }
	}
	if($('Bli0'+numB)){   
		if($('Bli0'+numB).style.display=='block'){
		  $('Bli0'+numB).style.display='none';
		 $('Bf0'+numB).style.background='url(images/01.gif)';
		}else {
		  $('Bli0'+numB).style.display='block';
		  $('Bf0'+numB).style.background='url(images/02.gif)';
		}
	}
}


var temp=0;
function show_menuC(){
		if (temp==0){
		 document.getElementById('LeftBox').style.display='none';
	  	 document.getElementById('RightBox').style.marginLeft='0';
		 document.getElementById('Mobile').style.background='url(images/center.gif)';

		 temp=1;
		}else{
		document.getElementById('RightBox').style.marginLeft='222px';
	   	document.getElementById('LeftBox').style.display='block';
		document.getElementById('Mobile').style.background='url(images/center0.gif)';

	   temp=0;
			}
	 }
</script>
</head>

<body>
<div class="header">
	<div class="header03"></div>
	<div class="header01"></div>
	<div class="header02">用户信息管理系统</div>
</div>
<div class="left" id="LeftBox">
	<div class="left01">
		<div class="left01_right"></div>
		<div class="left01_left"></div>
		<div class="left01_c">准考证号：<%=session.getAttribute("userid") %></div>
	</div>
	<div class="left02">
		<div class="left02top">
			<div class="left02top_right"></div>
			<div class="left02top_left"></div>
			<div class="left02top_c">用户信息管理</div>
		</div>
	  <div class="left02down">
			<div class="left02down01"><a  onclick="show_menuB(80)" href="javascript:;"><div id="Bf080" class="left02down01_img"></div>用户信息查询</a></div>
			<div class="left02down01_xia noneBox" id="Bli080">
				<ul>
					<li onmousemove="show_menu(10)" id="f010"><a href="#">&middot;精确查询</a></li>
					<li onmousemove="show_menu(11)" id="f011"><a href="#">&middot;组合条件查询</a></li>
				</ul>
			</div>
		    <div class="left02down01"><a onclick="show_menuB(81)" href="javascript:;">
		      <div id="Bf081" class="left02down01_img"></div>
		      用户密码管理</a></div>
			<div class="left02down01_xia noneBox" id="Bli081">
				<ul>
					<li onmousemove="show_menu(12)" id="f012"><a href="#">&middot;找回密码</a></li>
					<li onmousemove="show_menu(13)" id="f013"><a href="#">&middot;更改密码</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="left02">
		<div class="left02top">
			<div class="left02top_right"></div>
			<div class="left02top_left"></div>
			<div class="left02top_c">用户分析</div>
		</div>
		<div class="left02down">
			<div class="left02down01"><a  onclick="show_menuB(82)" href="javascript:;"><div id="Bf082" class="left02down01_img"></div>用户注册统计</a></div>
			<div class="left02down01"><a href="#"><div class="left02down01_img"></div>用户登录统计</a></div>
			<div class="left02down01"><a href="#"><div class="left02down01_img"></div>用户激活统计</a></div>
		</div>
	</div>
	<div class="left02">
		<div class="left02top">
			<div class="left02top_right"></div>
			<div class="left02top_left"></div>
			<div class="left02top_c">用户过滤</div>
		</div>
		<div class="left02down">
			<div class="left02down01"><a href="#"><div class="left02down01_img"></div>过滤IP(段)</a></div>
			<div class="left02down01"><a href="#"><div class="left02down01_img"></div>过滤用户名</a></div>
		</div>
	</div>
	<div class="left02">
		<div class="left02top">
			<div class="left02top_right"></div>
			<div class="left02top_left"></div>
			<div class="left02top_c">系统管理</div>
		</div>
		<div class="left02down">
			<div class="left02down01"><a href="#"><div class="left02down01_img"></div>权限管理</a></div>
			<div class="left02down01"><a href="#"><div class="left02down01_img"></div>用户组管理</a></div>
			<div class="left02down01"><a href="#"><div class="left02down01_img"></div>操作日志</a></div>
		</div>
	</div>
	<div class="left01">
		<div class="left03_right"></div>
		<div class="left01_left"></div>
		<div class="left03_c">安全退出</div>
	</div>
</div>
<div class="rrcc" id="RightBox">
	<div class="center" id="Mobile" onclick="show_menuC()"></div>
	<div class="right" id="li010">
        <h1> 在线考试系统</h1>
          <%
		if(session.getAttribute("userid")!=null){
  %>
  	欢迎 <%=session.getAttribute("userid") %> 考生进入在线考试系统！
  	<hr>
  <form action="result.jsp" method="post">
  <h3>一、单选题(每题5分)</h3>
   	1.西游记的作者是（）。<br>
   	<input type="radio" name="thor" value="A">A、曹雪芹
   	<input type="radio" name="thor" value="B">B、罗贯中
   	<input type="radio" name="thor" value="C">C、吴承恩
   	<input type="radio" name="thor" value="D">D、司马迁
   	<h3>二、多选题（每项5分，多选或错选0分）</h3>
   	2.下列属于中国四大发明的是（）。<br>
   	<input type="checkbox" name="poem" value="A">A、指南针
   	<input type="checkbox" name="poem" value="B">B、蒸汽机
   	<input type="checkbox" name="poem" value="C">C、火药
   	<input type="checkbox" name="poem" value="D">D、自行车<br>
   	<input type="checkbox" name="poem" value="E">E、印刷术
   	<input type="checkbox" name="poem" value="F">F、造纸
   	<input type="checkbox" name="poem" value="G">G、算盘
   	<input type="checkbox" name="poem" value="H">H、望远镜	<br>
   	<input type="submit" value="提交试卷">
   	</form>
   	<%
		}else{
	%>
	<center style="margin-top: 20px">
  	对不起，您还没有登录， 请先<a href="index.jsp">登录</a>！<br>
    </center>
	<%} %>
        
	</div>
	
</div>



	

</body>
</html>
 