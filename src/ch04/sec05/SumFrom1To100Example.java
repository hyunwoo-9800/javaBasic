/**
 * 
 */
package ch04.sec05;

/**
 * 
 */
public class SumFrom1To100Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 합계 변수
		int sum = 0;
		
		// 카운트 변수
		int i = 1;
		
		// i가 100보다 작거나 같은 동안에 반복
		while (i <= 100) {
			
			sum += i;
			i++;
			
		}
		
		System.out.println("1 ~ " + (i - 1) + " 합 = " + sum);
		
	} // main 끝

} // class 끝
