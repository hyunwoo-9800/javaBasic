package thisisjava.ch07.sec11;

public final class Employee extends Person {

	// default 생성자
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// 메서드 오버라이딩
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("제품을 생산합니다.");
	}

} // class 끝
