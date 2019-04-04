package com;

import java.util.Iterator;
import java.util.Map;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class IterateTag extends BodyTagSupport {
		
	Map map;         //要遍历的Map对象
	String element; //每次迭代存放当前对象的名称
	private Iterator it; //Map对象key值组成的Iterator对象
    //设置map属性的值，容器自动调用
	public void setMap(Map map){
			this.map = map;
		}
		//设置element属性的值,容器自动调用
		public void setElement(String element) {
			this.element = element;
		}
		//标签开始时运行doStartTag()方法
		public int doStartTag(){
			//获取当前map对象key值组成的iterator对象
			it = map.keySet().iterator();
			//取出当前key所对应的value值，并以element为名称保存在page范围内
			if(it.hasNext()){
				pageContext.setAttribute(element,it.next(),PageContext.PAGE_SCOPE);
			}
			return EVAL_BODY_INCLUDE; 
		}
		public int doAfterBody()throws JspTagException{
			if(it.hasNext()){
				//取出当前key所对应的value值，并以element为名称保存在page范围内
				pageContext.setAttribute(element,it.next(),PageContext.PAGE_SCOPE);
				return EVAL_BODY_BUFFERED;
			}else{
				return SKIP_BODY;
			}
		}
		public int doEndTag()throws JspTagException{
			try	{
				if(bodyContent!=null)
				//输出所有的body内容
				bodyContent.writeOut(bodyContent.getEnclosingWriter());
			}catch(java.io.IOException e){	}
			return EVAL_PAGE;
		}
	}