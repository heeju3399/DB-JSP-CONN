package ch03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch03/exampleServlet1")
public class exampleServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//서블릿호출시 자동으로 붙는 녀석 자바 메인과 동일함
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response = 응답
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>이클립스로 서블릿 ㅡ만들기?</h1>");
		out.println("<p>으앵?</p>");
		out.println("<p>세션 ID :" +session.getId()+ "</p>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("어디서보일까?");
		
	}

}
