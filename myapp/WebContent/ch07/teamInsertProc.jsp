<%@page import="ch07.TeamBean"%>
<%@page import="ch07.TeamMgr"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		TeamMgr mgr = new TeamMgr();
		TeamBean bean = new TeamBean();
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		int age = Integer.parseInt(request.getParameter("age"));
		String team = request.getParameter("team");
		
		bean.setName(name);
		bean.setCity(city);
		bean.setAge(age);
		bean.setTeam(team);
		//데이터베이스 가져오기 연결하기
		mgr.insertTeam(bean);
		//저장후에 teamList.jsp 호출
		response.sendRedirect("teamList.jsp");
%>



