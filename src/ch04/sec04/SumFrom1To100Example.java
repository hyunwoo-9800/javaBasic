/**
 * 
 */
package ch04.sec04;


/**
 * 
 * 합계 구하기
 * 
 */
public class SumFrom1To100Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 합계 저장용 변수
		int sum = 0;
		
		// 카운트 변수
		int i = 0;
		
		for(i = 1; i <= 100; i++) {
			
			sum += i;
			
		}
		
		System.out.println("1 ~ " + (i - 1) + " 합 = " + sum);
		
	} // main 끝

} // class 끝
