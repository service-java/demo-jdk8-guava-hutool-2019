package servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import valuebean.GoodsSingle;

public class ShopcarIndexServlet extends HttpServlet {
	private static ArrayList goodslist = new ArrayList();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();		
		session.setAttribute("goodslist",goodslist);
		response.sendRedirect("jump/servlet/shopping.jsp");
	}

	static{										//静态代码块
		String[] names={"苹果","香蕉","梨","橘子"};
		float[] prices={2.8f,3.1f,2.5f,2.3f};		
		for(int i=0;i<4;i++){
			GoodsSingle single=new GoodsSingle();
			single.setName(names[i]);
			single.setPrice(prices[i]);
			single.setNum(1);
			goodslist.add(single);
		}
	}
}