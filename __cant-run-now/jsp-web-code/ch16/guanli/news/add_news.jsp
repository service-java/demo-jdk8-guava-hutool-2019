<%@ page language="java" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>add news</title>
		<style type="text/css">
<!--
@import url("../../css/OSX.css");
@IMPORT url("./css/laste_zyn.css");
-->
</style>
	</head>
	<SCRIPT language=javascript>
function CheckForm()
{
	if(document.add_news_Form.title.value=="")
	{
		alert("请输入标题！");
		return false;
	}
	if(document.add_news_Form.content.value == "")
	{
		alert("请输入内容！");
		return false;
	}
	document.add_news_Form.submit();
}
</SCRIPT>
	<body  background="../../img/body_background.gif" topmargin="100">
		<div align="center">
			<form name="add_news_Form" action="<%=basePath %>/add_news">
				<table width="65%" border="0" cellspacing="1" cellpadding="1">
					<tr>
						<td colspan="2" align="center" background="../../img/title_4.png" >
							<font class="title_2">添加新闻</font>
						</td>
					</tr>
					<tr>
						<td width="70" align="center" bgcolor="F1F3F5" class="normalText">
							标题:
						</td>
						<td width="423" bgcolor="F1F3F5">
							<input type="text" name="title">
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center" bgcolor="F1F3F5" class="normalText">
							&nbsp;
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="F1F3F5" class="normalText">
							内容:
						</td>
						<td bgcolor="F1F3F5">
							<textarea name="content" cols="50" rows="5"></textarea>
						</td>
					</tr>
					<tr  align="center">
						<td colspan="2" bgcolor="F1F3F5">
							<input type="button" name="Submit" value="提交" onClick="CheckForm()">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
