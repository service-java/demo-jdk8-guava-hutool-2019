package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: SessionServlet
 *
 */
public class SessionServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public SessionServlet() {
		super();
	}   	

	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */	
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html;charset=GB2312");
		PrintWriter out = response.getWriter();

		out.println("<html><head>");
		out.println("<title>HttpSession Servlet" +"</title>");
		out.println("</head><body>");

		// 获取会话对象
		HttpSession session = request.getSession();
		// 从会话对象中读取数据
		Boolean isLogin = (Boolean) session.getAttribute("isLogin");

		if (isLogin == null) {
			isLogin = Boolean.FALSE;
		}

		String user = request.getParameter("user");
		String password = request.getParameter("pass");

		if (isLogin.booleanValue()) {
			// 从会话对象中读取数据
			user = (String) session.getAttribute("user");
			Date loginTime = new Date(session.getCreationTime());

			out.println("<h2>欢迎您，" + user + "！</h2>");
			out.println("<h2>在" + loginTime + "时间登录！</h2>");
		} else if ((user != null) && (password != null)) {
			// 在会话对象中保存数据
			session.setAttribute("user", user);
			session.setAttribute("isLogin", Boolean.TRUE);
			Date loginTime = new Date(session.getCreationTime());

			out.println("<h2>欢迎您，" + user + "！</h2>");
			out.println("<h2>在" + loginTime + "时间登录！</h2>");
		} else {
			out.println("<h2>请在下面输入登录信息</h2>");
			out.println("<form method=\"post\" action=\"getSession\">");
			out.println("<table>");

			out.println("<tr>");
			out.println("<td>用户名：</td>");
			out.println("<td><input name=\"user\" type=\"text\"></td>");
			out.println("</tr>");

			out.println("<tr>");
			out.println("<td>密码：</td>");
			out.println("<td><input name=\"pass\" type=\"password\"></td>");
			out.println("</tr>");

			out.println("<tr>");
			out.println("<td></td>");
			out.println("<td><input name=\"ok\" type=\"submit\" value=\"确定\">");
			out.println("<input name=\"cancel\" type=\"reset\" value=\"重置\"></td>");
			out.println("</tr>");

			out.println("</table>");
			out.println("</form>");
		}

		out.println("</body>");
		out.println("</html>");
	}
}  	
