package com.itzcn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private ArrayList<String> users = null;
	private ServletContext context  =null;
	

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		//在项目启动第一次时创建，该项目只创建一次，唯一的
        context = this.getServletContext(); 
        boolean flag = false;
        String url="../login.jsp";
        
        String username=request.getParameter("username");
      
        
        //获取用户列表,第一次获取时候为空   
        users =(ArrayList<String>)context.getAttribute("users");
        //第一个用户登录时
        if(users.isEmpty()){
            users = new ArrayList<String>();     
            users.add(username);   
            context.setAttribute("users", users);   //将第一个用户的名字保存到ServletContext对象中   
            System.out.println("--------第一个用户登录------");
            
        //非第一个用户登录   
        }else{
            for(String user : users){
                //如果该用户已经登录,请求error.jsp不让其再登录
                if(username.equals(user)){
                    url = "../error.jsp";   
                    System.out.println("--------重复登录------");
                    flag = true;
                    break;   
                }
            }
            if (!flag) {
                //如果该用户没登录,就将该用户的名字保存到ServletContext对象中
                System.out.println("--------非重复登录------");
                users.add(username); 
                
			} 

        }
        for (String string : users) {
			System.out.println("==========" + string+"==========");
		}

        
        response.sendRedirect(url); 
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
