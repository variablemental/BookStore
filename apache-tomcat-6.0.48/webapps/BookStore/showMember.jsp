<%@ page contentType="text/html; charset=UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>


<html>
<head>
</head>
<body>

 <br>
	 <table width="90%"  border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#CCCCCC">
	<%
	Map<String,String> map=(Map)request.getAttribute("peso");
	%>
         		 <tr>
			 <th align="right">会员姓名</th>
			 <th align="right">会员密码 </th>
		 </tr>
	

	 <tr>
	 	<td align="right"><%=map.get("username")%></td>
	 	<td align="right"><%=map.get("password")%></td>	
    </tr>  
          </table>
      <a href="Main.jsp">返回首页</a>
      
</body>
</html>
		
