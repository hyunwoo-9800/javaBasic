/**
 * 
 */
package ch05.sec05;

/**
 * 
 */
public class SplitExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 선언
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

		// 문자열 분리
		String[] tokens = board.split(",");

		String[] arr = { "번호 = ", "제목 = ", "내용 = ", "성명 = " };

		// 인덱스별로 읽기
		System.out.println("번호 = " + tokens[0]);
		System.out.println("제목 = " + tokens[1]);
		System.out.println("내용 = " + tokens[2]);
		System.out.println("성명 = " + tokens[3]);
		System.out.println();

		// for문으로 읽기
		for (int i = 0; i < tokens.length; i++) {

			System.out.println(arr[i] + tokens[i]);

		} // for문 종료

		// 개행용
		System.out.println();
		System.out.println("=========================================================================");
		System.out.println("=========================================================================");
		System.out.println("=========================================================================");
		System.out.println();

		// split 연습용
		String board2 = "1:자바 학습:참조 타입 String을 학습합니다.:누굴까요";
		String[] arr2 = { "번호 = ", "제목 = ", "내용 = ", "성명 = " };

		// 문자열 분리
		String[] tokens2 = board2.split(":");

		// 인덱스별로 읽기
		System.out.println("번호 = " + tokens2[0]);
		System.out.println("제목 = " + tokens2[1]);
		System.out.println("내용 = " + tokens2[2]);
		System.out.println("성명 = " + tokens2[3]);
		System.out.println();

		// for문으로 읽기
		for (int i = 0; i < tokens2.length; i++) {

			System.out.println(arr2[i] + tokens2[i]);

		} // for문 종료

	} // main 끝

} // class 끝
