<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		String name = request.getParameter("name");
		String bloodType = request.getParameter("bloodType");
%>
<!-- ǥ���Ŀ��� ""���� �������� ''������ �����Ѵ�. -->
<jsp:include page='<%=bloodType+".jsp"%>'>
	<jsp:param value="<%=name%>" name="name"/>
</jsp:include>
<jsp:include page='<%=bloodType+".jsp"%>'>
	<jsp:param value="<%=name%>" name="name"/>
</jsp:include>
