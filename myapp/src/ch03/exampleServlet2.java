package ch03;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ch03/exampleServlet2")
public class exampleServlet2 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7897035856513778365L;
	@Override//���� ��ü �����ɶ� ó������ �ѹ� ȣ��
	public void init() throws ServletException{
		System.out.println("init ȣ��");
	}
	@Override//���� ���� �� �����ɶ� �ѹ��� ȣ��
	public void destroy(){
		System.out.println("destroy ȣ��");
	}
	@Override//���� �Ҷ����� ȣ��
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("servlet ȣ��");
	
		
	}

}
