<!--
@Author: 骆金参
@Date:   2017-03-16T09:02:40+08:00
@Email:  1095947440@qq.com
@Filename: getinfo.jsp
@Last modified by:   骆金参
@Last modified time: 2017-03-16T09:29:46+08:00
-->


<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%
request.setCharacterEncoding("utf-8");

String name 	= request.getParameter("name");
String age  	= request.getParameter("age");
String gender = request.getParameter("gender");
String qualification = request.getParameter("qualification");
String hobby[] = request.getParameterValues("hobby");
String introduction = request.getParameter("introduction");

if(gender.equals("0")) {
	gender = "女";
}
else {
	gender = "男";
}

if(qualification.equals("highschool") ) {
	qualification = "高中毕业";
}
else if(qualification.equals("college")) {
	qualification = "本科";
}
else {
	qualification = "研究生";
}

String hobby_all = "";
if (hobby != null) {
	for (int i = 0, len = hobby.length;i < len; i++) {
	   hobby_all += hobby[i] + " ";
	}
}
hobby_all = hobby_all.replace("travel"		, "旅游");
hobby_all = hobby_all.replace("climb"		, "登山");
hobby_all = hobby_all.replace("exercise"	, "健身");


out.println("姓名：" + name + "<br>");
out.println("年龄：" + age + "<br>");
out.println("性别：" + gender + "<br>");
out.println("学历：" + qualification + "<br>");
out.println("爱好：" + hobby_all + "<br>");
out.println("自我介绍：" + introduction + "<br>");
%>
