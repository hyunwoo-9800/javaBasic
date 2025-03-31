package project;


import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class FindPane extends JPanel implements ActionListener {

	private JPanel jp[] = new JPanel[10];
	private JLabel jl[] = new JLabel[10];
	private JTextField tf[] = new JTextField[10];
	private JButton okb;
	private JButton rsb;
	private JButton csb;

	// 조회해줄 데이터들
	String[] caption = { "사 번:", "이 름:", "직 책:", "부 서", "메 일:", "고과점수", "연 봉", "연 차", "입사날짜" };

	public FindPane() {
		setLayout(new GridLayout(7, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;

		// 조회해줄 데이터들의 레이블, 텍스트필드 생성
		for (int i = 0; i < size; i++) {
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i] = new JPanel();
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
			tf[i].setEditable(false); // setEditable 텍스트필드의 편집여부 결정

			if (i == 0 || i == 1)
				tf[i].setEditable(true); // 사번, 이름 텍스트필드만 입력가능하게

		}

		// 버튼
		jp[size] = new JPanel();
		okb = new JButton("사원정보조회");
		okb.addActionListener(this);
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);
		csb = new JButton("삭제");
		csb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		jp[size].add(csb);
		add(jp[size]);

	} // FindPane()

	// 버튼을 눌렀을때 돌아갈 메소드
	public void actionPerformed(ActionEvent ae) {

		String ae_type = ae.getActionCommand();
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;
		EmployeeVO2 evo2 = null;
		if (ae_type.equals(okb.getText())) { // 조회하기 버튼을 눌르면
			try {
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim(); // 사번 텍스트필드에 입력한값으로 초기화
				String sname = tf[1].getText().trim(); // 이름 텍스트필드에 입력한값으로 초기화

				if (!sno.equals("") && !sname.equals("")) { // 사번, 이름 둘다 입력했을때
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname); // 사번,이름을 매개변수로 가지는 조회 메소드 실행
					evo2 = edvo.getEmployeeYS(evo.getNo());
				} else if (!sno.equals("") && sname.equals("")) { // 사번 만 입력했을때
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no); // 사번을 매개변수로 가지는 조회 메소드 실행
					evo2 = edvo.getEmployeeYS(evo.getNo()); // evo 에서 가져온 사번으로 연차,연봉 조회
				} else if (sno.equals("") && !sname.equals("")) // 이름만 입력했을떄
					evo = edvo.getEmployeeName(sname); // 이름을 매개변수로 가지는 조회메소드 실행
				evo2 = edvo.getEmployeeYS(evo.getNo()); // evo 에서 가져온 사번으로 연차,연봉 조회
			} catch (Exception e) {
				System.out.println("e=[" + e + "]");

			}

			if (evo != null) { // EmployeeVO 타입의 evo가 null값이 아니면, 조회해서 값을 가져왔으면
				try {
					int jg_no = evo.getJg_no();
					int dept_no = evo.getDept_no();
					int rank = evo.getRank();
					
					tf[0].setText(evo.getNo() + ""); // 텍스트 필드에 정보를 띄워줌. ""로 String형으로 형변환
					tf[1].setText(evo.getName());
					tf[2].setText(edvo.getJg_name(jg_no));
					tf[3].setText(edvo.getDept_name(dept_no));
					tf[4].setText(evo.getEmail());
					tf[5].setText(edvo.getRank_name(rank));
					tf[6].setText(evo2.getSalary() + "");
					tf[7].setText(evo2.getYasumi() + "");
					tf[8].setText(evo.getHire_date());
				} catch (Exception e) {
					System.out.println("e=[" + e + "]");
				}
			} else { // 조회해서 값을 가져오는데 실패했다면
				JOptionPane.showMessageDialog(this, "검색실패");
			}

		} else if (ae_type.equals(rsb.getText())) { // 다시쓰기 버튼 클릭시
			int size = caption.length;
			for (int i = 0; i < size; i++) { // 텍스트 필드 초기화
				tf[i].setText("");
			}
		}

		if (ae_type.equals(csb.getText())) { // 삭제 버튼을 눌렀다면

			String sno = tf[0].getText().trim();

			if (!sno.equals("")) { // 사번 이 입력되어있다면

				try {
					// 바로 삭제하지는 않고 다이얼 로그를 띄워줌
					int answer = JOptionPane.showConfirmDialog(this, "삭제하시겠습니까?", "confirm", JOptionPane.YES_NO_OPTION);

					if (answer == JOptionPane.YES_OPTION) { // 다이얼로그에서 예 버튼을 눌렀다면

						edvo = new EmployeeDAO();
						int no = Integer.parseInt(sno); // 사번 가져옴
						edvo.getEmployeeDelete(no); // 사번을 매개변수로 갖는 삭제 메소드 실행
						JOptionPane.showMessageDialog(this, "삭제되었습니다.");

					} else if (answer == JOptionPane.NO_OPTION) { // 아니요 버튼을 눌렀다면
						JOptionPane.showMessageDialog(this, "취소되었습니다.");
					}

				}

				catch (Exception e2) {
					// TODO: handle exception

					System.out.println("e2=[" + e2 + "]");
				}

			}
		} // 삭제 버튼을 눌렀다면
	} // actionPerformed(ActionEvent ae)
}// class
