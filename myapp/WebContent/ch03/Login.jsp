<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
	String id = (String)session.getAttribute("idKey");
%>
<h1>�α���</h1>
<%
		if(id != null){		
%>
<!-- �α��ε� ���� -->
<%=id%> �� �ݰ����ϴ�.
<a href="logout.jsp"> �α׾ƿ� </a>

<% }else{
			
%>
<!--  �α��� �ȵ� ���� -->
<form method="post" action="LoginServlet">
id : <input name="idi"><br/><br/>
pwd : <input type="password" name="pwd"><br/><br/>

<input type="submit" value="����"> 
</form>


<% } 

%>