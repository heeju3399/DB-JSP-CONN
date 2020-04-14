package db;

//JSP DB연동에 필요한 메소드를 만드는 클래스
public class TeamMgr {
	
	private DBConnectionMgr pool;
	
	public TeamMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	

}
