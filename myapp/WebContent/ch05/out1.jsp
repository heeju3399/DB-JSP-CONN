<%@page contentType="text/html; charset=EUC-KR"
				   buffer="5kb"
%>
<%
		request.setCharacterEncoding("EUC-KR");
		int totalBuffer = out.getBufferSize();
		int remainBuffer = out.getRemaining();
		int useBuffer = totalBuffer - remainBuffer;
		out.println("��� ������ ��ü ũ�� : "+totalBuffer+"<br>");
		out.println("���� ������ ��ü ũ�� : "+remainBuffer+"<br>");
		out.println("���� ���� ��뷮 : "+useBuffer+"<br>");
%>