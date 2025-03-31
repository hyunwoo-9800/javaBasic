package project;


import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {
	private JTabbedPane tp;
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;
	private UpdatePane upa;
	// private DeletePane dpa;
	// private SalaryPane spa;

	public MainFrame() throws HeadlessException {
		super();
		tp = new JTabbedPane(); // 탭 화면
		ap = new AddPane();	// 추가 저장 팬
		fp = new FindPane();	// 특정사원 조회,삭제 팬
		tpa = new TotalPane();	// 전체 사원정보 조회 팬
		upa = new UpdatePane(); // 수정 팬 추가
		// dpa = new DeletePane();
		// spa = new SalaryPane();

		tp.addTab("사원정보입력", ap); // 저장 탭 생성
		tp.addTab("사원정보조회,삭제", fp); // 조회,삭제
		tp.addTab("사원전체보기", tpa); // 전체조회
		tp.addTab("사원정보수정", upa); // 수정
		// tp.addTab("사원삭제", dpa);
		// tp.addTab("사원연봉", spa);

		getContentPane().add(tp);
		setTitle("인사 관리 시스템"); // 타이틀

		pack();
		setVisible(true); // 화면출력
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x버튼 누르면 종료
	}

	public static void main(String[] args) {
		new MainFrame();

	}
}
