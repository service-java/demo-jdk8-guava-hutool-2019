<%@ page contentType="text/html;charset=gb2312" language="java"  %>
<% request.setCharacterEncoding("gb2312");%> 
<html>
<head>
  <title>显示用户信息</title>
</head>
<body>
<jsp:useBean id="user" scope="session" class="jsp.test.show" />
<jsp:setProperty name="user" property="*" />
<% if(request.getParameter("name")==null){%>
<form name="Example" method="post" action="">
<p> 姓名：<input type="text" name="name" size="15" maxlength="15"></p>
<p> 密码：<input type="password" name="password" size="15" maxlength="15"></p>
<p> 性别：<input type="radio" name="sex" value="Male" checked>男 
         <input type="radio" name="sex" value="Female">女
</p>
<p>年龄： 
    <select name="age">
      <option value="10">10 ~ 20</option>
      <option value="20" selected>21 ~ 30</option>
      <option value="30">31 ~ 40</option>
      <option value="40">41 ~ 65</option>
    </select>
</p>
<p>兴趣： 
    <input type="checkbox" name="habit" value="Read">
    看书 
    <input type="checkbox" name="habit" value="Football">
    足球
    <input type="checkbox" name="habit" value="Travel">
    旅游 
    <input type="checkbox" name="habit" value="Music">
    听音乐 
    <input type="checkbox" name="habit" value="Tv">
    看电视</p>
<p> 
<input type="submit" value="传送">
<input type="reset" value="清除">
</p>
</form>
<%}else{%>
姓名：<%=user.getName()%><br>
密码：<%=user.getPassword() %><br>
性别：<%=user.getSex() %><br>
年龄：<%=user.getAge() %><br>
爱好: <%=user.getHobby() %>
<%} %>
</body>
</html>

