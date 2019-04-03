<%@ page contentType="text/html;charset=GB2312" %>
<% 
 String str=request.getParameter("submit");
 if(str==null) {
 	str="";
 }
 if(str.equals("yes")) {
 	response.setContentType("application/msword;charset=GB2312");
 }
%> 
<HTML>
<head>
    <title>response对象示例</title>
</head>
<BODY>
<P>我正在学习response对象
<P>将当前页面保存为word文档吗？
<FORM method="get" name="form">
	<INPUT TYPE="submit" value="yes" name="submit">
</FORM>
</BODY>
</HTML>
