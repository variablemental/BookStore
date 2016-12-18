<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/12/12
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询不足</title>
    <style>
        html,body {
            height: 100%;
            padding: 0;
            margin: 0;
        }

        body {
            min-height: 600px;
        }

        body * {
            font-family: Arial, Geneva, SunSans-Regular, sans-serif;
            font-size: 14px;
            color: #333;
            line-height: 22px;
        }
        #tabs>div {
            width: 100%;
            height: 400px;
            float: left;
            overflow: hidden;
        }

        #tabs h3 {
            font-size: 30px;
            line-height: 20px;
            margin: 60px 0 20px 0;
        }
        table td {
            width: 130px;
        }
    </style>
</head>
<body>
<div style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../images/11.jpg" height="100%" width="100%">
</div>
<div id="tabs">

    <div id="pink" align="center">
        <h3>
            查询不足
        </h3>
        <br/><br/>
        <form align="center">
            书籍编号：
            <input type="text" name="bookid" />
            &nbsp;&nbsp;&nbsp;
            库存量：
            <input type="text" name="count" />
        </form>
    </div>
</div>
</body>
</html>

