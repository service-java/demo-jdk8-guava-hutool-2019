<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>部门管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table background="images/23_03.gif" width="755px" height="27px" border="0" align="left" cellpadding="0" cellspacing="0">
    	<tr>
    		<td width="20px">&nbsp;</td>
    		<td><span class="STYLE1">当前位置-&gt;部门管理首页</span></td>
    	</tr>
  	</table>
  	<br>
  	<br>
	<table width="775">
		<tr>
			<td height="40" align="center"><a href="dept/addPost.jsp">创建新部门</a></td>
		</tr>
	</table>
	<table  style="position: relative;top: 0px;left: 50px" width="650" border="1" cellpadding="0" cellspacing="1" bordercolor="#F0F4FF" bgcolor="#999999">
        <tr>
          <td height="24" bgcolor="#F0F4FF"><div align="center" class="STYLE5">部门编号</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">部门名称</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">部门人数</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">部门介绍</div></td>
          <td bgcolor="#F0F4FF"><div align="center" class="STYLE5">操作</div></td>
        </tr>
        <s:iterator value="posts" var="post">
          <tr>
            <td height="24" bgcolor="#F0F4FF"><div align="center" class="STYLE3">
              <s:property value="#post.postId"/>
            </div></td>
            <td bgcolor="#F0F4FF"><div align="center" class="STYLE3">
               <s:property value="#post.postName"/>
            </div></td>
            <td bgcolor="#F0F4FF"><div align="center" class="STYLE3">
                <s:property value="#post.postNum"/>
            </div></td>
            <td bgcolor="#F0F4FF"><div align="center" class="STYLE3">
                <s:property value="#post.postRemark"/>
            </div></td>
            <td bgcolor="#F0F4FF"><div align="center" class="STYLE3">
            	<s:param name="postId" value="#post.postId"/>
            	<a href="showPost?postId=<%=request.getAttribute("postId")%>">修改</a>&nbsp;&nbsp;
            	<a href="delPost?postId=<%=request.getAttribute("postId")%>">删除</a></div></td>
          </tr>
        </s:iterator>
  </table>
  </body>
</html>
