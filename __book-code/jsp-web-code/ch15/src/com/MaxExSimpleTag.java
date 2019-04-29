package com;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class MaxExSimpleTag extends SimpleTagSupport implements DynamicAttributes
{
    private ArrayList<String> al=new ArrayList<String>();
    
    public void setDynamicAttribute(java.lang.String uri,
                                    java.lang.String localName,
                                    java.lang.Object value)
                             throws JspException
    {
        //将所有属性的值保存到ArrayList对象中。
        al.add((String)value);
    } 
    
    public void doTag() throws JspException, java.io.IOException
    {
        JspContext jspCtx=getJspContext();
        JspWriter out=jspCtx.getOut();
        
        int max=Integer.parseInt(al.get(0));
        
        int size=al.size();
        int num;
        
        //循环比较，找出最大值。
        for(int i=1;i<size;i++)
        {
            num=Integer.parseInt(al.get(i));
            max=max > num ? max : num;
        }
        //将最大值作为属性max的值，保存到页面范围。
        jspCtx.setAttribute("max",new Integer(max));
    }
}