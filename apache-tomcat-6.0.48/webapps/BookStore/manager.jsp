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
   <title>会员管理</title>
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
            管理员管理
        </h3><br/><br/>
        <table width="400px">
            <tr>
                <td align="right">
                    <label for="bookid">
                        管理员编号：
                    </label>
                </td>
                <td>
                    <input type="text" name="bookid" id="bookid" onblur="uNotNULL()"/>
                
                &nbsp;&nbsp;<input type="submit" value="查询管理员" />
                </td>
                
            </tr>
        </table>
        <br/><br/><br/>
        <div class="buttons">
            &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="更改管理员信息" />
            &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="删除管理员信息" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="Main.jsp">返回首页</a>
        </div><br/>
    </div>
</div>
</body>
</html>