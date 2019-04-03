package com;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class SwitchTag extends TagSupport{
	//boolean类型的变量，用于判断子标记是否已经执行。
	private boolean subTagvalue;

	public SwitchTag(){
		subTagvalue=false;
	}

	public int doStartTag() throws JspException{
		//当遇到<switch>的起始标记时，子标记还没有开始执行，
		//所以将subTagExecuted设置为false。
		subTagvalue = false;
		return EVAL_BODY_INCLUDE;
	}

	// 这个方法由子标记处理器对象调用，用于判断是否可以执行自身的标记体。
	public synchronized boolean getPermission(){
		return (!subTagvalue);
	}

	// 如果其中一个子标记满足了条件，则调用这个方法，通知父标记。
	// 这样，其它的子标记将忽略它们的标记体，从而实现switch...case功能。
	public synchronized void subTagSucceeded() {	
		subTagvalue = true;
	}

	public void release(){
		subTagvalue=false;
	}
}