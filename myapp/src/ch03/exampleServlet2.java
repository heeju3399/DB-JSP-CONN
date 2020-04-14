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
	@Override//서블릿 객체 생성될때 처음으로 한번 호출
	public void init() throws ServletException{
		System.out.println("init 호출");
	}
	@Override//서블릿 종료 및 수정될때 한번만 호출
	public void destroy(){
		System.out.println("destroy 호출");
	}
	@Override//서블릿 할때마다 호출
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("servlet 호출");
	
		
	}

}
