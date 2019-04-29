<%@page import="com.Product"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
response.setHeader("Pragma","No-cache"); 
response.setHeader("Cache-Control","no-cache"); 
response.setDateHeader("Expires", 0);

String action=request.getParameter("action");
if ((action != null) && action.equals("del")) {
response.setHeader("refresh", "5; url=list.jsp?action=del");
out.print("正在删除编号为【"+request.getParameter("id")+"】的商品，5秒后将转到list.jsp页面。");
} 
%>