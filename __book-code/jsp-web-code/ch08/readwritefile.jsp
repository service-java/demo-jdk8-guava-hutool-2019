<%@ page contentType="text/html;charset=gb2312"%>
<%@ page import="java.io.*,java.lang.*"%>
<html>
<head>
<title>读写文本文件</title>
</head>
<body>
<%
String path=request.getRealPath("");
//建立FileWriter对象，并实例化fw
FileWriter fw=new FileWriter(path + "\\test.txt");
//将字符串写入文件
fw.write("大家好！");
fw.write("hello！");
fw.write("请多多指教！");
fw.close();
FileReader fr=new FileReader(path + "\\test.txt");
//在读取过程中，要判断所读取的字符是否已经到了文件的末尾，并且这个字符是不是文件中的换行符，即判断该字符值是否为13。
int c=fr.read();//从文件中读取一个字符
//判断是否已读到文件结尾
while(c!=-1)
{
//输出读到的数据
out.print((char)c);
//从文件中继续读取数据
c=fr.read();
//判断是否为换行字符
if(c==13)
{
//输出分行标签
out.print("<br>");
//略过一个字符
fr.skip(1);
//读取一个字符
c=fr.read();
}
}
fr.close();
%>
</body>
</html>
