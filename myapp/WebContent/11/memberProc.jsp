<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="bean" class="member.MemberBean"/>>
<jsp:useBean id="mgr" class="member.MemberMgr"/>>
<jsp:setProperty property="*" name="bean"/>

<%
		request.setCharacterEncoding("EUC-KR");
		boolean result = mgr.insertMember(bean);
		out.print(result);
%>



