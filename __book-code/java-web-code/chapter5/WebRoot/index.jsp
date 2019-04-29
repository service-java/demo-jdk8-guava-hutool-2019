<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:useBean id="myBean" scope="application" class="com.itzcn.bean.MyBean"/>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <base href="<%=basePath%>">
    
    <title>汇智科技首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="style/style.css" rel="stylesheet" type="text/css" />
<link href="style/hd.css" rel="stylesheet" type="text/css" />
<LINK rel=stylesheet type=text/css href="style/books.css">
<LINK rel=stylesheet type=text/css href="style/hdpgg.css">
<script src="js/hd.js" type="text/javascript"></script>
<script src="js/books.js" type="text/javascript"></script>
<script>
function settab_zzjsnet(name,cursel,n){
 for(i=1;i<=n;i++){
  var menu=document.getElementById(name+i);
  var zzjs=document.getElementById("zzjs_"+name+"_"+i);
  menu.className=i==cursel?"hover":"";
  zzjs.style.display=i==cursel?"block":"none";
 }
}
</script>
  </head>
  
  <body>
<div class="mainbg">
<P id=header><A class=logo title="窗内网" 
href="http://www.itzcn.com/" target="_blank"><SPAN>窗内网</SPAN></A> 
<span style="padding-bottom: 0px; padding-left: 0px; width: 480px; padding-right: 0px; float: left; margin-left: 200px; padding-top: 10px;" >
<script type="text/javascript"><!--
google_ad_client = "ca-pub-8910150158289241";
/* 468&#42;60横幅 */
google_ad_slot = "9844266999";
google_ad_width = 468;
google_ad_height = 60;
//-->
</script>
<script type="text/javascript"
src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
</script>
</span>
<SPAN 
class=login>您好,
<A href="http://school.itzcn.com/register.html" target="_blank">注册</A> | 
<A href="http://school.itzcn.com/login.html" target="_blank">登录</A>
 | <a href="http://bbs.itzcn.com/forum-87-1.html" target="_blank">图书勘误</a> 
 | <A href="http://school.itzcn.com/help.html" target=_blank target="_blank">帮助中心</A> | <A onClick="this.style.behavior='url(#default#homepage)';this.setHomePage('http://www.itzcn.com/')" 
            href="#">设为首页</A> | <A href="javascript:window.external.addfavorite('','窗内网 - 视频教程')">加入收藏</A></SPAN> </P>
<div id=nav_index><p></p>
  <div id="menu">
    <ul>
      <li class="header_menu_noselected"><a href="http://school.itzcn.com/index.html"  target="_blank">学院首页</a></li>
	  <li class="header_menu_noselected"><a href="http://school.itzcn.com/teacher.html"  target="_blank">讲师风采</a></li>
	  <li class="header_menu_noselected"><a href="http://school.itzcn.com/book.html"  target="_blank">图书推荐</a></li>
	  <li class="header_menu_noselected"><a href="http://school.itzcn.com/vspacecp.html" target="_blank" >个人中心</a></li>
	  <li class="header_menu_noselected"><a href="http://bbs.itzcn.com"  target="_blank">窗内论坛</a></li>
	  <li class="header_menu_noselected"><a href="http://blog.itzcn.com"  target="_blank">窗内博客</a></li>
	 <li class="header_menu_noselected"><a href="http://home.itzcn.com"  target="_blank">我的空间</a></li>
      <li><span></span></li>
    </ul>
  </div>
  <ul>
    <li><span></span></li>
  </ul>
  <script>
  function searchinit(){
  	if (searchform_header.keywords.value=="找好友聊聊"){
		searchform_header.keywords.value="";
	}
  }
  </script>
<div class="search">
<form name="searchform_header" method="post" action="http://school.itzcn.com/search.html">
  <input name="keywords" onfocus="searchinit()" type="text" class="search_text" id="keywords" value="找好友聊聊" />
  <input type="hidden" name="stype" value="1" />
  <input name="button" type="button" class="sub" id="button" onclick="searchform_header.submit();" />
  </form>
