<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/12/12
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除书目</title>
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
                   删除书目
                </h3>
                <form name="form" method="post" action="bookmanagementaction.do?action=21">
                <table width="400px">
                    <tr>
                        <td align="right">
                            <label for="bookISBN">
                                ISBN：
                            </label>
                        </td>
                        <td>
                            <input type="text" name="bookISBN" id="bookISBN" onblur="uNotNULL()"/>
                        </td>
                    </tr>
                	<div class="buttons">
                	    <input type="submit" value="删除" /> &nbsp;&nbsp;&nbsp;&nbsp; 
                	    <input type="reset" value="重填" />
                </table>
                </form>
                <br/>

                </div><br/>
            </div>
        </div>
</body>
</html>
