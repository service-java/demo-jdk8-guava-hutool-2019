<%@ page language="java" contentType="text/html;charset=GB2312"%>

<html>
  <head>
    <title>使用过滤器校验表单数据</title>
    <meta http-equiv="Content-Type" content="text/html;charset=GB2312">
  </head>
  <body>
  <center>

  <h2>使用过滤器校验表单数据：</h2>
  
  <form method="post" action="CheckFormSuccess.jsp">
	<table>
	  <tr>
		<td>姓名：</td>
		<td><input name="name" type="text"></td>
	  </tr>
	  <tr>
		<td>年龄：</td>
		<td><input name="age" type="text"></td>
	  </tr>
	  <tr>
	    <td></td>
        <td>
          <input name="submit" type="submit" value="提交">
          <input name="reset" type="reset" value="重置">
        </td>
	  </tr>
	</table>
  </form>
  
  </center>
  </body>
</html>
