package thisisjava.ch07.sec10.exam01;

// 추상 클래스
public abstract class Phone {

	String owner;

	// default 생성자
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 오버로딩
	public Phone(String owner) {

		this.owner = owner;

	}

	// 메서드 선언
	void turnOn() {

		System.out.println("폰 전원을 켭니다.");

	}

	void turnOff() {

		System.out.println("폰 전원을 끕니다.");

	}

} // class 끝
