/**
 * 
 */
package ch04.sec04;


/**
 * 
 * 구구단 출력(for)
 * 
 */
public class PrintFrom1To10Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2 ~ 9번 반복(단 수)
		for (int m = 2; m <= 9; m++) {
			
			System.out.println("*** " + m + "단 ***");
			
			// 1 ~ 9번 반복
			for (int n = 1; n <= 9; n++) {
				
				System.out.println(m + " x " + n + " = " + (m * n));
				
			} // for 종료
			
		} // 단수 출력 for 종료
		
	} // main 끝

} // class 끝
