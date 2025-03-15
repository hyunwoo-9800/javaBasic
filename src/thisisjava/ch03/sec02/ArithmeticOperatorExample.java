/**
 * 
 */
package thisisjava.ch03.sec02;

/**
 * 
 */
public class ArithmeticOperatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;

		// int 타입으로 형변환 후 연산
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);

		// long 타입으로 형변화 후 연산
		long result2 = v1 + v2 - v4;
		System.out.println("result2 = " + result2);

		// double 타입으로 형변환 후 연산
		double result3 = (double) v1 / v2;
		System.out.println("result3 = " + result3);

		// int 타입으로 형변환 후 연산
		int result4 = v1 % v2;
		System.out.println("result4 = " + result4);

	} // main 끝

} // class 끝
