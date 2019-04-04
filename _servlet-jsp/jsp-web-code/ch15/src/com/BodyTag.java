package com;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.Hashtable;
import java.io.Writer;
import java.io.IOException;

public class BodyTag extends BodyTagSupport{
	int counts;//counts为迭代的次数。
	public BodyTag()	{
		super();
	}
	
	/**
	 *设置counts属性。这个方法由容器自动调用。
	 */
	public void setCounts(int c){
		this.counts=c;
	}
	
	/**
	 *覆盖doStartTag方法
	 */
	 public int doStartTag() throws JspTagException  {   
	     System.out.println("doStartTag");
	     if(counts>0) { 
	         return EVAL_BODY_TAG;
	     } 
	     else { 
	          return SKIP_BODY;
	     } 
    }
    
    /**
     *覆盖doAfterBody方法
     */
    public int doAfterBody() throws JspTagException { 
        System.out.println("doAfterBody"+counts);
        if(counts>1){
        	counts--;
        	return EVAL_BODY_TAG; 
         }  
         else{ 
            return SKIP_BODY; 
         } 
    }
    
   /**
     *覆盖doEndTag方法
     */
    public int doEndTag() throws JspTagException {
         System.out.println("doEndTag");
        try {  
             if(bodyContent != null) {
             	bodyContent.writeOut(bodyContent.getEnclosingWriter()); 
             }
        } 
        catch(java.io.IOException e){
        	throw new JspTagException("IO Error: " + e.getMessage());  
        }   
        return EVAL_PAGE;  
    }
    
     public void doInitBody() throws JspTagException{
      System.out.println("doInitBody");
     }
     public void setBodyContent(BodyContent bodyContent) {   
          System.out.println("setBodyContent");
          this.bodyContent=bodyContent; 
          
     }
}
