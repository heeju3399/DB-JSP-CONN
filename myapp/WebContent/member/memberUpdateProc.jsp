<%@ page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="mgr" class="member.MemberMgr"/>
<jsp:useBean id="bean" class="member.MemberBean"/>
<jsp:setProperty property="*" name="bean"/>

<% 
	boolean aa = mgr.updateMember(bean);
	if(aa == true){
		response.sendRedirect("login.jsp");
	}else{
		response.sendRedirect("MemberUpdate.jsp");
	}
	
%>