/**
 * 
 */
package ch02.sec07;

/**
 * 
 */
public class PromotionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자동 타입 변환

		// byte to int
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue = " + intValue);

		// char to int
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 = " + intValue);

		// int to long
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue = " + longValue);

		// long to flaot
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue = " + floatValue);

		// float to double
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue = " + doubleValue);

	} // main 끝

} // PromotionExample 끝
