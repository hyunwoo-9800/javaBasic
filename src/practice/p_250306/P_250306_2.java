/**
 * 
 */
package practice.p_250306;

/**
 * 
 */
public class P_250306_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int형 배열 선언
		int[] iArr = new int[10];

		// 카운트 변수
		int cnt = 3;

		for (int i = 0; i < iArr.length; i++) {

			iArr[i] += cnt;

			System.out.println("iArr[" + i + "] = " + iArr[i]);

			// 돌때마다 3씩 증가시키기 위함
			cnt += 3;

		} // for 종료

	} // main 끝

} // class 끝
