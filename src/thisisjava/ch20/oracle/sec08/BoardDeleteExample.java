package thisisjava.ch20.oracle.sec08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDeleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;

		try {

			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "c##hw", "0000");

			// 매개변수화된 SQL문 작성
			String sql = "DELETE FROM boards WHERE bwriter = ?";

			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");

			// SQL문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수: " + rows);

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();

		} finally {

			if (conn != null) {

				try {

					conn.close();

				} catch (SQLException e) {
					// TODO: handle exception

					e.printStackTrace();

				}

			}

		} // try - catch - finally 종료

	} // main 끝

} // class 끝
