package com;

	import javax.servlet.jsp.*;
	import javax.servlet.jsp.tagext.*;

	public class AttributeTag extends TagSupport {
		private String bgColor = "#FFFFCC";   
		private String color = "#000000"; // 字体默认黑色  
		private String align = "CENTER"; // 默认居中  
		private String fontSize = "3"; // 字体大小默认为3  
		private String border = "0"; // 表格边框默认为0  
		private String width = null; // 表格宽度为 null  
		private String bordercolor = "yellow"; // 表格边框颜色，默认黑色  

		public void setBgColor(String newBgColor) {
			bgColor = newBgColor;
		}
		public void setColor(String newColor) {
			color = newColor;
		}
		public void setAlign(String newAlign) {
			align = newAlign;
		}
		public void setFontSize(String newFontSize) {
			fontSize = newFontSize;
		}
		public void setBorder(String newBorder) {
			border = newBorder;
		}
		public void setWidth(String newWidth) {
			width = newWidth;
		}
		public void setBordercolor(String newBordercolor) {
			bordercolor = newBordercolor;
		}
		
		public int doStartTag() {
			try {
				JspWriter out = pageContext.getOut();
				out.print("<table border=" + border + " bordercolor=" + bordercolor);
				if (width != null) {
					out.print(" WIDTH=\"" + width + "\" >");
				}
				out.print("><TD bgcolor=" + bgColor + ">");
				out.print("<div align="	+ align + "><font size=" + fontSize + " color=" + color	+ "> ");
			} catch (Exception e) {
				System.out.println("Error in doStartTag of Myfont Handler Class: " + e);
			}
			return (EVAL_BODY_INCLUDE); 
		}
		
		public int doEndTag() {
			try {
				JspWriter out = pageContext.getOut();
				out.print("</td></tr></table>");
			} catch (Exception e) {
				System.out.println("Error in doEndTag of Myfont Handler Class: " + e);
			}
			return (EVAL_PAGE);		
		}
	
	

}
