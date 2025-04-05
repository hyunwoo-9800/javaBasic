package thisisjava.ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {

		Connection conn = null;

		try {

			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "c##hw", "0000");
			System.out.println("연결 성공");

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (conn != null) {

				try {

					// 연결 끊기
					conn.close();
					System.out.println("연결 끊기");

				} catch (SQLException e) {

				}

			}

		}

	} // main 끝

} // class 끝
