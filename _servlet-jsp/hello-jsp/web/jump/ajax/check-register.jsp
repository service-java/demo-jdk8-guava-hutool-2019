<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
    String[] users = { "admin", "root"}; //设定4个用户
    String username = request.getParameter("username"); //获取从客户端提交的用户名
    String con = "true"; //存放响应内容的字符串
    Arrays.sort(users); //对数组排序
    int result = Arrays.binarySearch(users, username); //搜索数组
    if (result > -1) {
        con = "false";
    }
    out.println(con);
%>
