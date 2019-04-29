<%@page import="java.sql.*"%>
<%request.setCharacterEncoding("UTF-8"); %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>Itzcn书店</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div id="container">
  <!-- ============= header start ============= -->
  <div id="header">
    <div id="banner">
      <h1 class="logo">Itzcn书店</h1>
    </div>
    <!-- ============= 菜单条(开始) ============= -->
    <div id="menubar">
      <ul>
        <li class="active_menu"><a href="#">首页</a></li>
        <li><a href="#">关于书店</a></li>
        <li><a href="#">新书列表</a></li>
        <li><a href="#">图书专辑</a></li>
        <li><a href="#">我的账号</a></li>
        <li><a href="#">用户注册</a></li>
        <li><a href="#">联系我们</a></li>
        <li><a href="#">人才招聘</a></li>
      </ul>
    </div>
    <!-- ============= 菜单条(结束) ============= -->
  </div>
  <!-- ============= header end ============= -->
  <div id="body" class="clear">
    <!-- ============= body_left start ============= -->
    <div id="body_left">
      <!-- ============= 好书推荐（开始） ============= -->
      <h2><img src="imgs/bullet1.gif" />可滚动的结果集</h2>
      <div class="prod clear">
<%
	String url = "jdbc:mysql://localhost:3306/db_book";
	String username = "root"; // 用户名
	String password = "123456"; // 密码
	Connection conn = null;
	Statement stmt = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password);
		stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//执行SQL查询语句得到可滚动结果集
		ResultSet rs = stmt.executeQuery("select * from books");
		out.println("<b>当前游标是否在第一行之前：" + rs.isBeforeFirst() + "</b><br>");
		out.println("由前至后顺序显示结果集 ：<br>");
		//使用next()方法顺序显示结果集
		while (rs.next()) {
			String id = rs.getString(1);
			out.println(id + "、 ");
		}
		out.println("<hr/><b>当前游标是否在最后一行之后:" + rs.isAfterLast() + "</b><br>");
		out.println("由后至前逆序显示结果:<br>");
		//使用previous()方法逆序显示结果
		while (rs.previous()) {
			String id = rs.getString(1);
			out.println(id + "、 ");
		}
		out.println("<hr/><br>将游标移动到第一行<br>");
		rs.first();
		out.println("<b>当前游标是否在第一行：" + rs.isFirst() + "</b><br>");
		out.println("结果集第一行的数据为:<br>");
		out.println(rs.getString(1) + " " + rs.getString(2) + " "+ rs.getString(3) + " " + rs.getString(4));
		out.println("<hr/>将游标移动到最后一行<br>");
		rs.last();
		out.println("<b>当前游标是否在最后一行：" + rs.isLast() + "</b><br>");
		out.println("结果集最后一行的数据为：<br>");
		out.println(rs.getString(1) + " " + rs.getString(2) + " "+ rs.getString(3) + " " + rs.getString(4));
		//游标的相对定位
		out.println("<hr/>将游标移动到最后一行的前三行<br>");
		rs.relative(-3);
		out.println("<b>结果集最后一行的前三行数据为：</b><br>");
		out.println(rs.getString(1) + " " + rs.getString(2) + " "+ rs.getString(3) + " " + rs.getString(4));
		//游标的绝对定位
		out.println("<hr/>将游标移动到第三行<br>");
		rs.absolute(3);
		out.println("<b>结果集第三行的数据为：</b><br>");
		out.println(rs.getString(1) + " " + rs.getString(2) + " "+ rs.getString(3) + " " + rs.getString(4));
		//beforeFirst()方法和next()方法配合使用
		out.println("<hr/><b>先将游标移动到第一行之前</b>");
		rs.beforeFirst();
		out.println("<br>再次由前至后显示结果：<br>");
		while (rs.next()) {
			String id = rs.getString(1);
			out.println(id + "、 ");
		}
		rs.close();
		stmt.close();
	} catch (ClassNotFoundException e) {
		System.out.println(e);
	}
%>
      </div>
      <!-- ============= 好书推荐（结束） ============= -->

    </div>
    <!-- ============= body_left end ============= -->
    <div id="body_right">
      <div id="cart" class="clear">
        <h2><img src="imgs/cart.gif" width="21" height="18" />购物车</h2>
        <div class="info">2件商品 | <span>总计：123￥</span><a href="#">查看购物车</a></div>
      </div>
      <img src="imgs/border.gif" width="329" height="31" />
      <div id="about_our">
        <h2><img src="imgs/bullet3.gif" width="26" height="25" />关于书店</h2>
        <div class="details clear"> <img src="images/about.jpg" />
          <p>　　汇智科技公司关注IT教育培训市场的发展和变化，致力于在线教育，推进无纸化教学进程。窗内网（www.itzcn.com）结合软件开发的实际需求，发布了Flex、C#、Java、ASP.NET和

JSP等系列视频教程。</p>
        </div>
      </div>
      <img src="imgs/border.gif" width="329" height="31" />
      <div id="promotions">
        <h2><img src="imgs/bullet4.gif" width="26" height="25" />图书分类</h2>
        <ul class="list">
          <li><a href="#">三维动画</a></li>
          <li><a href="#">.NET技术</a></li>
          <li><a href="#">Java技术</a></li>
          <li><a href="#">PHP技术</a></li>
          <li><a href="#">其它语言</a></li>
          <li><a href="#">Web前端</a></li>
          <li><a href="#">数据库技术</a></li>
          <li><a href="#">基础应用</a></li>
        </ul>
      </div>
      <div class="right_box">
        <h2><img src="imgs/bullet6.gif" width="26" height="25" />友情链接</h2>
        <ul class="list">
          <li><a href="#">窗内网</a></li>
          <li><a href="#">窗内论坛</a></li>
          <li><a href="#">Google搜索</a></li>
          <li><a href="#">百度搜索</a></li>
        </ul>
      </div>
    </div>
  </div>
  <!-- ============= footer start ============= -->
  <div id="footer">
    <div class="logo"> <img src="imgs/logo.png" /> <img src="imgs/itzcn.gif" /> </div>
    <div class="nav">
      <ul>
        <li><a href="#">首页</a></li>
        <li><a href="#">关于我们</a></li>
        <li><a href="#">服务</a></li>
        <li><a href="#">保密协议</a></li>
        <li><a href="#">联系我们</a></li>
      </ul>
    </div>
    <img src="imgs/footer_bg.gif" /> </div>
  <!-- ============= footer end ============= -->
</div>
</body>
</html>