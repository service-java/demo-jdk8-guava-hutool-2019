package com;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompressionFilter implements Filter {

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterchain) throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpServletResponse httpResp = (HttpServletResponse) response;

		String acceptEncodings = httpReq.getHeader("Accept-Encoding");
		if (acceptEncodings != null && acceptEncodings.indexOf("gzip") > -1)
		{
			// 得到响应对象的封装类对象
			CompressionResponseWrapper respWrapper = new CompressionResponseWrapper(
					httpResp);
			
			// 设置Content-Encoding实体报头，告诉浏览器实体正文采用了gzip压缩编码
			respWrapper.setHeader("Content-Encoding", "gzip");
			filterchain.doFilter(httpReq, respWrapper);
			
			//得到GZIPOutputStream输出流对象
			GZIPOutputStream gzipos = respWrapper.getGZIPOutputStream();
			//调用GZIPOutputStream输出流对象的finish()方法完成将压缩数据写入
			//响应输出流的操作，无须关闭输出流
			gzipos.finish();
		}
		else
		{
			filterchain.doFilter(httpReq, httpResp);
		}

	}

	public void init(FilterConfig filterConfig)  throws ServletException {}

}
