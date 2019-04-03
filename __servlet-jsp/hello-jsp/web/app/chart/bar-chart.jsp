<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="org.jfree.chart.ChartFactory" %>
<%@ page import="org.jfree.chart.JFreeChart" %>
<%@ page import="org.jfree.data.category.DefaultCategoryDataset" %>
<%@ page import="org.jfree.chart.plot.PlotOrientation" %>
<%@ page import="org.jfree.chart.entity.StandardEntityCollection" %>
<%@ page import="org.jfree.chart.ChartRenderingInfo" %>
<%@ page import="org.jfree.chart.servlet.ServletUtilities" %>

<%
DefaultCategoryDataset dataset1=new DefaultCategoryDataset();
dataset1.addValue(200,"北京","苹果");
dataset1.addValue(150,"北京","香蕉");
dataset1.addValue(450,"北京","葡萄");

dataset1.addValue(400,"吉林","苹果");
dataset1.addValue(200,"吉林","香蕉");
dataset1.addValue(150,"吉林","葡萄");

dataset1.addValue(150,"深圳","苹果");
dataset1.addValue(350,"深圳","香蕉");
dataset1.addValue(200,"深圳","葡萄");

//创建JFreeChart组件的图表对象
JFreeChart chart=ChartFactory.createBarChart3D(
									"水果销量图",		//图表标题
									"水果",		//x轴的显示标题
									"销量",			//y轴的显示标题
									dataset1,	//数据集
									PlotOrientation.VERTICAL,//图表方向(垂直)
									true,		//是否包含图例
									false,		//是否包含提示
									false		//是否包含URL
									);
//设置图表的文件名
// 固定用法
ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
String fileName = ServletUtilities.saveChartAsPNG(chart,400,270,info,session);
String url = request.getContextPath()+"/DisplayChart?filename="+fileName;
%>
<html>

  <head>
    <title>绘制柱形图</title>
  </head>
  
  <body topmargin="0">
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td>&nbsp;<img src="<%= url %>"></td>
  </tr>
</table>
  </body>
  
</html>
