<%@page import="ch07.mydbBean"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
%>
<jsp:useBean id="bean1" class="ch07.mydbBean"/>
<jsp:setProperty property="*" name="bean1"/>


msg2 : <jsp:getProperty property="num" name="bean1"/><br>
msg2 : <jsp:getProperty property="name" name="bean1"/><br>
cnt2 : <jsp:getProperty property="city" name="bean1"/><br>
cnt2 : <jsp:getProperty property="age" name="bean1"/><br>
cnt2 : <jsp:getProperty property="team" name="bean1"/><br>


