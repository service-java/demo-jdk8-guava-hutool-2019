package com;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import javax.servlet.ServletOutputStream;

public class GZIPServletOutputStream extends ServletOutputStream {
	
	private GZIPOutputStream gzipoutputstream;
	public GZIPServletOutputStream(ServletOutputStream sos) throws IOException
	{
		//使用响应输出流对象构造GZIPOutputStream过滤流对象
		this.gzipoutputstream = new GZIPOutputStream(sos);		
	}
	@Override
	public void write(int data) throws IOException
	{
		//将写入操作委托给GZIPOutputStream对象的write()方法，从而实现响应输出流的压缩
		gzipoutputstream.write(data);
	}
	
	/**
	 * 返回GZIPOutputStream对象，过滤器需要访问这个对象，以便完成将压缩数据写入输出流的操作
	 */
	public GZIPOutputStream getGZIPOutputStream()
	{
		return gzipoutputstream;
	}

}
