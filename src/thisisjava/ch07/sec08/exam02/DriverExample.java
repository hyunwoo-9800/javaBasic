/**
 * 
 */
package thisisjava.ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		// 인스턴스화
		Driver driver = new Driver();

		// 매개변수 bus
		Bus bus = new Bus();
		driver.driver(bus)
		;
		// 매개변수 taxi
		Taxi taxi = new Taxi();
		driver.driver(taxi);

	} // main 끝

} // class 끝
