package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import toolbean.MyTools;
import valuebean.WordSingle;

public class WordServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//以下代码用来获取表单中字段内容并进行转码
		String author=MyTools.toChinese(request.getParameter("author"));
		String title=MyTools.toChinese(request.getParameter("title"));
		String content=MyTools.toChinese(request.getParameter("content"));
		
		//获取当前时间并格式化时间为指定格式
		String today=MyTools.changeTime(new Date());
		
		WordSingle single=new WordSingle();									//创建值JavaBean对象用来封装获取的信息
		single.setAuthor(MyTools.changeHTML(author));
		single.setTitle(MyTools.changeHTML(title));
		single.setContent(content);
		single.setTime(today);
		
		HttpSession session=request.getSession();							//获取session对象
		ServletContext scx=session.getServletContext();						//通过session对象获取应用上下文
		ArrayList wordlist=(ArrayList)scx.getAttribute("wordlist");			//获取存储在应用上下文中的集合对象
		if(wordlist==null)
			wordlist=new ArrayList();
		wordlist.add(single);								//将封装了信息的值JavaBean存储到集合对象中
		scx.setAttribute("wordlist",wordlist);				//将集合对象保存到应用上下文中
		response.sendRedirect("jump/servlet/note-show.jsp");					//将请求重定向到show.jsp页面
	}
}
