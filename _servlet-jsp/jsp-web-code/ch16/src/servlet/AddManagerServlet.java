
package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.Admin_Manager;


/**
 * 
 * @author liuyu
 *2007-7-21
 */
public class AddManagerServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		HttpSession ses = request.getSession();
		
		String username = (String)request.getParameter("username");
		
		String password = (String)request.getParameter("password");
		
		boolean tag = Admin_Manager.HasAdmin(username);
		
		if(tag)
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("guanli/manage/add_error.jsp");
			
			requestDispatcher.forward(request,response);
		}
		else
		{
			Admin_Manager.add_Admin(username,password);
		
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("guanli/manage/add_success.jsp");
		
			requestDispatcher.forward(request,response);
		}
	}
	
	
	public void doPost(
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException
		{
			doGet(request,response);
		}

}
