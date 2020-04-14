<%@ page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
//세션객체 제거
		session.invalidate();
//현재 페이지를 로그인 .jsp로 호출한다!
	 	response.sendRedirect("Login.jsp");
%>
