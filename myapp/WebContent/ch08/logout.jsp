<!-- logout.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		//���ǿ� ������ Ű���� ����
		session.removeAttribute("idKey");
		//���� ��ü ��ü�� ����
		session.invalidate();
		response.sendRedirect("login.jsp");
%>