</div>
</div><div class="main">
	<!-- 左部-->
	<div class="left">
      <!--幻灯片和推荐图书-->
      <div class="swf_pic">
        <!--幻灯片开始-->
        <div id="ifocus">
          <div id="ifocus_pic">
            <div id="ifocus_piclist" style="left:0; top:0;">
              <ul>
			                  <li><a href="http://www.itzcn.com/" target="_blank"><img src="images/20090227035700.jpg" /></a></li>
			                  <li><a href="http://www.itzcn.com/" target="_blank"><img src="images/20090227035700.jpg" /></a></li>
			                  <li><a href="http://www.itzcn.com/" target="_blank"><img src="images/20090227035700.jpg" /></a></li>
			                </ul>
            </div>
            
            <div id="ifocus_tx">
              <!--<ul>
                <li class="current">庆祝窗内网门户首页改版成功。</li>
                <li class="normal">庆祝窗内网门户首页改版成功。</li>
                <li class="normal">庆祝窗内网门户首页改版成功。</li>
              </ul>-->
            </div>
          </div>
          <div id="ifocus_btn">
            <ul>              <li class="current"><img src="images/20090227035700.jpg" alt="" width="90" height="47" /></li>
			                <li class="current"><img src="images/20090506034317.jpg" alt="" width="90" height="47" /></li>
			                <li class="current"><img src="images/20090227040322.jpg" alt="" width="90" height="47" /></li>
			              </ul>
          </div>
          <SPAN class=sider_b></SPAN> </div>

        <!--幻灯片结束-->

        <div >
		
          <!--推荐图书开始-->
          <DIV id="tstj">
		  
            <UL>
			<script src="http://bbs.itzcn.com/api/javascript.php?key=threads_school_index_right" type="text/javascript"></script>
            </UL>
          </DIV>
          <!--推荐图书结束-->
        </div>
      </div>
	  <!-- /幻灯片和推荐图书-->
	        <!--精品就业班-->
			<div id="ad" style="clear:both; margin-top:10px;">
<script type="text/javascript"><!--
google_ad_client = "ca-pub-8910150158289241";
/* 720&#42;90图片广告 */
google_ad_slot = "7280540678";
google_ad_width = 728;
google_ad_height = 90;
//-->
</script>
<script type="text/javascript"
src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
</script>

