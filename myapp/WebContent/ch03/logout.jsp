<%@ page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
//���ǰ�ü ����
		session.invalidate();
//���� �������� �α��� .jsp�� ȣ���Ѵ�!
	 	response.sendRedirect("Login.jsp");
%>
