<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="java.io.*,com.lowagie.text.*,com.lowagie.text.pdf.*"%>
<%@ page import="java.net.URL" %>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
	response.reset();
	response.setContentType("application/pdf");
	Document document = new Document();
	//获取图片的路径
//	String filePath = pageContext.getServletContext().getRealPath("app/chart/harvest.jpg");
	Image jpg = Image.getInstance(basePath + "/app/chart/harvest.jpg");
	jpg.setAlignment(Image.MIDDLE);				//设置图片居中
	
	Table table=new Table(1);
	table.setAlignment(Table.ALIGN_MIDDLE);		//设置表格居中
	table.setBorderWidth(0); //将边框宽度设为0
	table.setPadding(3);						//表格边距离为3
	table.setSpacing(3);
	table.addCell(new Cell(jpg));							//将图片加载在表格中
	Cell cellword=new Cell("harvest");
	cellword.setHorizontalAlignment(Cell.ALIGN_CENTER);		//设置文字水平居中
	table.addCell(cellword);								//添加表格
	ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	PdfWriter.getInstance(document, buffer);
	document.open();
	//通过表格进行输出图片的内容
	document.add(table);
	document.close();
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