</div>
      <div style=" clear:both; margin-top:2px;">
        <!-----精品图书开始----->
        <div style="background-image:url(images/bookbt.jpg); height:30px; width:100%;"><span style="font-weight: bold;line-height:30px;color:#FFF; font-size:15px">&nbsp;精品图书</span><span style="padding-left:85%"><a href="http://school.itzcn.com/book.html">更多</a></span></div>
        <div style="border-left:2px solid #F5F5F5;border-bottom:2px solid #F5F5F5;border-right:2px solid #F5F5F5;">
          <div id="lib_zzjs_2">
            <div class="lib_menu_zzjsnet lib_border_zzjs">
              <ul> 
			  <li style=" width:30px;background-image:url(images/dhshou.JPG)"></li>
			                  <li id="zzjs_21" onmouseover="settab_zzjsnet('zzjs_2',1,5)"class="hover">数据库 类</li>
			                <li id="zzjs_22" onmouseover="settab_zzjsnet('zzjs_2',2,5)">WEB程序开发 类</li>
			                <li id="zzjs_23" onmouseover="settab_zzjsnet('zzjs_2',3,5)">完全学习手册  类</li>
			                <li id="zzjs_24" onmouseover="settab_zzjsnet('zzjs_2',4,5)">实践教程 类</li>
			                <li id="zzjs_25" onmouseover="settab_zzjsnet('zzjs_2',5,5)">标准教程 类</li>
			<li style=" width:53px;background-image:url(images/dhwei.JPG)"></li>
              </ul>
            </div>
            <div class="lib_Contentbox_zzjs lib_border_zzjs">
			                <div id="zzjs_zzjs_2_1" style="width:740px;">
                				<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-60.html">UML面向对象设计与分析基础教程 </A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528064820.jpg"></DIV>
                      <DIV class=detail_look>本书全面介绍使用UML进行软件设计、分析与开发的知识。UML... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-60.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-26.html">Oracle 11g数据库应用简明教程</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528125512.jpg"></DIV>
                      <DIV class=detail_look>本书以Oracle 11g for Windows XP为平... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-26.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-25.html">SQL Server 2008数据库应用简明教程 </A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100527103220.jpg"></DIV>
                      <DIV class=detail_look>本书由浅入深地介绍了SQL Server 2008中最基本、... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-25.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-20.html">SQL Server 2008中文版从入门到精通</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20090305022208.gif"></DIV>
                      <DIV class=detail_look>SQL Server 2008是Windows Server... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-20.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-6.html">Oracle 11g从入门到精通</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20090112054612.gif"></DIV>
                      <DIV class=detail_look>本书是针对Oracle公司最新推出的大型数据库管理系统Ora... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-6.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-1.html">SQL Server 2005中文版从入门到精通（普及版）</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20090101075124.gif"></DIV>
                      <DIV class=detail_look>微软公司发布的SQL Server 2005数据库平台产品，... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-1.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
				              </div>
			                <div id="zzjs_zzjs_2_2" style="display:none;width:740px;" >
                				<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-97.html">精通JS脚本之jQuery框架</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20110510040515.jpg"></DIV>
                      <DIV class=detail_look>本书从介绍JavaScript的基础知识开始，围绕标准Web... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-97.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-96.html">精通JS脚本之ExtJS框架</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20110510040243.jpg"></DIV>
                      <DIV class=detail_look>本书由浅入深地讲解了ExtJS在Web开发中的相关技术。本书... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-96.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-90.html">Flex 3.0程序开发技术详解</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20101220034727.jpg"></DIV>
                      <DIV class=detail_look>　Flex无缝整合了Flash、ActionScript以及... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-90.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-84.html">Ajax+PHP程序设计实战详解</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20101207024623.jpg"></DIV>
                      <DIV class=detail_look>《Ajax+PHP程序设计实战详解》介绍Ajax和PHP两种... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-84.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-83.html">Struts 2+Hibernate+Spring整合开发技术详解</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20101207024411.jpg"></DIV>
                      <DIV class=detail_look>《Struts 2+Hibernate+Spring整合开发... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-83.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-82.html">Flex+ASP.NET Web应用开发实战详解</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20101207024117.jpg"></DIV>
                      <DIV class=detail_look>《Flex+ASP.NET Web应用开发实战详解》内容简介... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-82.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
				              </div>
			                <div id="zzjs_zzjs_2_3" style="display:none;width:740px;" >
                				<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-111.html">Visual C++ 网络大讲堂</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20130603014935.jpg"></DIV>
                      <DIV class=detail_look>  本书循序渐进、系统地介绍了VC++软件开发技术。本书包含... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-111.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-110.html">Flex 4.0 网络大讲堂</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20130603014350.jpg"></DIV>
                      <DIV class=detail_look>本书详细而系统地介绍Flex 4技术。全书分6篇共19章，主... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-110.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-109.html">Oracle 11g网络大讲堂</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20130603013846.jpg"></DIV>
                      <DIV class=detail_look>本书以Oracle最新版本Oracle 11g R2进行详解... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-109.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-108.html">Struts 2网络大讲堂</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20130603013422.jpg"></DIV>
                      <DIV class=detail_look>　本书涵盖了Struts 2框架中的配置文件、拦截器、国际化... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-108.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-107.html">CSS网络大讲堂</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20130603012057.jpg"></DIV>
                      <DIV class=detail_look>　　本书主要介绍CSS的概念、类型、文本样式、边框样式、块样... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-107.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-95.html">PHP编程网络大讲堂</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20110124063136.jpg"></DIV>
                      <DIV class=detail_look>本书全面介绍PHP编程知识，全书共分4篇16章，内容包括：P... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-95.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
				              </div>
			                <div id="zzjs_zzjs_2_4" style="display:none;width:740px;" >
                				<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-49.html">XML实践教程 </A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528035706.jpg"></DIV>
                      <DIV class=detail_look>XML是一种描述数据和数据结构的语言，可以保存在任何可以存储... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-49.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-48.html">Visual Basic.Net程序设计实践教程  </A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528035000.jpg"></DIV>
                      <DIV class=detail_look> Visual Basic.NET是Windows环境下简单... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-48.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-47.html">ASP.NET网络应用与开发实践教程</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528034902.jpg"></DIV>
                      <DIV class=detail_look>   本书主要介绍了ASP.NET的基本概念和环境操作、AS... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-47.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-46.html">Visual C++.Net程序设计实践教程</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528033308.jpg"></DIV>
                      <DIV class=detail_look>   本书主要介绍Visual C++.NET编程知识。全书... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-46.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-45.html">C#程序设计实践教程  </A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528034651.jpg"></DIV>
                      <DIV class=detail_look>C#是随Visual Studio.NET发布的一种新语言，... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-45.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-44.html">ASP 动态网站开发实践教程</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528032534.jpg"></DIV>
                      <DIV class=detail_look>   本书全面介绍了ASP动态网站开发知识，包括ASP基础知... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-44.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
				              </div>
			                <div id="zzjs_zzjs_2_5" style="display:none;width:740px;" >
                				<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-61.html">TCP/IP协议与网络管理标准教程 </A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528065513.jpg"></DIV>
                      <DIV class=detail_look>在当今的互联网络世界中，TCP/IP协议已经成为计算机通信的... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-61.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-53.html">SQL Server 2005中文版标准教程</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528061514.jpg"></DIV>
                      <DIV class=detail_look>SQL Server 2005是典型的关系型数据库管理系统，... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-53.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-52.html">Oracle 10g数据库管理、应用与开发标准教程 </A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528061052.jpg"></DIV>
                      <DIV class=detail_look>Oracle数据库作为世界范围内性能最优异的数据库系统之一，... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-52.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-51.html">Oracle 11g中文版数据库管理、应用与开发标准教程</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528060557.jpg"></DIV>
                      <DIV class=detail_look>本书全面介绍Oracle 11g中文版数据库管理和应用的知识... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-51.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/bookshow-bookid-50.html">SQL Server 2008中文版标准教程</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/book/image/20100528040528.jpg"></DIV>
                      <DIV class=detail_look>本书全面介绍了SQL Server 2008中文版数据库管理... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/bookshow-bookid-50.html">观看图书</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
				              </div>
			              </div>
          </div>
        </div>
        <!-----精品图书结束----->
        <hr style="border:5px solid #FFF"/>
		
        <!-----推荐视频开始----->
        <div style="background-image:url(images/bookbt.jpg); height:30px;"><span style="font-weight: bold;line-height:30px;color:#FFF; font-size:15px">&nbsp;推荐视频</span><span style="padding-left:85%"><a href="http://school.itzcn.com/">更多</a></span></div>
        <div style="border-left:2px solid #F5F5F5;border-bottom:2px solid #F5F5F5;border-right:2px solid #F5F5F5;">
          <div id="lib_zzjs_2">
            <div class="lib_menu_zzjsnet lib_border_zzjs">
              <ul> 
			  <li style=" width:30px;background-image:url(images/dhshou.JPG)"></li>
			                  <li id="zzjs_31" onmouseover="settab_zzjsnet('zzjs_3',1,5)"class="hover">软件开发 类视频</li>
			                <li id="zzjs_32" onmouseover="settab_zzjsnet('zzjs_3',2,5)">三维动画 类视频</li>
			                <li id="zzjs_33" onmouseover="settab_zzjsnet('zzjs_3',3,5)">WEB编程 类视频</li>
			                <li id="zzjs_34" onmouseover="settab_zzjsnet('zzjs_3',4,5)">数据库 类视频</li>
			                <li id="zzjs_35" onmouseover="settab_zzjsnet('zzjs_3',5,5)">基础应用 类视频</li>
			<li style=" width:53px;background-image:url(images/dhwei.JPG)"></li>
              </ul>
            </div>
            <div class="lib_Contentbox_zzjs lib_border_zzjs">
              <!--视频内容开始-->
			                <div id="zzjs_zzjs_3_1" style="width:740px;">
                				<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-12.html">《C#2008从入门到精通 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090121022429.jpg"></DIV>
                      <DIV class=detail_look>窗内网C#2008视频教程系统讲解了C＃基础知识，并通过大量... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-12.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-10.html">《JSP+AJAX 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090306034918.gif"></DIV>
                      <DIV class=detail_look>窗内网JSP+AJAX视频教程系统讲解了JSP+AJAX基础... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-10.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-11.html">《FLEX从入门到精通 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090306094819.jpg"></DIV>
                      <DIV class=detail_look>窗内网FLEX+ASP.NET视频教程系统讲解了FLEX+A... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-11.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-20.html">《J2EE完全学习手册 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090306034647.gif"></DIV>
                      <DIV class=detail_look>J2EE（Java 2 Enterprise Edition... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-20.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-27.html">《VB.NET从入门到精通 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090306031651.gif"></DIV>
                      <DIV class=detail_look>VB.NET从入门到精通（暂无视频）... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-27.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-17.html">《Eclipse从入门到精通 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090228054328.jpg"></DIV>
                      <DIV class=detail_look>Eclipse最初由OTI和IBM两家公司的IDE产品开发组... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-17.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
				              </div>
			                <div id="zzjs_zzjs_3_2" style="display:none;width:740px;">
                				<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-13.html">《3ds max技法精粹 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090225021747.gif"></DIV>
                      <DIV class=detail_look>3ds max从入门到精通，首先介绍了3ds max基础知识... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-13.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-15.html">《Director无师自通班 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090306095957.jpg"></DIV>
                      <DIV class=detail_look>随着计算机技术、网络技术和数字通信技术的高度发展和融合，传统... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-15.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-16.html">《Zbrush无师自通 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090225021222.gif"></DIV>
                      <DIV class=detail_look>ZBrush是Pixologic开发的一款思维独特的图像创造... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-16.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-14.html">《Maya无师自通班 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090225021805.gif"></DIV>
                      <DIV class=detail_look>Maya无师自通班（暂无视频）... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-14.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
				              </div>
			                <div id="zzjs_zzjs_3_3" style="display:none;width:740px;">
                				<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-9.html">《ASP+AJAX从入门到精通 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090306031736.gif"></DIV>
                      <DIV class=detail_look>窗内网ASP+AJAX视频教程系统讲解了ASP+AJAX基础... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-9.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-18.html">《Java框架从入门到精通 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090306033508.gif"></DIV>
                      <DIV class=detail_look>Java框架从入门到精通（暂无视频）... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-18.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-19.html">《ASP.NET 3.5从入门到精通 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090306031508.gif"></DIV>
                      <DIV class=detail_look>ASP.NET 3.5是最新可视化Web开发平台，本视频结合... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-19.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-30.html">《PHP网络大讲堂 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090414082216.gif"></DIV>
                      <DIV class=detail_look>窗内网PHP基础入门视频教程系统讲解了PHP基础知识，并通过... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-30.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-29.html">《SEO搜索引擎优化 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090329114825.jpg"></DIV>
                      <DIV class=detail_look>SEO的主要工作是通过了解各类搜索引擎如何抓取互联网页面、如... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-29.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-33.html">《Struts 2从入门到精通 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20091027093304.jpg"></DIV>
                      <DIV class=detail_look>Struts 2从入门到精通 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-33.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
				              </div>
			                <div id="zzjs_zzjs_3_4" style="display:none;width:740px;">
                				<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-25.html">《My SQL从入门到精通 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20090306031847.gif"></DIV>
                      <DIV class=detail_look>My SQL从入门到精通（暂无视频）... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-25.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-48.html">《SQL 2008完全学习手册 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20091225045555.jpg"></DIV>
                      <DIV class=detail_look>由Microsoft发布的SQL Server产品是一个典型... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-48.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-35.html">《Oracle 11g完全学习手册 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20091116032949.gif"></DIV>
                      <DIV class=detail_look>Oracle也称为甲骨文，它是由Oracle公司提供的数据库... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-35.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-45.html">《ACCESS 2007 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20091215112919.jpg"></DIV>
                      <DIV class=detail_look>Access 2007是微软公司推出的基于Windows的桌... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-45.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
				              </div>
			                <div id="zzjs_zzjs_3_5" style="display:none;width:740px;">
                				<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-36.html">《Authorware7.0 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20091215030519.jpg"></DIV>
                      <DIV class=detail_look>Authorware7.0是Macromedia公司推出的一... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-36.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-37.html">《Windows XP 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20091215030726.jpg"></DIV>
                      <DIV class=detail_look>Windows XP是Windows操作系统自Windows... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-37.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-38.html">《Word 2007 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20091215112811.jpg"></DIV>
                      <DIV class=detail_look>Word 2007是Mcrosoft新近推出的办公软件Off... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-38.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-39.html">《五笔字型 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20091215030959.jpg"></DIV>
                      <DIV class=detail_look>本书从键盘布局和指法讲起，通过细致的例字讲解、难字分析、五笔... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-39.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-40.html">《Dreamweaver 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20091215031131.jpg"></DIV>
                      <DIV class=detail_look>Dreamweaver CS3是用于网站与应用设计和开发的业... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-40.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
								<DIV class=sort_xinshu>
                  <DIV class=sort_cont>
                    <DIV class=sort_title> <A href="http://school.itzcn.com/special-spid-41.html">《网络安全 教程》</A></DIV>
                    <DIV class=cont_detail>
                      <DIV class=img_frame><IMG src="http://school.itzcn.com/uploadFile/20091215031342.jpg"></DIV>
                      <DIV class=detail_look>网络安全已经成为现代网络世界的一个重要课题，网络安全关系着网... 视频教程                        <DIV class=sort_titl><IMG alt="" src="images/top_1.gif"> <A href="http://school.itzcn.com/special-spid-41.html">观看视频</A></DIV>
                      </DIV>
                    </DIV>
                  </DIV>
                </DIV>
				              </div>
			                <!--视频内容结束-->
            </div>
          </div>
        </div>
        <!-----推荐视频结束----->
        <hr style="border:5px solid #FFF"/>
      </div>
	   <!--/精品就业班-->
	</div>
	<!-- /左部-->
	    <!--右部-->
    <div class="right">
      <!--用户登录-->
	  <div class="member_login">
    <form action="index.jsp" method="post">
    <ul>
      <p class="tit">会员登录</p>
      <li style="padding-top:10px;">用户名：
        <input class="sr" type="text" name="userName" />
        <p>
          <input type="checkbox" class="remberme"  name="cookietime" value="315360000"   />
          记住我</p>
      <li>密&nbsp;&nbsp;&nbsp;&nbsp;码：
        <input class="sr" type="password" name="userPass" id="userpass" />
        <br />
        <p style="top:80px">
	<input type="hidden" name="referer" value="./default.html" />
          <input type="button" id="submit" value="登录"/>
          <input type="hidden" name="loginsubmit" value="true"/>
        </p>
      </li>
  <li><font color="red"><%
