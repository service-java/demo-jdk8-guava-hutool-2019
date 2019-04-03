package org.pan.web;

import java.sql.*;
import java.util.Vector;
import org.pan.util.*;
import javax.servlet.http.HttpServletRequest;
import org.pan.web.book.goods;


public class goodsmn extends DataBase {
	private goods agoods = new goods();	//新的类
	private javax.servlet.http.HttpServletRequest request; //建立页面请求
	private boolean sqlflag = true ;		//对接收到的数据是否正确
	private Vector goodslist;				//显示列表向量数组
	private int page = 1;					//显示的页码
	private int pageSize=10;				//每页显示的图书数
	private int pageCount =0;				//页面总数
	private long recordCount =0;			//查询的记录总数

	
	public goodsmn() throws Exception{
		super();
	}

	public Vector getGoodslist() {
		return goodslist;
	}

	public boolean getSqlflag() {
		return sqlflag;
	}

	public String getGbk( String str) {
		try
		{
			str =  new String(str.getBytes("ISO-8859-1"),"GBK");
			return str;
		}
		catch (Exception e)
		{
			return str;
		}
	}
	
	//将页面表单传来的资料分解
	public boolean getRequest(javax.servlet.http.HttpServletRequest newrequest) {
		boolean flag = false;
		try
		{	
			request = newrequest;
			String ID = request.getParameter("id");
			long bookid = 0;
			try
			{
				bookid = Long.parseLong(ID);
			}
			catch (Exception e)
			{
			}
			agoods.setId(bookid);
			String bookname = request.getParameter("bookname");
			if (bookname==null || bookname.equals(""))
			{
				bookname = "";
				sqlflag = false;
			}
			agoods.setGoodsName(getGbk(bookname)); 
			String author = request.getParameter("author");
			if (author==null || author.equals(""))
			{	
				author = "";
				sqlflag = false;
			}
			agoods.setAuthor(getGbk(author));
			String publish = request.getParameter("publish");
			if (publish==null)
			{
				publish = "";
			}
			agoods.setPublish(getGbk(publish));
			String bookclass = request.getParameter("bookclass");				
			int bc = Integer.parseInt(bookclass);
			agoods.setGoodsClass(bc);
			String bookno = request.getParameter("bookno");
			if (bookno == null)
			{
				bookno = "";
			}
			agoods.setGoodsNo(getGbk(bookno));
			float price;
			try	{
				price =new Float(request.getParameter("price")).floatValue();
			}
			catch (Exception e)
			{	
				price = 0;
				sqlflag = false;
			}
			agoods.setPrince(price);
			int amount;
			try
			{
				amount = new Integer(request.getParameter("amount")).intValue();	
			}
			catch (Exception e)
			{
				sqlflag = false;
				amount = 0;
			} 
			agoods.setAmount(amount);
			String content = request.getParameter("content");
			if (content == null)
			{	
				content = "";
			}
			agoods.setContent(getGbk(content));	
			if (sqlflag)
			{
				flag = true;
			}
			return flag;					
		}
		catch (Exception e)
		{
			return flag;
		}
	}

	public String getSql() {
		sqlStr = "select id,classname from my_goods order by id";
		return sqlStr;
	}


