<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ page import="java.util.Vector"%>
<%@ page import="com.UserForm"%>

<%
	request.setCharacterEncoding("utf-8"); // 防止中文乱码
	
	String username = request.getParameter("username");
	boolean flag = true;
	Vector temp = (Vector) application.getAttribute("myuser");
	
	// 如果用户列表为空，重建空vector
	if(application.getAttribute("myuser")==null){
		temp = new Vector();
	}
	
	// 
	for(int i=0; i<temp.size(); i++){
		UserForm tempuser = (UserForm)temp.elementAt(i);
		if(tempuser.username.equals(username)){
			out.println("<script language='javascript'>alert('该用户已经登录'); " 
				+ "window.location.href='index.jsp';</script>");
	        flag = false;
	    }
	}
	
	UserForm mylist=new UserForm();
	mylist.username=username;
	
	//保存当前登录的用户名
	session.setAttribute("username",username);
	application.setAttribute("ul",username);
	
	Vector myuser = (Vector)application.getAttribute("myuser");
	if(myuser==null) {
		myuser=new Vector();
	}
	
	if(flag) {
		myuser.addElement(mylist);
	}
	application.setAttribute("myuser",myuser);
	response.sendRedirect("main.jsp");
%>
