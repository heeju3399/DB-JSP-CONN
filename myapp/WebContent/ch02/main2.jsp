<%@ page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
	for(int i = 0; i<10; i++){
		out.println("���� �̷������.�������.<br>");
	}
%>
<script>
function a (){
	alert("kikiki");
}
</script>
<body onload='a()'>
	<form style = 'font-size:50'> front���</form>
	<%
	int i = 0 ;
		if(i<1){
			out.print("fff");
		}
	%>
</body>