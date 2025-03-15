/**
 * 
 */
package thisisjava.practice.p_250314;

/**
 * 로또 추출 프로그램
 */
public class lotto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열선언
		int[] lotto = new int[6];

		// 랜덤 값
		int random = 0;

		// 배열의 길이만큼 반복
		for (int i = 0; i < lotto.length; i++) {

			do {

				// 랜덤 값 생성
				random = (int) ((Math.random() * 45) + 1);

			} while (check(lotto, random));

			lotto[i] = random;
		}

		for (int i = 0; i < lotto.length; i++) {

			System.out.println((i + 1) + "번째 = " + lotto[i] + " ");

		}

	} // main 끝

	// 랜덤값 중복 확인용
	public static boolean check(int[] lotto, int random) {

		for (int i = 0; i < lotto.length; i++) {

			// 참일 경우 조건문 중지
			if (lotto[i] == random) {

				return true;

			}

		}

		return false;
		
	} // 메서드 종료

}
// class 끝
