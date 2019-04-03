package com;

import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HelloSimpleTag extends SimpleTagSupport{
	
	private JspFragment body;
    private String name; 
    
    public void setName(String name) {
        this.name=name;
        
    }
    
    public void setJspBody(JspFragment jspBody){
        this.body=jspBody;
    }
    
    public void doTag() throws JspException, java.io.IOException {
    	
    	getJspContext().getOut().print(this.name );
    
    	getJspContext().getOut().print( ":" );
        //body.invoke(null);   
    }

}
