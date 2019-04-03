<%@page import="com.Product"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	Product product=new Product();
	String action = request.getParameter("action");
	if ((action != null) && action.equals("add")) {
		Product product1 = new Product();
		product1.setName(request.getParameter("pdtname"));
		product1.setId(Integer.parseInt(request.getParameter("pdtid")));
		product1.setPrice(Integer.parseInt(request.getParameter("pdtprice")));
		product1.setNewprice(Integer.parseInt(request.getParameter("pdtnewprice")));
		product1.setAmount(Integer.parseInt(request.getParameter("pdtamount")));
		product1.setDate(request.getParameter("pdtdate"));
		request.setAttribute("phone", product1);
		
		product = (Product) request.getAttribute("phone");
	}

	if ((action != null) && action.equals("del")) {
		request.removeAttribute("phone");
		product = new Product();
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>itZcn网站后台管理系统</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<style media="all" type="text/css">
@import "css/all.css";
td,th{font-size: 14px;}
</style>

</head>
<body>
	<div id="main">
		<div id="header">
			<a href="index.html" class="logo"><img src="img/logo.gif" alt="" />
			</a>
			<ul id="top-navigation">
				<li class="active"><span><span>首页</span> </span>
				</li>
				<li><span><span><a href="#">用户</a> </span> </span>
				</li>
				<li><span><span><a href="#">订单</a> </span> </span>
				</li>
				<li><span><span><a href="#">全局</a> </span> </span>
				</li>
				<li><span><span><a href="#">统计</a> </span> </span>
				</li>
				<li><span><span><a href="#">工具</a> </span> </span>
				</li>
				<li><span><span><a href="#">扩展</a> </span> </span>
				</li>
			</ul>
		</div>
		<div id="middle">
			<div id="left-column">
				<h3>系统设置</h3>
				<ul class="nav">
					<li><a href="#">站点基本设置</a>
					</li>
					<li><a href="#">本地路径设置</a>
					</li>
					<li><a href="#">积分设置</a>
					</li>
					<li><a href="#">缩略图设置</a>
					</li>
					<li><a href="#">水印设置</a>
					</li>
					<li class="last"><a href="#">RSS设置</a>
					</li>
				</ul>
				<a href="#" class="link">用户组权限</a> <a href="#" class="link">公告管理</a>
			</div>
			<div id="center-column">
				<div class="top-bar">
					<a href="#" class="button">添加新配置 </a>
					<h1>全文索引</h1>
					<div class="breadcrumbs">
						<a href="#">首页</a> / <a href="#">内容搜索</a>
					</div>
				</div>
				<br />
				<div class="select-bar">
					<label> <input type="text" name="textfield" /> </label> <label>
						<input type="submit" name="Submit" value="开始搜索" /> </label>
				</div>
				<div class="table">
					<img src="img/bg-th-left.gif" width="8" height="7" alt=""
						class="left" /> <img src="img/bg-th-right.gif" width="7"
						height="7" alt="" class="right" />
					<table class="listing" cellpadding="0" cellspacing="0">
						<tr><th class="first" width="20">编号</th>
							<th >名称</th>
							<th>原价</th>
							<th>促销价</th>
							<th>库存</th>
							<th>上架日期</th>
							<th>操作</th>
						</tr>
						<tr class="bg">
							<td class="first style1"><%=product.getId()%></td>
							<td ><%=product.getName()%></td>
							<td><%=product.getPrice()%></td>
							<td><%=product.getNewprice()%></td>
							<td><%=product.getAmount()%></td>
							<td><%=product.getDate()%></td>
							<td><a href="del.jsp?action=del&id=<%=product.getId()%>"><img
									src="img/hr.gif" width="16" height="16" alt="" /> 删除</a></td>
						</tr>
					</table>

					<div class="select">
						<strong>页跳转: </strong> <select>
							<option>1</option>
						</select>
					</div>
				</div>
			</div>
			<div id="right-column">
				<strong class="h">提示</strong>
				<div class="box">
					程序版本：itZcn BCM V1.0 <a>查看最新版</a><br /> 服务器软件：Microsoft-IIS/6.0 <br />
					数据库大小：10.4M
				</div>
			</div>
		</div>
		<div id="footer"></div>
		<div style="text-align:center">Powered by itZcn BCM V1.0 &copy;
			2010 itZcn.com</div>

	</div>
</body>
</html>
