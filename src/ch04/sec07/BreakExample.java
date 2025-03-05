/**
 * 
 */
package ch04.sec07;

/**
 * 
 */
public class BreakExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {

			// 1 ~ 6 랜덤값 저장
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);

			// 6일 경우
			if (num == 6) {

				// while문 종료
				break;

			}

		} // while 종료

	} // main 끝

} // class 끝
