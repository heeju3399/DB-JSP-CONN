<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<body>
	<h2 align="center" style="color:orange; margin:50px; font-size: 50px" >������ ���</h2>
	<table align="center" border="3">
		

			<%for (int i = 2; i < 10; i++) {%> 

			<th align="center" width="100px" bgcolor="yellow"><%=i+"��" %></th>
<!-- -----------1�� ------------		 -->
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


