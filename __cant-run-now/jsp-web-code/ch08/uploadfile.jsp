<%@ page contentType="text/html;charset=gb2312" %>
<html>
     <head><title>上传文件</title></head>
    <body bgcolor="#ffffff" text="#000000">
         <p><b><font size=5>选择要上传文件</font></b></p> 
        <FORM METHOD="POST" ACTION="uploadfile1.jsp" ENCTYPE="multipart/form-data">
             <INPUT TYPE="FILE" NAME="FILE1" SIZE="30"><BR>
             <INPUT TYPE="SUBMIT" VALUE="开始上传">
        </FORM>
    </body>
</html>

