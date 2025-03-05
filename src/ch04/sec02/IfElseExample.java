/**
 * 
 */
package ch04.sec02;

/**
 * 
 */
public class IfElseExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;
		
		// score에 따라 실행
		if (90 <= score) {
			
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
			
		} else {
			
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		
		} // else if 종료
		
	} // main 끝

} // class 끝
