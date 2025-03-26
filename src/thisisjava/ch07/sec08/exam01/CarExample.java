/**
 * 
 */
package thisisjava.ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {

		// Car 객체 생성
		Car myCar = new Car();

		// Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();

		// HankookTire 객체 장착
		myCar.tire = new HnakookTire();
		myCar.run();

		// KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();

	} // main 끝

} // class 끝
