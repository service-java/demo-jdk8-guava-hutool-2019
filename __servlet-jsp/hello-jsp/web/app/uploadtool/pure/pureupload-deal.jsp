<%@ page import="java.io.FileOutputStream" %>
<%@ page import="java.io.File" %>
<%@ page import="java.io.DataInputStream" %><%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>HTML5 Page Title</title>

    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" style="margin-top: 20px;">

    <%
        int MAX_SIZE = 102400 * 102400; //定义上载文件的最大字节
        String rootPath; // 创建根路径的保存变量
        DataInputStream in = null; //声明文件读入类
        FileOutputStream fileOut = null;
        String remoteAddr = request.getRemoteAddr(); //取得客户端的网络地址

        //String serverName = request.getServerName(); //获得服务器的名字
        //String realPath = request.getRealPath(serverName);//取得互联网程序的绝对地址
        //realPath = realPath.substring(0,realPath.lastIndexOf("\\"));

        // rootPath = request.getSession().getServletContext().getRealPath("/")+ "/app/uploadtool/upload/"; //创建文件的保存目录
        rootPath =  application.getRealPath("/") + "/app/uploadtool/upload/";

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
    <a href="pureupload-index.jsp">继续上传文件</a>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>