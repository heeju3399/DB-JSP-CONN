<!-- teamInsertProc2.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="mgr" class="ch07.TeamMgr"/>
<jsp:useBean id="bean" class="ch07.TeamBean"/>
<jsp:setProperty property="*" name="bean"/>
<%
		mgr.insertTeam(bean);
		response.sendRedirect("teamList.jsp");
%>