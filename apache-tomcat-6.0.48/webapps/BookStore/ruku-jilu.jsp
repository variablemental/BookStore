<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/12/12
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>入库记录</title>
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
    <img src="images/11.jpg" height="100%" width="100%">
</div>
<div id="tabs">
    <div id="pink" align="center">
        <h3>
            入库记录
        </h3><br/><br/>
       <!--  <form>
            书籍编号：
            <input type="text" name="bookid" />  &nbsp;&nbsp;
            入库数量：
            <input type="text" name="rc" />    &nbsp;&nbsp;
            入库时间：
            <input type="text" name="time" />    &nbsp;&nbsp;
            经办人编号：
            <input type="text" name="id" />    &nbsp;&nbsp;
        </form> -->
        <br/>
        <div class="buttons" align="bottom">
            <form name="form" method="post" action="bookmanagementaction.do?action=23">
            <input type="submit" value="查询！" />&nbsp;&nbsp;
            <a href="Main.jsp">返回首页</a>
        </div><br/>
    </div>
</div>
</body>
</html>
