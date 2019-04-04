<%@ page contentType="text/html;charset=GB2312" %><%@ page import="java.io.*" %><%  response.reset();
  try{
   String str=request.getParameter("name1");   //获得响应客户的输出流：
   str=new String(str.getBytes("iso8859-1"),"gb2312");
   String path = request.getRealPath("/");
   path = path.substring(0,path.lastIndexOf("\\")); 
   path = path + "\\upload\\"; 
   File fileLoad=new File(path,str);//下载文件位置：
   response.reset();
   OutputStream o=response.getOutputStream();
   BufferedOutputStream bos=new BufferedOutputStream(o);
   byte b[]=new byte[500];  //输出文件用的字节数组,每次发送500个字节到输出流：
    response.setHeader("Content-disposition","attachment;filename="+new String(str.getBytes("gb2312"),"iso8859-1")); //客户使用保存文件的对话框   
   response.setContentType("application/x-tar");//通知客户文件的MIME类型：
    long fileLength=fileLoad.length();//通知客户文件的长度：
    String length=String.valueOf(fileLength);
    response.setHeader("Content_Length",length);
   FileInputStream in=new FileInputStream(fileLoad);//读取文件,并发送给客户下载:
    int n=0;
   while((n=in.read(b))!=-1)
      { bos.write(b,0,n);
      }
    bos.close();
     }catch(Exception e){System.out.print(e);}
  response.reset();
%>