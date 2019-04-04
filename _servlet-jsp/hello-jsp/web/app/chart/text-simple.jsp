<%@ page language="java"  pageEncoding="utf-8"%>
<%@ page import="java.io.*,com.lowagie.text.*,com.lowagie.text.pdf.*"%>

<%
	response.reset();
	response.setContentType("application/pdf");				//设置文档格式
	Rectangle rectPageSize = new Rectangle(PageSize.A4);	//定义A4页面大小

	Document document = new Document(rectPageSize);			//创建Document实例
	PdfWriter.getInstance(document,new FileOutputStream("welcomePage.pdf"));
	document.addTitle("欢迎页");
	document.addAuthor("wgh");
	document.open();										//打开文档
	document.add(new Paragraph("Welcome to BeiJing"));		//添加内容
	document.close();										//关闭文档


	//解决抛出IllegalStateException异常的问题
	out.clear();
	out = pageContext.pushBody();
%>