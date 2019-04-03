<%request.setCharacterEncoding("gb2312");
response.setCharacterEncoding("gb2312");
%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="java.io.*"%>

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
      <h2><img src="imgs/bullet1.gif" />上传结果</h2>
      <div class="prod clear">
      <% 
   int MAX_SIZE = 102400 * 102400; //定义上载文件的最大字节 
   String rootPath; // 创建根路径的保存变量 
   DataInputStream in = null; //声明文件读入类 
   FileOutputStream fileOut = null; 
   String remoteAddr = request.getRemoteAddr(); //取得客户端的网络地址 
   //String serverName = request.getServerName(); //获得服务器的名字 
   //String realPath = request.getRealPath(serverName);//取得互联网程序的绝对地址 
   //realPath = realPath.substring(0,realPath.lastIndexOf("\\")); 
   rootPath = request.getSession().getServletContext().getRealPath("/")+ "upload/"; //创建文件的保存目录
   out.println("<h3>上传文件保存目录为"+rootPath+"</h3>"); 
   String contentType = request.getContentType(); //取得客户端上传的数据类型 
try{ 
   if(contentType.indexOf("multipart/form-data") >= 0){ 
   in = new java.io.DataInputStream(request.getInputStream()); //读入上传的数据 
   int formDataLength = request.getContentLength(); 
   if(formDataLength > MAX_SIZE){ 
      out.println("<P>上传的文件字节数不可以超过" + MAX_SIZE + "</p>"); 
       return; 
   } 
   byte dataBytes[] = new byte[formDataLength]; //保存上传文件的数据 
   int byteRead = 0; 
   int totalBytesRead = 0; 
   while(totalBytesRead < formDataLength){ //上传的数据保存在byte数组 
         byteRead = in.read(dataBytes,totalBytesRead,formDataLength); 
        totalBytesRead += byteRead; 
} 
   String file = new String(dataBytes); //根据byte数组创建字符串 
   String saveFile = file.substring(file.indexOf("filename=\"") + 10); //取得上传的数据的文件名 
   saveFile = saveFile.substring(0,saveFile.indexOf("\n")); 
   saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1,saveFile.indexOf("\"")); 
   int lastIndex = contentType.lastIndexOf("="); 
   String boundary = contentType.substring(lastIndex + 1,contentType.length());//取得数据的分隔字符串 
   String fileName = rootPath + saveFile; 
   int pos; 
   pos = file.indexOf("filename=\""); 
   pos = file.indexOf("\n",pos) + 1; 
   pos = file.indexOf("\n",pos) + 1; 
   pos = file.indexOf("\n",pos) + 1; 
   int boundaryLocation = file.indexOf(boundary,pos) - 4; 
   int startPos = ((file.substring(0,pos)).getBytes()).length;//取得文件数据的开始的位置  
   int endPos = ((file.substring(0,boundaryLocation)).getBytes()).length; //取得文件数据的结束的位置 
   File checkFile = new File(fileName); //检查上载文件是否存在 
   if(checkFile.exists()){ 
         out.println("<p>" + saveFile + "文件已经存在.</p>"); 
    } 
   File fileDir = new File(rootPath);//检查上载文件的目录是否存在  
   if(!fileDir.exists()){ 
      fileDir.mkdirs(); 
    } 
   fileOut = new FileOutputStream(fileName); //创建文件的写出类 
   fileOut.write(dataBytes,startPos,(endPos - startPos)); //保存文件的数据 
   fileOut.close(); 
    out.println("<p align=’center’><font color=red size=5>" + saveFile + "文件成功上传.</font></p>"); 
   }
   else{ 
   String content = request.getContentType(); 
   out.println("<p>上传的数据类型不是multipart/form-data</p>"); 
    } 
   }catch(Exception ex)
    { 
         throw new ServletException(ex.getMessage()); 
   } 
%> 
<a href="uploadfile.jsp">继续上传文件</a>
      
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