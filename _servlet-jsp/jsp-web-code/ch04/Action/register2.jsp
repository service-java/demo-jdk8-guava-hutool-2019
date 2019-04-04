<%@ page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="user" scope="page" class="ch04.TestBean" />
<jsp:setProperty name="user" property="userName" value="xingming" />
<jsp:setProperty name="user" property="*" />
<html>
<body>
注册成功：
<br>
<hr>
使用bean属性方法：
<br>
用户名：
<%=user.getUserName()%>
<br>
密码：
<%=user.getPassword()%>
<br>
年龄：
<%=user.getAge()%>
<br>
<hr>
使用getProperty:
<br>
用户名：
<jsp:getProperty name="user" property="userName" />
<br>
密码：
<jsp:getProperty name="user" property="password" />
<br>
年龄：
<jsp:getProperty name="user" property="age" />
<br>
</body>
</html>
