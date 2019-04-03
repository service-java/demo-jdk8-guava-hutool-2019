<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户注册_窗内网</title>
<link href="reg.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<!--顶部-->
	<div id="header">
		<div class="h_lt">
			<a href="http://www.itzcn.com"><img src="images/logo.gif" />
			</a>
		</div>
		<div class="h_rt">
			您好 请 <A href="register.html">注册</A> 或 <A href="login.html">登录</A> | <A
				href="help.html" target=_blank>帮助中心</A> | <A
				onClick="this.style.behavior='url(#default#homepage)';this.setHomePage('{$site_url}')"
				href="#">设为首页</A> | <A
				href="javascript:window.external.addfavorite('{$SiteURL}','$seo_title')">加入收藏</A>
		</div>
	</div>
	<!--顶部-->
	<!--中间-->
	<div id="center">
		<!--中左-->
		<div class="c_lt">
			<div class="tt">
				只填五项就可立即注册窗内<font color="#FF0000">（必填）</font>
			</div>
			<form action="info.jsp" method="post" id="apForm">
			<% 
	 request.setCharacterEncoding("UTF-8");
  %>
			
				<div class="content">
					<p>
						 登 录 名： <INPUT class="input"
							type="text" id=username maxLength=32 name="username">
					</p>
					<p>
						 登录密码： <INPUT class="input"
							style="width:148px;" type=password maxLength=16 id="password"
							name="userpass">
					</p>
					<p>
						选择性别：<input name="sex" type="radio" value="男" />男 <input
							name="sex" type="radio" value="女" />女

					</p>
					<p>
						所在校区：<select name="area">
							<option value="中心校区">中心校区</option>
							<option value="经开校区">经开校区</option>
							<option value="人民路校区">人民路校区</option>
						</select>
					</p>
					<p>
						所学技术：<input name="subject" type="checkbox" value="Java软件编程" />
						Java软件编程 <input name="subject" type="checkbox" value="C#软件编程" />
						C#软件编程 <input name="subject" type="checkbox" value="计算机信息管理" />
						计算机信息管理 <input name="subject" type="checkbox" value="数据结构" />数据结构
						</select>
					</p>
					<p>
						<INPUT type="submit" name="mysubmit" value="" class="tj">
					</p>
				</div>
			</form>
			<div class="ft"></div>
		</div>
		<!--中左-->
		<!--中右-->
		<div class="clear"></div>
	</div>
	<!--中间-->
	<!--底部-->
	<div class="cop">
		<style type="text/css">
#foot {
	background: url(images/foot_bg.gif);
	WIDTH: 762px;
	COLOR: #143c80;
	TEXT-ALIGN: center;
	CLEAR: both;
	MARGIN: 0px auto;
}
</style>
		<table width="600" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="600" height="36" background="images/foot_bg.gif"><div
						align="center">
						<span class="foot"><a
							href="http://school.itzcn.com/aboutus.html">关于我们</a> | <a
							href="http://school.itzcn.com/etrs.html">免责声明</a> | <a
							href="http://school.itzcn.com/adver.html">广告合作</a> | <a
							href="http://school.itzcn.com/knowledge.html">知识产权</a> | <a
							href="http://school.itzcn.com/payment.html">支付方式</a> | <a
							href="http://school.itzcn.com/contactus.html">联系方式</a> | <a
							href="http://school.itzcn.com/zhaopin.html">加入我们</a>
						</span>
					</div>
				</td>
			</tr>
			<tr>
				<td height="36" align="center" style="text-align:center;"><span
					class="foot">Copyrights Reserved 2005-2010 窗内网 www.itzcn.com
						豫 <em>ICP08104500</em>备号</span><br />
				</td>
			</tr>
		</table>
	</div>
	<div class="clear"></div>
	<!--底部-->
</body>
</html>
