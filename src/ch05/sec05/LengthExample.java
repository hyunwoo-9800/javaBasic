/**
 * 
 */
package ch05.sec05;

/**
 * 
 */
public class LengthExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 선언
		String ssn = "9902211234567";

		// 문자열 길이
		int length = ssn.length();

		if (length == 13) {

			System.out.println("주민등록번호 자릿수가 맞습니다.");

		} else {

			System.out.println("주민등록번호 자릿수가 틀립니다.");

		}

	} // main 끝

} // class 끝
