<%@ page contentType="text/html; charset=gb2312"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<html>
<head>

</head>
<body>

 <br>
	 <table width="90%"  border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="#CCCCCC">
	<%
	List list2=(List)request.getAttribute("peso");
	%>
	
	 <%
		Map<String,String> map;
	 	for(int i=0;i<list2.size();i++){
	 		map=(Map)list2.get(i);			
	 %>
     		 <tr>
			 <th align="left">���</th>
			 <th align="right">�鼮���</th>
			 <th align="right">�鼮���� </th>
			 <th align="right">������</th>
			 <th align="right">���� </th>
			 <th align="right">�۸� </th>

		    </tr>
	 <tr>
	 	<td width="64%" height="30"><%=map.get("O_ID")%></td>
	 	<td width="64%" height="30"><%=map.get("B_id")%></td>
	 	<td width="64%" height="30"><%=map.get("U_id")%></td>	
        <td width="64%" height="30"><%=map.get("A_id") %></td>	
        <td width="64%" height="30"><%=map.get("O_num")%></td>	 
        <td width="64%" height="30"><%=map.get("B_up")%></td>
        <td width="64%" height="30"><%=map.get("B_tp")%></td>        
	<%}%>
      </table>
</body>
</html>
		