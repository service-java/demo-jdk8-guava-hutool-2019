<%@ page language="java" contentType="text/html;charset=GB2312"%>

<html>
  <head>
    <title>没能通过过滤器校验</title>
    <meta http-equiv="Content-Type" content="text/html;charset=GB2312">
  </head>
  <body>
  <center>

  <h2>您提交的数据如下：</h2>
  
  <form>
	<table>
	  <tr>
		<td>姓名：</td>
		<td>
		  <input name="name" type="text" value=<%=request.getParameter("name")%> readonly="true">
		</td>
	  </tr>
	  <tr>
		<td>年龄：</td>
		<td>
		  <input name="age" type="text" value=<%=request.getParameter("age")%> readonly="true">
		</td>
	  </tr>
	</table>
  </form>
  
  <h2><font color="#0000EE">输入数据没能通过过滤器的校验！</font></h2>
  
  </center>
  </body>
</html>
