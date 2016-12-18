<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/12/12
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Login Page</title>

    <style type="text/css">
        <!--
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

        #wrapper {
            background-color: #F4F0EE;
            border-top: 1px solid #ccc;
            border-bottom: 1px solid #ccc;
            width: 100%;
            height: 300px;
            padding-top: 25px;
            margin: -170px 0 0 0;
            position: absolute;
            left: 0;
            top: 40%;
        }

        #tabs>div {
            width: 100%;
            height: 400px;
            float: left;
            overflow: hidden;
        }

        #tabs h3 {
            font-size: 40px;
            line-height: 20px;
            margin: 60px 0 20px 0;
        }

        #wel h2 {
            font-size: 45px;
            line-height: 20px;
            color: #ABCDEF;
            width: 1000px;
        }

        #wel h2 span {
            font-size: 20px;
            line-height: 10px;
            color: #ABCDEF;
            width: 1000px;
        }

        #pager {
            width: 100%;
            margin: -76px auto 25px auto;
            text-align: center;
        }

        table td {
            width: 130px;
        }
    </style>
    <script>
        function uNotNULL(){
            var username=document.getElementById("name").value.trim();
            var ualert=document.getElementById("uAlert");
            if(username.length==0){
                ualert.innerHTML="<font size='15' color='red'>用户名不能为空</font>";
            }else{
                ualert.innerHTML="";
            }
        }
        function pNotNULL(){
            var password=document.getElementById("password").value.trim();
            var palert=document.getElementById("pAlert");
            if(password.length==0){
                palert.innerHTML="<font size='15' color='red'>密码不能为空</font>";
            }else{
                palert.innerHTML="";
            }
        }
        function validate(){
            var password=document.getElementById("password").value.trim();
            var username=document.getElementById("name").value.trim();
            if(username.length==0 || password.length==0){
                return false;
            }else{
                return true;
            }
        }
    </script>
</head>
<body>
<div>
    <div align="center"><!--  align="center" style="width:auto" -->
        <img src="../images/4.jpg"/>
    </div>
    <div id="wrapper">

        <div id="pager"></div>

        <div id="tabs">
            <div id="pink" align="center">
                <h3>
                    <img src="../images/1.png" />
                    书店管理系统
                </h3>
                <br/>
                <s:actionerror/>
                <form name="form" method="post" action="memberaction.do?action=2">
                    <table width="400px">
                        <tr>
                            <td align="right">
                                <label for="name">
                                    用户名：
                                </label>
                            </td>
                            <td>
                                <%--<input type="text" name="username" id="username" onblur="uNotNULL()"/>--%>
                                    <input type="text" name="name" id="name" onblur="uNotNULL()"/>
                            </td>
                            <td>
                                <div id="uAlert"></div>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">
                                <label for="password">
                                    密码 ：
                                </label>
                            </td>
                            <td>
                                <input type="password" name="password" id="password" onblur="pNotNULL()"/>
                            </td>
                            <td>
                                <div id="pAlert"></div>
                            </td>
                        </tr>
						<tr>
							<td>
                        <input type="radio" checked="checked" name="level" value="normal"/>普通用户&nbsp;&nbsp;
							</td>
							<td>
                        <input type="radio" name="level" value="vip" />VIP用户&nbsp;&nbsp;
							</td>
							<td>
                        <input type="radio" name="level" value="manager"/>管理员&nbsp;&nbsp;
                        	</td>
                    <br/>
						</tr>
						<tr>
						<td>
                    <div class="buttons">
                        <input type="submit" value="登录"/> &nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="重置" />
                        </td>
                    </div>
                    	</tr>
                    </table>
                    </form>
                <div align="center" id="wel" style="width: auto">
                    <h2>
                        <span></span>
                    </h2>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
