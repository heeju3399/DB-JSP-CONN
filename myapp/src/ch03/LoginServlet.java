package ch03;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class postServlet
 */
@SuppressWarnings("serial")
@WebServlet("/ch03/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");
		
		 
		String ID = request.getParameter("idi");
		String PS = request.getParameter("pwd");
	
	
		if(ID != null && PS != null ) {
			HttpSession sesstion = request.getSession();
			//세션에 idkey라는 name으로 id값을 저장함
			sesstion.setAttribute("idKey", ID);
			
			String ss = sesstion.getId();
			System.out.println(ss);
		}
		response.sendRedirect("Login.jsp");
		
	}
	
	

}
