<!-- updateGuestBookProc.jsp -->
<%@page contentType="text/html; charset=EUC-KR"%>
<%request.setCharacterEncoding("EUC-KR");%>
<jsp:useBean id="mgr" class="guestbook.GuestBookMgr"/>
<jsp:useBean id="bean" class="guestbook.GuestBookBean"/>
<jsp:setProperty property="*" name="bean"/>
<%
		//secret üũ�� �ϸ�  secret=1 ���� �Ѿ�ͼ� ���� ����
		//�׷��� üũ���� ������ secret �� ��ü�� �Ѿ���� ����.
		if(bean.getSecret()==null){
			bean.setSecret("0");
		}
		mgr.updateGuestBook(bean);
		//â�� close
%>
<script>
	opener.location.reload();
	self.close(); 
</script>








