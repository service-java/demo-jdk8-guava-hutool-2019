package servlet;

import valuebean.Info;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import toolbean.MyTools;

/**
 * Created by Luo_0412 on 2017/4/12.
 */
public class InfoServlet extends HttpServlet {
    private Info info = new Info();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession(); // 引入session

        String name = MyTools.toChinese(request.getParameter("name"));
        int age 	= Integer.parseInt(request.getParameter("age"));
        String gender = MyTools.toChinese(request.getParameter("gender"));
        String qualification = MyTools.toChinese(request.getParameter("qualification"));
        String[] hobby = MyTools.toChinese(request.getParameterValues("hobby"));
        String introduction = MyTools.toChinese(request.getParameter("introduction"));

        // 这种方式不太适宜
        // session主要是存储用户信息的
        // 而且没有必要封装到对象
        // sendRedirect重定向是不传参的
//        info.setName(name);
//        info.setAge(age);
//        info.setGender(gender);
//        info.setIntroduction(introduction);
//        info.setHobby(hobby);
//        info.setQulification(qualification);
//        session.setAttribute("info", info);
//        response.sendRedirect("lab/lab8/getinfo.jsp");

        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.setAttribute("gender", gender);
        request.setAttribute("qualification", qualification);
        request.setAttribute("introduction", introduction);
        request.setAttribute("hobby", hobby);


        request.getRequestDispatcher("lab/lab8/getinfo.jsp").forward(request, response);
    }

}
