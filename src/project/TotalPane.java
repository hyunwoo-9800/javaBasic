package project;


import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TotalPane extends JPanel{
	public TotalPane() {
		// TODO Auto-generated constructor stub
		super();
		JTable table = new JTable(new EmployModel()); // EmployModel 인스턴스로 JTable에 인스턴스화
		add(new JScrollPane(table)); //스크롤 기능 추가
	}

}
