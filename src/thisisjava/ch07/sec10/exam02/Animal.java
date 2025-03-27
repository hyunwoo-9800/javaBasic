package thisisjava.ch07.sec10.exam02;

// 추상 클래스의 추상 메서드
public abstract class Animal {

	// default 생성자
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	// 메서드
	public void breathe() {

		System.out.println("숨을 쉽니다.");

	}

	// 추상 메서드
	public abstract void sound();

} // class 끝
