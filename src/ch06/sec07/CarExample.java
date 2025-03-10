/**
 * 
 */
package ch06.sec07;

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
		Car myCar = new Car("그랜저", "검정", 250);
		
		Car myCar2 = new Car();
		
		// 출력
		System.out.println(myCar.model + myCar.color + myCar.maxSpeed);
		System.out.println(myCar2.model + myCar2.color + myCar2.maxSpeed);
		
		
	} // main 끝

} // class 끝
