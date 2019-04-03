package com;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class CaseTag extends TagSupport{
    private boolean cond;
    
    public CaseTag(){
        cond=false;
    }
    
    public void release(){
        cond=false;
    }
    
    public void setCond(boolean cond){
        this.cond=cond;
    }
    
    public int doStartTag() throws JspException{
        Tag parent=getParent();

       //判断是否可以执行自身的标记体。
        if (!((SwitchTag) parent).getPermission())
            return SKIP_BODY;

        //如果条件为true，则通知父标记，已经有一个子标记满足条件了。
        //否则，忽略标记体。
        if (cond) {
            ((SwitchTag)parent).subTagSucceeded();
           
            return EVAL_BODY_INCLUDE;
        } else{
            return SKIP_BODY;
        }
    }
}