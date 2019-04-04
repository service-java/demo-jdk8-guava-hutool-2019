#### 第一次提升技巧


* JavaBean

```
title=title.replace("<","&lt;");						//替换标题中的“<”字符
title=title.replace(">","&gt;");						//替换标题中的“>”字符
content=content.replace("<","&lt;");					//替换内容中的“<”字符
content=content.replace(">","&gt;");					//替换内容中的“>”字符

<%@ page import="toolbean.MyTools" %>
title=MyTools.change(title);		
content=MyTools.change(content);
	
// 使用JavaBean来实现	
```

* Servlet

```

    <servlet>
        <servlet-name>MyServlet</servlet-name>
        <servlet-class>servlet.MyServlet</servlet-class>
    </servlet>
    <servlet-mapping>
    <servlet-name>MyServlet</servlet-name>
    <url-pattern>/textServlet</url-pattern>
</servlet-mapping>
    
// 访问 http://localhost:8686/Grammar/textServlet

// 留言板
http://localhost:8686/Grammar/jump/servlet/note-index.jsp
    
// 购物车    
http://localhost:8686/Grammar/ShopcarIndexServlet
    
```
