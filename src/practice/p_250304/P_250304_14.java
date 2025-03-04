/**
 * 
 */
package practice.p_250304;

/**
 * 
 * "*" 출력 예제 클래스
 * 
 */
public class P_250304_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 카운트 변수
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;

		System.out.println("사각형 출력 연습");

		// 사각형 출력
		for (cnt1 = 0; cnt1 <= 4; cnt1++) {

			for (cnt2 = 0; cnt2 <= 3; cnt2++) {

				System.out.print("*");
			}

			System.out.println("*");

		} // 사각형 for 끝

		System.out.println("=========================");
		System.out.println("삼각형 출력 연습 01");

		// 삼각형 출력
		for (cnt1 = 0; cnt1 <= 4; cnt1++) {

			for (cnt2 = 0; cnt2 <= cnt1; cnt2++) {

				System.out.print("*");
			}

			System.out.println();

		} // 삼각형 for 끝

		System.out.println();

		System.out.println("=========================");
		System.out.println("삼각형 출력 연습 02");

		// 삼각형 출력
		for (cnt1 = 0; cnt1 <= 5; cnt1++) {

			for (cnt2 = 5; 0 < cnt2; cnt2--) {

				if (cnt1 < cnt2) {

					System.out.print(" ");

				} else {
					
					System.out.print("*");
				
				}
			
			}
			
			System.out.println();
			
		} // 삼각형 for 끝
		
	} // main 끝

} // class 끝
