<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		//DB����
		//�����̶�� ���� ������ ���� : Ŭ���̾�Ʈ ������ ��ü�� ����
		session.setAttribute("idKey", id);
		//������ �����ֱ� : 30��
		session.setMaxInactiveInterval(3*60);//3��
%>
id : <%=id %>
pass : <%=pwd %><br><br><br>

<FORM METHOD="POST" ACTION="session2.jsp">
    1.���� �����ϴ� ������?<br>
	<INPUT TYPE="radio" NAME="season" VALUE="��">��
	<INPUT TYPE="radio" NAME="season" VALUE="����">����
	<INPUT TYPE="radio" NAME="season" VALUE="����">����
	<INPUT TYPE="radio" NAME="season" VALUE="�ܿ�">�ܿ�<p>

	2.���� �����ϴ� ������?<br>
	<INPUT TYPE="radio" NAME="fruit" VALUE="watermelon">����
	<INPUT TYPE="radio" NAME="fruit" VALUE="melon">���
	<INPUT TYPE="radio" NAME="fruit" VALUE="apple">���
	<INPUT TYPE="radio" NAME="fruit" VALUE="orange">������<p>
	<INPUT TYPE="submit" VALUE="�������">
</FORM>