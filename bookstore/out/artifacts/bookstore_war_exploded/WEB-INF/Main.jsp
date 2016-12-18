<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/12/12
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="UTF-8">

    <title>系统主页面</title>
    <style>

        .center{
            text-align:center;
        }
        .center ul{
            list-style-type:none;
            margin:0;
            padding:0;
            overflow:hidden;
            display:inline-block;
        }
        .center li{
            float:left;
        }


        p.title{
            text-align:center;
            font-size:3em;
            color:black;
            line-height:20px;
            font-weight:bold;
        }

        /*设置主体类型样式*/
        .content{
            position: absolute;
            left:33%;
            top:35%;
            width: 50%;
            height: 60%;
        }

        .content #picture{
            margin-left: auto;
            margin-right: auto;
        }
        #sddm
        {   margin: 0 auto;
            padding: 0;
            z-index: 30;
            background-color:#F4F4F4;
            width: 325px;
            height:24px;}
        #sddm li
        {   margin: 0;
            padding: 0;
            list-style: none;
            float: left;
            font: bold 14px arial}
        #sddm li a
        {   display: block;
            margin: 0 1px 0 0;
            padding: 4px 10px;
            width: 60px;
            background: #5970B2;
            color: #FFF;
            text-align: center;
            text-decoration: none}
        #sddm li a:hover
        {   background: #49A3FF}
        #sddm div
        {   position: absolute;
            visibility: hidden;
            margin: 0;
            padding: 0;
            background: #EAEBD8;
            border: 1px solid #5970B2}
        #sddm div a
        {   position: relative;
            display: block;
            margin: 0;
            padding: 5px 10px;
            width: auto;
            white-space: nowrap;
            text-align: left;
            text-decoration: none;
            background: #EAEBD8;
            color: #2875DE;
            font: 18px arial}
        #sddm div a:hover
        {   background: #49A3FF;
            color: #FFF}

    </style>
    <script type="text/javascript">
        <!--
        var timeout = 100;
        var closetimer = 10;
        var ddmenuitem = 0;
        // open hidden layer
        function mopen(id)
        {
            // cancel close timer
            mcancelclosetime();
            // close old layer
            if(ddmenuitem) ddmenuitem.style.visibility = 'hidden';
            // get new layer and show it
            ddmenuitem = document.getElementById(id);
            ddmenuitem.style.visibility = 'visible';
        }
        // close showed layer
        function mclose()
        {
            if(ddmenuitem) ddmenuitem.style.visibility = 'hidden';
        }
        // go close timer
        function mclosetime()
        {
            closetimer = window.setTimeout(mclose, timeout);
        }
        // cancel close timer
        function mcancelclosetime()
        {
            if(closetimer)
            {
                window.clearTimeout(closetimer);
                closetimer = null;
            }
        }
        // close layer when click-out
        document.onclick = mclose;
        // -->
    </script>
</head>
<body>

<div style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="images/11.jpg" height="100%" width="100%">
</div>
<div>
    <p class="title">欢迎使用书店管理系统</p><br/>
    <div class="center">
        <img src="images/1.gif">
        <ul id="sddm">
            <li><a href="Main.jsp" target="_top" class="chosen">首页</a></li>
            <li><a href="#" onmouseover="mopen('m1')" onmouseout="mclosetime()" target="_top">前台销售</a>
                <div id="m1" onmouseover="mcancelclosetime()" onmouseout="mclosetime()">
                    <a href="sell.jsp">图书销售</a>
                    <a href="search.jsp">图书查询</a>
                    <a href="search-nf.jsp">查询不足</a>
                    <a href="manage.jsp">销售管理</a>
                </div>
            </li>
            <li><a href="#" target="_top" onmouseover="mopen('m2')" onmouseout="mclosetime()">后台管理</a>
                <div id="m2" onmouseover="mcancelclosetime()" onmouseout="mclosetime()">
                    <a href="ruku.jsp">图书入库</a>
                    <a href="ruku-jilu.jsp">入库记录</a>
                    <a href="return-manage.jsp">退书管理</a>
                    <a href="return-search.jsp">退书查询</a>
                </div>
            </li>
            <li><a href="#" target="_top" onmouseover="mopen('m3')" onmouseout="mclosetime()">高级管理</a>
                <div id="m3" onmouseover="mcancelclosetime()" onmouseout="mclosetime()">
                    <a href="client.jsp">客户管理</a>
                    <a href="vip.jsp">会员管理</a>
                    <a href="manager.jsp">管理员管理</a>
                </div>
            </li>
        </ul>
    </div>

</div>
</body>
</html>
