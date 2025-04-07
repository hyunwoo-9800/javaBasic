package thisisjava.ch20.oracle.sec09.exam02;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardSelectExample {

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
						+ "bno, "
						+ "btitle, "
						+ "bcontent, "
						+ "bwriter, "
						+ "bdate, "
						+ "bfilename, "
						+ "bfiledata "
					+ "FROM boards WHERE bwriter = ?";

			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");

			// SQL 실행 후 데이터 읽기
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfilename(rs.getString("bfilename"));
				board.setBfiledata(rs.getBlob("bfiledata"));

				System.out.println(board);
				
				// 파일로 저장
				Blob blob = board.getBfiledata();
				if (blob != null) {
					
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("C:/test/" + board.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
					
				}

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
