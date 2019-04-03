<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/8
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=utf-8"
         language="java" errorPage="" %>
<%--<%@ page import="java.sql.*" %>--%>

<html>
<head>
    <title>Ajax示例</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>



<div class="container" style="margin-top: 20px;">
    <p>这是一生中难得的机会 <a href="#" id="translate">汉译英</a> </p>
    <hr>

    <div id="answer">
        <%--这个DOM留着给responseText--%>
    </div>
</div>



<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>

    var http_request = false; // 默认为false

    /**
     * 创建请求函数
     */
    function createRequest(url)
    {
        http_request = false;

        // 发出请求
        // Mozilla浏览器
        if (window.XMLHttpRequest) {
            console.log("采用的是 Mozilla模式");
            http_request = new XMLHttpRequest();
            if (http_request.overrideMimeType) {
                http_request.overrideMimeType('text/xml');   //设置MIME类别
            }
        }

        // IE浏览器
        else if (window.ActiveXObject) {
            console.log("采用的是IE模式");

            try {
                http_request = new ActiveXObject("Msxml2.XMLHTTP");
            } catch (e) {
                try {
                    http_request = new ActiveXObject("Microsoft.XMLHTTP");
                } catch (e) {}
            }
        }


        // 创建失败
        if (!http_request) {
            alert("不能创建XMLHttpRequest对象实例！");
            return false;
        }


        // 状态改变的时候
        http_request.onreadystatechange = getResult;   // 调用返回结果处理函数
        http_request.open('POST', url, true); // POST
        http_request.send();

    }

    /**
     * 返回结果处理函数
     */
    function getResult()
    {
        // 判断请求状态
        if (http_request.readyState == 4) {

            // 请求成功，开始处理返回结果
            if (http_request.status == 200) {
                answer.innerHTML = http_request.responseText; // 注意responseText
            }

            //请求页面有错误
            else {
                alert("您所请求的页面有错误！");
            }
        }
    }


    // 注册监听事件
    var translate_btn = document.getElementById('translate');
    translate_btn.addEventListener("click", function() {
        createRequest('answer.txt'); // 调用函数
    });



</script>

</body>
</html>
