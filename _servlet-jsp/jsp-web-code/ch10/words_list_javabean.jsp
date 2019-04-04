<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.ch10.*" %>
<jsp:useBean id="pages" scope="page" class="com.ch10.splitPage"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!	
	//每页显示的记录数
	int pageSize = 3;
	String sqlStr="";
	//当前页
	int showPage=1;
	//数据库用户名
	String userName="root";
	//数据库密码
	String userPassword="root";
    //数据库的URL，包括连接数据库所使用的编码格式
	String url="jdbc:mysql://localhost:3306/ch10?useUnicode=true&characterEncoding=gb2312";
	//定义连接对象
	Connection dbcon;
%>
<%
	try 
	{
		//加载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		//获得数据库的连接对象
		dbcon= DriverManager.getConnection(url,userName,userPassword);				
	}
	catch(SQLException ex)
	{
		//打印出异常信息
		System.out.println(ex.toString());		
	}
	catch(ClassNotFoundException ex)
	{
		//打印出异常信息
		System.out.println(ex.toString());	
	}

	//给pages中参数con赋值
	pages.setCon(dbcon);	
	sqlStr = "select * from words order by WordsID";
	//查询数据表，获得查询结果	
	String strPage=null;
	//获取跳转到的目的页面
	strPage=request.getParameter("showPage");
	if (strPage==null)
	{
		showPage=1;
	}
	else
	{
		try
		{
			showPage=Integer.parseInt(strPage);
		}
		catch(NumberFormatException e)
		{
			showPage = 1;
		}
		if(showPage<1) 
		{
			showPage=1;
		}
	}
pages.initialize(sqlStr,pageSize,showPage);
	//获取要显示的数据集合
	Vector vData=pages.getPage();
%>
<html> 
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>分页显示</title>
	</head>
	<body bgcolor="#FFFFFF" text="#000000">
		<h1 align=center>留言簿</h1>
		<div align=center>
		<table border="1" cellspacing="0" cellpadding="0" width="80%"> 
			<tr> 
			<th width="20%">编号</th> 
			<th width="50%">留言标题</th> 
			<th width="30%">留言时间</th> 
			</tr>
		<% 
			for(int i=0;i<vData.size();i++)
			{ 
				//显示数据
				String[] sData=(String[])vData.get(i);
		%>
				<tr> 
					<td><%=sData[0]%></td> 
					<td align=left><%=sData[1]%></td> 
					<td align=left>
					<%
						//显示留言时间，省去时间串中"."后面的字符
						String str_WordsTime = sData[3];
						if(str_WordsTime.indexOf(".")>-1)
						{

str_WordsTime=str_WordsTime.substring(0,str_WordsTime.indexOf("."));
						}
						out.println(str_WordsTime);
					%>			
					</td> 
				</tr> 		
		<%
			}
		%>
		</table>
		<form action="words_list_javabean.jsp" method="get" target="_self">	
			共<font color=red><%=pages.getRowCount()%></font>条&nbsp;
			<%=pageSize%>条/页&nbsp;
			第<font color=red><%=showPage%></font>页/共<font 
color=red><%=pages.getPageCount()%></font>页 &nbsp;
			<a href="words_list_javabean.jsp?showPage=1" target="_self">[首
页]</a>&nbsp;			
			<%
				//判断"上一页"链接是否要显示
				if(showPage > 1)
				{				
			%>
					<a 
href="words_list_javabean.jsp?showPage
=<%=showPage-1%>" target="_self">[上一页]</a>&nbsp;
			<%
				}
				else
				{
			%>
					[上一页]&nbsp;
			<%
				}
				//判断"下一页"链接是否要显示
				if(showPage < pages.getPageCount())
				{				
			%>
					<a 
href="words_list_javabean.jsp?showPage
=<%=showPage+1%>" target="_self">[下一页]</a>&nbsp;
			<%
				}
				else
				{
			%>
					[下一页]&nbsp;
			<%
				}
			%> 
			<a 
href="words_list_javabean.jsp?showPage
=<%=pages.getPageCount()%>" target="_self">[尾页]</a>&nbsp;
			转到
			<select name="showPage">
			<%
				for(int x=1;x<=pages.getPageCount();x++)
				{
			%>
					<option value="<%=x%>" <%if(showPage==x) 
out.println("selected");%> ><%=x%></option>
			<%
				}
			%>
			</select>			
			页&nbsp;
			<input type="submit" name="go" value="提交"/>
		</form>
		<%
			//关闭数据库连接
			dbcon.close();		
		%>
		</div>
	</body>
</html>
