package project;


import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class EmployModel extends AbstractTableModel {
	Object[][] data;
	Object[] columnName;

	EmployeeDAO emDao = new EmployeeDAO();
	EmployeeVO emTo = new EmployeeVO();
	ArrayList<String> title;
	ArrayList<EmployeeVO> list;

	public EmployModel() {
		super();
		// title = emDao.getColumnName();
		String[] title = {"사 번", "이 름", "직 책", "부 서", "메 일", "고과점수","입사날짜"};
		columnName = title;
		int columnCount = columnName.length;

		list = emDao.getEmployeetotal();
		int rowCount = list.size();

		// [행],[열]
		data = new Object[rowCount][columnCount];

		try {
			// 전체사원의 데이터를 2차 배열형식으로 저장
			for (int index = 0; index < rowCount; index++) {
				emTo = list.get(index);
				int jg_no = emTo.getJg_no();
				int dept_no = emTo.getDept_no();
				int rank = emTo.getRank();
				data[index][0] = emTo.getNo();
				data[index][1] = emTo.getName();
				data[index][2] = emDao.getJg_name(jg_no);
				data[index][3] = emDao.getDept_name(dept_no);
				data[index][4] = emDao.getRank_name(rank);
				data[index][5] = emTo.getEmail();
				data[index][6] = emTo.getHire_date();
			}
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");

		}

	} // EmployModel()

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		if (columnName == null)
			return 0;
		else
			return columnName.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		if (data == null)
			return 0;
		else
			return data.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}

	public String getColumnName(int column) {
		return (String) columnName[column];
	}

}
