import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class bookServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");

		if (action.equals("del")) {
			String url = "jdbc:mysql://localhost:3306/db_book";
			String username = "root"; // 用户名
			String password = "123456"; // 密码
			Connection conn = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, username, password);
				// 创建执行语句
				// 使用PreparedStatement添加多条记录
				String sql = "delete from books where id="
						+ request.getParameter("id");
				PreparedStatement pstmt = conn.prepareStatement(sql);
				// 执行更新语句
				pstmt.executeUpdate();
				// 关闭pstmt
				pstmt.close();
				response.sendRedirect("bookList.jsp");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		/*
		 * if ((action != null) && (action.equals("add"))) { String url =
		 * "jdbc:mysql://localhost:3306/db_book"; String username = "root"; //
		 * 用户名 String password = "123456"; // 密码 Connection conn = null; try {
		 * Class.forName("com.mysql.jdbc.Driver"); conn =
		 * DriverManager.getConnection(url, username, password); // 创建执行语句 //
		 * 使用PreparedStatement添加多条记录 String sql =
		 * "insert into books  values(?,?,?,?,?,?)"; PreparedStatement pstmt =
		 * conn.prepareStatement(sql); // 将从表单中获取的数据添加到预编译对象中 pstmt.setInt(1,
		 * Integer.parseInt(request.getParameter("id"))); pstmt.setString(2,
		 * request.getParameter("name")); pstmt.setString(3,
		 * request.getParameter("author")); pstmt.setInt(4,
		 * Integer.parseInt(request.getParameter("price"))); pstmt.setString(5,
		 * request.getParameter("pubdate")); pstmt.setString(6,
		 * request.getParameter("comments")); // 执行更新语句 pstmt.executeUpdate();
		 * // 关闭pstmt pstmt.close(); } catch (ClassNotFoundException e) {
		 * e.printStackTrace(); } catch (SQLException e) { e.printStackTrace();
		 * }
		 * 
		 * }
		 */

		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		if (action != null) {
			String url = "jdbc:mysql://localhost:3306/db_book";
			String username = "root"; // 用户名
			String password = "123456"; // 密码
			Connection conn = null;

			if (action.equals("add")) {
				System.out.print(request.getParameter("name"));
				try {

					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(url, username, password);
					// 创建执行语句
					// 使用PreparedStatement添加多条记录
					String sql = "insert into books  values(?,?,?,?,?,?)";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					// 将从表单中获取的数据添加到预编译对象中
					pstmt.setInt(1,
							Integer.parseInt(request.getParameter("id")));
					pstmt.setString(2, request.getParameter("name"));
					pstmt.setString(3, request.getParameter("author"));
					pstmt.setInt(4,
							Integer.parseInt(request.getParameter("price")));
					pstmt.setString(5, request.getParameter("publisher"));
					pstmt.setString(6, request.getParameter("comments"));
					// 执行更新语句
					pstmt.executeUpdate();
					// 关闭pstmt
					pstmt.close();
					response.sendRedirect("bookList.jsp");

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}/**/

			}
			if (action.equals("update")) {
				try {

					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(url, username, password);
					// 创建执行语句
					// 使用PreparedStatement添加多条记录
					String sql = "update books set name=?,author=?,price=?,publisher=?,intro=? where id=?";
					PreparedStatement pstmt = conn.prepareStatement(sql);
					// 将从表单中获取的数据添加到预编译对象中
					pstmt.setString(1, request.getParameter("name"));
					pstmt.setString(2, request.getParameter("author"));
					pstmt.setInt(3,
							Integer.parseInt(request.getParameter("price")));
					pstmt.setString(4, request.getParameter("publisher"));
					pstmt.setString(5, request.getParameter("comments"));
					pstmt.setInt(6,
							Integer.parseInt(request.getParameter("id")));
					// 执行更新语句
					pstmt.executeUpdate();
					// 关闭pstmt
					pstmt.close();
					response.sendRedirect("bookList.jsp");

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		}
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
