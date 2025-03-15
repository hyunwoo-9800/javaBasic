/**
 * 
 */
package thisisjava.ch06.sec06;

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
		Car myCar = new Car();
		
		// 객체의 값 읽기
		System.out.println("모델명 = " + myCar.model);
		System.out.println("시동여부 = " + myCar.start);
		System.out.println("현재속도 = " + myCar.speed);
		
		System.out.println();
		
		// 객체의 값 변경
		myCar.model = "모닝";
		myCar.start = true;
		myCar.speed = 100;
		
		// 객체의 값 읽기
		System.out.println("모델명 = " + myCar.model);
		System.out.println("시동여부 = " + myCar.start);
		System.out.println("현재속도 = " + myCar.speed);
		
	} // main 끝

} // class 끝
