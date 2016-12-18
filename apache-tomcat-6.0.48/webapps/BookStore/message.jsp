<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/12/12
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <header>
            <div class="center">
                <img src="../images/p2.gif">
                <ul>
                    <li><a href="add.jsp" target="_top" class="chosen">添加图书信息</a></li>
                    <li><a href="update.jsp" target="_top">修改图书信息</a></li>

                </ul>
            </div>
            <div class="wenzi">欢迎:<s: value="#session.user" /></div>
        </header>
    </div>
</body>
</html>
