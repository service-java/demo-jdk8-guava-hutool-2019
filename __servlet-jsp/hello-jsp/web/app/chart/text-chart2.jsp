<%@ page language="java"  pageEncoding="gb2312"%>
<%@ page import="java.io.*,com.lowagie.text.*,com.lowagie.text.pdf.*"%>
<%
	response.reset();
	response.setContentType("application/pdf");				//设置文档格式
	Document document = new Document();						//创建Document实例
	//生成2行5列的表格	
	PdfPTable table = new PdfPTable(5);
	for (int i = 1; i < 11; i++) {
		PdfPCell cell = new PdfPCell();
		cell.addElement(new Paragraph("N0."+String.valueOf(i)));
		table.addCell(cell);
	}
	ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	PdfWriter.getInstance(document, buffer);
	document.open();										//打开文档
	document.add(table);		//添加表格
	document.close();										//关闭文档
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
