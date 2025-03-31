package project;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO<ResultSetMataData> {

	// 사원 정보 입력 (String name, int jg_no, int dept_no, int rank, String email, Strig
	// hire_date)
	public EmployeeVO getEmployeeregiste(EmployeeVO evo) throws Exception {
		String dml = "insert into employee (name,jg_no,dept_no,rank,email,hire_date)values (?,?,?,?,?,?);";
		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			// DB에서 테이블 생성할때 사번은 AUTO_ICREMENT 로 지정해놔서 따로 입력받지 않아도된다.
			// pstmt.setInt(1, evo.getNo());
			pstmt.setString(1, evo.getName());
			pstmt.setInt(2, evo.getJg_no());
			pstmt.setInt(3, evo.getDept_no());
			pstmt.setInt(4, evo.getRank());
			pstmt.setString(5, evo.getEmail());
			pstmt.setString(6, evo.getHire_date());

			int i = pstmt.executeUpdate(); // 쿼리문이 insert이니깐
			retval = new EmployeeVO();
			retval.setStatus(i + "");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
		return retval;
	}

	// 이름으로 사번조회
	public int getNamefindNo(String name) throws Exception {
		String dml = "select no from employee where name = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int retval = 0;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setString(1, name);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				retval = rs.getInt(1);
			}
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return retval;

	}// 연봉계산 끝

	// 사번, 이름으로 정보조회
	public EmployeeVO getEmployeeCheck(int no, String name) throws Exception {
		String dml = "select*from employee where no = ? and name =?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getString(7));
			}
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return retval;

	}

	// 사번으로 정보조회
	public EmployeeVO getEmployeeNo(int no) throws Exception {
		String dml = "select*from employee where no=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getString(7));
			}
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return retval;
	}

	// 이름으로 정보조회
	public EmployeeVO getEmployeeName(String name) throws Exception {
		String dml = "select*from employee where name=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getString(7));
			}
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return retval;
	}

	// 사번으로 연봉 연차 정보조회
	public EmployeeVO2 getEmployeeYS(int no) throws Exception {
		String dml = "select salary, yasumi from employee2 where no=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO2 retval = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no); // 바인딩변수로 (int) 사번 만 있으면 가능
			rs = pstmt.executeQuery();
			if (rs.next()) {
				// employee2 테이블에서 (double)연봉, (int)연차
				retval = new EmployeeVO2(rs.getDouble(1), rs.getInt(2));
			}
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return retval;
	}

	// 사원정보 전체보기
	public ArrayList<EmployeeVO> getEmployeetotal() {
		ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
		String tml = "select*from employee";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO emVo = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(tml);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emVo = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getString(7));
				list.add(emVo);
			}
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return list;
	}

	// 사원전체보기 탭에서 위에 컬럼이름을 띄워주기위해
	public ArrayList<String> getColumnName() {
		ArrayList<String> columnName = new ArrayList<String>();
		String sql = "select*from employee";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();

			for (int i = 1; i <= cols; i++) {
				columnName.add(rsmd.getColumnName(i));
			}
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return columnName;
	}

	// 사번으로 부서, 직책 수정
	public void getEmployeeUpdate(int jg_no, int dept_no, int rank, int no) throws Exception {
		String dml = "update employee Set jg_no = ?, dept_no = ?,rank = ? Where no = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO edto = null;

		try {

			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, jg_no); // 1번째 바인딩변수에 (int)직급 no 매개변수
			pstmt.setInt(2, dept_no); // 2번째 바인딩변수에 (int)부서 no
			pstmt.setInt(3, rank); // 3번째 바인딩 변수에 (int)사번
			pstmt.setInt(4, no); // 4번째 바인딩 변수에 (int)사번
			pstmt.executeUpdate(); // 매개변수를 넣은 dml 셀렉문의 결과표

		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		} // try-catch-catch-finally
	}

	// 사번으로 해당 사원의 정보 삭제 메서드
	public int getEmployeeDelete(int no) throws Exception {

		String dml = "DELETE FROM employee WHERE no = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		// ResultSet rs = null;
		// EmployeeDTO retval = null;

		try {

			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no); // 첫번째 바인딩변수에 (int)사번
			pstmt.executeUpdate();

			// retval = (EmployeeDTO)pstmt;

		} catch (SQLException se) {

			System.out.println(se);

		} catch (Exception e) {

			System.out.println(e);

		} finally {

			try {

				// if (rs != null)
				// rs.close();

				if (pstmt != null)
					pstmt.close();

				if (con != null)
					con.close();

			} catch (SQLException se) {

			}
		}

		return 0;

	}

	// employee2 테이블에 insert (사번, 이름)
	public void getEmployee2Insert(int id, String name) throws Exception {
		String dml = "insert into employee2 (no,name) values (?,?);";
		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, id); // 1번째 바인딩변수에는 no 라는 필드에 넣을 (int)데이터, 사번
			pstmt.setString(2, name); // 2번째 바인딩 변수에는 name 라는 필드에 넣을 (String)데이터, 사원이름

			int i = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
	} // getEmployee2Insert

	// 사번으로 해당 사원의 연봉계산 하는 메소드
	public double getEmployeeSalary(int no) throws Exception {
		String dml = "SELECT d.dept_salary * g.jg_salary" + " FROM (SELECT dept_no, jg_no" + " FROM employee"
				+ "	WHERE no = ?) as s, dept d, jobG g" + " WHERE s.dept_no = d.dept_no" + " AND s.jg_no = g.jg_no";
		/***
		 * ex) 사번이 1인 사원의 연봉구하기 SELECT d.dept_salary * g.jg_salary FROM( SELECT dept_no,
		 * jg_no FROM employee WHERE no = 1) as s, dept d, jobG g WHERE s.dept_no =
		 * d.dept_no AND s.jg_no = g.jg_no;
		 * 
		 * employee 테이블에서 사번이 1인 사원의 부서no, 직급no 가져옴, 부서no로 dept테이블이랑 조인, 직급no로 jobG테이블의
		 * 테이블 조인, dept테이블의 부서별 초봉 * jobG테이블의 직급별 연봉 = 해당 사원의 연봉으로 계산
		 ***/

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		double retval = 0;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				retval = rs.getDouble(1);
			}
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return retval;

	}// 연봉계산 끝

	// 사번을 매개변수로 개인 연봉을 구하는 메소드로 구한뒤 employee2 테이블에 저장
	public void getSalaryDBsave(int no) throws Exception {
		String dml = "UPDATE employee2 SET salary =" + getEmployeeSalary(no) + " WHERE no =?";
		Connection con = null;
		PreparedStatement pstmt = null;
		// ResultSet rs = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no);

			pstmt.executeUpdate();

		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				// if (rs != null)
				// rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}

	}// 개인연봉저장 끝

	// 전체 사원의 수를 구하는 메소드
	public int getEmployeeCount() throws Exception {
		String dml = "select count(*) from employee;";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;

		try {

			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			} // if

		} catch (SQLException se) {

			System.out.println(se);

		} catch (Exception e) {

			System.out.println(e);

		} finally {

			try {

				if (pstmt != null)
					pstmt.close();

				if (con != null)
					con.close();

			} catch (SQLException se) {

			}
		} // try-catch-catch-finally

		return count;

	}// count 끝

	// 사번 1번부터 끝까지 DB에 개개인의 연봉저장
	public void totalSaveDB() {

		EmployeeDAO evo = null;
		int i = 0;
		try {
			for (i = 1; i < evo.getEmployeeCount(); i++) {
				evo.getSalaryDBsave(i);
			}
		} catch (Exception e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} // for

	}// totalSaveDB() 끝

	// 사번으로 해당 사원의 연차계산 (직급별로 연차가 다름)
	public int getEmployeeYasumi(int no) throws Exception {
		String dml = "select yasumi from jobG" + " where jg_no = (select jg_no from employee where no = ?);";

		/***
		 * ex) 사번이 1인 사원의 연차 구하기 SELECT yasumi FROM jobG WHERE jg_no = (SELECT jg_no
		 * FROM employee WHERE no = 1);
		 * 
		 * employee 테이블에서 사번이 1인 사원의 직급no를 가져옴, jobG 테이블과 직급no로 조인, jobG 테이블에서 해당 직급no의
		 * 연차를 가져옴
		 ***/

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int retval = 0;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				retval = rs.getInt(1);
			}
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return retval;
	}

	// 사번으로 개인 연차를 구하고 employee2 테이블에 저장
	public void getYasumiDBsave(int no) throws Exception {
		String dml = "UPDATE employee2 SET yasumi = " + getEmployeeYasumi(no) + " WHERE no =?";

		Connection con = null;
		PreparedStatement pstmt = null;
		// ResultSet rs = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no);

			pstmt.executeUpdate();

		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				// if (rs != null)
				// rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}

	}// 개인 연차 저장 끝

	// 부서 번호로 부서 이름 구하는 메소드
	public String getDept_name(int dept_no) throws Exception {
		String dml = "SELECT dept_name" + " FROM dept" + " WHERE dept_no = ?;";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dept_name = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, dept_no);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dept_name = rs.getString(1);
			}

		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return dept_name;
	}// getDept_name(int dept_no)

	// 직급 번호로 직급 이름 구하는 메소드
	public String getJg_name(int jg_no) throws Exception {
		String dml = "SELECT jg_name" + " FROM jobG" + " WHERE jg_no = ?;";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String jg_name = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, jg_no);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				jg_name = rs.getString(1);
			}

		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return jg_name;
	} // getJg_name(int jg_no)

	// 직급 번호로 직급 이름 구하는 메소드
	public String getRank_name(int rank) throws Exception {
		String dml = "SELECT rank_name" + " FROM rankTable" + " WHERE rank = ?;";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String rank_name = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, rank);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				rank_name = rs.getString(1);
			}

		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
				// TODO: handle exception
			}
		}
		return rank_name;
	} // getJg_name(int jg_no)

}