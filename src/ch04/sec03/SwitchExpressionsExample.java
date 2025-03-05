/**
 * 
 */
package ch04.sec03;

/**
 * 
 */
public class SwitchExpressionsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'B';

		// 람다식
		switch (grade) {

			case 'A', 'a' -> {
	
				System.out.println("우수 회원입니다.");
				break;
	
			}
	
			case 'B', 'b' -> {
	
				System.out.println("일반 회원입니다.");
				break;
	
			}
	
			default -> {
	
				System.out.println("손님입니다.");
				break;
	
			}
			
		} // switch 끝
		
		
		// 실행할 결과가 하나일 경우에는 중괄호 생략가능
		switch(grade) {
		
			case 'A', 'a' -> System.out.println("우수 회원입니다.");
			case 'B', 'b' -> System.out.println("일반 회원입니다.");
			default -> System.out.println("손님입니다.");
		
		} // switch 끝

	} // main 끝

} // class 끝
