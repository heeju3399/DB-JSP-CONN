<!-- if.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		String name = request.getParameter("name");
		String color2 = request.getParameter("color");
		String msg = "";
		if(color2.equals("blue")){
		 	msg = "파란색";
		}else if(color2.equals("red")){
			msg = "빨간색";
		}else if(color2.equals("orange")){
			msg = "오렌지색";
		}else{
			msg = "기타색";
			color2 = "black";
		}
%>
<body bgcolor="<%=color2%>" style="color:white">
<%=name%>님 좋아하는 색상은
<%= color2 %>입니다.


</body>





