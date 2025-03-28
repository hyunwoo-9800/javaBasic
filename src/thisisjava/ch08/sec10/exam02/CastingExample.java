package thisisjava.ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구현 객체
		Vehicle vehicle = new Bus();

		// 인터페이스로 호출
		vehicle.run();
//		vehicle.checkFare();

		// 강제 타입 변환
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();

	} // main 끝

} // class 끝
