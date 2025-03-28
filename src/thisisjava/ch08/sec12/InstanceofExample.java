package thisisjava.ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vehicle 구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		// 메서드 호출 시 구현 객체를 전달
		ride(taxi);
		System.out.println();
		ride(bus);
		

	} // main 끝

	// 인터페이스 매개변수를 갖는 메서드
	public static void ride(Vehicle vehicle) {

		// 방법1
//		if (vehicle instanceof Bus) {
//
//			Bus bus = (Bus) vehicle;
//			bus.checkFare();
//
//		}

		// 방법2
		// 자바12 부터 사용 가능
		if (vehicle instanceof Bus bus) {

			bus.checkFare();

		}

		vehicle.run();

	} // 메서드 끝

} // class 끝