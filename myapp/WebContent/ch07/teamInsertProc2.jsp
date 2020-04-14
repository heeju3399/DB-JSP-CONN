<!-- teamInsertProc2.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<!-- //객체 ㅅ생성 -->
<jsp:useBean id="TeamMgr" class="ch07.TeamMgr"/>
<jsp:useBean id="TeamBean" class="ch07.TeamBean"/>
<jsp:setProperty property="*" name="bean"/>
<%
		//데이터베이스 연동
		TeamMgr.insertTeam(TeamBean);
		response.sendRedirect("teamList.jsp");
%>



