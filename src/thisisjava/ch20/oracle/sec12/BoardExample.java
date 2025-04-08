package thisisjava.ch20.oracle.sec12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample {

	private Scanner sc = new Scanner(System.in);
	private Connection con;

	// DB 연결
	public BoardExample() {

		try {

			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "c##hw", "0000");
			System.out.println("연결 성공");

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
			exit();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoardExample bex = new BoardExample();
		bex.list();

	} // main 끝

	// 메서드 선언
	public void list() {

		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------------------------------------");
//		System.out.printf("%-6s%-15s%-12s%-16s%-40s\n", "no", "boardnum", "writer", "date", "title");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------------------");
//		System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "writer", "2022.01.27", "게시판에 오신 것을 환영합니다.");
//		System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "writer", "2022.01.27", "올 겨울은 많이 춥습니다.");

		try {

			String sql = "SELECT bno, row_number() over (order by bdate) as no, btitle, bcontent, bwriter, bdate, bfilename, bfiledata FROM boards ORDER BY bno DESC";

			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Board board = new Board();
//				board.setBno(rs.getInt("bno"));
				board.setBoardNum(rs.getInt("no"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));

//				System.out.printf("%-6s%-15s%-12s%-16s%-40s\n", board.getBno(), board.getBoardNum(), board.getBwriter(),
//						board.getBdate(), board.getBtitle());
				System.out.printf("%-6s%-12s%-16s%-40s\n", board.getBoardNum(), board.getBwriter(),
						board.getBdate(), board.getBtitle());

			}

			rs.close();
			ps.close();

		} catch (SQLException e) {
			// TODO: handle exception

			e.printStackTrace();
			exit();

		}

		// 메인 메뉴 출력
		mainMenu();

	}

	public void mainMenu() {

		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1.메인메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.println("메뉴 선택 : ");
		String menuNo = sc.nextLine();
		System.out.println();

		switch (menuNo) {

		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();

		}

	}

	private void create() {

		// 입력 받기
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목 : ");
		board.setBtitle(sc.nextLine());
		System.out.print("내용 : ");
		board.setBcontent(sc.nextLine());
		System.out.print("작성자 : ");
		board.setBwriter(sc.nextLine());

		// 보조 메뉴 출력
		System.out.println("-----------------------------------------------------------------");
		System.out.println("보조 메뉴 : 1.Ok | 2.Cancle");
		System.out.print("메뉴 선택 : ");
		String menuNo = sc.nextLine();

		if (menuNo.equals("1")) {

			// 게시글 저장
			try {

				String sql = "INSERT INTO boards VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, NULL, NULL)";

				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, board.getBtitle());
				ps.setString(2, board.getBcontent());
				ps.setString(3, board.getBwriter());
				ps.executeUpdate();
				ps.close();

			} catch (Exception e) {
				// TODO: handle exception

				e.printStackTrace();
				exit();

			}

		}

		// 게시물 목록 출력
		list();

	}

	private void read() {

		System.out.println("[게시물 읽기]");
		System.out.print("no : ");
		int no = Integer.parseInt(sc.nextLine());

		// 테이블에서 해당하는 게시물 가져오기
		try {

			String sql = "SELECT bno, row_number() over (order by bdate) as no, btitle, bcontent, bwriter, bdate FROM boards WHERE bno = ?";
			String sql2 = "SELECT bno FROM (SELECT rownum as num, boards.* FROM boards) WHERE num = ?";
			PreparedStatement ps2 = con.prepareStatement(sql2);
			ps2.setInt(1, no);
			ResultSet rs2 = ps2.executeQuery();
			int bno;
			
			if (rs2.next()) {
				
				bno = rs2.getInt("bno");
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, bno);
				ResultSet rs = ps.executeQuery();
				
				if (rs.next()) {

					Board board = new Board();
					board.setBno(rs.getInt("bno"));
					board.setBoardNum(rs.getInt("no"));
					board.setBtitle(rs.getString("btitle"));
					board.setBcontent(rs.getString("bcontent"));
					board.setBwriter(rs.getString("bwriter"));
					board.setBdate(rs.getDate("bdate"));

					System.out.println("###############");
//					System.out.println("번호 : " + board.getBno());
					System.out.println("번호 : " + board.getBoardNum());
					System.out.println("제목 : " + board.getBtitle());
					System.out.println("내용 : " + board.getBcontent());
					System.out.println("작성자 : " + board.getBwriter());
					System.out.println("날짜 : " + board.getBdate());
					System.out.println("###############");

					// 보조 메뉴 출력
					System.out.println("-----------------");
					System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
					System.out.print("메뉴 선택");
					String menuNo = sc.nextLine();

					if (menuNo.equals("1")) {

						update(board);

					} else if (menuNo.equals("2")) {

						delete(board);

					}

				}

				rs.close();
				ps.close();
				
			}

		} catch (Exception e) {

			// TODO: handle exception
			e.printStackTrace();
			exit();

		}

		// 게시물 목록 출력
		list();

	}

	private void clear() {

		System.out.println("[게시물 전체 삭제]");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("보조 메뉴 : 1.Ok | 2.Cancle");
		System.out.print("메뉴 선택 : ");
		String menuNo = sc.nextLine();

		// 테이블에서 게시글 전체 삭제
		if (menuNo.equals("1")) {

			try {

				String sql = "TRUNCATE TABLE boards";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.executeUpdate();
				ps.close();

			} catch (Exception e) {
				// TODO: handle exception

				e.printStackTrace();
				exit();

			}

		}

		// 게시물 목록 출력
		list();

	}

	private void exit() {

		if (con != null) {

			try {

				con.close();

			} catch (SQLException e) {
				// TODO: handle exception
			}

		}

		System.out.println("** 게시판 종료 **");
		System.exit(0);

	}

	public void update(Board board) {

		// 수정 내용 입력 받기
		System.out.println("[수정 내용 입력]");
		System.out.print("제목 : ");
		board.setBtitle(sc.nextLine());
		System.out.print("내용 : ");
		board.setBcontent(sc.nextLine());
		System.out.print("작성자 : ");
		board.setBwriter(sc.nextLine());

		// 보조 메뉴 출력
		System.out.println("-----------------------------------------------------------------");
		System.out.println("보조 메뉴 : 1.Ok | 2.Cancle");
		System.out.print("메뉴 선택 : ");
		String menuNo = sc.nextLine();

		if (menuNo.equals("1")) {

			// 게시글 수정
			try {

				String sql = "Update boards SET btitle = ?, bcontent = ?, bwriter = ? WHERE bno = ?";

				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, board.getBtitle());
				ps.setString(2, board.getBcontent());
				ps.setString(3, board.getBwriter());
				ps.setInt(4, board.getBno());
				ps.executeUpdate();
				ps.close();

			} catch (Exception e) {
				// TODO: handle exception

				e.printStackTrace();
				exit();

			}

			// 게시물 목록 출력
			list();

		}

	}

	public void delete(Board board) {

		// 게시글 삭제
		try {

			String sql = "Delete FROM boards WHERE bno = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, board.getBno());
			ps.executeUpdate();
			ps.close();

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
			exit();

		}

		// 게시물 목록 출력
		list();

	}

} // class 끝
