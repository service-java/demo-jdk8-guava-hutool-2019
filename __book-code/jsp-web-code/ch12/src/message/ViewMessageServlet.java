package message;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for Servlet: ViewMessageServlet
 * 
 */
public class ViewMessageServlet extends javax.servlet.http.HttpServlet
		implements javax.servlet.Servlet {
	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	private Connection con;

	public ViewMessageServlet() {
		String url = "jdbc:mysql://localhost/liuyan";
		String userName = "root";
		String password = "root";
		String sql = null;
		con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("加载驱动器类时出现异常");
		}
		try {
			con = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			System.out.println("出现SQLException异常");
		}
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Collection ret = new ArrayList();
		try {
			Statement stm = con.createStatement();
			ResultSet result = stm.executeQuery("select count(*) from message");
			int message_count = 0;
			if (result.next()) {
				message_count = result.getInt(1);
				result.close();
			}
			if (message_count > 0) {
				result = stm
						.executeQuery("select * from message order by time desc");

				while (result.next()) {
					String title = result.getString("title");
					String name = result.getString("name");
					String mail = result.getString("mail");
					String content = result.getString("content");
					java.sql.Date date = result.getDate("time");
					MessageVO message = new MessageVO();
					message.setName(name);
					message.setTitle(title);
					message.setContent(content);
					message.setDate(date);
					message.setEmail(mail);
					ret.add(message);

				}
				result.close();
				stm.close();
				request.setAttribute("messages", ret);// 和第一种方式的不同之处
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("viewMessages.jsp");
				dispatcher.forward(request, response);
			}
			// con.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}