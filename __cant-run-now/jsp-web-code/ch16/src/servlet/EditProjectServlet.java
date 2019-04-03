package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.Project_Manager;

public class EditProjectServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		HttpSession ses = request.getSession();
		
		String id = (String)request.getParameter("project_id");		
		int ID = Integer.parseInt(id);		
		String name = (String)request.getParameter("name");		
		String info = (String)request.getParameter("info");		
		String time = (String)request.getParameter("time");
		
		Project_Manager.Edit_Project(ID,name,info,time);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/guanli/project/edit_success.jsp");
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
