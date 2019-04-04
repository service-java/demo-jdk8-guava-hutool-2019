<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户信息管理系统</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/JavaScript">
	var $ = function(id) {
		return document.getElementById(id);
	}

	function show_menu(num) {
		for (i = 0; i < 100; i++) {
			if ($('li0' + i)) {
				$('li0' + i).style.display = 'none';
				$('f0' + i).className = '';
			}
		}
		$('li0' + num).style.display = 'block';//触发以后信息块
		$('f0' + num).className = 'left02down01_xia_li';//触发以后TAG样式
	}

	function show_menuB(numB) {
		for (j = 0; j < 100; j++) {
			if (j != numB) {
				if ($('Bli0' + j)) {
					$('Bli0' + j).style.display = 'none';
					$('Bf0' + j).style.background = 'url(images/01.gif)';
				}
			}
		}
		if ($('Bli0' + numB)) {
			if ($('Bli0' + numB).style.display == 'block') {
				$('Bli0' + numB).style.display = 'none';
				$('Bf0' + numB).style.background = 'url(images/01.gif)';
			} else {
				$('Bli0' + numB).style.display = 'block';
				$('Bf0' + numB).style.background = 'url(images/02.gif)';
			}
		}
	}

	var temp = 0;
	function show_menuC() {
		if (temp == 0) {
			document.getElementById('LeftBox').style.display = 'none';
			document.getElementById('RightBox').style.marginLeft = '0';
			document.getElementById('Mobile').style.background = 'url(images/center.gif)';

			temp = 1;
		} else {
			document.getElementById('RightBox').style.marginLeft = '222px';
			document.getElementById('LeftBox').style.display = 'block';
			document.getElementById('Mobile').style.background = 'url(images/center0.gif)';

			temp = 0;
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
			<div class="left01_c">
				准考证号：<%=session.getAttribute("userid")%></div>
		</div>
		<div class="left02">
			<div class="left02top">
				<div class="left02top_right"></div>
				<div class="left02top_left"></div>
				<div class="left02top_c">用户信息管理</div>
			</div>
			<div class="left02down">
				<div class="left02down01">
					<a onclick="show_menuB(80)" href="javascript:;"><div id="Bf080"
							class="left02down01_img"></div>用户信息查询</a>
				</div>
				<div class="left02down01_xia noneBox" id="Bli080">
					<ul>
						<li onmousemove="show_menu(10)" id="f010"><a href="#">&middot;精确查询</a>
						</li>
						<li onmousemove="show_menu(11)" id="f011"><a href="#">&middot;组合条件查询</a>
						</li>
					</ul>
				</div>
				<div class="left02down01">
					<a onclick="show_menuB(81)" href="javascript:;">
						<div id="Bf081" class="left02down01_img"></div> 用户密码管理</a>
				</div>
				<div class="left02down01_xia noneBox" id="Bli081">
					<ul>
						<li onmousemove="show_menu(12)" id="f012"><a href="#">&middot;找回密码</a>
						</li>
						<li onmousemove="show_menu(13)" id="f013"><a href="#">&middot;更改密码</a>
						</li>
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
				<div class="left02down01">
					<a onclick="show_menuB(82)" href="javascript:;"><div id="Bf082"
							class="left02down01_img"></div>用户注册统计</a>
				</div>
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>用户登录统计</a>
				</div>
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>用户激活统计</a>
				</div>
			</div>
		</div>
		<div class="left02">
			<div class="left02top">
				<div class="left02top_right"></div>
				<div class="left02top_left"></div>
				<div class="left02top_c">用户过滤</div>
			</div>
			<div class="left02down">
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>过滤IP(段)</a>
				</div>
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>过滤用户名</a>
				</div>
			</div>
		</div>
		<div class="left02">
			<div class="left02top">
				<div class="left02top_right"></div>
				<div class="left02top_left"></div>
				<div class="left02top_c">系统管理</div>
			</div>
			<div class="left02down">
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>权限管理</a>
				</div>
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>用户组管理</a>
				</div>
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>操作日志</a>
				</div>
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
			<%
				if (session.getAttribute("userid") != null) {
			%>
			<h1>
				<%=session.getAttribute("userid")%>同学考试结果
			</h1>
			<%
				}
			%>
			<hr>
				<%
					String str1 = request.getParameter("thor"); //获取单选题答案
					String[] str2 = request.getParameterValues("poem"); //获取多选题答案
				%>
				您的答案如下：<br> 1. <%
					out.print(str1); //输出单选题答案
				%><br> 2. <%
					if (str2 != null) { //输出多选题答案
						for (int i = 0; i < str2.length; i++) {
							out.print(str2[i]);
						}
					}
					int score = 0, score1 = 0; //声明变量

					if (str1.equals("C")) { //判断单选题答案的
						score1 = 5;
					} else {
						score1 = 0;
					}

					for (int i = 0; i < str2.length; i++) { //判断多选题答案
						if (str2[i].equals("A")) {
							score = 5;
						}
						if (str2[i].equals("C")) {
							score = score + 5;
						}
						if (str2[i].equals("E")) {
							score = score + 5;
						}
						if (str2[i].equals("F")) {
							score = score + 5;
						}
					}
					int s = score + score1;
				%><br> 您的总成绩为：<%=s%>分，总分25分 
		</div>




	</div>





</body>
</html>
