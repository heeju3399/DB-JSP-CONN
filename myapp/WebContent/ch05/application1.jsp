<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		//�ܺ�ȯ�� ������ ���� ���� ��ü
		String realPath = application.getRealPath("/");
		application.log("application ���� ��ü �α� �׽�Ʈ");
		//application > session > reqeust> page
		application.setAttribute("aaa", "�׽�Ʈ");
%>
���� �����̳� �̸��� ���� <%=application.getServerInfo()%><br>
�������� �ý��� ��� <%=realPath%>


