<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/12/12
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员管理</title>
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
    </style>
</head>
<body>
<div style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="../images/11.jpg" height="100%" width="100%">
</div>
<div id="tabs">
    <div id="pink" align="center">
        <h3>
            管理员管理
        </h3><br/><br/>
        <form>
            管理员编号：
            <input type="text" name="bookname" />   <br/><br/>
            管理员名称：
            <input type="text" name="writer" />   <br/><br/>
            管理员密码：
            <input type="text" name="publisher" />&nbsp;&nbsp;&nbsp;

        </form>
        <br/><br/>
        <div class="buttons">
            <input type="submit" value="添加管理员" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="删除管理员" />
        </div><br/>
    </div>
</div>
</body>
</html>