request.setCharacterEncoding("utf-8");
String name = request.getParameter("userName");
if(request.getParameter("userName")!=null&&!request.getParameter("userName").toString().trim().equals("")){
%>
<jsp:setProperty name="myBean" property="*"/>
欢迎
<%=name %>
登录，您是第
<jsp:getProperty name="myBean" property="count"/>
位登录的用户。
<%} %><br></font></li>
      <span></span>
      <div class="member"></div>
    </ul>
  </form>
  </div>      <!--新手上路-->
      <hr style="border:3px solid #FFF"/>
      <div class="" style="cellspacing="5"">
        <!--左端窗内博客广告开始-->
        <img src="images/boke.jpg" width="230" height="66" />
        <!--左端窗内博客广告结束-->
      </div>
      <hr style="border:3px solid #FFF"/>
	   <!--站长寄语开始-->
      <DIV id="sider">
        <H2><SPAN></SPAN><A 
href="#" style="font-size:12px">站长寄语</A></H2>
     	  <!--跑马灯-->
          <ul>
    <marquee direction="UP" onmouseout="this.start();" onmouseover="this.stop();" style="margin-top:0px; padding:5px;width:95%;font-size:12px; LINE-HEIGHT: 20px; overflow:hidden" scrolldelay=200 scrollamount=4>
  &nbsp;&nbsp;&nbsp;&nbsp;欢迎光临中国<a href="http://www.itzcn.com" >计算机教程网</a>，我们将致力于创建权威原创计算机教程，努力营造互动学习交流平台，打造一流IT学习乐园，推进无纸化教学进程！！！<a href="#">视频教程</a>，将带您进入身临其境的视频教学氛围；<a href="#">在线课堂</a>，展现给您图文并茂的原创教程；如果在学习过程中有什么疑问，可以登录<a href="#">在线交流</a>栏目，在这里您可以得到权威人士的点拔和指导，当然您也可以为网友提供帮助，展现自己的智慧和才华；<a href="#">资源下载</a>，为您提供常用工具，最新软件；<a href="#">业界新闻</a>，了解IT最新动态，掌握更多IT资讯；<a href="#">图书推荐</a>最新计算机教程畅销图书重点推荐；更多精彩内容，敬请期待......您的支持是我们工作最大的动力!
    </marquee>
    <!--跑马灯/-->
    </ul>
        <SPAN class=sider_b></SPAN> </DIV>
      <!--站长寄语结束-->
	        <DIV id="sider">
