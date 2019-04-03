package toolbean;


import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class ShowDate extends TagSupport {
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			Date dt = new Date();
			java.sql.Date date = new java.sql.Date(dt.getTime());
			out.print(date);
		} catch (Exception e) {
			System.out.println("显示系统日期出现的异常：" + e.getMessage());
		}
		return (SKIP_BODY); // 返回SKIP_BODY常量，表示不对标签体进行处理
	}
}
