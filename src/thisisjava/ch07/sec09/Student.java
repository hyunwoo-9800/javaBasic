package thisisjava.ch07.sec09;

public class Student extends Person {

	public int studentNo;

	// default 생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 오버라이딩
	public Student(String name, int studentNo) {

		super(name);
		this.studentNo = studentNo;

	}
	
	// 메서드
	public void study() {
		
		System.out.println("공부를 합니다.");
		
	}

} // class 끝
