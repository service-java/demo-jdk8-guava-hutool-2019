<!--
@Author: 骆金参
@Date:   2017-03-16T09:31:13+08:00
@Email:  1095947440@qq.com
@Filename: login_deal.jsp
@Last modified by:   骆金参
@Last modified time: 2017-03-16T09:38:28+08:00
-->

<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%@ page import="javax.servlet.http.Cookie" %>
<%@ page import="java.net.*" %>

<%
request.setCharacterEncoding("utf-8"); // 防止中文乱码

String name = request.getParameter("username"); // 获取表单用户名
String pwd  = request.getParameter("userpwd");  // 获取表单密码

// 校验用户名与密码
// 如果不是返回登录页面
if( ! (name.equals("zhangsan") &&  pwd.equals("123456"))) { 
	response.sendRedirect("login.jsp");
}

// 获取提交的
// 是否记住密码
Boolean isRemembered = false;
if(!(request.getParameter("is_remembered") == null)) {
	isRemembered = true;
}
out.print("记住密码：" + isRemembered + "<br>");

// cookie有关声名
Cookie cookie = null; 
Cookie[] cookies = request.getCookies();
Boolean hasUserName = false;
   
// 如果cookies为空
// 但是结合浏览器现在的情况
if( cookies != null) {
	
	for (int i = 0; i < cookies.length; i++){
	    cookie = cookies[i];
	    if(cookie.getName().equals("username") ) {
	    	hasUserName = true;
			break;
	    }
	}
	
	
	if(! hasUserName) {
		
		// 10天后过期
		Cookie username = new Cookie("username", name);
		Cookie userpwd  = new Cookie("userpwd", pwd);
		Cookie isremembered  = new Cookie("isremembered", "");
		
		if(isRemembered) {
			isremembered.setValue("on");
			username.setMaxAge(60*60*24*10); 
			userpwd.setMaxAge(60*60*24*10);
		} else {
			isremembered.setValue("off");
			username.setValue("");
			userpwd.setValue("");
		}
		
		response.addCookie(username);
		response.addCookie(userpwd);
		response.addCookie(isremembered);
		out.print("cookies被创建" + "<br>");

	}
		
	
	else {
		for (int i = 0; i < cookies.length; i++){
		    cookie = cookies[i];
		    
		    // 更新isremembered
		    if(cookie.getName().equals("isremembered")) {
		    	if(isRemembered) {
		    		cookie.setValue("on");
		    	}
		    	else {
		    		cookie.setValue("off");
		    	}
		    	response.addCookie(cookie);
		    }
		    
		    // 更新username
		    if(cookie.getName().equals("username")) {
		    	if( ! isRemembered) {
		    		cookie.setValue("");
		    		cookie.setMaxAge(-1);
				} else {
		    		cookie.setValue(name);
		    		cookie.setMaxAge(60*60*24*10);
				}
		    	response.addCookie(cookie);
		    }
		    
		    // 更新password
		    if(cookie.getName().equals("userpwd")) {
		    	if( ! isRemembered) {
		    		cookie.setValue("");
		    		cookie.setMaxAge(-1);
				} else {
		    		cookie.setValue(pwd);
		    		cookie.setMaxAge(60*60*24*10);
				}
		    	response.addCookie(cookie);
		    }
		    
		}
	}
	
} 
else {
	// 10天后过期
	Cookie username = new Cookie("username", name);
	Cookie userpwd  = new Cookie("userpwd", pwd);
	Cookie isremembered  = new Cookie("isremembered", "");
	
	if(isRemembered) {
		isremembered.setValue("on");
		username.setMaxAge(60*60*24*10); 
		userpwd.setMaxAge(60*60*24*10);
	} else {
		isremembered.setValue("off");
		username.setValue("");
		userpwd.setValue("");
	}
	
	response.addCookie(username);
	response.addCookie(userpwd);
	response.addCookie(isremembered);
	out.print("cookies被创建" + "<br>");
}

out.print("用户名："  + name + "<br>");
out.print("密码："   + pwd + "<br>");
out.print("<a href='login.jsp'>返回登录</a>");

%>
