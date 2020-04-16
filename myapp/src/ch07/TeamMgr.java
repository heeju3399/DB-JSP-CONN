package ch07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

//JSP DB������ �ʿ��� �޼ҵ带 ����� Ŭ����
public class TeamMgr {

	private DBConnectionMgr pool;

	public TeamMgr() {
		// DBConnectionMgr �̱��� �������� ���� Ŭ����
		// �̱��� ������ ��ü�� only one���� ����� �ִ� ����
		pool = DBConnectionMgr.getInstance();
	}

	// pool���� Connection ���� -> ��� -> �ݳ�.

	// ����
	// public void insertTeam(String name, String city, int age, String team) {
	public void insertTeam(TeamBean bean) {
		// java.sql ��Ű�� ���
		Connection con = null;
		// SQL�� �����ϴ� ��ü
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			// DBConnectionMgr���� Connection ������.
			con = pool.getConnection();
			sql = "insert tblTeam(name,city,age,team)values(?,?,?,?)";
			// ����
			pstmt = con.prepareStatement(sql);
			// ?�� ���� ����
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getCity());
			pstmt.setInt(3, bean.getAge());
			pstmt.setString(4, bean.getTeam());
			// �ϼ��� SQL ����
			pstmt.executeUpdate();// insert, update, delete
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// coConnection �ݳ��ϰ� pstmt�� close
			pool.freeConnection(con, pstmt);
		}
	}

	// ����Ʈ
	public Vector<TeamBean> listTeam() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<TeamBean> vlist = new Vector<TeamBean>();
		try {
			con = pool.getConnection();
			sql = "select * from tblTeam";
			pstmt = con.prepareStatement(sql);
			// ?�� ���� ������ ������ ����.
			rs = pstmt.executeQuery();// select ����
			// select�� ������� ũ�⸦ �𸣱� ������ �ݺ��� while�� ���
			while (rs.next()) {
				/*
				 * int num = rs.getInt(1);//1�� ������ �÷��� ù��° ����. num String name =
				 * rs.getString(2);//name String city = rs.getString(3); int age = rs.getInt(4);
				 * String team =rs.getString(5);
				 */
				TeamBean bean = new TeamBean();
				bean.setNum(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setCity(rs.getString(3));
				bean.setAge(rs.getInt(4));
				bean.setTeam(rs.getString(5));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}

	// ���ڵ� ��������
	public TeamBean getTeam(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		TeamBean bean = new TeamBean();
		try {
			con = pool.getConnection();
			sql = "select * from tblTeam where num=?";
			pstmt = con.prepareStatement(sql);
			// ù��° ?�� ����
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				bean.setNum(rs.getInt("num"));
				bean.setName(rs.getString("name"));
				bean.setCity(rs.getString("city"));
				bean.setAge(rs.getInt("age"));
				bean.setTeam(rs.getString("team"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}

	// ���� : �������� ���� true, �����̸� false
	public boolean updateTeam(TeamBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update tblTeam set name=?, city=?, age=?, team=? " + "where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getCity());
			pstmt.setInt(3, bean.getAge());
			pstmt.setString(4, bean.getTeam());
			pstmt.setInt(5, bean.getNum());
			if (pstmt.executeUpdate() == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}

	// ����
	public void deleteTeam(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql = "delete from tblTeam where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
	}
	
	//team name list
	public Vector<String> listTeamName(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<String> vlist = new Vector<String>();
		try {
			con = pool.getConnection();
			sql = "select distinct(team) from tblTeam";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vlist.addElement(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	
}
















