/**
 * 
 */
package thisisjava.practice.p_250304;

/**
 * 
 * 연산 우선 순위
 * 
 */
public class P_250304_69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2 % 6 + 3 + (2 + 5) + 3 / 2은 괄호 안부터 계산 하므로 2 % 6 + 3 + 7 + 3 / 2가 된다.
		// 괄호 이후에는 연산 우선 순위에 따라 2 % 6 = 2 이므로
		// 2 + 3 + 7 + 3 / 2
		// 3 / 2 = 1 이므로 
		// 2 + 3 + 7 + 1 = 13이 최종 결과 값이다.
		
		System.out.println(2 % 6 + 3 + (2 + 5) + 3 / 2);

	} // main 끝

} // class 끝
