<%@ page language="java"  pageEncoding="gb2312"%>
<%@ page import="java.io.*,com.lowagie.text.*,com.lowagie.text.pdf.*"%>
<%
	response.reset();
	response.setContentType("application/pdf");				//设置文档格式
	Document document = new Document();						//创建Document实例
	//进行表格设置
	Table table = new Table(3);					//建立列数为3的表格
	table.setBorderWidth(2);					//边框宽度设置为2
	table.setPadding(3);						//表格边距离为3
	table.setSpacing(3);
	Cell cell = new Cell("header");				//创建单元格作为表头
	cell.setHorizontalAlignment(Cell.ALIGN_CENTER);		
	cell.setHeader(true);						//表示该单元格作为表头信息显示
	cell.setColspan(3);							//合并单元格，使该单元格占用3个列
	table.addCell(cell);
	table.endHeaders();				//表头添加完毕，必须调用此方法，否则跨页时，表头联显示
	cell = new Cell("cell1");//添加一个一行两列的单元格
	cell.setRowspan(2);				//合并单元格，向下占用2行
	table.addCell(cell);
	table.addCell("cell2.1.1");
	table.addCell("cell2.2.1");
	table.addCell("cell2.1.2");
	table.addCell("cell2.2.2");
	ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	PdfWriter.getInstance(document, buffer);
	document.open();										//打开文档
	document.add(table);		//添加内容
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
