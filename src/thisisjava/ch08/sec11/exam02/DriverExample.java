package thisisjava.ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Driver driver = new Driver();

		// Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		// 매개변수의 다형성
		driver.ddrive(bus);
		driver.ddrive(taxi);

	} // main 끝

} // class 끝