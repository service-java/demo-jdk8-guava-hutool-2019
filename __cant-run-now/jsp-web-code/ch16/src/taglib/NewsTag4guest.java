package taglib;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import DBQuery.DataProcess;
import Object.News;

public class NewsTag4guest  extends TagSupport{
	
	public int doEndTag() throws JspException {
		
		JspWriter out = pageContext.getOut();
		
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		        
		 String str = (String) request.getQueryString();
		    System.out.println("str=="+str);
	        int page;
	        if (str == null || str.equals(""))
	            page = 1;
	        else {				
	            String[] aa = str.split("=");
	            page = Integer.parseInt(aa[1]);
	        }
		
		try
		{
			String strSql = new String("select * from news order by datetime desc");			
			int count = DataProcess.nCount(strSql);			
			int totalPages = 0;
			
			if(count%5==0)
			{
				totalPages=count/5;
			}
			else
			{
				totalPages = count/5+1;
			}
			
			int currentPage=1;
			
			if(page<=0)
			{
				currentPage=1;
			}
			else if(page>totalPages)
			{
				currentPage=totalPages;
			}
			else
			{
				currentPage = page;
			}
		
            Vector Items = News.search(strSql, page);

            out.println("<table width=\"100%\"  border=\"0\" cellspacing=\"1\" cellpadding=\"1\" class=\"tableBorder\">" );
         
            for (int i = 0; i < Items.size(); i++) 
            {
            	News bean = (News) Items.elementAt(i);
            	
            	out.println("<tr>");            	
            	out.println("<td bgcolor=\"E4EDF9\" class=\"normalText\">"+bean.getTitle()+"</td>");            	
            	out.println("</tr>");
            	out.println("<tr>");
            	out.println("<td bgcolor=\"F1F3F5\" class=\"normalText\">"+bean.getContent()+"</td>");
            	out.println("</tr>");
            	out.println("<tr>");
            	out.println("<td>&nbsp;</td>");
            	out.println("</tr>");   
            	            	
            }

            out.println("<tr>");        	
        	out.println("<td colspan=\"2\"><table width=\"100%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"E4EDF9\">");        	
        	out.println("<tr class=\"normalText\">");
        	out.println("<td>页次:"+currentPage+"/"+totalPages+"页&nbsp;每页5 总数"+count+"</td>");
        	out.println("<td align=\"right\">分页:");
        	if(page!=-1){
        	out.println("<a href=\"index.jsp?arg1=-1\">首页</a> ");
        	}
        	
        	out.println("<a href=\"index.jsp?arg2=-2\">上一页</a> ");        	
        	out.println("<a href=\"index.jsp?arg3=-3\">下一页</a> ");
        	if(page!=-4){
            out.println("<a href=\"index.jsp?arg4=-4\">尾页</a></td>");
        	}
        	out.println("</tr>");
        	out.println("</table></td>");
        	out.println("</tr>");        	
            out.println("</table>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return SKIP_BODY;
	}

}
