package com.itzcn.listener;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnLineCountListener implements ServletContextListener, HttpSessionListener,
		HttpSessionAttributeListener {
	// 声明一个ServletContext对象
	private ServletContext application = null;
	private ArrayList<String> users = null;
	private HttpSession session = null;
	private String user = null;
	//context初始化时激发
	public void contextInitialized(ServletContextEvent sce) {
		// 容器初始化时，向application中存放一个空的容器
		this.application = sce.getServletContext();
		this.application.setAttribute("users", new ArrayList<String>());
		
	}
	//context删除时激发
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	public void sessionCreated(HttpSessionEvent se) {
	}
	public void sessionDestroyed(HttpSessionEvent se) {		
		session = se.getSession();    
		user = (String)session.getAttribute("username");    
       users = (ArrayList<String>)session.getServletContext().getAttribute("users");  
        for(String u:users){ 
            //将这个用户从ServletContext对象中移除 
            if(u.equals(user)){   
                users.remove(u);      
                break;   
            }   
        }   
        //将session设置成无效  
        session.invalidate();   
        System.out.println("一个Session被销毁了!"); 
	}
	public void attributeAdded(HttpSessionBindingEvent se) {
		// 如果登陆成功，则将用户名保存在列表之中
		users=(ArrayList<String>)application.getAttribute("users");
		users.add(se.getValue().toString());
		this.application.setAttribute("users", users);
	}
	//删除一个新的属性时激发
	public void attributeRemoved(HttpSessionBindingEvent se) {
	}
	//属性被替代时激发
	public void attributeReplaced(HttpSessionBindingEvent se) {
	}
}
