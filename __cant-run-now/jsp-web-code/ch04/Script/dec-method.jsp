<%@ page contentType="text/html;charset=gb2312"%>
<html>
<body>
<p>请输入圆的半径:</p>
<form action="dec-method.jsp" method="get" name="form"><input
	type="text" name="radius"> <input type="submit" name="submit"
	value="开始计算"></form>

<%!double area(double r) {
		return Math.PI * r * r;
	}

	double perimeter(double r) {
		return Math.PI * 2 * r;
	}%>
<%
	String str = request.getParameter("radius");
	if (str != null) {
		try {
			double r;
			r = Double.parseDouble(str);
%>

<p>圆的面积是：<%=area(r)%>
<p>圆的周长是：<%=perimeter(r)%> <%
 			} catch (Exception e) {
 			out.print(e.getMessage());
 		}
 	}
 %>

</body>
</html>
