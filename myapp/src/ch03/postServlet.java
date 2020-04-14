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
@WebServlet("/ch03/postServlet")
public class postServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html; charset=EUC-KR");
		
		//"msg�� "��ǲŸ���� name�� ���� ��ġ�ؾ��Ѵ�. �ѱ� �ȉ´�. 
		String ID = request.getParameter("id");
		String PS = request.getParameter("pwd");
		
		if(ID != null && PS != null ) {
			HttpSession sesstion = request.getSession();
			//���ǿ� idkey��� name���� id���� ������
			sesstion.setAttribute("idKey","id");
		}
		response.sendRedirect("Login.jsp");
		
	}

}
