<!-- script.jsp -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<!-- ����(Declaration) -->
<%!
		String declaration = "Declaration";
		 
		public String decMethod(){
			return declaration;
		}
%>
<!-- ��ũ��Ʈ��(Scriptlet) -->
<%
		String scriptlet = "Scriptlet";
		String comment = "Comment";		
		out.println("���尴ü�� �̿��� ��� ssssssssssssssss: " + declaration +"<p>");
%>
<!-- ǥ����(Expression) -->
������ ���1aaaaaaaaaaaaa : <%=declaration %><p>
������ ���2bbbbbbbbbbbbb : <%=decMethod() %><p>
��ũ��Ʈ���� ���1ccccccccccc : <%=scriptlet %><p>
<%--\jsp/ �ּ� --%>









