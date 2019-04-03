<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
session.removeAttribute("userid"); 
response.sendRedirect("home.jsp");
%>