/**
 * 
 */
package thisisjava.ch02.sec05;

/**
 * 
 */
public class BooleanExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if 체크 플래그
		boolean stop = true;

		if (stop) {

			System.out.println("중지");

		} else {

			System.out.println("시작");

		} // else if 끝

		int x = 10;
		boolean result1 = (x == 20);
		boolean result2 = (x != 20);

		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

	} // main 끝

} // BooleanExample 끝
