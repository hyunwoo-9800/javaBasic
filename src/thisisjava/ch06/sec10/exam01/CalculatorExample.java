/**
 * 
 */
package thisisjava.ch06.sec10.exam01;

/**
 * 정적 멤버
 */
public class CalculatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 원의 넓이 계산
		double result1 = 10 * 10 * Calculator.pi;

		// 덧셈
		int result2 = Calculator.plus(10, 5);

		// 뺄셈
		int result3 = Calculator.minus(10, 5);

		// 출력
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);

		// 개행용
		System.out.println();

		// 인스턴스화
		Calculator cal = new Calculator();

		// 정적멤버 접근
		result1 = 10 * 10 * cal.pi;
		result2 = cal.plus(10, 5);
		result3 = cal.minus(10, 5);

		// 출력
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);

	} // main 끝

} // class 끝
