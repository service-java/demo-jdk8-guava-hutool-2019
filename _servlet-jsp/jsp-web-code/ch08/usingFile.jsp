<%@page contentType="text/html"%>
  <%@page pageEncoding="GB2312"%>
  <%@page import="java.io.*"%>
  <html>
      <head><title>运用File对象</title></head>
      <body>
      <%
          String thePath=request.getRealPath("/")+"ch08\\theFile" ; 
          File myDir = new File(thePath)   ;
          File myFile = new File(thePath,"testFile.txt" )   ;
          File mynotExistFileFile = new
   			 File(thePath,"notExistFile.txt" )   ;
          out.println(
                  "目录 "+thePath+ " 是否存在：" + 
                  myDir.exists() + "<BR>"  );
          out.println(
                  "文件 "+thePath+ "\\testFile.txt 是否存在：" + 
                  myFile.exists() + "<BR>" );
          out.println("文件 "+thePath+ "\\notExistFile.txt 是否存在：" +
          mynotExistFileFile.exists() + "<BR>"+ "<BR>" );
          out.println("文件 "+thePath+ "\\testFile.txt 是否可读取：" + 
          myFile.canRead() + "<BR>" );
          out.println("文件 "+thePath+ "\\testFile.txt 是否可写入：" + 
          myFile.canWrite() + "<BR>" );
      %>
      </body>
  </html>
