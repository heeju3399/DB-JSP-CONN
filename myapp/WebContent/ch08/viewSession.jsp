<!-- viewSession.jsp -->
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		//������ ���Ǹ� Ȯ�� ���ؼ��� ������ name(key)���� �˸��.
		String id = (String)session.getAttribute("logID");
		String pwd = (String)session.getAttribute("logPWD");
		out.println("id : " + id +", pwd : " + pwd+"<p>");
		
		//���ǿ� ����� ��ü�� ���� �Ҽ� �ִ� ����� name ���
		Enumeration<String> en = session.getAttributeNames();
		while(en.hasMoreElements()){
			String name = en.nextElement();
			Object obj = session.getAttribute(name);
			out.println("session name : " + name +"<br>");
			out.println("session value : " + obj +"<p>");
		}
		
%>
<a href="createSession.jsp">���ǰ�ü����</a>










