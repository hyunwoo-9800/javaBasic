/**
 * 
 */
package practice;

/**
 * 
 */
public class P_250227_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello";
		String str2 = "World";

		// "Hello" 출력
		System.out.println("str1 = " + str1);

		// HelloWorld 출력
		System.out.println("str1 + \"World\" = " + str1 + "World");

		// HelloWorld 출력
		System.out.println("str1 + str2 = " + str1 + str2);

		str1 = "new Word";
		String str3 = str1 + str2;

		// new WordWorld 출력
		System.out.println("str3 = " + str3);

	} // main 끝

} // class 끝
