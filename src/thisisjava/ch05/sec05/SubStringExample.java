/**
 * 
 */
package thisisjava.ch05.sec05;
/**
 * 
 */
public class SubStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 선언
		String ssn = "990221 - 1234567";

		// 문자열 자르기
		String firstNum = ssn.substring(0, 7);
		String secondNum = ssn.substring(9);

		System.out.println(firstNum);
		System.out.println(secondNum);

	} // main 끝

} // class 끝
