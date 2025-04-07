package thisisjava.ch20.oracle.sec07;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;

		try {

			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "c##hw", "0000");

			// 매개변수화된 SQL문 작성
			String sql = new StringBuilder()
					.append("UPDATE boards SET ")
					.append("btitle = ?, ")
					.append("bcontent = ?, ")
					.append("bfilename = ?, ")
					.append("bfiledata = ?")
					.append("WHERE bno = ?")
					.toString();

			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "눈사람");
			pstmt.setString(2, "눈으로 만든 사람");
			pstmt.setString(3, "snowman.jpg");
			pstmt.setBlob(4, new FileInputStream("src/thisisjava/ch20/oracle/sec07/snowman.jpg"));
			pstmt.setInt(5, 1); 				// 게시물 번호 지정

			// SQL문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 수: " + rows);

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
