<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
	String id = (String)session.getAttribute("idKey");
%>
<h1>로그인</h1>
<%
		if(id != null){		
%>
<!-- 로그인된 영역 -->
<%=id%> 님 반갑습니다.
<a href="logout.jsp"> 로그아웃 </a>

<% }else{
			
%>
<!--  로그인 안된 영역 -->
<form method="post" action="LoginServlet">
id : <input name="idi"><br/><br/>
pwd : <input type="password" name="pwd"><br/><br/>

<input type="submit" value="가입"> 
</form>


<% } 

%>