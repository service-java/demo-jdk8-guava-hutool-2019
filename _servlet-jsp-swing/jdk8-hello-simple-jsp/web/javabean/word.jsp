<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/6
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- 通过JavaBean避免中文乱码  -->
<form action="do-word.jsp" method="post">
    <table border="1" rules="rows">
        <tr height="30">
            <td>留 言 者：</td>
            <td><input type="text" name="author" size="20"></td>
        </tr>
        <tr height="30">
            <td>留言标题：</td>
            <td><input type="text" name="title" size="35"></td>
        </tr>
        <tr>
            <td>留言内容：</td>
            <td><textarea name="content" rows="8" cols="34"></textarea></td>
        </tr>
        <tr align="center" height="30">
            <td colspan="2">
                <input type="submit" value="提交">
                <input type="reset" value="重置">
            </td>
    </table>
</form>