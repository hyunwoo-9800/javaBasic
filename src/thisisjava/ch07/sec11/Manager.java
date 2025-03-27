package thisisjava.ch07.sec11;

public non-sealed class Manager extends Person {

	// default 생성자
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	// 메서드 오버라이딩
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("생산 관리를 합니다.");
	}

} // class 끝
