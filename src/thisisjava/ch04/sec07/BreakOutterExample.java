/**
 * 
 */
package thisisjava.ch04.sec07;

/**
 * 
 */
public class BreakOutterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {

			for (char lower = 'a'; lower <= 'z'; lower++) {

				System.out.println(upper + "-" + lower);

				// lower가 g일 경우 전체 for문을 벗어남
				if (lower == 'g') {

					break Outter;

				} // if문 종료

			} // 내부 for문 종료

		} // 전체 for문 종료

	} // main 끝

} // class 끝
