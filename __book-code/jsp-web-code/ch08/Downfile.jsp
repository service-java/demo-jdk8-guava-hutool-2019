<%@ page contentType="text/html;charset=GB2312"%>
<%@ page import="java.io.File"%>
<%@ page import="java.io.FilenameFilter"%>
<HTML>
      <head><title>显示现在文件</title></head>
      <body>
            <center>
         <h3>请选择要下载的文件</h3>
         <table >
            <%
               String path = request.getRealPath("/");
               File file1=new File(path,"\\upload");
               String str[]=file1.list();
               for(int i=0;i<str.length;i++){
                  String ss=str[i];
                  out.println("<tr><td>"+ss+"</td><td><a href='Downfile1.jsp?name1="+ss+"'>下载</a></td></tr>");
                }
           %>  
        </table>
        <center>
      </body>
</HTML>
