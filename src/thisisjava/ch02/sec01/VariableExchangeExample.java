/**
 * 
 */
package thisisjava.ch02.sec01;

/**
 * 
 */
public class VariableExchangeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 3;
		int y = 5;
		System.out.println("원래 값은?");
		System.out.println("x = " + x + "\t" + "y = " + y);

		// 개행
		System.out.println("\n");

		// x, y 값 바꾸기
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("교환된 값은?");
		System.out.println("x = " + x + "\t" + "y = " + y);

	} // main 끝

} // VariableExchangeExample 끝
