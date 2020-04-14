<!-- script.jsp -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<!-- 선언문(Declaration) -->
<%!
		String declaration = "Declaration";
		 
		public String decMethod(){
			return declaration;
		}
%>
<!-- 스크립트릿(Scriptlet) -->
<%
		String scriptlet = "Scriptlet";
		String comment = "Comment";		
		out.println("내장객체를 이용한 출력 ssssssssssssssss: " + declaration +"<p>");
%>
<!-- 표현식(Expression) -->
선언문의 출력1aaaaaaaaaaaaa : <%=declaration %><p>
선언문의 출력2bbbbbbbbbbbbb : <%=decMethod() %><p>
스크립트릿의 출력1ccccccccccc : <%=scriptlet %><p>
<%--\jsp/ 주석 --%>









