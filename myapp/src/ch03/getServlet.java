package ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch03/getServlet")
public class getServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=EUC-KR");
		//"msg�� "��ǲŸ���� name�� ���� ��ġ�ؾ��Ѵ�. �ѱ� �ȉ´�. 
		String msg = request.getParameter("msg");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>GetServlet</h1>");
		out.println("<h1>GetServlet</h1>");
		out.println("msg : "  + msg );
		
	}

}
