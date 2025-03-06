/**
 * 
 */
package ch05.sec05;

/**
 * 
 */
public class IndexOfContainsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 선언
		String subject = "자바 프로그래밍 자바12345 자바 6";
		System.out.println("문자열의 길이 : " + subject.length());

		// 프로그래밍이 포함된 인덱스 번호
		int location = subject.indexOf("프로그래밍");
		System.out.println("프로그래밍이 있는 시작 위치 = " + location);
		System.out.println(location);

		// 인덱스 번호부터 문자열 자르기
		String substring = subject.substring(location);
		System.out.println(substring);

		// 자바가 포함된 인덱스 번호
		location = subject.indexOf("자바");
		System.out.println("자바가 있는 시작 위치 = " + location);

		// 문자열에 자바가 포함된 경우
		if (location != -1) {

			System.out.println("자바와 관련된 책이군요.");

		} else {

			System.out.println("자바와 관련없는 책이군요.");

		}

		String pythonStr = subject.replace("자바", "Python");
		System.out.println("pythonStr = " + pythonStr);

		// 논리형으로 문자열에 자바가 포함됬는지 확인
		boolean result = subject.contains("자바");

		// 자바가 있으면
		if (result) {

			System.out.println("자바와 관련된 책이군요.");

		} else {

			System.out.println("자바와 관련없는 책이군요.");

		}

	} // main 끝

} // class 끝
