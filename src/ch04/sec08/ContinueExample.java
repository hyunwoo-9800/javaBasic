/**
 * 
 */
package ch04.sec08;

/**
 * 
 */
public class ContinueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {

			// 홀수일 경우 실행
			if (i % 2 != 0) {

				continue;

			} // if 종료

			System.out.println(i + " ");

		} // for 종료

	} // main 끝

} // class 끝
