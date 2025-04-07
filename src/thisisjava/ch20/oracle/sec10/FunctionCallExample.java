package thisisjava.ch20.oracle.sec10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionCallExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		
		try {
			
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "c##hw", "0000");

			// 매개변수화된 호출문 작성
			String sql = "{ ? = call user_login(?, ?) }";
			CallableStatement cstmt = conn.prepareCall(sql);
			
			// 바인딩 변수 값 지정
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setString(2, "winter");
			cstmt.setString(3, "12345");
			
			// 프로시저 실행
			cstmt.execute();
			
			int result = cstmt.getInt(1);
			
			// 프로시저 닫기
			cstmt.close();
			
			String message = switch(result) {
			
			case 0 -> "로그인 성공";
			case 1 -> "비밀번호가 틀림";
			default -> "아이디가 존재하지 않음";
			
			};
			
			System.out.println(message);
			
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
