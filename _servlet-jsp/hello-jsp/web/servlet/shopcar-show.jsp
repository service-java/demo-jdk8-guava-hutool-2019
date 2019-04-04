<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="valuebean.GoodsSingle" %>
<%
	//获取存储在session中用来存储用户已购买商品的buylist集合对象
	ArrayList buylist = (ArrayList)session.getAttribute("buylist");
	float total=0; 							//用来存储应付金额
%>
<table border="1" width="450" rules="none" cellspacing="0" cellpadding="0">
	<tr height="50"><td colspan="5" align="center">购买的商品如下</td></tr>
	<tr align="center" height="30" bgcolor="lightgrey">
		<td width="25%">名称</td>
		<td>价格(元/斤)</td>
		<td>数量</td>
		<td>总价(元)</td>
		<td>移除(-1/次)</td>
	</tr>
	<%	if(buylist==null||buylist.size()==0){ %>
	<tr height="100"><td colspan="5" align="center">您的购物车为空！</td></tr>
	<%
		}
		else{
			for(int i=0;i<buylist.size();i++){
				GoodsSingle single=(GoodsSingle)buylist.get(i);
				String name=single.getName();			//获取商品名称
				float price=single.getPrice();			//获取商品价格
				int num=single.getNum();				//获取购买数量
				//计算当前商品总价，并进行四舍五入
				float money=((int)((price*num+0.05f)*10))/10f;
				total+=money; 							//计算应付金额
	%>
	<tr align="center" height="50">
		<td><%=name%></td>
		<td><%=price%></td>
		<td><%=num%></td>
		<td><%=money%></td>
		<td><a href="<%=request.getContextPath()%>/BuyServlet?action=remove&name=<%=single.getName() %>">移除</a></td>
	</tr>
	<%
			}
		}
	%>
	<tr height="50" align="center"><td colspan="5">应付金额：<%=total%></td></tr>
	<tr height="50" align="center">
		<td colspan="2"><a href="shopping.jsp">继续购物</a></td>
		<td colspan="3"><a href="<%=request.getContextPath()%>/BuyServlet?action=clear">清空购物车</a></td>
	</tr>
</table>
