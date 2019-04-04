<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="Object.*" errorPage="error.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println("basePath:"+basePath);
%>
<html>
	<head>
		<title>edit news</title>
	<style type="text/css">
<!--
@import url("../../css/OSX.css");
-->
</style>
	</head>

	<SCRIPT language=javascript>
function CheckForm()
{
	if(document.news_form.title.value=="")
	{
		alert("请输入标题！");
		return false;
	}
	if(document.news_form.content.value == "")
	{
		alert("请输入内容！");
		return false;
	}
	document.news_form.submit();
}
</SCRIPT>

	<body background="../../img/body_background.gif" topmargin="30">
		<%String id = (String) request.getParameter("news_id");
			int ID = Integer.parseInt(id);
			News news = News.getNews(ID);

			%>
		<div align="center">
			<form name="news_form" action="<%=basePath %>edit_news" method="post">
				<table width="80%" border="0" cellspacing="1" cellpadding="1">
					<tr>
						<td colspan="2" align="center" background="../../img/title_4.png" >
		<font class="title_2">新闻编辑</font>
					</tr>
					<tr>
						<td width="15%" align="center" bgcolor="#F0F0F0" class="normalText">
							标题:
						</td>
						<td width="85%" bgcolor="#F0F0F0">
							<input type="text" name="title" class="textBox" value="<%=news.getTitle()%>">
							<input type="hidden" name="news_id" value="<%=id%>">
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="#F0F0F0" class="normalText">
							内容:
						</td>
						<td bgcolor="#F0F0F0">
							<textarea name="content" cols="50" rows="6">
								<%=news.getContent()%>
							</textarea>
						</td>
					</tr>
					<tr>
						<td bgcolor="#F0F0F0">
							&nbsp;
						</td>
						<td bgcolor="#F0F0F0">
							<input type="button" name="Submit" value="保存修改" onClick="CheckForm()">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
