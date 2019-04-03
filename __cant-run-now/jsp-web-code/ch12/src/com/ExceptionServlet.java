package com;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class ExceptionServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
               throws ServletException,IOException
    {   
        try
        {
            int a=5;
            int b=0;
            int c=a/b;
        }
        catch(ArithmeticException e)
        {
            req.setAttribute("javax.servlet.error.exception",e);
            req.setAttribute("javax.servlet.error.request_uri",req.getRequestURI());            
            RequestDispatcher rd=req.getRequestDispatcher("ExceptionHandler");
            rd.forward(req,resp);
        }
    }
}