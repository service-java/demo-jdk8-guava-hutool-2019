<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录_窗内网</title>
<link href="login.css" type="text/css" rel="stylesheet" />
</head>
<body>
<%@include file="header.jsp" %>
<!--中间-->
<div id="lad_center">
       <div class="lad_lt">
	     <div class="tt">欢迎光临窗内，学IT,尽在窗内网!<a href="register.php"><img style="margin-left:5px;" src="images/land_t.gif" border="0" /></a></div>
		 <div class="cont">
		     <div class="pep"></div>
			 <div class="ms">
			     <p style="padding-top:30px;*padding-top:40px;">VIP窗内：在线教育平台<br/>
			     学习电脑技术的最好途径<br/>
			     <a style="color:#ff6600;margin-left:5px;" href="http://bbs.itzcn.com" target="_blank">[访问论坛]</a> <a style="color:#ff6600;margin-left:5px;" href="http://blog.itzcn.com" target="_blank">[访问博客]</a></p>
				 
			 </div>
		 </div> 
		 <div class="fb">
		   <ul>
		     <li class="xs"><p class="zb"><a href="http://www.itzcn.com/wyxs.html">我要悬赏</a></p><p class="xz">更低的成本，更多的选择</p></li>
			 <li class="zq"><p class="zb"><a href="http://www.itzcn.com/mywk.html">我要赚钱</a></p><p class="xz">能力变现，有本事你就来</p></li>
		   </ul>
		 </div>
  </div>
  <div class="lad_rt">
  <div class="top"><a href="http://www.itzcn.com/mywk.html" target="_blank"><img border="0"src="images/user_dlx.gif" alt="下一个会是谁？" /></a></li>
  </ul></div>
  <div class="top2"><a href="http://u.itzcn.com/space-243045.html" target="_blank"><img border="0"src="images/user_dl.gif" /></a></li>
  </ul></div>
  
     <form action="" method="post">
	<p style="*margin-top:20px;">用户名 <input class="sr" type="text" name="username" maxlength="15" value="<%=request.getParameter("username") %>" /></p>
	<p>密　码 <input class="sr" type="password" name="userpass"  maxlength="25"/>
	<a href="./login.php?action=lostpass">忘记密码</a></p>
	<p style="padding: 2px 0px 6px 45px; text-indent: -3px;">您已注册，请直接输入密码登录系统。</p>
	<p style="margin:0px 0px 10px 50px;color:red"></p>
	
	<p style="text-indent:40px;">
	<input type="hidden" name="loginsubmit" value="true" />
	<input type="submit" class="Login1" name="mysubmit" value="" />
	
	<div class="clear"></div>
	</p>
   </form>
   <div class="bottom">
   <p><b>你知道这些数据吗？</b>
   <br />
   窗内网目前汇集:<font color="#FE5301">92166</font>个人才&nbsp;&nbsp;&nbsp;共有:<font color="#FE5301">4331643</font>个视频
   </p>
   
   
   </div>
  </div>
  
<div class="clear"></div>
</div>
<!--中间-->
<%@include file="footer.jsp" %>
</body>
</html>	
			