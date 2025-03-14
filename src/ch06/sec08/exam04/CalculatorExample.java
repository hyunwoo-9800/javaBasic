/**
 * 
 */
package ch06.sec08.exam04;

/**
 * 메서드 오버로딩
 */
public class CalculatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스화
		Calculator cal = new Calculator();

		// 메서드 호출 및 출력
		System.out.println(cal.areaRectangle(4));
		System.out.println(cal.areaRectangle(5, 2));

	} // main 끝

} // class 끝
