package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.Teacher_Manager;

public class EditTeacherServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession ses = request.getSession();
		
		String id = (String) request.getParameter("teacher_id");
		int ID = Integer.parseInt(id);
		String name = (String) request.getParameter("name");
		String sex = (String) request.getParameter("radiobutton");
		String zhicheng = (String) request.getParameter("zhicheng");
		String image = (String) request.getParameter("image");
		String info = (String) request.getParameter("info");

		Teacher_Manager.Edit_Teacher(name, sex, zhicheng, image, info, ID);

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("guanli/teacher/edit_success.jsp");
		requestDispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
