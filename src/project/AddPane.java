package project;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class AddPane extends JPanel implements ActionListener, ItemListener {
	private JPanel jp[] = new JPanel[10];
	private JLabel jl[] = new JLabel[10];
	private JTextField tf[] = new JTextField[15];
	private JButton okb;
	private JButton rsb;
	//private JButton ssb;
	private int dept_no = 0;
	private int jg_no = 0;
	private int rank = 0;
	private String hire_date = "";
	private int temp = 0;
	JComboBox combo1;
	JComboBox combo2;
	JComboBox combo3;

	// private double salary = 0;

	String[] caption = { "이름: ", "직책:  ", "부서: ", "고과점수: ", "메일: ", "입사날짜: " };

	public AddPane() {
		super();
		setLayout(new GridLayout(10, 1));
		EtchedBorder eb = new EtchedBorder();

		int size = caption.length;
		// int i;

		// 이름을 입력할 패널(레이블 ,텍스트필드)
		jp[0] = new JPanel();
		jl[0] = new JLabel(caption[0]);
		tf[0] = new JTextField(15); // 0번째 텍스트 필드
		jp[0].add(jl[0]);
		jp[0].add(tf[0]);
		add(jp[0]);

		// 직급을 입력할 패널(레이블 , 직급 콤보박스)
		jp[1] = new JPanel();
		jl[1] = new JLabel(caption[1]);
		jp[1].add(jl[1]); // 패널에 레이블 직급 넣기
		add(jp[1]); // 프레임에 패널넣기

		combo1 = new JComboBox();
		combo1.addItem("직책을 선택하세요.");
		combo1.addItem("1.신입사원");// "1.신입사원"
		combo1.addItem("2.주임");// "2.주임"
		combo1.addItem("3.대리");// "3.대리"
		combo1.addItem("4.과장");// "4.과장"

		jp[1].add(combo1); // 패널에 콤보박스 넣기
		combo1.addItemListener(this);

		// 부서를 입력할 패널(레이블 , 부서 콤보박스)
		jp[2] = new JPanel();
		jl[2] = new JLabel(caption[2]);
		jp[2].add(jl[2]);
		add(jp[2]);

		combo2 = new JComboBox();
		combo2.addItem("부서번호를 선택하세요."); // 부서명 선택
		combo2.addItem("10.영업부");
		combo2.addItem("20.개발부");
		combo2.addItem("30.마케팅부");
		combo2.addItem("40.회계부");

		jp[2].add(combo2); // 콤보박스도 넣음
		combo2.addItemListener(this);

		// 고과점수를 입력할 패널(레이블, 고과점수 콤보박스)
		jp[3] = new JPanel();
		jl[3] = new JLabel(caption[3]);
		jp[3].add(jl[3]);
		add(jp[3]);
		combo3 = new JComboBox();
		combo3.addItem("고과점수 선택하세요."); // 고과점수 선택
		combo3.addItem("1.A");
		combo3.addItem("2.B");
		combo3.addItem("3.C");
		combo3.addItem("4.D");

		jp[3].add(combo3);
		combo3.addItemListener(this);

		// 메일을 입력할 패널(레이블, 텍스트필드)
		jp[4] = new JPanel();
		jl[4] = new JLabel(caption[4]);
		tf[4] = new JTextField(15); // 3번째 텍스트 필드
		jp[4].add(jl[4]);
		jp[4].add(tf[4]);
		add(jp[4]);

		// 입사날짜를 입력할 패널(레이블, 텍스트필드)
		jp[5] = new JPanel();
		jl[5] = new JLabel(caption[5]);
		tf[5] = new JTextField(15); // 5 ~ 6번째 텍스트 필드
		jp[5].add(jl[5]);
		jp[5].add(tf[5]);
		add(jp[5]);

		// 버튼 부분
		jp[size] = new JPanel();
		okb = new JButton("저장하기");
		okb.addActionListener(this);
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);
		//ssb = new JButton("연봉/연차");
		//ssb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		//jp[size].add(ssb);
		add(jp[size]);

	} // AddPane()

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String ae_type = ae.getActionCommand();
		EmployeeVO eto = null;
		EmployeeDAO edvo = null;
		EmployeeVO2 evo2 = null;

		if (ae_type.equals(okb.getText())) { // 저장하기 버튼을 누르면
			try {
				eto = new EmployeeVO(tf[0].getText(), jg_no, (dept_no * 10), rank, tf[4].getText(), tf[5].getText());
				edvo = new EmployeeDAO();
				edvo.getEmployeeregiste(eto);
				
				int id;
				evo2 = new EmployeeVO2();
				id = edvo.getNamefindNo(tf[0].getText()); // 이름으로 사번을찾고
				edvo.getEmployee2Insert(id, tf[0].getText()); // 사번, 이름을 매개변수로 입력받음
				edvo.getYasumiDBsave(id); // 사번으로 연차를 employee2 에 저장
				edvo.getSalaryDBsave(id); // 사번으로 연봉을 emplyoee2 에 저장
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("e=[" + e + "]");
			}
			if (edvo != null)
				JOptionPane.showMessageDialog(this, tf[0].getText() + "님이 성공적으로 추가됨");
		} else if (ae_type.equals(rsb.getText())) { // 다시쓰기 버튼을 누르면
			for (int i = 0; i < 3; i++) {
				try {
					tf[0].setText(""); // 0번째 를 다시 돌린다
					tf[4].setText("");
					tf[5].setText("");

					// for(int i=0; i<3; i++) {
					if (i == 0) {
						combo1.setSelectedIndex(0);
					} else if (i == 1) {
						combo2.setSelectedIndex(0);
					} else {
						combo3.setSelectedIndex(0);
					}
				}
				catch (Exception e) {
					System.out.println("e=[" + e + "]");
				}
			}// for
		} 
		/***
		else if (ae_type.equals(ssb.getText())) { // 연봉/연차 버튼을 누르면

			{

				try {

					int id = 0;
					edvo = new EmployeeDAO();
					evo2 = new EmployeeVO2();
					id = edvo.getNamefindNo(tf[0].getText()); // 이름으로 사번을찾고
					edvo.getEmployee2Insert(id, tf[0].getText()); // 사번, 이름을 매개변수로 입력받음
					edvo.getYasumiDBsave(id); // 사번으로 연차를 employee2 에 저장
					edvo.getSalaryDBsave(id); // 사번으로 연봉을 emplyoee2 에 저장
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("e=[" + e + "]");
				}
			}

		}***/
	}// actionPerformed(ActionEvent ae)

	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		if (ie.getStateChange() == ItemEvent.SELECTED) {
			// 에러 // 콤보박스의 아이템을 문자열로 받아들이고 0번 인덱스부터 2번 인덱스 전까지 추출
			// dept_no = Integer.parseInt(ie.getItem().toString().substring(0, 2));

			// 에러 // 콤보박스의 아이템을 문자열로 받아들이고 정규식 표현에서 숫자가 아닌부분을 ""로 치환 후 형변환
			// Integer.parseInt(ie.getItem().toString().replaceAll("^[0-9]","").trim());

			// 콤보박스의 아이템을 문자열로 받아들이고 0번 인덱스부터 1번 인덱스 전까지 추출
			try {
			dept_no = Integer.parseInt(ie.getItem().toString().substring(0, 1));
			rank = Integer.parseInt(ie.getItem().toString().substring(0, 1));
			jg_no = Integer.parseInt(ie.getItem().toString().substring(0, 1));
			}catch(Exception e) {}
			// 에러 // 콤보박스의 아에팀을 문자열로 받고 "." 의 인덱스를 찾고, 0번인덱스부터 "." 전 까지 추출
			// temp = ie.getItem().toString().indexOf(".");
			// dept_no = Integer.parseInt(ie.getItem().toString().substring(0, temp));
		}
	}// itemStateChanged(ItemEvent ie)

} // class