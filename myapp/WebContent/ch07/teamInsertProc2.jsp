<!-- teamInsertProc2.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<!-- //��ü ������ -->
<jsp:useBean id="TeamMgr" class="ch07.TeamMgr"/>
<jsp:useBean id="TeamBean" class="ch07.TeamBean"/>
<jsp:setProperty property="*" name="bean"/>
<%
		//�����ͺ��̽� ����
		TeamMgr.insertTeam(TeamBean);
		response.sendRedirect("teamList.jsp");
%>



