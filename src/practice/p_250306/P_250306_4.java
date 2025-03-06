/**
 * 
 */
package practice.p_250306;

/**
 * 
 */
public class P_250306_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int형 배열 선언
		int[] iArr = { 12, 1, 5, 3, 6, 8, 5, 3 };

		// 합계 변수
		int sum = 0;

		for (int i = 0; i < iArr.length; i++) {

			// 합계 변수에 배열의 값을 저장
			sum += iArr[i];
			
		} // for 종료
		
		System.out.println("배열의 총합은 = " + sum);

	} // main 종료

} // class 종료
