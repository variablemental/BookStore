<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/12/15
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>操作成功</title>
    <style>
        p.title{
            text-align:center;
            font-size:3em;
            color:black;
            line-height:20px;
            font-weight:bold;
        }
        font{
            text-align:center;
        }
    </style>
    <script type="text/javascript">
        onload=function(){
            setInterval(go, 1000);
        };
        var x=3; //利用了全局变量来执行
        function go(){
            x--;
            if(x>0){
                document.getElementById("sp").innerHTML=x+"自动跳转到首页"; //每次设置的x的值都不一样了。
            }else{
                location.href='Main.jsp';
            }
        }
    </script>

</head>
<body>
<div style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../images/11.jpg" height="100%" width="100%">
</div>
<div>
    <p class="title">操作成功！</p><br/>
    <font class="font" color="red" size="3"> <br/> <br/>
        三秒后将跳转到首页面 <br> <br> 如果没有跳转,请按 <a href="Main.jsp">这里</a>!!!
        <br/> </font>

</div>
</body>
</html>
