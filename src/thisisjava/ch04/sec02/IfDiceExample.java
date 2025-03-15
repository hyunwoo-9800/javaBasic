/**
 * 
 */
package thisisjava.ch04.sec02;

/**
 * 
 */
public class IfDiceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 ~ 6 사이의 랜덤 값 생성
		int num = (int) (Math.random() * 6) + 1;
		
		// 생성된 값에 따라 실행
		if (num == 1) {
			
			System.out.println("1번입니다.");
			
		} else if (num == 2) {
			
			System.out.println("2번입니다.");
			
		} else if (num == 3) {
			
			System.out.println("3번입니다.");
			
		} else if (num == 4) {
			
			System.out.println("4번입니다.");
			
		} else if (num == 5) {
			
			System.out.println("5번입니다.");
			
		} else if (num == 6) {

			System.out.println("6번입니다.");
			
		} // else if 종료
		
	} // main 끝

} // class 끝
