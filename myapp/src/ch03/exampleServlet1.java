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

	//����ȣ��� �ڵ����� �ٴ� �༮ �ڹ� ���ΰ� ������
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response = ����
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>��Ŭ������ ���� �Ѹ����?</h1>");
		out.println("<p>����?</p>");
		out.println("<p>���� ID :" +session.getId()+ "</p>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("��𼭺��ϱ�?");
		
	}

}
