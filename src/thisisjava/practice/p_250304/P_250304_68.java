/**
 * 
 */
package thisisjava.practice.p_250304;

/**
 * 
 * 연산 우선 순위
 * 
 */
public class P_250304_68 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5 % 6 + (3 + 3 * 2)은 괄호 안부터 계산 하므로 5 % 6 + (9)가 된다.
		// 괄호 이후에는 연산 우선 순위에 따라 5 % 6 = 5
		// 5 + 9 = 14 가 최종 결과값이다.
		
		System.out.println(5 % 6 + (3 + 3 * 2));

	} // main 끝

} // class 끝
