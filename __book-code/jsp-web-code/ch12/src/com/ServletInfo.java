package com;

import java.io.*;
import java.util.*;
import javax.servlet.*;

/**
 * 获取自身信息的Servlet
 */
public class ServletInfo extends GenericServlet {

	private Map initParams = new LinkedHashMap();
	private String servletName = null;

	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		// 获得初始化参数名称集合
		Enumeration paramNames = getInitParameterNames();
		// 获得所有参数的初始值
		while (paramNames.hasMoreElements()) {
			String name = (String) paramNames.nextElement();
			// 按参数名获得参数的初始值
			String value = getInitParameter(name);
			initParams.put(name, value);
		}

		// 获得Servlet的名称
		servletName = getServletName();
	}

	public void service(ServletRequest request, ServletResponse response)
	throws ServletException, IOException {
		
		response.setContentType("text/html;charset=GB2312");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<head>");
		out.println("<title>获取Servlet自身的信息</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Servlet自身的信息：</h2>");
		out.println("<h4>配置名称：" + servletName + "</h4><br>");
		out.println("<h4>初始参数:</h4>");
		out.println("<table width=\"350\" border=\"1\">");
		out.println("<tr>");
		out.println("<td width=\"175\">参数名</td>");
		out.println("<td width=\"175\">参数值</td>");
		out.println("</tr>");

		Set paramNames = initParams.keySet();
		Iterator iter = paramNames.iterator();
		while (iter.hasNext()) {

			String name = (String) iter.next();
			String value = (String) initParams.get(name);

			out.println("<tr>");
			out.println("<td>" + name + "</td>");
			out.println("<td>" + value + "</td>");
			out.println("</tr>");

		}

		out.println("</table>");	
		out.println("</body>");
		out.println("</html>");
	}

}