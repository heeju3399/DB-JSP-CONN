<%@page contentType="text/html; charset=EUC-KR"%>
<!-- SUN ��å JSP�� �ڹ��ڵ带 0%-->
<%
		String s = new String();
%>
<jsp:useBean id="s1" class="java.lang.String"/>
<jsp:declaration>
	public int max(int a, int b){
		return a>b?a:b;
	}
</jsp:declaration>
<jsp:scriptlet>
	int a=22;
	int b=23;
</jsp:scriptlet>
a=<jsp:expression>a</jsp:expression>��
b=<jsp:expression>b</jsp:expression> �߿� �� ū ���ڴ�?
<jsp:expression>max(a, b)</jsp:expression>






