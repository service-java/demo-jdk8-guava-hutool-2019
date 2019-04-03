package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.News_Manager;

public class EditNewsServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		HttpSession ses = request.getSession();
		String title = (String)request.getParameter("title");
		String content = (String)request.getParameter("content");
		String ID = (String)request.getParameter("news_id");
		
		int id = Integer.parseInt(ID);
				
		News_Manager.Edit_News(title,content,id);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("./guanli/news/edit_success.jsp");
		System.out.println("dispatch URI"+request.getRequestURI());
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
