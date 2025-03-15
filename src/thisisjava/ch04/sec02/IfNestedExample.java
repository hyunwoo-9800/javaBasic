/**
 * 
 */
package thisisjava.ch04.sec02;

/**
 * 
 */
public class IfNestedExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 점수를 랜덤으로 생성
		int score = (int) (Math.random() * 20) + 81;
		String grade = "";
		System.out.println("점수 : " + score);

		// 중첩된 if문
		if (90 <= score) {

			if (95 <= score) {

				grade = "A++";

			} else {

				grade = "A";

			} // 내부 if 종료

		} else {

			if (85 <= score) {

				grade = "B+";

			} else {

				grade = "B";

			} // 내부 if 종료

		} // 전체 else if 종료

		System.out.println("학점 : " + grade);

	} // main 끝

} // class 끝
