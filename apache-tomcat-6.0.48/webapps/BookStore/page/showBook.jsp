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
	 	<td width="64%" height="30"><%=map.get("id")%></td>
	 	<td width="64%" height="30"><%=map.get("name")%></td>
	 	<td width="64%" height="30"><%=map.get("ISBN")%></td>	
        <td width="64%" height="30"><%=map.get("Author")%></td>	
        <td width="64%" height="30"><%=map.get("press")%></td>	 
        <td width="64%" height="30"><%=map.get("price")%></td>
        <td width="64%" height="30"><%=map.get("num")%></td>        
	<%}%>
      </table>
</body>
</html>
		
