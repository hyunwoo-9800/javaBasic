package thisisjava.ch07.sec09;

public class Person {

	public String name;

	// default 생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 오버로딩
	public Person(String name) {

		this.name = name;

	}
	
	// 메서드
	public void walk() {
		
		System.out.println("걷습니다.");
		
	}

} // class 끝
