/**
 * 
 */
package thisisjava.ch04.sec03;

/**
 * 
 */
public class SwitchCharExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'B';

		switch (grade) {

			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
	
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
	
			default:
	
				System.out.println("손님 입니다.");
				break;

		} // switch 끝

	} // main 끝
	
} // class 끝
