package servlet;

import toolbean.MyTools;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import db.ConnDB;


/**
 * Created by Luo_0412 on 2017/4/19.*/
public class StuServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action == null) { request.getRequestDispatcher("lab/lab9/list-stu.jsp").forward(request, response); }
        if(action.equals("add")) { add(request,response); }
        if(action.equals("show")) { show(request,response); }
        if(action.equals("edit")) { edit(request,response); }
        if(action.equals("del")) { del(request,response); }
    }

    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = MyTools.toChinese(request.getParameter("name"));
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = MyTools.toChinese(request.getParameter("gender"));
        String qualification = MyTools.toChinese(request.getParameter("qualification"));
        String hobby = MyTools.strArrToStr(
                MyTools.toChinese(request.getParameterValues("hobby")));
        String introduction = MyTools.toChinese(request.getParameter("introduction"));
        String sql = "insert into student values (null, ";
        sql += "'" + name + "' , ";
        sql += "" + age + ", ";
        sql += "'" + gender + "' ,";
        sql += "'" + hobby + "' ,";
        sql += "'" + qualification + "' ,";
        sql += "'" + introduction + "')";

        try {
            ConnDB conn = new ConnDB();
            conn.getConnection();
            conn.executeUpdate(sql);

            request.setAttribute("status", "success");
            request.getRequestDispatcher("lab/lab9/add-stu.jsp").forward(request, response);
        } catch(Exception e) {
            request.setAttribute("status", "error");
            request.getRequestDispatcher("lab/lab9/add-stu.jsp").forward(request, response);
        }

    }

    protected void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.getRequestDispatcher("lab/lab9/show-stu.jsp").forward(request, response);
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = MyTools.toChinese(request.getParameter("name"));
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = MyTools.toChinese(request.getParameter("gender"));
        String qualification = MyTools.toChinese(request.getParameter("qualification"));
        String hobby = MyTools.strArrToStr(
                MyTools.toChinese(request.getParameterValues("hobby")));
        String introduction = MyTools.toChinese(request.getParameter("introduction"));
        String sql = "update student set ";
        sql += " name = '" + name + "' , ";
        sql += " age = " + age + ", ";
        sql += " gender = '" + gender + "' ,";
        sql += " hobby = '" + hobby + "' ,";
        sql += " qualification = '" + qualification + "' ,";
        sql += " introduction = '" + introduction + "' ";
        sql += " where id = " + id;
//        System.out.print(sql);

        try {
            ConnDB conn = new ConnDB();
            conn.getConnection();
            conn.executeUpdate(sql);

            request.setAttribute("status", "success");
            request.getRequestDispatcher("lab/lab9/list-stu.jsp").forward(request, response);
        } catch(Exception e) {
            request.setAttribute("status", "error");
            request.getRequestDispatcher("lab/lab9/list-stu.jsp").forward(request, response);
        }
    }

    protected void del(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from student where id = " + id;

        try {
            ConnDB conn = new ConnDB();
            conn.getConnection();
            conn.executeUpdate(sql);

            request.getRequestDispatcher("lab/lab9/list-stu.jsp").forward(request, response);
        } catch(Exception e) {
            request.getRequestDispatcher("lab/lab9/list-stu.jsp").forward(request, response);
        }

    }

}
