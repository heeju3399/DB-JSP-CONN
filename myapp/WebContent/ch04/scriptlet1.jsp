<!-- scriptlet1.jsp -->
<%@page import="java.util.Date"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		float f = 2.3f;
		int i = Math.round(f);
		Date d = new Date(); 
%>
실수 f의 반올림 : <%=i%><br/>
날짜와 시간 : <%=d.toString()%>