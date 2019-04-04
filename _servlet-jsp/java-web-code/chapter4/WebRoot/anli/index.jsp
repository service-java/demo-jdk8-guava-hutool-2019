<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<TITLE></TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<LINK href="admin.files/css.css" type=text/css rel=stylesheet>
<BODY style="OVERFLOW-Y: auto; OVERFLOW-X: hidden"  >
<TABLE height="100%" width="100%" align=center bgColor=#f8f8f8 border=0>
    <TBODY>
  
    <TR>
  
  <TD vAlign=top><BR>
    <TABLE cellSpacing=0 cellPadding=0 width=350 align=center bgColor=#f8f8f8 
      border=0>
      <TBODY>
          <TR width="300">
        
       
          <TD background=admin.files/Login_1.gif colSpan=2 height=20><FONT 
            color=#ffffff><IMG height=16 src="admin.files/siteengine.png" 
            width=16 align=absMiddle border=0>&nbsp;Powered by itZcn.com</FONT></TD>
            </TR>
          
          <TR>
            <TD align=middle background=admin.files/Login_2.gif colSpan=2 height=77><FONT color=#ffffff style="font-size:18px">国学在线考试系统</FONT></TD>
          </TR>
          <TR>
            <TD align=middle colSpan=2 height=6></TD>
          </TR>
          <TR>
            <TD align=middle background=admin.files/Login_3.gif height=148>
             <FORM action="check.jsp" method="post">
              准考证号：
              <INPUT  type="text" name="username">
              <BR>
              登录密码：
              <INPUT  type="password" name="userpass">
              <BR>
              <BR>
              <INPUT class=button onmouseover="this.style.backgroundColor='#879BD8'" onmouseout="this.style.backgroundColor='#cccccc'" type=submit value=确定 name=submit>
              <INPUT class=button onmouseover="this.style.backgroundColor='#879BD8'" onmouseout="this.style.backgroundColor='#cccccc'" type=reset value=取消 name=reset></TD>
        </FORM>
        </TR>
      
        </TBODY>
      
    </TABLE></TD>
    </TR>
  
    </TBODY>
  
</TABLE>
<DIV></DIV>
</BODY>
</HTML>
