<%@ page language="java"  pageEncoding="utf-8"%>
<%@ page import="java.io.*,com.lowagie.text.*,com.lowagie.text.pdf.*"%>
<%
	response.reset();
	response.setContentType("application/pdf");				//设置文档格式
	Document document = new Document();						//创建Document实例
	//进行中文输出设置
	BaseFont bfChinese = BaseFont.createFont("STSong-Light",
			"UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
	Paragraph par = new Paragraph("宝剑峰从磨砺出",new Font(bfChinese, 12, Font.NORMAL));
	par.add(new Paragraph(" 梅花香自苦寒来",new Font(bfChinese, 12, Font.ITALIC)));
	ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	PdfWriter.getInstance(document, buffer);
	document.open();										//打开文档
	document.add(par);		//添加内容
	document.close();

	//关闭文档
	//解决抛出IllegalStateException异常的问题
	out.clear();
	out = pageContext.pushBody();
	DataOutput output = new DataOutputStream(response.getOutputStream());

	byte[] bytes = buffer.toByteArray();
	response.setContentLength(bytes.length);

	for (int i = 0; i < bytes.length; i++) {
		output.writeByte(bytes[i]);
	}
%>
