package thisisjava.ch07.sec11;

// 봉인된 클래스
public sealed class Person permits Employee, Manager {

	public String name;

	// default 생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void work() {

		System.out.println("하는 일이 결정되지 않았습니다.");

	}

} // class 끝
