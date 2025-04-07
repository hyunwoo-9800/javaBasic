package thisisjava.ch20.oracle.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;

		try {

			String sql = "";
			PreparedStatement ps = null;
			int rows = 0;

			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "c##hw", "0000");

			// 트랜잭션 시작
			// 자동 커밋 끄기
			conn.setAutoCommit(false);

			// 출금 작업
			sql = "UPDATE accounts SET balance = balance - ? WHERE ano = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 10000);
			ps.setString(2, "111-111-1111");
			rows = ps.executeUpdate();
			if (rows == 0) {

				throw new Exception("출금되지 않았음");

			}

			ps.close();

			// 입금 작업
			sql = "UPDATE accounts SET balance = balance + ? WHERE ano = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 10000);
			ps.setString(2, "222-222-2222");
			rows = ps.executeUpdate();
			if (rows == 0) {

				throw new Exception("출금되지 않았음");

			}

			ps.close();

			// 수동 커밋, 모두 성공 처리
			conn.commit();

		} catch (Exception e) {
			// TODO: handle exception

			try {

				// 수동 롤백, 모두 실패 처리
				conn.rollback();

			} catch (SQLException e1) {
				// TODO: handle exception

				System.out.println("계좌 이체 실행");
				e1.printStackTrace();

			} finally {

				if (conn != null) {

					try {

						// 자동 커밋 활성화
						conn.setAutoCommit(true);
						conn.close();

					} catch (Exception e2) {

						// TODO: handle exception
						
					}

				}

			}

		}

	} // main 끝

} // class 끝
