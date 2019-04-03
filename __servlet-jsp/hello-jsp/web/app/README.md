#### 简单App

* 上传
    [upload-demo](http://www.runoob.com/jsp/jsp-file-uploading.html)

```
// 需要这2个jar
commons-fileupload-1.3.2.jar
commons-io-2.5.jar

主要是Servlet/UploadServlet.java文件

    // 映射
    <servlet>
        <servlet-name>UploadServlet</servlet-name>
        <servlet-class>servlet.UploadServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>UploadServlet</servlet-name>
        <url-pattern>/uploadServlet</url-pattern>
    </servlet-mapping>
    
    // 表单
   <form method="post" action="/Grammar/uploadServlet" enctype="multipart/form-data">
   
1. web.xml 与 Servlet更新后一定注意刷新或重启 tomcat
2. 路径问题
3. 文件重命名的一种方式
filename = UUID.randomUUID().toString() + "_" + filename;

// jspSmartUpload.jar 几乎不更新,可摒弃


// 限制类型上传
util/file/FileUpload
util/file/GetFile
util/file/LimitFile

// 无组件上传下载
util/file/DownLoadFile // 会调用GetFile


访问 http://localhost:8686/DownLoadFile
直接访问会报错
```

* 基础

```
// 另存为文档
暂时只在ie浏览器中可行 ?


```

* 图表/输出处理

```
// jspfreechart.jar实现

    <servlet>
        <servlet-name>DisplayChart</servlet-name>
        <servlet-class>
            org.jfree.chart.servlet.DisplayChart
        </servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>DisplayChart</servlet-name>
        <url-pattern>/DisplayChart</url-pattern>
    </servlet-mapping>
    
    // 同样注意下路径
    
// TEXT-PIC 绝对路径
String filePath = 
pageContext.getServletContext().getRealPath("app/text/harvest.jpg");

```

* 邮件

```
// 需要以下jar
JavaMail mail.jar 1.4.5
JAF（版本 1.1.1） activation.jar

还未成功
```

* xml处理

```
// 把下面两个jar包放到 WEB_INF/lib
XercesImpl.jar
xalan.jar


// 注意及时刷新
// jstl实现xml貌似较少用到了
``` 