<script type="text/javascript"><!--
google_ad_client = "ca-pub-8910150158289241";
/* 200&#42;200图片广告 */
google_ad_slot = "8046457936";
google_ad_width = 200;
google_ad_height = 200;
//-->
</script>
<script type="text/javascript"
src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
</script>

 </DIV>	  
      <!--内网公告开始-->
      <DIV id="sider">
        <H2><SPAN><A href="http://school.itzcn.com/announcements.html" style="font-size:12px">更多</A></SPAN><A 
href="http://school.itzcn.com/announcements.html" style="font-size:12px">窗内公告</A></H2>
        <UL>
           <LI><a href="http://school.itzcn.com/announcements-id-25.html#25" title="《Oracle完全学习手册》畅销图书推荐">《Oracle完全学习手册》畅销图书推荐</a></LI>
    <LI><a href="http://school.itzcn.com/announcements-id-23.html#23" title="《Visual C++2008完全学习手册》畅销图书推荐">《Visual C++2008完全学习手册》畅销图书推荐</a></LI>
    <LI><a href="http://school.itzcn.com/announcements-id-22.html#22" title="《SQL Server 2008完全学习手册》畅销图书推荐">《SQL Server 2008完全学习手册》畅销图书推荐</a></LI>
    <LI><a href="http://school.itzcn.com/announcements-id-21.html#21" title="《Struts 2完全学习手册》畅销图书推荐">《Struts 2完全学习手册》畅销图书推荐</a></LI>
    <LI><a href="http://school.itzcn.com/announcements-id-20.html#20" title="网络安全视频教程">网络安全视频教程</a></LI>
    <LI><a href="http://school.itzcn.com/announcements-id-19.html#19" title="Oracle 11g完全学习手册视频教程">Oracle 11g完全学习手册视频教程</a></LI>
    <LI><a href="http://school.itzcn.com/announcements-id-18.html#18" title="Windows XP 视频教程">Windows XP 视频教程</a></LI>
    <LI><a href="http://school.itzcn.com/announcements-id-17.html#17" title="Dreamweaver 视频教程">Dreamweaver 视频教程</a></LI>
    <LI><a href="http://school.itzcn.com/announcements-id-16.html#16" title="Flash视频教程">Flash视频教程</a></LI>
    <LI><a href="http://school.itzcn.com/announcements-id-15.html#15" title="Word 2007">Word 2007</a></LI>
            </UL>
        <SPAN 
