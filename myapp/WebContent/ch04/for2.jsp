<%@page contentType="text/html; charset=EUC-KR"%>
<link href="style.css" rel="stylesheet" type="text/css">
<%
		request.setCharacterEncoding("EUC-KR");
		String teams [] = {"����Ǯ","�ǽ�Ƽ","������","ÿ��","�ƽ���"};
		int wins[] = {10,8,7,7,4};
		int tie[] = {1,1,2,2,5};
		int lose[] = {0,2,2,2,2};
		int point[] = {31,25,23,23,17};
		
		
		
%>

<body>

<div align="center">
<h1>�����̾�פ� ����</h1>
<form style="align-content: center">
<table border="1">
<tr> 
		<th>����</th>
		<th>����</th>
		<th>��</th>
		<th>��</th>
		<th>��</th>
		<th>����</th>		
	</tr> 

<%for(int i = 0; i<teams.length; i++){%> 
	 <tr>
   				<td><%=i+1 %></td>
    			<td><%=teams[i] %></td>
    			<td><%=wins[i] %></td>
    			<td><%=tie[i] %></td>
    			<td><%=lose[i] %></td>
    			<td><%=point[i] %></td>
  			</tr>

<%}%>

</table>
<hr style="margin:30px">
<table border="1">
<tr align="center"> 
		<th>����</th> 
		<th>����</th> 
		<th>��</th>
		<th>��</th>
		<th>��</th>
		<th>����</th>		
	</tr> 

<%for(int i = 0; i<teams.length; i++){
	 out.print("<tr>");
	 out.print("<td>"+i+1+"</td>");
	 out.print("<td>"+teams[i]+"</td>");
	 out.print("<td>"+wins[i]+"</td>");
	 out.print("<td>"+tie[i]+"</td>");
	 out.print("<td>"+lose[i]+"</td>");
	 out.print("<td>"+point[i]+"</td>");
	 out.print("</tr>");
}%>

</table>


</form>
</div>


</body>