<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<% 

int randNum 	= Integer.parseInt(request.getParameter("num"));

// session.setAttribute("num", 0);
// session.setAttribute("times", 0);

// 随机数初始化并保存
if (session.getAttribute("num") == null 
		|| session.getAttribute("num").equals("")) {
	session.setAttribute("num", ((int)(Math.random() * 100) + 1));
	session.setAttribute("times", 0); // 统计次数初始化
	session.setAttribute("min", 0);
	session.setAttribute("max", 101);
	session.setAttribute("isTiming", "false"); // 是否在计时
}


if(session.getAttribute("isTiming").equals("false")) {
	long startTime = System.currentTimeMillis();
	session.setAttribute("start", startTime);
	session.setAttribute("isTiming", "true"); 
}


int num = (Integer)session.getAttribute("num");
int tmp = (Integer)session.getAttribute("times"); // (Integer)转化
session.setAttribute("times", tmp+1);             // 更新统计次数

int min = (Integer)session.getAttribute("min");
int max = (Integer)session.getAttribute("max");


session.setAttribute("pre", randNum);
if(randNum < num) {
	out.print("太小");
	if(randNum > min) {
		session.setAttribute("min", randNum);
	}
	response.sendRedirect("small.jsp");	
}
else if(randNum == num) {
	out.print("success");
	response.sendRedirect("success.jsp");
}
else {
	out.print("太大");
	if(randNum < max) {
		session.setAttribute("max", randNum);
	}
	response.sendRedirect("large.jsp");
}


%>