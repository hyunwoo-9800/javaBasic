/**
 * 
 */
package thisisjava.ch03.sec04;

/**
 * 
 */
public class AccuracyExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		double result1 = apple - number * pieceUnit;

		System.out.println("사과 1개에서 남은 양 = " + result1);
		
		// 정확하게 계산할 때는 정수 연산으로 할것
		int totalPieces = apple * 10;
		int result2 = totalPieces - number;
		System.out.println("10조각에서 남은 조각 = " + result2);
		System.out.println("사과 1개에서 남은 양 = " + result2 / 10.0);

	} // main 끝

} // class 끝
