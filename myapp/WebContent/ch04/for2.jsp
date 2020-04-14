<%@page contentType="text/html; charset=EUC-KR"%>
<link href="style.css" rel="stylesheet" type="text/css">
<%
		request.setCharacterEncoding("EUC-KR");
		String teams [] = {"리버풀","맨시티","레스터","첼시","아스널"};
		int wins[] = {10,8,7,7,4};
		int tie[] = {1,1,2,2,5};
		int lose[] = {0,2,2,2,2};
		int point[] = {31,25,23,23,17};
		
		
		
%>

<body>

<div align="center">
<h1>프리미어리그ㅜ 순위</h1>
<form style="align-content: center">
<table border="1">
<tr> 
		<th>순위</th>
		<th>팀명</th>
		<th>승</th>
		<th>무</th>
		<th>패</th>
		<th>승점</th>		
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
		<th>순위</th> 
		<th>팀명</th> 
		<th>승</th>
		<th>무</th>
		<th>패</th>
		<th>승점</th>		
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