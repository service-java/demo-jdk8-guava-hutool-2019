package message;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: AddMessageServlet
 *
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddMessageServlet extends HttpServlet {
    private Connection con;
    public void doGet(HttpServletRequest request ,HttpServletResponse response)
         throws IOException,ServletException{
    	response.setContentType("text/html;charset=gb2312");
    	request.setCharacterEncoding("gb2312");
        String name    = request.getParameter("name");
        String title   = request.getParameter("title");
        String email=request.getParameter("email");
        String content = request.getParameter("content");
        if(name==null)
            name = "";
        if(title==null)
            title = "";
        if(content==null)
            content = "";
        if(email==null)
        	email="";
        try
        {
            PreparedStatement stm=con.prepareStatement("insert into message values(?,?,?,?,?)");
            stm.setString(1,title);
            stm.setString(2,name);
            stm.setDate(3,new java.sql.Date(new java.util.Date().getTime()));
            if((email).length()==0)
                stm.setString(5,null);
            else stm.setString(5,email);
                    stm.setString(4,content);
            try
            {
                stm.executeUpdate();
            }catch(Exception e){}
            //关闭数据库库连接
                //con.close();
            RequestDispatcher dispatcher =
    			request.getRequestDispatcher("/ViewMessageServlet");
            dispatcher.forward(request, response);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
public void doPost(HttpServletRequest request,HttpServletResponse response)
throws IOException ,ServletException{
     doGet(request,response);
}
     public AddMessageServlet()
     {
    	 String url = "jdbc:mysql://localhost/liuyan";
		String userName = "root";
		String password = "root";
		String sql = null;
		con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			System.out.println("加载驱动器类时出现异常");
		}
		try {
			con = DriverManager.getConnection(url, userName, password);
		} catch(SQLException e) {
			System.out.println("出现SQLException异常");
		}	
     }
} 
