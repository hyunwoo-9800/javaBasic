package thisisjava.ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Car myCar = new Car();

		// 메서드 호출
		myCar.run();

		// 타이어 객체 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();

		// 메서드 호출
		myCar.run();
		
	} // main 끝

} // class 끝
