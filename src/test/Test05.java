package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;

		try {

			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "c##hw", "0000");

			// 트랜잭션 시작
			// 자동 커밋 끄기
			conn.setAutoCommit(false);

			// 출금 작업
			String sql1 = "UPDATE accounts SET balance = balance - ? WHERE ano = ?";
			PreparedStatement ps1 = conn.prepareStatement(sql1);
			ps1.setInt(1, 10000);
			ps1.setString(2, "111-111-11110");

			int rows1 = ps1.executeUpdate();
			if (rows1 == 0)
				throw new Exception("출금되지 않았음");

		} catch (Exception e) {
			// TODO: handle exception

			try {

				// 수동 롤백, 모두 실패 처리
				conn.rollback();
				// 자동 커밋 활성화
				conn.setAutoCommit(true);

			} catch (SQLException e1) {
				// TODO: handle exception
			}
			
			System.out.println("계좌 이체 실패");
			e.printStackTrace();

		}

	}

}
