package thisisjava.ch08.sec11.exam01;

public class Car {

	// 인스턴스화
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();

	// 메서드
	void run() {

		tire1.roll();
		tire2.roll();

	}

} // class 끝
