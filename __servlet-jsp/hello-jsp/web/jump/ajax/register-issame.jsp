<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
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

    <h4 class="text-center">admin和root被注册过了</h4>

    <form action="" class="form">

        <div class="form-group">
            <input class="form-control" type="text"
                   name="username" placeholder="用户名"
                   id="username" onblur="checkUsername();"  />
            <p id="register_info"></p>
        </div>

        <div class="form-group">
            <input class="form-control" type="password"
                   name="password" placeholder="密码"
                   id="password-always-checkbox" />
        </div>

        <div class="form-group">
            <button class="btn btn-default" type="submit">提交</button>
        </div>
    </form>

</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
    var XmlHttp;

    function createXMLHttpRequest() {
        //在IE下创建XMLHTTPRequest对象
        try {
            XmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            try {
                XmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            } catch (oc) {
                XmlHttp = null;
            }
        }

        //在Mozilla和Safari等非IE浏览器下创建XMLHTTPRequest对象
        if (!XmlHttp && typeof XMLHttpRequest != "undefined") {
            XmlHttp = new XMLHttpRequest();
        }
        if (!XmlHttp)
            alert("XMLHttpRequest对象创建失败。");
        return XmlHttp;
    }

    function checkUsername() {
        console.log("Ajax大法开始..");
        var username = $("username").value; //获取姓名
        var url = "check-register.jsp?username=" + username;
        createXMLHttpRequest(); //创建XMLHttpRequest对象
        XmlHttp.onreadystatechange = handleStateChange; //指定回调函数
        XmlHttp.open("GET", url, true); //指定GET请求URL
        XmlHttp.send(null); //发送GET请求
    }

    function handleStateChange() {
        if (XmlHttp.readyState == 4) {

            //判断对象状态
            if (XmlHttp.status == 200) {
                var result = XmlHttp.responseText; //获取服务器的响应内容
                if (result.indexOf("true") != -1) {
                    $("register_info").innerHTML="恭喜您！该用户名有效！";
                } else {
                    $("register_info").innerHTML="抱歉！该用户名已经被注册！";
                }
            } else { // 请求页面有错误
                alert("您所请求的页面有错误！");
            }
        }
    }

    function $(id) {
        return document.getElementById(id);
    }
</script>

</body>
</html>
