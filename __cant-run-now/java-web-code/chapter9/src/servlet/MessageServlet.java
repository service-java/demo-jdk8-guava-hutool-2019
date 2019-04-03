package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MessageDao;
import entity.Message;

public class MessageServlet extends HttpServlet {

	/**
	 * doGet()方法
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * doPost()方法	 
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		MessageDao md=new MessageDao();
		List<Message> eml=md.meList();
		session.setAttribute("meList",eml);
		request.getRequestDispatcher("/anli/message.jsp").forward(request, response);		
	}

	

}
