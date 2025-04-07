package thisisjava.ch20.oracle.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserSelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;

		try {
			
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "c##hw", "0000");

			// 매개변수화된 SQL문 작성
			String sql = "SELECT "
						+ "userid, "
						+ "username, "
						+ "userpassword, "
						+ "userage, "
						+ "useremail "
					+ "FROM USERS WHERE userid = ?";

			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");

			// SQL 실행 후 데이터 읽기
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {

				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserIName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				
				System.out.println(user);

			} else {

				System.out.println("사용자 아이디가 존재하지 않습니다.");

			}
			
			rs.close();
			pstmt.close();

		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			
		} finally {
			
			if (conn != null) {
				
				try {
					
					conn.close();
					
				} catch (Exception e) {
					
					// TODO: handle exception
					
					e.printStackTrace();
					
				}
				
			} // conn 종료
			
		} //  try - catch - finally 종료

	} // main 끝

} // class 끝
