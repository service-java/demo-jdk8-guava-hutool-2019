package com;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpErrHandlerServlet extends HttpServlet
{
    protected void service(HttpServletRequest req, HttpServletResponse resp)
                    throws ServletException, java.io.IOException
    {
        resp.setContentType("text/html;charset=GB2312");
        PrintWriter out = resp.getWriter();
        
        Integer status_code=(Integer)req.getAttribute("javax.servlet.error.status_code");
        
        out.println("<html><head><title>错误页面</title></head>");
        out.println("<body>");
        
        //如果你的JDK版本低于1.5，那么你应该按照如下方式调用
        //int status=status_code.intValue();
        //switch(status){...}
        switch(status_code)
        {
        case 401:
            break;
        case 404:
            out.println("<h2>HTTP状态代码："+status_code+"</h2>");
            out.println("您正在搜索的页面可能已经删除、更名或暂时不可用。");
            out.println("转到<a href='mailto:admin@jsp.org'>网站管理员</a>服务支持。");
            break;
        case 500:
        	out.println("<h2>HTTP状态代码："+status_code+"</h2>");
        	out.println("The server encountered an internal error () that prevented it from fulfilling this request");
        	break;
        default:
            break;
        }
        out.println("</body></html>");
        out.close();
    }
}