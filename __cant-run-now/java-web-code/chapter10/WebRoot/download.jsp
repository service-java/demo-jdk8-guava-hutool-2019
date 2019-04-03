<%@page import="java.net.URLDecoder"%>
<%@page import="java.io.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
	request.setCharacterEncoding("gb2312");
	response.setCharacterEncoding("gb2312"); //设置响应编码格式
	response.setContentType("text/html;charset=gb2312");
	String pathname = request.getParameter("path"); //获取传递过来的参数
	pathname = new String(pathname.getBytes("iso8859-1"), "gb2312");
	File file = new File(pathname); //创建File对象
	out.println(java.net.URLEncoder.encode(file.getName(), "iso8859-1"));
	out.println(java.net.URLEncoder.encode(file.getName(), "gb2312"));
	out.println(URLDecoder.decode(file.getName(), "utf-8"));
	if (file.exists() == false) {
		out.println("<p align ='center'>文件不存在或已被删除，下载失败!!<p>");
	} else {
		InputStream ins = new FileInputStream(file); //创建InputStream对象，读取文件
		OutputStream os = response.getOutputStream(); //获取响应输出流
		response.addHeader(
				"Content-Disposition",
				"attachment;filename="
						+ java.net.URLEncoder.encode(file.getName(),
								"gb2312"));
		response.addHeader("Content-Length", file.length() + "");
		response.setContentType("application/octet-stream"); //设置响应正文类型
		int data = 0;
		while ((data = ins.read()) != -1) { //从文件流中循环读取字节
			os.write(data); //将输出字节流
		}
		out.clear();
		out = pageContext.pushBody();
		os.close();
		ins.close();
	}
%>
