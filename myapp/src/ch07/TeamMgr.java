package ch07;

import java.sql.Connection;
import java.sql.PreparedStatement;

//JSP DB������ �ʿ��� �޼ҵ带 ����� Ŭ����
public class TeamMgr {
	
	private DBConnectionMgr pool;
	
	public TeamMgr() {
		//DBConnectionMgr �̱��� �������� ���� Ŭ����
		//�̱��� ������ ��ü�� only one���� ����� �ִ� ����
		pool = DBConnectionMgr.getInstance();
	}
	
	//pool���� Connection ���� -> ��� -> �ݳ�.
	
	//����
	//public void insertTeam(String name, String city, int age, String team) {
	public void insertTeam(TeamBean bean) {
		//java.sql ��Ű�� ���
		Connection con = null;
		//SQL�� �����ϴ� ��ü
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//DBConnectionMgr���� Connection ������.
			con = pool.getConnection();
			sql = "insert tblTeam(name,city,age,team)values(?,?,?,?)";
			//����
			pstmt = con.prepareStatement(sql);
			//?�� ���� ����
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getCity());
			pstmt.setInt(3, bean.getAge());
			pstmt.setString(4, bean.getTeam()); 
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			//coConnection �ݳ��ϰ� pstmt�� close
			pool.freeConnection(con, pstmt);
		}
	}
	
	//����Ʈ
	
	//���ڵ� ��������
	
	//����
	
	//����
	
}







