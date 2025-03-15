/**
 * 
 */
package thisisjava.ch06.sec08.exam01;

/**
 * 메서드 호출 예제 클래스
 */
public class CalculatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Calculator cal = new Calculator();

		// 메서드 호출
		cal.powerOn();

		// 리턴값이 있는 메서드 호출
		int resultPlus = cal.plus(5, 6);
		System.out.println("resultPlus = " + resultPlus);

		int x = 10;
		int y = 4;

		double resultDivide = cal.divide(x, y);

		System.out.println("resultDivide = " + resultDivide);

		cal.powerOff();

	} // main 끝

} // class 끝
