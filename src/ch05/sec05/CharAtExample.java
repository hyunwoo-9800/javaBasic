/**
 * 
 */
package ch05.sec05;

/**
 * 
 */
public class CharAtExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 선언
		String ssn = "9902211234567";

		// 문자 추출
		char sex = ssn.charAt(6);

		switch (sex) {
		
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
	
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;

		} // switch 종료

	} // main 끝

} // class 끝
