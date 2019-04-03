<%@ page contentType="text/html; charset=utf-8"%>

<jsp:useBean id="myWord" class="valuebean.WordSingle" scope="request">
	<jsp:setProperty name="myWord" property="*"/>
</jsp:useBean>

<jsp:forward page="show-word.jsp"/>
