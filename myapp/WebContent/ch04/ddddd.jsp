<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<body>
	<h2 align="center" style="color:red; margin:50px;" >구구단 출력</h2>
	<table align="center" border="1">
		

			<%for (int i = 2; i < 10; i++) {%> 

			<th align="center" width="100px" bgcolor="yellow"><%=i+"단" %></th>
<!-- -----------1단 ------------		 -->
			<%}%>
			<%for (int i = 1; i < 10; i++) {%>
		<tr>
			
			<%for (int j = 2; j < 10; j++) {%>
			
			<td align="center" style="background: orange"><%=j%> X <%=i%>= <%= j * i %></td>
			<%}%>
			
		</tr>
	
		<% } %>

	</table>
		
</body>


