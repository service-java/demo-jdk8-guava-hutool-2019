<%@ page contentType="text/html; charset=utf-8" language="java"  errorPage="" %>
<%@ page import="java.util.*" %>
<%@ page import ="javax.mail.*" %>
<%@ page import="javax.mail.internet.*" %>
<%@ page import="javax.activation.*" %>
<%
try{
	request.setCharacterEncoding("utf-8");
	String from=request.getParameter("from");
	String to=request.getParameter("to");
	String subject=request.getParameter("subject");
	String messageText=request.getParameter("content");
    String password=request.getParameter("password");
    
	//生成SMTP的主机名称
	//int n =from.indexOf('@');
	//int m=from.length() ;
	//String mailserver ="smtp."+from.substring(n+1,m);
    String mailserver="smtp.163.com";
    
    //建立邮件会话
	Properties pro=new Properties();
    pro.put("mail.smtp.host",mailserver);
    pro.put("mail.smtp.auth","true");
    Session sess=Session.getInstance(pro);
    sess.setDebug(true);
    //新建一个消息对象
    MimeMessage message=new MimeMessage(sess);
    //设置发件人
    InternetAddress from_mail=new InternetAddress(from);
    message.setFrom(from_mail);
   //设置收件人
    InternetAddress to_mail=new InternetAddress(to);
    message.setRecipient(Message.RecipientType.TO ,to_mail);
    //设置主题
    message.setSubject(subject);
   //设置内容
   message.setText(messageText);
   //设置发送时间
   message.setSentDate(new Date());
   //发送邮件
   message.saveChanges();  //保证报头域同会话内容保持一致
   Transport transport =sess.getTransport("smtp");
   transport.connect(mailserver,from,password);
   transport.sendMessage(message,message.getAllRecipients());
   transport.close();
   out.println("<script language='javascript'>alert('邮件已发送！');window.location.href='send-mail.jsp';</script>");
}catch(Exception e){
	System.out.println("发送邮件产生的错误："+e.getMessage());
	out.println("<script language='javascript'>alert('邮件发送失败！');window.location.href='send-mail.jsp';</script>");
}
%>
