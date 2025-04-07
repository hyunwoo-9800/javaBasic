package thisisjava.ch20.oracle.sec10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureCallExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;

		try {

			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "c##hw", "0000");

			// 매개변수화된 호출문 작성
			String sql = "{ call user_create(?, ?, ?, ?, ?, ?) }";
			CallableStatement cstmt = conn.prepareCall(sql);
			
			// 바인딩 변수 값 지정
			cstmt.setString(1, "summer");
			cstmt.setString(2, "한여름");
			cstmt.setString(3, "12345");
			cstmt.setInt(4, 26);
			cstmt.setString(5, "summer@mycompany.com");
			cstmt.registerOutParameter(6, Types.INTEGER);
			
			// 프로시저 실행
			cstmt.execute();
			
			int rows = cstmt.getInt(6);
			System.out.println("저장된 행수 : " + rows);
			
			// 프로시저 닫기
			cstmt.close();
			

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
