package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.Student_Manager;

public class AddStudentServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		HttpSession ses = request.getSession();
		
		String name = (String)request.getParameter("name");		
		String sex = (String)request.getParameter("radiobutton");		
		String image = (String)request.getParameter("image");		
		String grade = (String)request.getParameter("grade");		
		int grade_id = Integer.parseInt(grade);
		
		Student_Manager.Add_Student(name,grade_id,image,sex);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("guanli/student/add_success.jsp");
		requestDispatcher.forward(request,response);
	}
	
	public void doPost(
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException
		{
			doGet(request,response);
		}

}