class=sider_b></SPAN> </DIV>
      <!--内网公告结束-->

      <!--群公告开始-->
      <DIV id="sider">
        <H2><SPAN></SPAN><A 
href="#" style="font-size:12px">窗内官方群</A></H2>
        <UL>
          <LI style="BACKGROUND: url(images/groupico.gif) no-repeat left 50%;">&nbsp;&nbsp;窗内网一群：33925615</LI>
          <LI style="BACKGROUND: url(images/groupico.gif) no-repeat left 50%;">&nbsp;&nbsp;窗内网二群：45368980</LI>
          <LI style="BACKGROUND: url(images/groupico.gif) no-repeat left 50%;">&nbsp;&nbsp;窗内网三群：107423140</LI>
<LI style="BACKGROUND: url(images/groupico.gif) no-repeat left 50%;">&nbsp;&nbsp;窗内网四群：184726020</LI>
            </UL>
        <SPAN class=sider_b></SPAN> </DIV>
      <!--群公告结束-->
      <!--左端窗内博客广告开始-->
      <img src="images/zhuce.jpg" width="230" height="66" />
      <!--左端窗内博客广告结束-->
      <hr style="border:3px solid #FFF"/>
      <!--左端窗内博客广告开始-->
	  <!--
      <img src="images/xuebi.jpg" width="230" height="66" />
	  -->
      <!--左端窗内博客广告结束-->
    </div><!--/右部-->
