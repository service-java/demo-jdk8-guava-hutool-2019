<%@page import="java.sql.*"%>
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
					<li class="active_menu"><a href="#">首页</a>
					</li>
					<li><a href="#">关于书店</a>
					</li>
					<li><a href="#">新书列表</a>
					</li>
					<li><a href="#">图书专辑</a>
					</li>
					<li><a href="#">我的账号</a>
					</li>
					<li><a href="#">用户注册</a>
					</li>
					<li><a href="#">联系我们</a>
					</li>
					<li><a href="#">人才招聘</a>
					</li>
				</ul>
			</div>
			<!-- ============= 菜单条(结束) ============= -->
		</div>
		<!-- ============= header end ============= -->
		<div id="body" class="clear">
			<!-- ============= body_left start ============= -->
			<div id="body_left">
				<!-- ============= 好书推荐（开始） ============= -->
				<h2>
					<img src="imgs/bullet1.gif" />特价图书
				</h2>
				<div class="prod clear">
					<%
						try {
							//驱动类
							String url = "jdbc:mysql://localhost:3306/db_book";
							String username = "root"; //用户名
							String password = "123456"; //密码
							Connection conn = null;
							Statement statement = null;
							Class.forName("com.mysql.jdbc.Driver");
							conn = DriverManager.getConnection(url, username, password);
							ResultSet rs = null;
							statement = conn.createStatement();
					%>
					<table border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC"
						width="100%">
						<tr align="center" bgcolor="#FAFAF1">
							<td>编号</td>
							<td>书名</td>
							<td>作者</td>
							<td>价格</td>
							<td>出版社</td>
							<td>简介</td>
						</tr>

						<%
							String sql = "select * from books";
								rs = statement.executeQuery(sql);
								int intPageSize; //一页显示的记录数
								int intRowCount; //记录的总数
								int intPageCount; //总页数
								int intPage; //待显示的页码
								String strPage;
								int i;
								intPageSize = 3; //设置一页显示的记录数
								strPage = request.getParameter("page");//取得待显示的页码
								if (strPage == null) //判断strPage是否等于null,如果是，显示第一页数据
								{
									intPage = 1;
								} else {
									intPage = java.lang.Integer.parseInt(strPage); //将字符串转换为整型
								}
								if (intPage < 1) {
									intPage = 1;
								}
								rs.last();//获取记录总数
								intRowCount = rs.getRow();
								intPageCount = (intRowCount + intPageSize - 1) / intPageSize; //计算机总页数
								if (intPage > intPageCount)
									intPage = intPageCount; //调整待显示的页码
								if (intPageCount > 0) {
									//将记录指针定位到待显示页的第一条记录上
									rs.absolute((intPage - 1) * intPageSize + 1);
								}
								//下面用于显示数据
								i = 0;
								while (i < intPageSize && !rs.isAfterLast()) {
						%>
						<tr>
							<td><%=rs.getString("id")%></td>
							<td><%=rs.getString("name")%></td>
							<td><%=rs.getString("author")%></td>
							<td><%=rs.getString("price")%></td>
							<td><%=rs.getString("publisher")%></td>
							<td><%=rs.getString("intro")%></td>
						</tr>
						<%
							rs.next();
					i++;
							}
							rs.close();//关闭连接、释放资源
							statement.close();
								conn.close();%>
								<tr>
								<td colspan="6">
								共<%=intRowCount%>个记录，分<%=intPageCount%>页显示/当前第<%=intPage%>页     <%
			for (int j = 1; j <= intPageCount; j++) {
					out.print("&nbsp;&nbsp;<a href='bookPage.jsp?page=" + j + "'>"
							+ j + "</a>");
				}
		%>
								<%
								
							} catch (Exception e) {
							
								e.printStackTrace();
							}
						%></td>
								</tr>
					</table>



				</div>
				<!-- ============= 好书推荐（结束） ============= -->

			</div>
			<!-- ============= body_left end ============= -->
			<div id="body_right">
				<div id="cart" class="clear">
					<h2>
						<img src="imgs/cart.gif" width="21" height="18" />购物车
					</h2>
					<div class="info">
						2件商品 | <span>总计：123￥</span><a href="#">查看购物车</a>
					</div>
				</div>
				<img src="imgs/border.gif" width="329" height="31" />
				<div id="about_our">
					<h2>
						<img src="imgs/bullet3.gif" width="26" height="25" />关于书店
					</h2>
					<div class="details clear">
						<img src="images/about.jpg" />
						<p>
							汇智科技公司关注IT教育培训市场的发展和变化，致力于在线教育，推进无纸化教学进程。窗内网（www.itzcn.com）结合软件开发的实际需求，发布了Flex、C#、Java、ASP.NET和

							JSP等系列视频教程。</p>
					</div>
				</div>
				<img src="imgs/border.gif" width="329" height="31" />
				<div id="promotions">
					<h2>
						<img src="imgs/bullet4.gif" width="26" height="25" />图书分类
					</h2>
					<ul class="list">
						<li><a href="#">三维动画</a>
						</li>
						<li><a href="#">.NET技术</a>
						</li>
						<li><a href="#">Java技术</a>
						</li>
						<li><a href="#">PHP技术</a>
						</li>
						<li><a href="#">其它语言</a>
						</li>
						<li><a href="#">Web前端</a>
						</li>
						<li><a href="#">数据库技术</a>
						</li>
						<li><a href="#">基础应用</a>
						</li>
					</ul>
				</div>
				<div class="right_box">
					<h2>
						<img src="imgs/bullet6.gif" width="26" height="25" />友情链接
					</h2>
					<ul class="list">
						<li><a href="#">窗内网</a>
						</li>
						<li><a href="#">窗内论坛</a>
						</li>
						<li><a href="#">Google搜索</a>
						</li>
						<li><a href="#">百度搜索</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- ============= footer start ============= -->
		<div id="footer">
			<div class="logo">
				<img src="imgs/logo.png" /> <img src="imgs/itzcn.gif" />
			</div>
			<div class="nav">
				<ul>
					<li><a href="#">首页</a>
					</li>
					<li><a href="#">关于我们</a>
					</li>
					<li><a href="#">服务</a>
					</li>
					<li><a href="#">保密协议</a>
					</li>
					<li><a href="#">联系我们</a>
					</li>
				</ul>
			</div>
			<img src="imgs/footer_bg.gif" />
		</div>
		<!-- ============= footer end ============= -->
	</div>
</body>
</html>