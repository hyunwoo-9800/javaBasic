package project;

// JAVA와 MySQL을 연결해주는 jdbc 드라이버명 과 mysql의 주소, id, password
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
		static final String driver = "com.mysql.jdbc.Driver";
		static final String url = "jdbc:mysql://localhost:3306/sawon"; 
		public static Connection getConnection() throws Exception{
			Class.forName(driver); 
			// 주소, id, password : password는 설정안해놔서 공백문자로
			Connection con = DriverManager.getConnection(url, "root", ""); 
			return con;
		}
}
