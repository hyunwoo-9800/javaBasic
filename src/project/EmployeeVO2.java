package project;

// employee2 테이블 에 해당하는 생성자

public class EmployeeVO2 {
	private int no;	// 사번
	private String name;	// 이름
	private double salary;	// 연봉
	private int yasumi;		// 연차
	
	
	public EmployeeVO2() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeVO2(int no, String name, double salary, int yasumi) {
		super();
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.yasumi = yasumi;
	}


	public EmployeeVO2(int no, double salary, int yasumi) {
		super();
		this.no = no;
		this.salary = salary;
		this.yasumi = yasumi;
	}



	public EmployeeVO2(double salary, int yasumi) {
		super();
		this.salary = salary;
		this.yasumi = yasumi;
	}


	public EmployeeVO2(String name, double salary, int yasumi) {
		super();
		this.name = name;
		this.salary = salary;
		this.yasumi = yasumi;
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getYasumi() {
		return yasumi;
	}


	public void setYasumi(int yasumi) {
		this.yasumi = yasumi;
	}


}