package ch04;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class MUtil {
	//request�� �Ѱܿ� ���ڸ� ���ڷ� ����
	public static int parseInt(HttpServletRequest request, String name) {
		return Integer.parseInt(request.getParameter(name));
	}
	//Random ������ ����
	public static String randomColor() {
		Random r = new Random();
		String rgb = Integer.toHexString(r.nextInt(256));
		rgb += Integer.toHexString(r.nextInt(256));
		rgb += Integer.toHexString(r.nextInt(256));
		return "#"+rgb;
	} 
}






