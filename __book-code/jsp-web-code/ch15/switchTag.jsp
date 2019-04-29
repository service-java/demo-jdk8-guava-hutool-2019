<%@ page contentType="text/html;charset=GB2312"%>
<%@ taglib uri="/mytag" prefix="my"%>

<%
String language = request.getParameter("language");
%>
<h2>100请选择不同语言表达
<br><hr>
<my:switch>
	<my:case cond="<%=language.equals("Chinese")%>">
		<%
		out.println(language + " ：一百");
		%>
	</my:case>
	<my:case cond="<%=language.equals("English")%>">
		<%
		out.println(language + "： one hundred ");
		%>
	</my:case>
	<my:default>
		<%
		out.println(language + "： 100");
		%>
	</my:default>
</my:switch>
</h2>
