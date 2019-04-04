<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加信息</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="images/css.css" rel="stylesheet" type="text/css">

<style type="text/css">
<!--
body {
	margin-top: 0px;
	margin-bottom: 0px;
}
.style21 {color: #FF0000}
-->
</style>

	<script type="text/javascript">
		function check(form){
			with(form){
				if (name.value=="") {
					alert("姓名不能为空");
					return  false;
				}
				if (age.value=="") {
					alert("年龄不能为空");
					return  false;
				}
				if (address.value=="") {
					alert("地址不能为空");
					return  false;
				}
			}
		}
	</script>
  </head>
  
  <body>
<TABLE WIDTH=770 HEIGHT=109 BORDER=0 align="center" CELLPADDING=0 CELLSPACING=0>
  <TR>
    <TD width="149" HEIGHT=89 ROWSPAN=2><img src="images/webzcnlogo.gif" width="258" height="119"></TD>
    <TD width="621" HEIGHT=103 ROWSPAN=1><div align="center"></div></TD>
  </TR>
  <TR>
    <TD HEIGHT=14><img src="images/topindex2.gif" width="512" height="16"></TD>
  </TR>
</TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=770 align=center border=0>  <TBODY>    <TR>      <TD><a href="http://www.itzcn.com/"><IMG height=38 src=images/menu_1x1.gif width=74 border=0 alt="网站首页"></a><a href="http://bbs.itzcn.com"><IMG height=38 src=images/menu_1x2.gif width=78 border=0 alt="技术论坛"></a><IMG height=38 src=images/menu_1x4.gif width=77 border=0 alt="联系方式"><IMG height=38 src=images/menu_1x6.gif width=77 border=0 alt="商业注册"><a href="#"><IMG height=38 src=images/menu_1x7.gif width=77 border=0 alt="建设中"></a><IMG height=38 src=images/menu_1x9.gif width=77 border=0 alt="意见反馈"><IMG height=38 src=images/menu_1x5.gif width=77 border=0 alt="联系方式"><IMG height=38 src=images/menu_1x11.gif width=233 border=0></TD>    </TR>  </TBODY></TABLE>
<table width="771" height="37" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
    <td width="192" bgcolor="#c0c0c0" background="images/bar_bg1.gif" style="border-left: 1 solid #C0C0C0"></td>
    <td width="533" bgcolor="#c0c0c0" background="images/bar_bg1.gif">
      <p align="right">　</td>
    <td width="38" bgcolor="#c0c0c0" background="images/bar_bg1.gif" style="border-right: 1 solid #C0C0C0">
      <img border="0" src="images/bar_bg_mid.gif" width="38" height="37"></td>
  </tr>
</table>
<table width="769" border="0" align="center" cellpadding="0" cellspacing="0" height="477">
  <tr> 
    <td width="3" height="423" style="border-left: 1 solid #C0C0C0" rowspan="4">&nbsp;</td>
    <td width="192" height="34" style="border-right: 1 solid #C0C0C0"><a name="lianx"><img border="0" src="images/title1.gif" width="192" height="34"></a></td>
    <td valign="top" height="423" width="572" rowspan="4"><table width="95%"  border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><img src="images/sfdsf.gif" width="14" height="8"></td>
      </tr>
    </table>
      <TABLE cellSpacing=6 cellPadding=0 width="92%" align=center 
border=0 height="397">
        <TBODY>
          <TR vAlign=top>
            <TD height=391>
            <form action="servlet/AddServlet" method="post" onsubmit="return check(this);"> 
              <TABLE cellSpacing=0 cellPadding=0 width="511" border=0>
                <TBODY>
                  <TR>
                    <TD width="165" rowSpan=6>
                      <DIV align=left><img border="0" src="images/cp.jpg" width="127" height="165"></DIV></TD>
                    <TD height=22 align="center" colspan="2"><h2>添加人员信息</h2></TD>
                  </TR>
                  
                  <TR>
                    <TD height=22 width="74">姓名</TD>       
                    <TD height=22 width="266"><input type="text" name="name"></TD>
                  </TR>
                  <TR>
                    <TD height=22 width="74">年龄</TD>       
                    <TD height=22 width="266"><input type="text" name="age"></TD>    
                  </TR>
                  <TR>
                    <TD height=22 width="74">性别</TD>       
                    <TD height=22 width="266">
                    <input type="radio" name="sex" value="男" checked="checked">男
    				<input type="radio" name="sex" value="女">女</TD>    
                  </TR>
                  <TR>
                    <TD height=22 width="74">地址</TD>       
                    <TD height=22 width="266"><textarea rows="5" cols="30" name="address"></textarea></TD>    
                  </TR>
                  <tr>
                   <TD height=22 align="center" colspan="2"><input type="submit" value="添加"></TD>
                   </tr>
                </TBODY>
              </TABLE>
              </form>
             <!-- <TABLE height=2 cellSpacing=0 cellPadding=0 width="100%" 
                  align=center 
                  background="images/txwm_line_1.gif" 
                  border=0>
                <TBODY>
                  <TR>
                    <TD height=2><IMG height=2 
                        src="images/dot.gif" 
                    width=10></TD>
                  </TR>
                </TBODY>
              </TABLE>-->
             <!-- <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                <TBODY>
                  <TR>
                    <TD height=22>
                    </TD>
                  </TR>
                </TBODY>
              </TABLE>-->
              <TABLE height=197 cellSpacing=0 cellPadding=0 width="100%" 
                  align=center 
                  border=0>
                <TBODY>
                  <TR>
                    
                      <IMG height=20 
                        src="images/dot.gif" 
                    width=10></TD>
                  </TR>
                </TBODY>
            </TABLE></TD>
          </TR>
        </TBODY>
    </TABLE>
<!--      <table width="95%"  border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><img src="images/sfdsf.gif" width="14" height="6"></td>
        </tr>
      </table>-->
      </td>
    <td width="1" bgcolor="#c0c0c0" height="423" rowspan="4"></td>
  </tr>
  <tr>
    <td width="192" height="144" style="border-right: 1 solid #C0C0C0"><span lang="zh-cn"><font color="#242424" face="宋体" size="2"><img border="0" src="images/jt1.gif" width="11" height="11"></font></span>窗内网一群：33925615 <br>
      <br>
      <span lang="zh-cn"><font color="#242424" face="宋体" size="2"><img border="0" src="images/jt1.gif" width="11" height="11"></font></span>窗内网二群：45368980 <br>
      <br>
      <span lang="zh-cn"><font color="#242424" face="宋体" size="2"><img border="0" src="images/jt1.gif" width="11" height="11"></font></span>窗内网三群：107423140<br>
      <br>
    <span lang="zh-cn"><font color="#242424" face="宋体" size="2"><img border="0" src="images/jt1.gif" width="11" height="11"></font></span><a href="mailto:mydear1021@yahoo.com.cn?subject=我要购买商业版">窗内网四群：184726020</a></td>
  </tr>
  <tr>
    <td width="192" height="33" style="border-right: 1 solid #C0C0C0">&nbsp;</td>
  </tr>
  <tr>
    <td width="192" height="212" style="border-right: 1 solid #C0C0C0"><span lang="zh-cn"><b><font color="#242424" size="2" face="宋体">   
          
      </font><font color="#797979" size="2" face="宋体"><br>
    </font></b></span></td>
  </tr>
  <tr> 
    <td height="37" colspan="4" bgcolor="#c0c0c0" background="images/bar_bg2.gif" style="border-left: 1 solid #C0C0C0; border-right: 1 solid #C0C0C0; border-top: 1 solid #C0C0C0" width="770">
      <table cellPadding="0" cellSpacing="1" class="d9pt" height="20" style="PADDING-BOTTOM: 1px; PADDING-LEFT: 4px; PADDING-RIGHT: 4px; PADDING-TOP: 1px" width="750">
        <tbody>
          <tr>
            <td height="10" width="748">
              <div align="center">
                <p align="center">关于网站 | 客服中心 | 服务条款 |     
                赞助空间 | 广告联系 | 本站历程 | 管理入口</p>    
              </div>
            </td>
          </tr>
        </tbody>
      </table>
    </td>
  </tr>
  <tr> 
    <td height="18" colspan="4" bgcolor="#c0c0c0" width="770"><img border="0" src="images/topindex3.gif" width="770" height="16"></td>
  </tr>
</table>
</body>
</html>
