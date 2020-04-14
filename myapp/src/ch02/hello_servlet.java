package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ch02/hello_servlet")
public class hello_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
	response.setContentType("text/html; charset=EUC-KR");
	PrintWriter out= response.getWriter();

	for(int i = 0; i<2; i++) {
	out.print("<h1 style='color:blue';>¹Ý°©´ÙÀÚ¹Ù¾ß!</h1>");
	out.print("<p>?>>>????</p>");
	out.print("<div font-size:50px;>¿ìÄí·¼¶ó</div>");
		
	}
		
	}

}
