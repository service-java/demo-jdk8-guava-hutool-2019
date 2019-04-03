<%@ page contentType="text/html; charset=utf-8" language="java" import="java.util.*" %>
<%@ page import="com.UserForm"%>
<% request.setCharacterEncoding("utf-8"); %>

<% Vector myuser = (Vector)application.getAttribute("myuser"); %>

<table width="100%">
  <tr><td height="32" align="center" class="word_orange ">欢迎来到丫丫聊天室！</td></tr>
  <tr>
  <td height="23" align="center"><a  href="#" onclick="set('所有人')">所有人</a></td>
  </tr>  
 	<%	for(int i=0;i<myuser.size();i++){
		UserForm mylist=(UserForm)myuser.elementAt(i); %>
  <tr>
    <td height="23" align="center"><a href="#" onclick="set('<%=mylist.username%>')"><%=mylist.username%></a></td>
  </tr>
<%}%>
<tr><td height="30" align="center">当前在线[<font color="#FF6600"><%=myuser.size()%></font>]人</td></tr>
</table>