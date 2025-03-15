/**
 * 
 */
package thisisjava.ch04.sec02;

/**
 * 
 */
public class IfElseIfElseExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;

		// score에 따라 실행
		if (90 <= score) {

			System.out.println("점수가 100 ~ 90입니다.");
			System.out.println("등급은 A입니다.");

		} else if (80 <= score) {

			System.out.println("점수가 80 ~ 90입니다.");
			System.out.println("등급은 B입니다.");

		} else if (70 <= score) {

			System.out.println("점수가 70 ~ 80입니다.");
			System.out.println("등급은 C입니다.");

		} else {

			System.out.println("점수가 70미만 입니다.");
			System.out.println("등급은 D입니다.");

		} // else if 종료

	} // main 끝

} // class 끝
