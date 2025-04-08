package thisisjava.ch20.oracle.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionExample {

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
			ps1.setString(2, "111-111-1111");

			int rows1 = ps1.executeUpdate();
			if (rows1 == 0) {

				throw new Exception("출금되지 않았음");

			}

			ps1.close();

			// 입금 작업
			String sql2 = "UPDATE accounts SET balance = balance + ? WHERE ano = ?";
			PreparedStatement ps2 = conn.prepareStatement(sql2);
			ps2.setInt(1, 10000);
			ps2.setString(2, "222-222-2222");
			int rows2 = ps2.executeUpdate();
			if (rows2 == 0) {

				throw new Exception("입금되지 않았음");

			}

			ps2.close();

			// 수동 커밋, 모두 성공 처리
			conn.commit();
			System.out.println("계좌 이체 성공");

			if (rows1 != 0 && rows2 != 0) {

				ResultSet rs = null;
				Accounts accounts = null;

				sql1 = "SELECT ano, owner, balance FROM accounts WHERE ano = ?";
				ps1 = conn.prepareStatement(sql1);
				ps1.setString(1, "111-111-1111");

				rs = ps1.executeQuery();
				if (rs.next()) {

					accounts = new Accounts();
					accounts.setAno(rs.getString("ano"));
					accounts.setOwner(rs.getString("owner"));
					accounts.setBalance(rs.getInt("balance"));

					System.out.println("남은 잔고");
					System.out.println("계좌 번호 : " + accounts.getAno() + " 이름 : " + accounts.getOwner() + " 잔고 : "
							+ accounts.getBalance());

					sql2 = "SELECT ano, owner, balance FROM accounts WHERE ano = ?";
					ps2 = conn.prepareStatement(sql2);
					ps2.setString(1, "222-222-2222");

					rs = ps2.executeQuery();
					if (rs.next()) {

						accounts = new Accounts();
						accounts.setAno(rs.getString("ano"));
						accounts.setOwner(rs.getString("owner"));
						accounts.setBalance(rs.getInt("balance"));

						System.out.println("남은 잔고");
						System.out.println("계좌 번호 : " + accounts.getAno() + " 이름 : " + accounts.getOwner() + " 잔고 : "
								+ accounts.getBalance());

					}
				}
			}

		} catch (Exception e) {

			try {

				// 롤백 -> 모두 실패 처리
				conn.rollback();
				// 원래대로 자동 커밋 기능 켜기
				conn.setAutoCommit(true);

			} catch (SQLException e1) {

			}

			System.out.println("계좌 이체 실패");
			e.printStackTrace();

		} finally {

			if (conn != null) {

				try {

					// 원래대로 자동 커밋 기능 켜기
					conn.setAutoCommit(true);

					// 연결 끊기
					conn.close();
				} catch (SQLException e) {

				}
			}
		}

	} // main 끝

}
// class 끝
