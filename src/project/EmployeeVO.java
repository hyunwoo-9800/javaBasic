package project;


public class EmployeeVO {
	private int no; // 사번 1
	private String name; // 이름 2
	private int jg_no; // 직책 3
	private int dept_no; // 부서 4
	private int rank; // 고과점수 5
	private String email; // 메일 6
	private String hire_date; // 입사날짜 7
	private String Status;


	public EmployeeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	// 사원정보 입력할때
	public EmployeeVO(String name, int jg_no, int dept_no, int rank, String email, String hire_date) {
		super();
		this.name = name;
		this.jg_no = jg_no;
		this.dept_no = dept_no;
		this.rank = rank;
		this.email = email;
		this.hire_date = hire_date;
	}




	// 사원정보 조회할때
	public EmployeeVO(int no, String name, int jg_no, int dept_no, int rank, String email, String hire_date) {
		super();
		this.no = no;
		this.name = name;
		this.jg_no = jg_no;
		this.dept_no = dept_no;
		this.rank = rank;
		this.email = email;
		this.hire_date = hire_date;
	}





	public EmployeeVO(int no, String name, int jg_no, int dept_no, int rank, String email, String hire_date,
			String status) {
		super();
		this.no = no;
		this.name = name;
		this.jg_no = jg_no;
		this.dept_no = dept_no;
		this.rank = rank;
		this.email = email;
		this.hire_date = hire_date;
		Status = status;
	}





	@Override
	public String toString() {
		return "EmployeeDTO [no=" + no + ", name=" + name + "]";
	}




	public int getNo() {
		return no;
	}




	public void setNo(int no) {
		this.no = no;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getJg_no() {
		return jg_no;
	}




	public void setJg_no(int jg_no) {
		this.jg_no = jg_no;
	}




	public int getDept_no() {
		return dept_no;
	}




	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}




	public int getRank() {
		return rank;
	}




	public void setRank(int rank) {
		this.rank = rank;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getHire_date() {
		return hire_date;
	}




	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}




	public String getStatus() {
		return Status;
	}




	public void setStatus(String status) {
		Status = status;
	}

	
}
