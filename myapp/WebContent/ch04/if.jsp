<!-- if.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		String name = request.getParameter("name");
		String color2 = request.getParameter("color");
		String msg = "";
		if(color2.equals("blue")){
		 	msg = "�Ķ���";
		}else if(color2.equals("red")){
			msg = "������";
		}else if(color2.equals("orange")){
			msg = "��������";
		}else{
			msg = "��Ÿ��";
			color2 = "black";
		}
%>
<body bgcolor="<%=color2%>" style="color:white">
<%=name%>�� �����ϴ� ������
<%= color2 %>�Դϴ�.


</body>





