/**
 * 
 */
package thisisjava.ch06.sec09;

/**
 * 
 */
public class CarExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		Car noNamecar = new Car();

		// 메서드 호출
		myCar.run();
		yourCar.run();
		noNamecar.run();

	} // main 끝

} // class 끝
