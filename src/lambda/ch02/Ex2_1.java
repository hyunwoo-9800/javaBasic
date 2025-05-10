/**
 * 
 */
package lambda.ch02;

/**
 * 
 */
public class Ex2_1 {

	@FunctionalInterface
	interface MyFunction {
		boolean apply(String input);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFunction isNotNull1 = (String input) -> {

			return input != null;
		};

		MyFunction isNotNull2 = input -> {

			return input != null;

		};

		MyFunction isNotNull3 = (String input) -> input != null;

		MyFunction isNotNull4 = (input) -> input != null;

		// 콘솔 출력
		System.out.println(isNotNull1.apply("hello")); // true
		System.out.println(isNotNull2.apply(null)); // false
		System.out.println(isNotNull3.apply("")); // true
		System.out.println(isNotNull4.apply(null)); // false

		System.out.println(isNotNull1);
		System.out.println(isNotNull2);
		System.out.println(isNotNull3);
		System.out.println(isNotNull4);
		
	} // main 끝

} // class 끝
