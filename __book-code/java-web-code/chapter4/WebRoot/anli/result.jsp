<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>�û���Ϣ����ϵͳ</title>
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
		$('li0' + num).style.display = 'block';//�����Ժ���Ϣ��
		$('f0' + num).className = 'left02down01_xia_li';//�����Ժ�TAG��ʽ
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
		<div class="header02">�û���Ϣ����ϵͳ</div>
	</div>
	<div class="left" id="LeftBox">
		<div class="left01">
			<div class="left01_right"></div>
			<div class="left01_left"></div>
			<div class="left01_c">
				׼��֤�ţ�<%=session.getAttribute("userid")%></div>
		</div>
		<div class="left02">
			<div class="left02top">
				<div class="left02top_right"></div>
				<div class="left02top_left"></div>
				<div class="left02top_c">�û���Ϣ����</div>
			</div>
			<div class="left02down">
				<div class="left02down01">
					<a onclick="show_menuB(80)" href="javascript:;"><div id="Bf080"
							class="left02down01_img"></div>�û���Ϣ��ѯ</a>
				</div>
				<div class="left02down01_xia noneBox" id="Bli080">
					<ul>
						<li onmousemove="show_menu(10)" id="f010"><a href="#">&middot;��ȷ��ѯ</a>
						</li>
						<li onmousemove="show_menu(11)" id="f011"><a href="#">&middot;���������ѯ</a>
						</li>
					</ul>
				</div>
				<div class="left02down01">
					<a onclick="show_menuB(81)" href="javascript:;">
						<div id="Bf081" class="left02down01_img"></div> �û��������</a>
				</div>
				<div class="left02down01_xia noneBox" id="Bli081">
					<ul>
						<li onmousemove="show_menu(12)" id="f012"><a href="#">&middot;�һ�����</a>
						</li>
						<li onmousemove="show_menu(13)" id="f013"><a href="#">&middot;��������</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="left02">
			<div class="left02top">
				<div class="left02top_right"></div>
				<div class="left02top_left"></div>
				<div class="left02top_c">�û�����</div>
			</div>
			<div class="left02down">
				<div class="left02down01">
					<a onclick="show_menuB(82)" href="javascript:;"><div id="Bf082"
							class="left02down01_img"></div>�û�ע��ͳ��</a>
				</div>
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>�û���¼ͳ��</a>
				</div>
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>�û�����ͳ��</a>
				</div>
			</div>
		</div>
		<div class="left02">
			<div class="left02top">
				<div class="left02top_right"></div>
				<div class="left02top_left"></div>
				<div class="left02top_c">�û�����</div>
			</div>
			<div class="left02down">
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>����IP(��)</a>
				</div>
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>�����û���</a>
				</div>
			</div>
		</div>
		<div class="left02">
			<div class="left02top">
				<div class="left02top_right"></div>
				<div class="left02top_left"></div>
				<div class="left02top_c">ϵͳ����</div>
			</div>
			<div class="left02down">
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>Ȩ�޹���</a>
				</div>
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>�û������</a>
				</div>
				<div class="left02down01">
					<a href="#"><div class="left02down01_img"></div>������־</a>
				</div>
			</div>
		</div>
		<div class="left01">
			<div class="left03_right"></div>
			<div class="left01_left"></div>
			<div class="left03_c">��ȫ�˳�</div>
		</div>
	</div>
	<div class="rrcc" id="RightBox">
		<div class="center" id="Mobile" onclick="show_menuC()"></div>
		<div class="right" id="li010">
			<%
				if (session.getAttribute("userid") != null) {
			%>
			<h1>
				<%=session.getAttribute("userid")%>ͬѧ���Խ��
			</h1>
			<%
				}
			%>
			<hr>
				<%
					String str1 = request.getParameter("thor"); //��ȡ��ѡ���
					String[] str2 = request.getParameterValues("poem"); //��ȡ��ѡ���
				%>
				���Ĵ����£�<br> 1. <%
					out.print(str1); //�����ѡ���
				%><br> 2. <%
					if (str2 != null) { //�����ѡ���
						for (int i = 0; i < str2.length; i++) {
							out.print(str2[i]);
						}
					}
					int score = 0, score1 = 0; //��������

					if (str1.equals("C")) { //�жϵ�ѡ��𰸵�
						score1 = 5;
					} else {
						score1 = 0;
					}

					for (int i = 0; i < str2.length; i++) { //�ж϶�ѡ���
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
				%><br> �����ܳɼ�Ϊ��<%=s%>�֣��ܷ�25�� 
		</div>




	</div>





</body>
</html>