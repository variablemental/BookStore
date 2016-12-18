<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/12/15
  Time: 8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单查询</title>
    <style>
     #tabs h3 {
            font-size: 30px;
            line-height: 20px;
            margin: 60px 0 20px 0;
        }
    </style>
</head>
<body>
<div style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="images/11.jpg" height="100%" width="100%">
</div>
<div id="tabs">
    <div id="pink" align="center">
        <h3>
            查询订单
        </h3>
       

        <br>
       
        <br/><br/>
         <form name="form" method="post" action="orderformaction.do?action=30">
        <div class="buttons" align="bottom">
             <input type="submit" value="查询订单" />&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" value="返回" onclick="location.href='Main.jsp'"/>
        </div><br/>
        </form>
    </div>
</div>
</body>
</html>

