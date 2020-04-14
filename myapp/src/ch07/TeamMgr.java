package ch07;

import java.sql.Connection;
import java.sql.PreparedStatement;

//JSP DB연동에 필요한 메소드를 만드는 클래스
public class TeamMgr {
	
	private DBConnectionMgr pool;
	
	public TeamMgr() {
		//DBConnectionMgr 싱글톤 패턴으로 구현 클래스
		//싱글톤 패턴은 객체를 only one개만 만들수 있는 패턴
		pool = DBConnectionMgr.getInstance();
	}
	
	//pool에서 Connection 빌림 -> 사용 -> 반납.
	
	//저장
	//public void insertTeam(String name, String city, int age, String team) {
	public void insertTeam(TeamBean bean) {
		//java.sql 패키지 사용
		Connection con = null;
		//SQL문 생성하는 객체
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//DBConnectionMgr에서 Connection 빌려옴.
			con = pool.getConnection();
			sql = "insert tblTeam(name,city,age,team)values(?,?,?,?)";
			//공식
			pstmt = con.prepareStatement(sql);
			//?에 값을 세팅
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getCity());
			pstmt.setInt(3, bean.getAge());
			pstmt.setString(4, bean.getTeam()); 
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			//coConnection 반납하고 pstmt는 close
			pool.freeConnection(con, pstmt);
		}
	}
	
	//리스트
	
	//레코드 가저오기
	
	//수정
	
	//삭제
	
}







