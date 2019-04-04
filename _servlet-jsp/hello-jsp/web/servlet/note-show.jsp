<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="valuebean.WordSingle" %>

<%
	ArrayList wordlist = (ArrayList)application.getAttribute("wordlist");

	if(wordlist == null || wordlist.size() == 0) {
		out.print("没有留言可显示！");
	}
	else {
		for(int i = wordlist.size()-1; i>=0; i--) {
			WordSingle single = (WordSingle)wordlist.get(i);
%>
    <p>留 言 者：<%=single.getAuthor() %></p>
	<p>留言时间：<%=single.getTime() %></p>
    <p>留言标题：<%=single.getTitle() %> </p>
	<p>留言内容：
	<textarea rows="7"  cols="30" readonly><%=single.getContent() %></textarea>
    </p>
    <hr>


<%
		}
	} %>

    <a href="note-index.jsp">我要留言</a>
