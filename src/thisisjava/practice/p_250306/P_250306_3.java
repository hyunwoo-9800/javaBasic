/**
 * 
 */
package thisisjava.practice.p_250306;

/**
 * 
 */
public class P_250306_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int형 배열 선언
		int[] iArr = new int[100];

		// 카운트 변수
		int cnt = 1;

		for (int i = 0; i < iArr.length; i++) {

			iArr[i] += cnt;

			// 돌때마다 1씩 증가
			cnt++;

			// 인덱스가 짝수인 경우만 배열 출력
			if (i % 2 == 0) {

				System.out.println("iArr[" + i + "] = " + iArr[i]);

			} // if 종료

			// 0번 인덱스를 제외하고 싶다면 사용
//			if (i % 2 == 0 && i != 0) {
//				
//				System.out.println("iArr[" + i + "] = " + iArr[i]);
//				
//			} // if 종료

		} // for 종료

	} // main 끝

} // class 끝
