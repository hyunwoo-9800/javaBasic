package thisisjava.ch07.sec10.exam01;

// 추상 클래스를 상속
public class SmartPhone extends Phone {

	String owner;

	// default 생성자
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 오버라이딩
	public SmartPhone(String owner) {

		super(owner);

	}

	// 메서드 선언
	void internetSearch() {

		System.out.println("인터넷 겁색을 합니다.");

	}

} // class 끝
