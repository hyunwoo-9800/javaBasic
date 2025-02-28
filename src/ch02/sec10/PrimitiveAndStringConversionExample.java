/**
 * 
 */
package ch02.sec10;

/**
 * 
 */
public class PrimitiveAndStringConversionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수형, 실수형, 논리 값으로 변경
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.141592");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		System.out.println("value3 = " + value3);
		
		System.out.println();

		// 문자열로 변경
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(false);

		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);

	} // main 끝

} // class 끝
