<!--
@Author: 骆金参
@Date:   2017-03-23T11:39:08+08:00
@Email:  1095947440@qq.com
@Filename: buy.jsp
@Last modified by:   骆金参
@Last modified time: 2017-03-23T13:07:20+08:00
-->


<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Map" %>
<%@page import="java.util.HashMap" %>
<%@page import="java.util.Iterator" %>
<%@page import="java.net.URLDecoder" %>

<%
   // equest.setCharacterEncoding("UTF-8");

   String type = request.getParameter("type"); 
   String price = request.getParameter("price");
   String bookname = request.getParameter("bookname");
   bookname = new String(bookname.getBytes("ISO-8859-1"), "UTF-8");
   // bookname = java.net.URLDecoder.decode(bookname, "UTF-8");
   
   // out.print(bookname);
   
   ArrayList books = null;
   if(session.getAttribute("books")!=null){
       books = (ArrayList) session.getAttribute("books");
   }else{
       books = new ArrayList();
   }
   Iterator iter=books.iterator();
   HashMap hm=null;
   boolean hasFound=false;
   while(iter != null && iter.hasNext()) {
	   hm = (HashMap)iter.next();
	   String bname = (String)hm.get("bookname");
	   int tmp = type.equals("del") ? -1 : 1;
	   if(bname.equals(bookname)) {
		   int n = (Integer)hm.get("quantity") + tmp;
		   hm.replace("quantity",n); // 
		   hasFound = true;
		   
		   // 如果为零
		   if(n == 0) { 
			   books.remove(hm); // 直接删除 
			   break;
		   }
		   break;
	   }
   }
   if(!hasFound){
	   Map book=new HashMap();
	   book.put("bookname", bookname);
	   book.put("price", price);
	   book.put("quantity", 1);
	   books.add(book);
   }
 
   session.setAttribute("books", books);
%>

<% 
	if(type.equals("buy")) { %>
		<jsp:forward page="bookList.jsp" />
<% 	} else { %>
		<jsp:forward page="checkout.jsp" />
<% 	}
%>