	public boolean execute(HttpServletRequest res) throws Exception {
		request = res;
		String PAGE = request.getParameter("page");   //页码
		String classid = request.getParameter("classid");	//分类ID号
		String keyword = request.getParameter("keyword");	//查询关键词
		if (classid==null) classid="";		
		if (keyword==null) keyword = "";
		keyword = getGbk(keyword).toUpperCase();
		try
		{
			page = Integer.parseInt(PAGE);
		}
		catch (NumberFormatException e)
		{
			page = 1;
		}
		 
		//取出记录数
		if (!classid.equals("") && keyword.equals("") ) {		
			sqlStr = "select count(*) from my_goods where goodsclass='" + classid + "'";
		} else if (!keyword.equals("")) {
			if (classid.equals(""))
			{
				sqlStr = "select count(*) from my_goods where upper(goodsname) like '%" +keyword+ "%' or upper(content) like '%" + keyword + "%'";
			} else {
				sqlStr = "select count(*) from my_goods where goodsclass='" + classid + "' and  (upper(goodsname) like '%" +keyword+ "%' or upper(content) like '%" + keyword + "%')";
			}
		} else {
			sqlStr = "select count(*) from my_goods";   
		}

		int rscount = pageSize;
		try
		{
			ResultSet rs1 = stmt.executeQuery(sqlStr);
			if (rs1.next()) recordCount = rs1.getInt(1);				
			rs1.close();
		}
		catch (SQLException e)
		{
			return false;
		}
		//设定有多少pageCount
		if (recordCount < 1)
            pageCount = 0;
        else
            pageCount = (int)(recordCount - 1) / pageSize + 1;
		//检查查看的页面数是否在范围内
		if (page < 1)  
            page = 1;
        else if (page > pageCount)
            page = pageCount;
		
		rscount = (int) recordCount % pageSize;	 // 最后一页记录数        

		//sql为倒序取值
		sqlStr = "select  a.id,a.goodsname,a.goodsclass,b.classname,a.author,a.publish,a.goodsno,a.content,a.prince,a.amount,a.Leav_number,a.regtime from My_goods a,My_goodsclass b where a.goodsclass = b.Id ";
		if (!classid.equals("") && keyword.equals("") ){  //如果类别不为空，非查询
			if (page == 1)
			{
				sqlStr = sqlStr + " and a.goodsclass='" + classid + "' order by a.Id desc";
			} else {
				sqlStr = sqlStr + " and a.goodsclass='" + classid + "' and a.Id not in ( select Id from My_goods order by Id ) and a.Id in " +
				"(select Id from My_goods ORDER BY Id )  order by a.Id desc";
			}		
		} else if (!keyword.equals("")) {  //如果是查询资料
			if (page == 1)
			{
				if (!classid.equals(""))  //查询某一类
				{
					sqlStr = sqlStr + "and a.goodsclass='" + classid + "' and (upper(a.goodsname) like '%" +keyword+ "%' or upper(a.content) like '%" + keyword + "%')  order by a.Id desc";
				} else {		//查询所有类
					sqlStr = sqlStr + " and (upper(a.goodsname) like '%" +keyword+ "%' or upper(a.content) like '%" + keyword + "%') order by a.Id desc";
				}
			} else { 
				if (!classid.equals(""))
				{
					sqlStr = sqlStr + " and a.goodsclass='" + classid + "' and (upper(a.goodsname) like '%" +keyword+ "%' or upper(a.content) like '%" + keyword + "%') and a.Id not in ( select Id from My_goods ORDER BY Id ) and a.Id in " +
					"(select Id from My_goods ORDER BY Id ) " + " order by a.Id desc";
				} else {
					sqlStr = sqlStr + " and (upper(a.goodsname) like '%" +keyword+ "%' or upper(a.content) like '%" + keyword + "%') and a.Id not in ( select Id from My_goods ORDER BY Id ) and a.Id in " +
					"(select Id from My_goods ORDER BY Id ) " + " order by a.Id desc";
				}
			}	

		} else {		//非查询，也非分类浏览
			if (page == 1)
			{
				sqlStr = sqlStr + "  order by a.Id desc";
			} else {
				sqlStr = sqlStr + " and a.Id not in ( select Id from My_goods ORDER BY Id ) and a.Id in " +
				"(select Id from My_goods ORDER BY Id) order by a.Id desc";
			}		
		}

		try
		{
			rs = stmt.executeQuery(sqlStr);
			goodslist = new Vector(rscount);
			while (rs.next())
			{
				goods good = new goods();
				good.setId(rs.getLong("id"));
				good.setGoodsName(rs.getString("goodsname"));
				good.setGoodsClass(rs.getInt("goodsclass"));
				good.setClassname(rs.getString("classname"));
				good.setAuthor(rs.getString("author"));
				good.setPublish(rs.getString("publish"));
				good.setGoodsNo(rs.getString("goodsno"));
				good.setContent(rs.getString("content"));
				good.setPrince(rs.getFloat("prince"));
				good.setAmount(rs.getInt("amount"));
				good.setLeav_number(rs.getInt("Leav_number"));
				good.setRegTime(rs.getString("regtime"));
				goodslist.addElement(good);
			}
			rs.close();
			return true;
		}
		catch (SQLException e)
		{
			
			System.out.println(e);
			return false;
		}
		

	}

