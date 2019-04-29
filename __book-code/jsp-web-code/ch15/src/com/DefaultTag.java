package com;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class DefaultTag extends TagSupport{
    public int doStartTag() throws JspException {
        Tag parent=getParent();
        
        //判断标记体是否可以执行 。
        if (!((SwitchTag) parent).getPermission())
            return SKIP_BODY;

        //如果没有<case>标记满足条件，则执行<default>标记的标记体。
        ((SwitchTag)parent).subTagSucceeded();
        return EVAL_BODY_INCLUDE;
    }
}