package servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import toolbean.MyTools;
import toolbean.ShopCar;
import valuebean.GoodsSingle;

public class BuyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");	//获取action参数值
		if(action==null)
			action="";
		if(action.equals("buy"))					//触发了“购买”请求
			buy(request,response);						//调用buy()方法实现商品的购买
		if(action.equals("remove"))					//触发了“移除”请求
			remove(request,response);					//调用remove()方法实现商品的移除
		if(action.equals("clear"))					//触发了“清空购物车”请求
			clear(request,response);					//调用clear()方法实现购物车的清空
	}
	//实现购买商品的方法
	protected void buy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();		
		String strId=request.getParameter("id");		//获取触发“购买”请求时传递的id参数，该参数存储的是商品在goodslist对象中存储的位置	
		int id=MyTools.strToint(strId);
		
		ArrayList goodslist=(ArrayList)session.getAttribute("goodslist");
		GoodsSingle single=(GoodsSingle)goodslist.get(id);
		
		ArrayList buylist=(ArrayList)session.getAttribute("buylist");		//从session范围内获取存储了用户已购买商品的集合对象
		if(buylist==null)
			buylist=new ArrayList();
		
		ShopCar myCar=new ShopCar();
		myCar.setBuylist(buylist); 						//将buylist对象赋值给ShopCar类实例中的属性
		myCar.addItem(single);							//调用ShopCar类中addItem()方法实现商品添加操作
		
		session.setAttribute("buylist",buylist);		
		response.sendRedirect("jump/servlet/shopcar-show.jsp");				//将请求重定向到show.jsp页面
	}
	//实现移除商品的方法
	protected void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		ArrayList buylist=(ArrayList)session.getAttribute("buylist");
		
		String name = request.getParameter("name");
		ShopCar myCar = new ShopCar();
		myCar.setBuylist(buylist);						//将buylist对象赋值给ShopCar类实例中的属性
		myCar.removeItem(MyTools.toChinese(name));		//调用ShopCar类中removeItem ()方法实现商品移除操作
		
		response.sendRedirect("jump/servlet/shopcar-show.jsp");
	}
	//实现清空购物车的方法
	protected void clear(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		ArrayList buylist=(ArrayList)session.getAttribute("buylist");			//从session范围内获取存储了用户已购买商品的集合对象
		buylist.clear();														//清空buylist集合对象，实现购物车清空的操作
		
		response.sendRedirect("jump/servlet/shopcar-show.jsp");
	}
}