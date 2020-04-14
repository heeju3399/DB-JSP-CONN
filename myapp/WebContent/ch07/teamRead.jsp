<!--teamRead.jsp-->
<%@page import="ch07.TeamBean"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="mgr" class="ch07.TeamMgr"/>
<%
		request.setCharacterEncoding("EUC-KR");
		int num = 0;
		if(request.getParameter("num")==null){
			//���������� num�� ��û���� ������ ������ �������� ����
			response.sendRedirect("teamList.jsp");
		}else{
			num = Integer.parseInt(request.getParameter("num"));
		}
		TeamBean bean = mgr.getTeam(num);
		//���ǿ� bean Ű������ bean ��ü�� ����
		session.setAttribute("bean", bean);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Team Mgr</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div align="center">
<h1>Team Read</h1>
<table border="1">
	<tr>
		<td>��ȣ</td>
		<td><%=bean.getNum()%></td>
	</tr>
	<tr>
		<td>�̸�</td>
		<td><%=bean.getName()%></td>
	</tr>
	<tr>
		<td>��°�</td>
		<td><%=bean.getCity()%></td>
	</tr>
	<tr>
		<td>����</td>
		<td><%=bean.getAge()%></td>
	</tr> 
	<tr>
		<td>����</td>
		<td><%=bean.getTeam()%></td>
	</tr>
</table><p/>
<a href="teamList.jsp">LIST</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="teamPost.jsp">POST</a>&nbsp;&nbsp;
</div>
</body>
</html>










