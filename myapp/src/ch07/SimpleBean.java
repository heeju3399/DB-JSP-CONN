package ch07;

/*�ڹٺ��� ���̹� ����.
 * 1.���̺�+Bean (JSP ���� ���)
 * 2.���̺�+DTO (Data Transfer Object)
 * 3.���̺�+VO (Value Object)
 * ex) tblTeam -> TeamBean.java 
 * */
public class SimpleBean {
	//���̺� ��Ű��
	private String msg;
	private int cnt;
	
	//setter -> setXxx, getter -> getXxx
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}











