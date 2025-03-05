/**
 * 
 */
package ch04.sec03;

/**
 * 
 */
public class SwitchNoBreakCaseExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 8 ~ 11 사이의 랜덤 값 생성
		int num = (int) (Math.random() * 4) + 8;
		
		System.out.println("현재 시간은 " + num + "시입니다.");

		switch (num) {

			case 8: {
	
				System.out.println("출근합니다.");
				
			}
	
			case 9: {
	
				System.out.println("회의를 합니다.");
			}
	
			case 10: {
	
				System.out.println("업무를 봅니다.");
			}
	
			default: {
				
				System.out.println("외근을 나갑니다.");
			}

		} // switch 끝

	} // main 끝
}
// class 끝
