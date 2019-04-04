package com;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener,
		ServletContextAttributeListener {

	private ServletContext context = null;

    /**
     *以下代码实现ServletContextListener接口。
     */
    public void contextDestroyed(ServletContextEvent sce) {
    	logout("contextDestroyed()-->ServletContext被销毁");
    	this.context = null;

    }

    public void contextInitialized(ServletContextEvent sce) {
    	this.context = sce.getServletContext();
    	logout("contextInitialized()-->ServletContext初始化了");

    }//ServletContextListener

    /**
     *以下代码实现 ServletContextAttributeListener接口
     */    
    public void attributeAdded(ServletContextAttributeEvent scae) {
    	logout("增加了一个ServletContext属性：attributeAdded('" + scae.getName() + "', '" +
    			scae.getValue() + "')");

    }

    public void attributeRemoved(ServletContextAttributeEvent scae) {
    	logout("删除了一个ServletContext属性：attributeRemoved('" + scae.getName() + "', '" +
    			scae.getValue() + "')");

    }


    public void attributeReplaced(ServletContextAttributeEvent scae) {
    	logout("某个ServletContext的属性被改变：attributeReplaced('" + scae.getName() + "', '" +
    			scae.getValue() + "')");

    }

    private void logout(String message) {		    
    	PrintWriter out=null;
    	try {
    		out=new PrintWriter(new FileOutputStream("c:\\test.txt",true));
    		out.println(new java.util.Date().toLocaleString()+"::Form ContextListener: " + message);
    		out.close();
    	}
    	catch(Exception e) {
    		out.close();
    		e.printStackTrace();
    	}

    }  

}
