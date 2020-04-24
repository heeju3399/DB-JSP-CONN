package guestbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;

public class xxxxx {

	String a;
	String b;
	String c;
	String f;
	String e;
	String k;
	String g;

	public static boolean aaaaa(String a, String b, String c, String f, String g, String k, String e, String d) {
		
		Connection con = null;
		PreparedStatement pstmt = null;	
		String sql = null;
		DBConnectionMgr pool;
		pool = DBConnectionMgr.getInstance();
		try {
			con = pool.getConnection();
			System.out.println("14");
			sql = "insert mydb.eeeeee(id,pwd,name,email,hp,grade,date,time)" + "values(?,?,?,?,?,?,now(),now())";// ANSI ,																								// RDBMS
			pstmt = con.prepareStatement(sql);
	
			pstmt.setString(1, a);
			pstmt.setString(2, b);
			pstmt.setString(3, c);
			pstmt.setString(4, d);
			pstmt.setString(5, e);
			pstmt.setString(6, f);
			

			pstmt.executeUpdate();// DML : insert, update, delete
		} catch (Exception e2) {
			System.out.println("err:?????" + e2);
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i < 1000000; i++) {

			int ran = (int) (Math.random() * i);
			String aa = Integer.toString(ran);

			int ran1 = (int) (Math.random() * 110000000 + i);
			String bb = Integer.toString(ran1);

			int ran2 = (int) (Math.random() * 110000000 + i);
			String cc = (Integer.toString(ran2));

			int ran3 = (int) (Math.random() * 130000000 + i);
			String dd = (Integer.toString(ran3));

			int ran4 = (int) (Math.random() * 130000000 + i);
			String zz = (Integer.toString(ran4));

			int ran5 = (int) (Math.random() * 130000000 + i);
			String xx = (Integer.toString(ran5));

			int ran6 = (int) (Math.random() * 130000000 + i);
			String ee = (Integer.toString(ran6));
			
			int ran7 = (int) (Math.random() * 130000000 + i);
			String ff = (Integer.toString(ran7));
			
			boolean nono = aaaaa(aa, bb, cc, dd, zz, xx, ee, ff);

			System.out.println(nono + "//");
			System.out.println(" id :" + aa + "  pwd:" + bb + "  Email:" + cc + "  name :" + "  " + ee + ff);
			

		}
		
		JFrame jfm = new JFrame("¿Ï·á");
		jfm.setSize(200,200);
		jfm.setVisible(true);

//		int a[] = new int[5];
//		List<Integer> list = new ArrayList<>();
//		Random r = new Random();
//		for (int i = 0; i <= 4; i++) {
//			a[i] = r.nextInt(10) + 1;
//			for (int j = 0; j < i; j++) {
//				if (a[i] == a[j]) {
//					i--;
//				}
//			}
//		}
//		for (int value : a) {
//			list.add(value);
//		}
//		Collections.sort(list);
//		System.out.println(list);

	}

}
