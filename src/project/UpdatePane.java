package project;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class UpdatePane extends JPanel implements ActionListener, ItemListener {

	private JPanel jp[] = new JPanel[7];
	private JLabel jl[] = new JLabel[7];
	private JTextField tf[] = new JTextField[10];
	private JButton okb;
	private JButton rsb;
	private int dept_no = 0;
	private int jg_no = 0;
	private int rank = 0;
	private int no = 0;
	JComboBox combo1;
	JComboBox combo2;
	JComboBox combo3;

	String[] caption = { "직 급:", "부 서:", "고과점수:", "사 번:" };

	public UpdatePane() {
		setLayout(new GridLayout(5, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		// JComboBox[] combo;
		int size = caption.length;

		// 직급을 입력할 패널(레이블 , 직급 콤보박스)
		jp[0] = new JPanel();
		jl[0] = new JLabel(caption[0]);
		jp[0].add(jl[0]); // 패널에 레이블 직급 넣기
		add(jp[0]); // 프레임에 패널넣기

		
		combo1 = new JComboBox();
		combo1.addItem("직책을 선택하세요.");
		combo1.addItem("1.신입사원");// "1.신입사원"
		combo1.addItem("2.주임");// "2.주임"
		combo1.addItem("3.대리");// "3.대리"
		combo1.addItem("4.과장");// "4.과장"

		jp[0].add(combo1); // 패널에 콤보박스 넣기
		combo1.addItemListener(this);

		// 부서를 입력할 패널(레이블 , 부서 콤보박스)
		jp[1] = new JPanel();
		jl[1] = new JLabel(caption[1]);
		jp[1].add(jl[1]);
		add(jp[1]);

		combo2 = new JComboBox();
		combo2.addItem("부서번호를 선택하세요."); // 부서명 선택
		combo2.addItem("10.영업부");
		combo2.addItem("20.개발부");
		combo2.addItem("30.마케팅부");
		combo2.addItem("40.회계부");

		jp[1].add(combo2); // 콤보박스도 넣음
		combo2.addItemListener(this);

		// 고과점수를 입력할 패널(레이블, 고과점수 콤보박스)
		jp[2] = new JPanel();
		jl[2] = new JLabel(caption[2]);
		jp[2].add(jl[2]);
		add(jp[2]);
		combo3 = new JComboBox();
		combo3.addItem("고과점수 선택하세요."); // 고과점수 선택
		combo3.addItem("1.A");
		combo3.addItem("2.B");
		combo3.addItem("3.C");
		combo3.addItem("4.D");

		jp[2].add(combo3);
		combo3.addItemListener(this);

		jl[3] = new JLabel(caption[3]);
		tf[3] = new JTextField(15);
		jp[3] = new JPanel();
		jp[3].add(jl[3]);
		jp[3].add(tf[3]);
		add(jp[3]);
		tf[3].setEditable(true);

		/***
		 * for (int i = 0; i < size; i++) { jl[i] = new JLabel(caption[i]); tf[i] = new
		 * JTextField(15); jp[i] = new JPanel(); jp[i].add(jl[i]); jp[i].add(tf[i]);
		 * add(jp[i]); tf[i].setEditable(true); // setEditable 텍스트필드의 편집여부 결정 }
		 ***/
		jp[size] = new JPanel();
		okb = new JButton("사원정보수정");
		okb.addActionListener(this);
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		add(jp[size]);
	}

	public void actionPerformed(ActionEvent ae) {

		String ae_type = ae.getActionCommand();
		EmployeeDAO edvo = null;
		EmployeeVO2 evo2 = null;

		if (ae_type.equals(okb.getText())) {
			try {
				int answer = JOptionPane.showConfirmDialog(this, "수정하시겠습니까?", "confirm", JOptionPane.YES_NO_OPTION);

				if (answer == JOptionPane.YES_OPTION) {

					no = Integer.parseInt(tf[3].getText().trim());

					edvo = new EmployeeDAO();
					// 업데이트 메소드 실행
					edvo.getEmployeeUpdate(jg_no, (dept_no*10), rank, no);

					
					// 수정된 부서,직급으로 연봉, 연차도 수정
					int id = 0;
					edvo = new EmployeeDAO();
					evo2 = new EmployeeVO2();
					id = edvo.getNamefindNo(tf[3].getText()); // 이름으로 사번을찾고
					edvo.getEmployee2Insert(id, tf[3].getText()); // 사번, 이름을 매개변수로 입력받음
					edvo.getYasumiDBsave(id); // 사번으로 연차를 employee2 에 저장
					edvo.getSalaryDBsave(id); // 사번으로 연봉을 emplyoee2 에 저장
				
					JOptionPane.showMessageDialog(this, "수정되었습니다.");

				} else if (answer == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(this, "취소되었습니다.");
				}

			} catch (Exception e) {
				System.out.println("e=[" + e + "]");
			}

		} else if (ae_type.equals(rsb.getText())) { // 다시쓰기 버튼 클릭시 초기화
			for (int i = 0; i < 3; i++) {
				try {
					tf[3].setText("");
					
					if (i == 0) {
						combo1.setSelectedIndex(0);
					} else if (i == 1) {
						combo2.setSelectedIndex(0);
					} else {
						combo3.setSelectedIndex(0);
					}
				}catch (Exception e) {
					System.out.println("e=[" + e + "]");
				}
			}// for
			
		} // 다시쓰기 버튼

	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		if (ie.getStateChange() == ItemEvent.SELECTED) {
			try {
			dept_no = Integer.parseInt(ie.getItem().toString().substring(0, 1));
			rank = Integer.parseInt(ie.getItem().toString().substring(0, 1));
			jg_no = Integer.parseInt(ie.getItem().toString().substring(0, 1));
			}catch(Exception e) {}
		}
	}// itemStateChanged(ItemEvent ie)

}
