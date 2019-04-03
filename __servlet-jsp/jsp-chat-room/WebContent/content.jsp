<%@ page contentType="text/html; charset=utf-8" 
	language="java" import="java.util.*" errorPage="" %>
<% request.setCharacterEncoding("utf-8"); %>
<%
if(session.getAttribute("username").equals("null")){
	out.println("<script language='javascript'>alert('您还没有登录不能进入本聊天室');" + 
		"parent.location.href='login.html';</script>");
}

if(session.getAttribute("username").equals("request.getParameter("+request.getParameter("tempuser")+")")){
	out.println("<script language='javascript'>alert('请重新选择聊天对象');</script>");
}

String message=request.getParameter("message");
String select=request.getParameter("select");
String tempuser=request.getParameter("tempuser");
String color=request.getParameter("color");

if(message!=null&&tempuser!=null){
	if(message.startsWith("<")){
		out.print("<marquee direction='left' scrollamount='23'>"+
		"<font color='blue'>"+"请不要输入带有标记的特殊符号"+"</font>"+"</marquee>");
		return;
	}else if(message.endsWith(">")){
		out.print("<marquee direction='left' scrollamount='25'>"+
		"<font color='blue'>"+"请不要输入带有标记的特殊符号"+"</font>"+"</marquee>");
		return;
	}
	if(application.getAttribute("message")==null){	//第一个人说话时
		application.setAttribute("message","<br>"+"<font color='blue'>"+
		"<strong>"+session.getAttribute("username")+"</strong>"+"</font>"+"<font color='#CC0000'>"+select+"</font>"+"对"+"<font color='green'>"+"["+tempuser+"]"+"</font>"+"说："+"<font color="+color+">"+message);
	}else{
		application.setAttribute("message","<br>"+"<font color='blue'>"+"<strong>"+session.getAttribute("username")+"</strong>"+"</font>"+"<font color='#CC0000'>"+select+"</font>"+"对"+"<font color='green'>"+"["+tempuser+"]"+"</font>"+"说："+"<font color="+color+">"+message+"</font>"+application.getAttribute("message"));
	}
	out.println("<p>"+application.getAttribute("message")+"<p>");
}else{
	if(application.getAttribute("message")==null){
		out.println("<font color='#cc0000'>"+application.getAttribute("ul")+"</font>"+"<font color='green'>"+"走进了网络聊天室"+"</font>");
		out.println("<br>"+"<center>"+"<font color='#aa0000''>"+"请各位聊友注意聊天室的规则,不要在本聊天室内发表反动言论及对他人进行人身攻击，不要随意刷屏。"+"</font>"+"</center>");
	}else{
	out.println(application.getAttribute("message")+"<br>");
	}
}
%>
