<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="org.w3c.dom.Node"%>
<%@ page import="org.w3c.dom.*,javax.xml.parsers.*,java.io.*"  pageEncoding="utf-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>HTML5 Page Title</title>

    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" style="margin-top: 20px;">

    <table class="table">
        <%
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
//                String s = request.getSession().getServletContext().getRealPath("/")
//                        + "/books.xml";
                String s = application.getRealPath("/") + "/app/xml/books.xml";

                Document document = builder.parse(new File(s));
                Element root = document.getDocumentElement();
                NodeList nodelist = root.getElementsByTagName("book");	//获得标记名为员工的集合

                // 读属性
                int size = nodelist.getLength();
                for (int i = 0; i < size; i++) {
                    Node node = nodelist.item(i);
                    String name = node.getNodeName();
                    NamedNodeMap map = node.getAttributes();			//获得标记中属性的集合。
                    out.print("<tr>");
                    for (int k = 0; k < map.getLength(); k++) {		//循环的形式输出标记中所有的属性
                        Attr attrNode = (Attr) map.item(k);
                        String attValue = attrNode.getValue();
                        out.println("<td>attr " + (i+1) + "</td><td>" + attValue+ "</td>");
                    }out.print("</tr>");
                }

                // 读子节点
//                document = builder.parse(new File(s));
                root = document.getDocumentElement();
                String rootName = root.getNodeName();
                out.println("<tr><td>rootname</td><td>" + rootName + "</td></tr>");
                nodelist = document.getElementsByTagName("book");
                out.println("<tr><td>nodename</td><td>" + nodelist.item(0).getNodeName()+"</td></tr>");

                // 子节点的属性
                nodelist = root.getChildNodes();
                size = nodelist.getLength();
                for (int i = 0; i < size; i++) {
                    Node node = nodelist.item(i);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementNode = (Element) node;
                        String name = elementNode.getNodeName();
                        String id = elementNode.getAttribute("name");
                        String content = node.getFirstChild().getNodeValue();
                        out.println("<tr><td>"+name+"</td><td>"+id+"</td><td>"+content+"</td></tr>");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        %>

    </table>


</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
