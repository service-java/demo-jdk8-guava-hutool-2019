package com;

import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HelloTag implements Tag
{
	private PageContext pageContext;
	private Tag parent;

	public void setPageContext(PageContext pc)
	{
		this.pageContext=pc;        
	}

	public void setParent(Tag t)
	{
		this.parent=t;        
	}

	public Tag getParent()
	{
		return parent;
	}

	public int doStartTag() throws JspException
	{        
		return SKIP_BODY;
	}

	public int doEndTag() throws JspException
	{   
		//利用pageContext对象的getOut()方法得到JspWriter对象。     
		JspWriter out=pageContext.getOut();
		try
		{
			//利用JspWriter对象，向客户端输出欢迎信息。
			out.print("Hello world ! 你好，世界！");
		}
		catch(IOException e)
		{
			System.err.println(e.toString());
		}
		return EVAL_PAGE;
	}

	public void release(){}
}