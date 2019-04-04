package com;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{
	public void init(){}
     
    public void doGet(HttpServletRequest req, HttpServletResponse res)
               throws ServletException,IOException {
        req.setCharacterEncoding("gb2312");
        String username=req.getParameter("username");
        String welcomeInfo="welcome"+ ", " + username;
        
        res.setContentType("text/html;charset=gb2312");
        
        PrintWriter out=res.getWriter();
        
        out.println("<html><head><title>");
        out.println("WelcomeServlet");
        out.println("</title></head>");
        out.println("<body>");
        out.println(welcomeInfo);
        out.println("</body></html>");
        out.close();
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse res)
                    throws ServletException,IOException{
        doGet(req,res);
    }
}