<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<html>
<head>

</head>
<body>
<div style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="images/11.jpg" height="100%" width="100%">
</div>
 <br>
	 <table width="90%"  border="1" cellpadding="1" cellspacing="1" bordercolor="#CCCFFF" bgcolor="#CCCFFF">
	<%
	List list2=(List)request.getAttribute("peso");
	%>
	     		 <tr>
			 <th align="left">�������</th>
			 <th align="right">�鼮���</th>
			 <th align="right">�û����</th>
			 <th align="right">����Ա���</th>
			 <th align="right">����</th>
			 <th align="right">����</th>
			 <th align="right">�ܼ�</th>

		    </tr>
	 <%
		Map<String,String> map;
	 	for(int i=0;i<list2.size();i++){
	 		map=(Map)list2.get(i);			
	 %>
     	<!--	 <tr>
			 <th align="left">�������</th>
			 <th align="right">�鼮���</th>
			 <th align="right">�û����</th>
			 <th align="right">����Ա���</th>
			 <th align="right">����</th>
			 <th align="right">����</th>
			 <th align="right">�ܼ�</th>

		    </tr>    -->
	 <tr>
	 	<td align="left"><%=map.get("O_id")%></td>
	 	<td align="right"><%=map.get("B_id")%></td>
	 	<td align="right"><%=map.get("U_id")%></td>	
        <td align="right"><%=map.get("A_id") %></td>	
        <td align="right"><%=map.get("O_num")%></td>	 
        <td align="right"><%=map.get("B_up")%></td>
        <td align="right"><%=map.get("B_tp")%></td>        
	<%}%>
      </table>
      <a href="Main.jsp">����</a>
</body>
</html>
		