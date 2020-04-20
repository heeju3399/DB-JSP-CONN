<%@page import="ch07.mydbBean"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<jsp:useBean id="bean" class="ch07.mydbBean" />


<jsp:setProperty property="*" name="bean" />

<%
	
%>