</div>﻿<div class="clear"></div>
<div id="mainfoot">
<DIV id=foot>
<P class=foot><A href="aboutus.html" target="_blank">关于我们</A> | <A 
href="etrs.html" target="_blank">免责声明</A> | <A 
href="adver.html" target="_blank">广告合作</A> | <A 
href="knowledge.html" target="_blank">知识产权</A> | <A 
href="payment.html" target="_blank">支付方式</A> | <A 
href="contactus.html" target="_blank">联系方式</A> | <A 
href="zhaopin.html" target="_blank">加入我们</A> | 
<A href="http://www.371gold.com" target='_blank'>金帮手</A>
</P><P>
<EM>Copyrights Reserved 2005-2011</EM> 窗内网(<EM>www.itzcn.com</EM>)&nbsp;&nbsp; <EM>豫ICP备11020987号-2</EM><br> 
<A href='http://guestbook.zzwljc.com:8080/' target='_blank' BORDER='0'style="border:0">
<IMG  border='0' src='http://202.111.153.21/beian/jc1.gif' style="height:50px"></A>
<script src="http://s133.cnzz.com/stat.php?id=1267697&web_id=1267697&show=pic1" type="text/javascript"></script>
<A href='http://guestbook.zzwljc.com:8080/' target='_blank' BORDER='0'style="border:0;">
<IMG border='0' src='http://202.111.153.21/beian/jc2.gif' style="height:50px"></A>
<br/>郑公备：<a href='http://125.46.78.52:802/ShowResult.asp?sn=41010329000027' target='_blank'>41010329000027</a>
</P>

</DIV>
</div>

</body>

</html>