	public boolean insert() throws Exception {
		sqlStr = "insert into my_goods (goodsname,goodsclass,Author,Publish,goodsno,Content,Prince,Amount,Leav_number,Regtime) values ('";
		sqlStr = sqlStr + strFormat.toSql(agoods.getGoodsName()) + "','";
		sqlStr = sqlStr + agoods.getGoodsClass() + "','";
		sqlStr = sqlStr + strFormat.toSql(agoods.getAuthor()) + "','";
		sqlStr = sqlStr + strFormat.toSql(agoods.getPublish()) + "','";
		sqlStr = sqlStr + strFormat.toSql(agoods.getGoodsNo()) + "','";
		sqlStr = sqlStr + strFormat.toSql(agoods.getContent()) + "','";
		sqlStr = sqlStr + agoods.getPrince() + "','";
		sqlStr = sqlStr + agoods.getAmount() + "','";
		sqlStr = sqlStr + agoods.getAmount() + "',";
		sqlStr = sqlStr + "now())";
		try
		{
			stmt.execute(sqlStr);
			return true;
		}
		catch (SQLException sqle)
		{
			System.out.println(sqle);
			return false;
		}
	}

	public boolean update() throws Exception {
		sqlStr = "update my_goods set ";
		sqlStr = sqlStr + "goodsname = '" + strFormat.toSql(agoods.getGoodsName()) + "',";
		sqlStr = sqlStr + "goodsclass = '" + agoods.getGoodsClass() + "',";
		sqlStr = sqlStr + "Author = '" + strFormat.toSql(agoods.getAuthor()) + "',";
		sqlStr = sqlStr + "publish = '" + strFormat.toSql(agoods.getPublish()) + "',";
		sqlStr = sqlStr + "goodsno = '" + strFormat.toSql(agoods.getGoodsNo()) + "',";
		sqlStr = sqlStr + "content = '" + strFormat.toSql(agoods.getContent()) + "',";
		sqlStr = sqlStr + "prince = '" + agoods.getPrince() + "',";
		sqlStr = sqlStr + "Amount = '" + agoods.getAmount() + "',";
		sqlStr = sqlStr + "leav_number = '" + agoods.getAmount() + "' ";
		sqlStr = sqlStr + "where id = '" + agoods.getId() + "'";
		try
		{		
			stmt.execute(sqlStr);
			return true;
		}
		catch (SQLException e)
		{
			return false;
		}
	
	}

	public boolean delete( int aid ) throws Exception {

		sqlStr = "delete from My_goods where id = "  + aid ;
		try
		{
			stmt.execute(sqlStr);
			return true;
		}
		catch (SQLException e)
		{
			System.out.println(e);
			return false;
		}
	}

	public boolean getOnebook(int newid ) throws Exception {
		try
		{
			sqlStr="select  a.id,a.goodsname,a.goodsclass,b.classname,a.author,a.publish,a.goodsno,a.content,a.prince,a.amount,a.Leav_number,a.regtime from My_goods a,My_goodsclass b where a.goodsclass=b.Id and a.Id = " + newid ;
			rs = stmt.executeQuery(sqlStr);
			
			if (rs.next())
			{	goodslist = new Vector(1);
				goods book = new goods();
				book.setId(rs.getLong("id"));
				book.setGoodsName(rs.getString("goodsname"));
				book.setGoodsClass(rs.getInt("goodsclass"));
				book.setClassname(rs.getString("classname"));
				book.setAuthor(rs.getString("author"));
				book.setPublish(rs.getString("publish"));
				book.setGoodsNo(rs.getString("goodsno"));
				book.setContent(rs.getString("content"));
				book.setPrince(rs.getFloat("prince"));
				book.setAmount(rs.getInt("amount"));
				book.setLeav_number(rs.getInt("Leav_number"));
				book.setRegTime(rs.getString("regtime"));
				goodslist.addElement(book);
			} else {
				rs.close();
				return false;
			}
			rs.close();
			return true;
		}
		catch (SQLException e)
		{
			System.out.println(e);
			return false;
		}
		
	}

	public int getPage() {				//显示的页码
		return page;
	}
	public void setPage(int newpage) {
		page = newpage;
	}

	public int getPageSize(){			//每页显示的图书数
		return pageSize;
	}
	public void setPageSize(int newpsize) {
		pageSize = newpsize;
	}

	public int getPageCount() {				//页面总数
		return pageCount;
	}
	public void setPageCount(int newpcount) {
		pageCount = newpcount;
	}

	public long getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(long newrcount) {
		recordCount= newrcount;
	}


};

