<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    if (session.getAttribute("information") == null) {
        out.print("session对象已不存在");
    }

    else {
        out.print(session.getAttribute("information"));
    }
%>