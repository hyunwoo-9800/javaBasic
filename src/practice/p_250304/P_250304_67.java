/**
 * 
 */
package practice.p_250304;

/**
 * 
 * 연산 우선 순위
 * 
 */
public class P_250304_67 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 + 5 * 5 + (8 % 5 * 1)은 괄호 안부터 계산 하므로 3 + 5 * 5 + (3)가 된다.
		// 괄호 이후에는 연산 우선 순위에 따라 5 * 5 = 25
		// 25 + 3 = 28
		// 28 + 3 = 31 이 최종 결과값이다.
		
		System.out.println(3 + 5 * 5 + (8 % 5 * 1));

	} // main 끝

} // class 끝
