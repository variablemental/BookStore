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
    <title>图书入库</title>
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
            height: 800px;
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
            图书入库
        </h3><br/><br/>
        <form name="form" method="post" action="bookmanagementaction.do?action=20">
            书籍编号：
             <input type="text" name="bookid" />   <br/><br/>
             书名：
             <input type="text" name="bookname" />   <br/><br/>
            作者：
             <input type="text" name="bookauthor" />   <br/><br/>
            出版社：
             <input type="text" name="bookpress" />   <br/><br/>
             价格：
             <input type="text" name="bookprice" />   <br/><br/>
            入库数量：
            <input type="text" name="rc" />   <br/><br/>
        <br/>
        <div class="buttons">
            <input type="submit" value="继续添加" /> &nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" value="提交" />
            &nbsp;&nbsp;&nbsp;&nbsp;
           <a href="Main.jsp">返回首页</a>
         </form>   
        </div><br/>
    </div>
</div>

</body>
</html>
