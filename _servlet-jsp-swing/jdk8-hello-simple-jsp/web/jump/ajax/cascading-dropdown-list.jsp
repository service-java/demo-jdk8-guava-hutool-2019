<%--
  Created by IntelliJ IDEA.
  User: Luo_0412
  Date: 2017/4/11
  Time: 11:31
  To change this template use File | Settings | File Templates.
  参考 http://www.cnblogs.com/createboke/p/6688993.html
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

    <div class="row">
        <div class="col-sm-4">
            <select id="sheng" class="form-control" ><option>请选择省</option></select>
        </div>

        <div class="col-sm-4">
            <select id="cheng" class="form-control"><option>请选择市</option></select>
        </div>

        <div class="col-sm-4">
            <select id="xian" class="form-control"><option>请选择县</option></select>
        </div>
    </div>



</div><!-- ./container -->

<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
    $(function() {

        function lyz(e) {    //下拉列表初始化
            $(e).html("<option>请选择</option>");
        }

        var data = {
            山东: {济南: "槐荫区,长清区,高新区,天桥区", 烟台: "莱山区,福山区,芝罘区"},
            河北: {衡水: "枣强县,新河县", 石家庄: "鹿泉区,栾城区"},
            河南: {郑州: "温县,新密市", 许昌: "扶沟县,太康县"}
        };

        //遍历数据增加省份项
        $.each(data, function (a) {
            $("#sheng").append("<option>" + a + "</option>");
        });

        //alert("aaa");

        //省份列表框改变事件
        $("#sheng").change(function () {
            lyz("#cheng");    //城市的下拉框初始化
            lyz("#xian");      //县级的下拉框初始化

            // index value
            $.each(data, function (a, b) {

                if ($("#sheng option:selected").text() == a) { //如果省份选中项与数据匹配
                    //alert(a);
                    $.each(b, function (c, d) { //遍历数组
                        $("#cheng").append("<option>" + c + "</option>"); //增加城市项
                    });
                    //城市列表项改变事项
                    $("#cheng").change(function () {
                        lyz(".xian");

                        $.each(b, function (c, d) { //遍历数据
                            if ($("#cheng option:selected").text() == c) { //如果城市选中项与数据匹配
                                //alert(c);
                                $.each(d.split(","), function () {     //遍历数组增加型号项， split()方法用于把一个字符串分割成字符串数组
                                    $("#xian").append("<option>" + this + "</option>");
                                });
                            }
                        });
                    });
                }
            });
        });

    });

</script>

</body>
</html>
