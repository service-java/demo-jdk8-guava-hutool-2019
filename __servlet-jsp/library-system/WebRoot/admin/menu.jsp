<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<LINK href="../css/admin.css" type="text/css" rel="stylesheet">
<SCRIPT language=javascript>
	function expand(el)
	{
		childObj = document.getElementById("child" + el);

		if (childObj.style.display == 'none')
		{
			childObj.style.display = 'block';
		}
		else
		{
			childObj.style.display = 'none';
		}
		return;
	}
</SCRIPT>
</HEAD>
<BODY>
<TABLE height="100%" cellSpacing=0 cellPadding=0 width=170 
background=../images/menu_bg.jpg border=0>
  <TR>
    <TD vAlign=top align=middle>
      <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        
        <TR>
          <TD height=10></TD></TR></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        
        <TR height=22>
          <TD style="PADDING-LEFT: 30px" background=../images/menu_bt.jpg><A 
            class=menuParent onclick=expand(1) 
            href="javascript:void(0);">部门管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child1 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="../showPosts" 
            target=main>管理部门</A></TD></TR>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="../dept/addPost.jsp" 
            target=main>添加部门</A></TD></TR>
        </TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        <TR height=22>
          <TD style="PADDING-LEFT: 30px" background=../images/menu_bt.jpg><A 
            class=menuParent onclick=expand(2) 
            href="javascript:void(0);">员工管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child2 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="../showUsers" 
            target=main>管理员工</A></TD></TR>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="../user/addUser.jsp" 
            target=main>添加员工</A></TD></TR>
       </TABLE>
      
      
     
      
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        
        <TR height=22>
          <TD style="PADDING-LEFT: 30px" background=../images/menu_bt.jpg><A 
            class=menuParent onclick=expand(7) 
            href="javascript:void(0);">系统管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child7 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="#" 
            target=main>基本设置</A></TD></TR>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="#" 
            target=main>样式管理</A></TD></TR>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="#" 
            target=main>栏目管理</A></TD></TR>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="#" 
            target=main>功能管理</A></TD></TR>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="#" 
            target=main>菜单管理</A></TD></TR>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="#" 
            target=main>首页设置</A></TD></TR>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="#" 
            target=main>管理员列表</A></TD></TR>
        <TR height=4>
          <TD colSpan=2></TD></TR></TABLE>
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        
        <TR height=22>
          <TD style="PADDING-LEFT: 30px" background=../images/menu_bt.jpg><A 
            class=menuParent onclick=expand(0) 
            href="javascript:void(0);">个人管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child0 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            href="#" 
            target=main>修改口令</A></TD></TR>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="../images/menu_icon.gif" width=9></TD>
          <TD><A class=menuChild 
            onclick="if (confirm('确定要退出吗？')) return true; else return false;" 
            href="logout.jsp" 
            target=_top>退出系统</A></TD></TR></TABLE></TD>
    <TD width=1 bgColor=#d1e6f7></TD></TR></TABLE></BODY></HTML>
 