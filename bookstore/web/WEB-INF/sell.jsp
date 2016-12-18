<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/12/12
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书销售</title>
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
            height: 500px;
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
            图书销售
        </h3>
        <table width="400px">
            <tr>
                <td align="right">
                    <label for="bookid">
                        书籍编号：
                    </label>
                </td>
                <td>
                    <input type="text" name="bookid" id="bookid" onblur="uNotNULL()"/>
                </td>
                <td>
                    <input type="submit" value="查询" />
                </td>
            </tr>
        </table>
        <table width="400px">
            <tr>
                <td align="right">
                    <label for="vipid">
                        会员编号：
                    </label>
                </td>
                <td>
                    <input type="text" name="vipid" id="vipid" onblur="uNotNULL()"/>
                </td>
                <td>
                    <input type="submit" value="确认" />
                </td>
            </tr>

        </table>
        <br/>
        <form>
            书名：
            <input type="text" name="bookname" />   <br/><br/>
            作者：
            <input type="text" name="writer" />   <br/><br/>
            出版社：
            <input type="text" name="publisher" />&nbsp;&nbsp;&nbsp;
            库存量：
            <input type="text" name="count" />
            <br/><br/>
            类型：
            <input type="text" name="type" />&nbsp;&nbsp;&nbsp;
            单价：
            <input type="text" name="price" />   <br/><br/>
            折扣：
            <input type="text" name="discount" />&nbsp;&nbsp;&nbsp;
            实售价格：
            <input type="text" name="real-price" />   <br/><br/>
        </form>
        <div class="buttons">
            <input type="submit" value="确定" /> &nbsp;&nbsp;&nbsp;
            <input type="submit" value="继续" />
        </div>
    </div>
</div>


</body>
</html>
